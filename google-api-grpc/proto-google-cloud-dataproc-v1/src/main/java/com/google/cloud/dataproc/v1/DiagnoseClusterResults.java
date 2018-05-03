// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * The location of diagnostic output.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.DiagnoseClusterResults}
 */
public  final class DiagnoseClusterResults extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.DiagnoseClusterResults)
    DiagnoseClusterResultsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiagnoseClusterResults.newBuilder() to construct.
  private DiagnoseClusterResults(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiagnoseClusterResults() {
    outputUri_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DiagnoseClusterResults(
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            outputUri_ = s;
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
    return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_DiagnoseClusterResults_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_DiagnoseClusterResults_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.DiagnoseClusterResults.class, com.google.cloud.dataproc.v1.DiagnoseClusterResults.Builder.class);
  }

  public static final int OUTPUT_URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object outputUri_;
  /**
   * <pre>
   * Output-only. The Google Cloud Storage URI of the diagnostic output.
   * The output report is a plain text file with a summary of collected
   * diagnostics.
   * </pre>
   *
   * <code>string output_uri = 1;</code>
   */
  public java.lang.String getOutputUri() {
    java.lang.Object ref = outputUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output-only. The Google Cloud Storage URI of the diagnostic output.
   * The output report is a plain text file with a summary of collected
   * diagnostics.
   * </pre>
   *
   * <code>string output_uri = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOutputUriBytes() {
    java.lang.Object ref = outputUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outputUri_ = b;
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

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getOutputUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, outputUri_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOutputUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, outputUri_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.DiagnoseClusterResults)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.DiagnoseClusterResults other = (com.google.cloud.dataproc.v1.DiagnoseClusterResults) obj;

    boolean result = true;
    result = result && getOutputUri()
        .equals(other.getOutputUri());
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
    hash = (37 * hash) + OUTPUT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getOutputUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.DiagnoseClusterResults prototype) {
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
   * <pre>
   * The location of diagnostic output.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.DiagnoseClusterResults}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.DiagnoseClusterResults)
      com.google.cloud.dataproc.v1.DiagnoseClusterResultsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_DiagnoseClusterResults_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_DiagnoseClusterResults_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.DiagnoseClusterResults.class, com.google.cloud.dataproc.v1.DiagnoseClusterResults.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.DiagnoseClusterResults.newBuilder()
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
      outputUri_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto.internal_static_google_cloud_dataproc_v1_DiagnoseClusterResults_descriptor;
    }

    public com.google.cloud.dataproc.v1.DiagnoseClusterResults getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.DiagnoseClusterResults.getDefaultInstance();
    }

    public com.google.cloud.dataproc.v1.DiagnoseClusterResults build() {
      com.google.cloud.dataproc.v1.DiagnoseClusterResults result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dataproc.v1.DiagnoseClusterResults buildPartial() {
      com.google.cloud.dataproc.v1.DiagnoseClusterResults result = new com.google.cloud.dataproc.v1.DiagnoseClusterResults(this);
      result.outputUri_ = outputUri_;
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
      if (other instanceof com.google.cloud.dataproc.v1.DiagnoseClusterResults) {
        return mergeFrom((com.google.cloud.dataproc.v1.DiagnoseClusterResults)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.DiagnoseClusterResults other) {
      if (other == com.google.cloud.dataproc.v1.DiagnoseClusterResults.getDefaultInstance()) return this;
      if (!other.getOutputUri().isEmpty()) {
        outputUri_ = other.outputUri_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.dataproc.v1.DiagnoseClusterResults parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.DiagnoseClusterResults) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object outputUri_ = "";
    /**
     * <pre>
     * Output-only. The Google Cloud Storage URI of the diagnostic output.
     * The output report is a plain text file with a summary of collected
     * diagnostics.
     * </pre>
     *
     * <code>string output_uri = 1;</code>
     */
    public java.lang.String getOutputUri() {
      java.lang.Object ref = outputUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output-only. The Google Cloud Storage URI of the diagnostic output.
     * The output report is a plain text file with a summary of collected
     * diagnostics.
     * </pre>
     *
     * <code>string output_uri = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOutputUriBytes() {
      java.lang.Object ref = outputUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outputUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output-only. The Google Cloud Storage URI of the diagnostic output.
     * The output report is a plain text file with a summary of collected
     * diagnostics.
     * </pre>
     *
     * <code>string output_uri = 1;</code>
     */
    public Builder setOutputUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      outputUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output-only. The Google Cloud Storage URI of the diagnostic output.
     * The output report is a plain text file with a summary of collected
     * diagnostics.
     * </pre>
     *
     * <code>string output_uri = 1;</code>
     */
    public Builder clearOutputUri() {
      
      outputUri_ = getDefaultInstance().getOutputUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output-only. The Google Cloud Storage URI of the diagnostic output.
     * The output report is a plain text file with a summary of collected
     * diagnostics.
     * </pre>
     *
     * <code>string output_uri = 1;</code>
     */
    public Builder setOutputUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      outputUri_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.DiagnoseClusterResults)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.DiagnoseClusterResults)
  private static final com.google.cloud.dataproc.v1.DiagnoseClusterResults DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.DiagnoseClusterResults();
  }

  public static com.google.cloud.dataproc.v1.DiagnoseClusterResults getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiagnoseClusterResults>
      PARSER = new com.google.protobuf.AbstractParser<DiagnoseClusterResults>() {
    public DiagnoseClusterResults parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DiagnoseClusterResults(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DiagnoseClusterResults> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiagnoseClusterResults> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dataproc.v1.DiagnoseClusterResults getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

