/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.timrobertson;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LogMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LogMessage\",\"namespace\":\"com.timrobertson\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"payload\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence payload;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public LogMessage() {}

  /**
   * All-args constructor.
   */
  public LogMessage(java.lang.CharSequence id, java.lang.CharSequence payload) {
    this.id = id;
    this.payload = payload;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return payload;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: payload = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'payload' field.
   */
  public java.lang.CharSequence getPayload() {
    return payload;
  }

  /**
   * Sets the value of the 'payload' field.
   * @param value the value to set.
   */
  public void setPayload(java.lang.CharSequence value) {
    this.payload = value;
  }

  /** Creates a new LogMessage RecordBuilder */
  public static com.timrobertson.LogMessage.Builder newBuilder() {
    return new com.timrobertson.LogMessage.Builder();
  }
  
  /** Creates a new LogMessage RecordBuilder by copying an existing Builder */
  public static com.timrobertson.LogMessage.Builder newBuilder(com.timrobertson.LogMessage.Builder other) {
    return new com.timrobertson.LogMessage.Builder(other);
  }
  
  /** Creates a new LogMessage RecordBuilder by copying an existing LogMessage instance */
  public static com.timrobertson.LogMessage.Builder newBuilder(com.timrobertson.LogMessage other) {
    return new com.timrobertson.LogMessage.Builder(other);
  }
  
  /**
   * RecordBuilder for LogMessage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LogMessage>
    implements org.apache.avro.data.RecordBuilder<LogMessage> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence payload;

    /** Creates a new Builder */
    private Builder() {
      super(com.timrobertson.LogMessage.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.timrobertson.LogMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.payload)) {
        this.payload = data().deepCopy(fields()[1].schema(), other.payload);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing LogMessage instance */
    private Builder(com.timrobertson.LogMessage other) {
            super(com.timrobertson.LogMessage.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.payload)) {
        this.payload = data().deepCopy(fields()[1].schema(), other.payload);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public com.timrobertson.LogMessage.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public com.timrobertson.LogMessage.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'payload' field */
    public java.lang.CharSequence getPayload() {
      return payload;
    }
    
    /** Sets the value of the 'payload' field */
    public com.timrobertson.LogMessage.Builder setPayload(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.payload = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'payload' field has been set */
    public boolean hasPayload() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'payload' field */
    public com.timrobertson.LogMessage.Builder clearPayload() {
      payload = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public LogMessage build() {
      try {
        LogMessage record = new LogMessage();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.payload = fieldSetFlags()[1] ? this.payload : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
