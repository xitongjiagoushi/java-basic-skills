// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.brctl.serial.protobuf.bean;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Person)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>required int32 age = 2;</code>
     */
    boolean hasAge();
    /**
     * <code>required int32 age = 2;</code>
     */
    int getAge();

    /**
     * <code>required string phone = 3;</code>
     */
    boolean hasPhone();
    /**
     * <code>required string phone = 3;</code>
     */
    java.lang.String getPhone();
    /**
     * <code>required string phone = 3;</code>
     */
    com.google.protobuf.ByteString
        getPhoneBytes();

    /**
     * <code>required string career = 4;</code>
     */
    boolean hasCareer();
    /**
     * <code>required string career = 4;</code>
     */
    java.lang.String getCareer();
    /**
     * <code>required string career = 4;</code>
     */
    com.google.protobuf.ByteString
        getCareerBytes();
  }
  /**
   * Protobuf type {@code Person}
   */
  public  static final class Person extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Person)
      PersonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Person() {
      name_ = "";
      age_ = 0;
      phone_ = "";
      career_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              age_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              phone_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              career_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.brctl.serial.protobuf.bean.PersonOuterClass.internal_static_Person_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.brctl.serial.protobuf.bean.PersonOuterClass.internal_static_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.brctl.serial.protobuf.bean.PersonOuterClass.Person.class, com.brctl.serial.protobuf.bean.PersonOuterClass.Person.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>required string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <code>required int32 age = 2;</code>
     */
    public boolean hasAge() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 age = 2;</code>
     */
    public int getAge() {
      return age_;
    }

    public static final int PHONE_FIELD_NUMBER = 3;
    private volatile java.lang.Object phone_;
    /**
     * <code>required string phone = 3;</code>
     */
    public boolean hasPhone() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string phone = 3;</code>
     */
    public java.lang.String getPhone() {
      java.lang.Object ref = phone_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          phone_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string phone = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      java.lang.Object ref = phone_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CAREER_FIELD_NUMBER = 4;
    private volatile java.lang.Object career_;
    /**
     * <code>required string career = 4;</code>
     */
    public boolean hasCareer() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string career = 4;</code>
     */
    public java.lang.String getCareer() {
      java.lang.Object ref = career_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          career_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string career = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCareerBytes() {
      java.lang.Object ref = career_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        career_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAge()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPhone()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCareer()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, age_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, phone_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, career_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, phone_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, career_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.brctl.serial.protobuf.bean.PersonOuterClass.Person)) {
        return super.equals(obj);
      }
      com.brctl.serial.protobuf.bean.PersonOuterClass.Person other = (com.brctl.serial.protobuf.bean.PersonOuterClass.Person) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName()
            .equals(other.getName());
      }
      result = result && (hasAge() == other.hasAge());
      if (hasAge()) {
        result = result && (getAge()
            == other.getAge());
      }
      result = result && (hasPhone() == other.hasPhone());
      if (hasPhone()) {
        result = result && getPhone()
            .equals(other.getPhone());
      }
      result = result && (hasCareer() == other.hasCareer());
      if (hasCareer()) {
        result = result && getCareer()
            .equals(other.getCareer());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasAge()) {
        hash = (37 * hash) + AGE_FIELD_NUMBER;
        hash = (53 * hash) + getAge();
      }
      if (hasPhone()) {
        hash = (37 * hash) + PHONE_FIELD_NUMBER;
        hash = (53 * hash) + getPhone().hashCode();
      }
      if (hasCareer()) {
        hash = (37 * hash) + CAREER_FIELD_NUMBER;
        hash = (53 * hash) + getCareer().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.brctl.serial.protobuf.bean.PersonOuterClass.Person prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Person)
        com.brctl.serial.protobuf.bean.PersonOuterClass.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.brctl.serial.protobuf.bean.PersonOuterClass.internal_static_Person_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.brctl.serial.protobuf.bean.PersonOuterClass.internal_static_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.brctl.serial.protobuf.bean.PersonOuterClass.Person.class, com.brctl.serial.protobuf.bean.PersonOuterClass.Person.Builder.class);
      }

      // Construct using com.brctl.serial.protobuf.bean.PersonOuterClass.Person.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        age_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        phone_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        career_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.brctl.serial.protobuf.bean.PersonOuterClass.internal_static_Person_descriptor;
      }

      public com.brctl.serial.protobuf.bean.PersonOuterClass.Person getDefaultInstanceForType() {
        return com.brctl.serial.protobuf.bean.PersonOuterClass.Person.getDefaultInstance();
      }

      public com.brctl.serial.protobuf.bean.PersonOuterClass.Person build() {
        com.brctl.serial.protobuf.bean.PersonOuterClass.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.brctl.serial.protobuf.bean.PersonOuterClass.Person buildPartial() {
        com.brctl.serial.protobuf.bean.PersonOuterClass.Person result = new com.brctl.serial.protobuf.bean.PersonOuterClass.Person(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.age_ = age_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.phone_ = phone_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.career_ = career_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.brctl.serial.protobuf.bean.PersonOuterClass.Person) {
          return mergeFrom((com.brctl.serial.protobuf.bean.PersonOuterClass.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.brctl.serial.protobuf.bean.PersonOuterClass.Person other) {
        if (other == com.brctl.serial.protobuf.bean.PersonOuterClass.Person.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasAge()) {
          setAge(other.getAge());
        }
        if (other.hasPhone()) {
          bitField0_ |= 0x00000004;
          phone_ = other.phone_;
          onChanged();
        }
        if (other.hasCareer()) {
          bitField0_ |= 0x00000008;
          career_ = other.career_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        if (!hasAge()) {
          return false;
        }
        if (!hasPhone()) {
          return false;
        }
        if (!hasCareer()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.brctl.serial.protobuf.bean.PersonOuterClass.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.brctl.serial.protobuf.bean.PersonOuterClass.Person) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>required int32 age = 2;</code>
       */
      public boolean hasAge() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 age = 2;</code>
       */
      public int getAge() {
        return age_;
      }
      /**
       * <code>required int32 age = 2;</code>
       */
      public Builder setAge(int value) {
        bitField0_ |= 0x00000002;
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 age = 2;</code>
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000002);
        age_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object phone_ = "";
      /**
       * <code>required string phone = 3;</code>
       */
      public boolean hasPhone() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string phone = 3;</code>
       */
      public java.lang.String getPhone() {
        java.lang.Object ref = phone_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            phone_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string phone = 3;</code>
       */
      public com.google.protobuf.ByteString
          getPhoneBytes() {
        java.lang.Object ref = phone_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          phone_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string phone = 3;</code>
       */
      public Builder setPhone(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        phone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string phone = 3;</code>
       */
      public Builder clearPhone() {
        bitField0_ = (bitField0_ & ~0x00000004);
        phone_ = getDefaultInstance().getPhone();
        onChanged();
        return this;
      }
      /**
       * <code>required string phone = 3;</code>
       */
      public Builder setPhoneBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        phone_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object career_ = "";
      /**
       * <code>required string career = 4;</code>
       */
      public boolean hasCareer() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string career = 4;</code>
       */
      public java.lang.String getCareer() {
        java.lang.Object ref = career_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            career_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string career = 4;</code>
       */
      public com.google.protobuf.ByteString
          getCareerBytes() {
        java.lang.Object ref = career_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          career_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string career = 4;</code>
       */
      public Builder setCareer(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        career_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string career = 4;</code>
       */
      public Builder clearCareer() {
        bitField0_ = (bitField0_ & ~0x00000008);
        career_ = getDefaultInstance().getCareer();
        onChanged();
        return this;
      }
      /**
       * <code>required string career = 4;</code>
       */
      public Builder setCareerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        career_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Person)
    }

    // @@protoc_insertion_point(class_scope:Person)
    private static final com.brctl.serial.protobuf.bean.PersonOuterClass.Person DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.brctl.serial.protobuf.bean.PersonOuterClass.Person();
    }

    public static com.brctl.serial.protobuf.bean.PersonOuterClass.Person getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Person>
        PARSER = new com.google.protobuf.AbstractParser<Person>() {
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Person(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Person> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    public com.brctl.serial.protobuf.bean.PersonOuterClass.Person getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\"B\n\006Person\022\014\n\004name\030\001 \002(\t\022\013" +
      "\n\003age\030\002 \002(\005\022\r\n\005phone\030\003 \002(\t\022\016\n\006career\030\004 \002" +
      "(\tB \n\036com.brctl.serial.protobuf.bean"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Name", "Age", "Phone", "Career", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
