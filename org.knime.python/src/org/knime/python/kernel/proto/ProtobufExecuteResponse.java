// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: executeresponse.proto

package org.knime.python.kernel.proto;

public final class ProtobufExecuteResponse {
  private ProtobufExecuteResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ExecuteResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string output = 1;
    /**
     * <code>required string output = 1;</code>
     */
    boolean hasOutput();
    /**
     * <code>required string output = 1;</code>
     */
    java.lang.String getOutput();
    /**
     * <code>required string output = 1;</code>
     */
    com.google.protobuf.ByteString
        getOutputBytes();

    // required string error = 2;
    /**
     * <code>required string error = 2;</code>
     */
    boolean hasError();
    /**
     * <code>required string error = 2;</code>
     */
    java.lang.String getError();
    /**
     * <code>required string error = 2;</code>
     */
    com.google.protobuf.ByteString
        getErrorBytes();
  }
  /**
   * Protobuf type {@code knime.ExecuteResponse}
   */
  public static final class ExecuteResponse extends
      com.google.protobuf.GeneratedMessage
      implements ExecuteResponseOrBuilder {
    // Use ExecuteResponse.newBuilder() to construct.
    private ExecuteResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ExecuteResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ExecuteResponse defaultInstance;
    public static ExecuteResponse getDefaultInstance() {
      return defaultInstance;
    }

    public ExecuteResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ExecuteResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              output_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              error_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.knime.python.kernel.proto.ProtobufExecuteResponse.internal_static_knime_ExecuteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.knime.python.kernel.proto.ProtobufExecuteResponse.internal_static_knime_ExecuteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse.class, org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<ExecuteResponse> PARSER =
        new com.google.protobuf.AbstractParser<ExecuteResponse>() {
      public ExecuteResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExecuteResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ExecuteResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string output = 1;
    public static final int OUTPUT_FIELD_NUMBER = 1;
    private java.lang.Object output_;
    /**
     * <code>required string output = 1;</code>
     */
    public boolean hasOutput() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string output = 1;</code>
     */
    public java.lang.String getOutput() {
      java.lang.Object ref = output_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          output_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string output = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOutputBytes() {
      java.lang.Object ref = output_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        output_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string error = 2;
    public static final int ERROR_FIELD_NUMBER = 2;
    private java.lang.Object error_;
    /**
     * <code>required string error = 2;</code>
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string error = 2;</code>
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          error_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string error = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      output_ = "";
      error_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasOutput()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasError()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getOutputBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getErrorBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getOutputBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getErrorBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code knime.ExecuteResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.knime.python.kernel.proto.ProtobufExecuteResponse.internal_static_knime_ExecuteResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.knime.python.kernel.proto.ProtobufExecuteResponse.internal_static_knime_ExecuteResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse.class, org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse.Builder.class);
      }

      // Construct using org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        output_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        error_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.knime.python.kernel.proto.ProtobufExecuteResponse.internal_static_knime_ExecuteResponse_descriptor;
      }

      public org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse getDefaultInstanceForType() {
        return org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse.getDefaultInstance();
      }

      public org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse build() {
        org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse buildPartial() {
        org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse result = new org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.output_ = output_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.error_ = error_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse) {
          return mergeFrom((org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse other) {
        if (other == org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse.getDefaultInstance()) return this;
        if (other.hasOutput()) {
          bitField0_ |= 0x00000001;
          output_ = other.output_;
          onChanged();
        }
        if (other.hasError()) {
          bitField0_ |= 0x00000002;
          error_ = other.error_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasOutput()) {
          
          return false;
        }
        if (!hasError()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.knime.python.kernel.proto.ProtobufExecuteResponse.ExecuteResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string output = 1;
      private java.lang.Object output_ = "";
      /**
       * <code>required string output = 1;</code>
       */
      public boolean hasOutput() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string output = 1;</code>
       */
      public java.lang.String getOutput() {
        java.lang.Object ref = output_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          output_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string output = 1;</code>
       */
      public com.google.protobuf.ByteString
          getOutputBytes() {
        java.lang.Object ref = output_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          output_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string output = 1;</code>
       */
      public Builder setOutput(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        output_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string output = 1;</code>
       */
      public Builder clearOutput() {
        bitField0_ = (bitField0_ & ~0x00000001);
        output_ = getDefaultInstance().getOutput();
        onChanged();
        return this;
      }
      /**
       * <code>required string output = 1;</code>
       */
      public Builder setOutputBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        output_ = value;
        onChanged();
        return this;
      }

      // required string error = 2;
      private java.lang.Object error_ = "";
      /**
       * <code>required string error = 2;</code>
       */
      public boolean hasError() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string error = 2;</code>
       */
      public java.lang.String getError() {
        java.lang.Object ref = error_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          error_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string error = 2;</code>
       */
      public com.google.protobuf.ByteString
          getErrorBytes() {
        java.lang.Object ref = error_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          error_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string error = 2;</code>
       */
      public Builder setError(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        error_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string error = 2;</code>
       */
      public Builder clearError() {
        bitField0_ = (bitField0_ & ~0x00000002);
        error_ = getDefaultInstance().getError();
        onChanged();
        return this;
      }
      /**
       * <code>required string error = 2;</code>
       */
      public Builder setErrorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        error_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:knime.ExecuteResponse)
    }

    static {
      defaultInstance = new ExecuteResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:knime.ExecuteResponse)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_knime_ExecuteResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_knime_ExecuteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025executeresponse.proto\022\005knime\"0\n\017Execut" +
      "eResponse\022\016\n\006output\030\001 \002(\t\022\r\n\005error\030\002 \002(\t" +
      "B8\n\035org.knime.python.kernel.protoB\027Proto" +
      "bufExecuteResponse"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_knime_ExecuteResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_knime_ExecuteResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_knime_ExecuteResponse_descriptor,
              new java.lang.String[] { "Output", "Error", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
