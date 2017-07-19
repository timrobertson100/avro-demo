package com.timrobertson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

public class UsageDemo {
  private static final DecoderFactory DECODER_FACTORY = DecoderFactory.get();
  private static final EncoderFactory ENCODER_FACTORY = EncoderFactory.get();

  private static final GenericDatumWriter<LogMessage> WRITER = new SpecificDatumWriter<LogMessage>(LogMessage.class);
  private static final GenericDatumReader<LogMessage> READER = new SpecificDatumReader<LogMessage>(LogMessage.class);


  public static void main(String[] args) throws IOException {
    LogMessage log = LogMessage.newBuilder().setId("1").setPayload("Debug: Bingo!").build();

    // encode a single log message as Avro
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    BinaryEncoder encoder = ENCODER_FACTORY.binaryEncoder(os, null);
    WRITER.write(log, encoder);
    encoder.flush();
    byte[] encoded = os.toByteArray();

    System.out.println("Avro encoded: " + Arrays.toString(encoded));

    // decode the Avro
    Decoder decoder = DECODER_FACTORY.binaryDecoder(encoded, null);  // no reuse of decoder here, but normally you would
    LogMessage log2 = READER.read(null, decoder); // no resuse of an existing object

    System.out.println("Decoded payload: " + log2.getPayload());
  }
}
