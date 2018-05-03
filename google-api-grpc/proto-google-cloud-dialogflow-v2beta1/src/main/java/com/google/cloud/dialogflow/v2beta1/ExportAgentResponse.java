// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The response message for [Agents.ExportAgent][google.cloud.dialogflow.v2beta1.Agents.ExportAgent].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.ExportAgentResponse}
 */
public  final class ExportAgentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.ExportAgentResponse)
    ExportAgentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportAgentResponse.newBuilder() to construct.
  private ExportAgentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportAgentResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExportAgentResponse(
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
            agentCase_ = 1;
            agent_ = s;
            break;
          }
          case 18: {
            agentCase_ = 2;
            agent_ = input.readBytes();
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
    return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.ExportAgentResponse.class, com.google.cloud.dialogflow.v2beta1.ExportAgentResponse.Builder.class);
  }

  private int agentCase_ = 0;
  private java.lang.Object agent_;
  public enum AgentCase
      implements com.google.protobuf.Internal.EnumLite {
    AGENT_URI(1),
    AGENT_CONTENT(2),
    AGENT_NOT_SET(0);
    private final int value;
    private AgentCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AgentCase valueOf(int value) {
      return forNumber(value);
    }

    public static AgentCase forNumber(int value) {
      switch (value) {
        case 1: return AGENT_URI;
        case 2: return AGENT_CONTENT;
        case 0: return AGENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AgentCase
  getAgentCase() {
    return AgentCase.forNumber(
        agentCase_);
  }

  public static final int AGENT_URI_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The URI to a file containing the exported agent. This field is populated
   * only if `agent_uri` is specified in `ExportAgentRequest`.
   * </pre>
   *
   * <code>string agent_uri = 1;</code>
   */
  public java.lang.String getAgentUri() {
    java.lang.Object ref = "";
    if (agentCase_ == 1) {
      ref = agent_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (agentCase_ == 1) {
        agent_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The URI to a file containing the exported agent. This field is populated
   * only if `agent_uri` is specified in `ExportAgentRequest`.
   * </pre>
   *
   * <code>string agent_uri = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAgentUriBytes() {
    java.lang.Object ref = "";
    if (agentCase_ == 1) {
      ref = agent_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (agentCase_ == 1) {
        agent_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGENT_CONTENT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The exported agent.
   * Example for how to export an agent to a zip file via a command line:
   * curl &#92;
   *   'https://dialogflow.googleapis.com/v2beta1/projects/&lt;project_name&gt;/agent:export'&#92;
   *   -X POST &#92;
   *   -H 'Authorization: Bearer '$(gcloud auth print-access-token) &#92;
   *   -H 'Accept: application/json' &#92;
   *   -H 'Content-Type: application/json' &#92;
   *   --compressed &#92;
   *   --data-binary '{}' &#92;
   * | grep agentContent | sed -e 's/.*"agentContent": "&#92;([^"]*&#92;)".*&#47;&#92;1/' &#92;
   * | base64 --decode &gt; &lt;agent zip file&gt;
   * </pre>
   *
   * <code>bytes agent_content = 2;</code>
   */
  public com.google.protobuf.ByteString getAgentContent() {
    if (agentCase_ == 2) {
      return (com.google.protobuf.ByteString) agent_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (agentCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, agent_);
    }
    if (agentCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) agent_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, agent_);
    }
    if (agentCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) agent_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.ExportAgentResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.ExportAgentResponse other = (com.google.cloud.dialogflow.v2beta1.ExportAgentResponse) obj;

    boolean result = true;
    result = result && getAgentCase().equals(
        other.getAgentCase());
    if (!result) return false;
    switch (agentCase_) {
      case 1:
        result = result && getAgentUri()
            .equals(other.getAgentUri());
        break;
      case 2:
        result = result && getAgentContent()
            .equals(other.getAgentContent());
        break;
      case 0:
      default:
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
    switch (agentCase_) {
      case 1:
        hash = (37 * hash) + AGENT_URI_FIELD_NUMBER;
        hash = (53 * hash) + getAgentUri().hashCode();
        break;
      case 2:
        hash = (37 * hash) + AGENT_CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getAgentContent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.ExportAgentResponse prototype) {
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
   * The response message for [Agents.ExportAgent][google.cloud.dialogflow.v2beta1.Agents.ExportAgent].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.ExportAgentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.ExportAgentResponse)
      com.google.cloud.dialogflow.v2beta1.ExportAgentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.ExportAgentResponse.class, com.google.cloud.dialogflow.v2beta1.ExportAgentResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.ExportAgentResponse.newBuilder()
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
      agentCase_ = 0;
      agent_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto.internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor;
    }

    public com.google.cloud.dialogflow.v2beta1.ExportAgentResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.ExportAgentResponse.getDefaultInstance();
    }

    public com.google.cloud.dialogflow.v2beta1.ExportAgentResponse build() {
      com.google.cloud.dialogflow.v2beta1.ExportAgentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dialogflow.v2beta1.ExportAgentResponse buildPartial() {
      com.google.cloud.dialogflow.v2beta1.ExportAgentResponse result = new com.google.cloud.dialogflow.v2beta1.ExportAgentResponse(this);
      if (agentCase_ == 1) {
        result.agent_ = agent_;
      }
      if (agentCase_ == 2) {
        result.agent_ = agent_;
      }
      result.agentCase_ = agentCase_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.ExportAgentResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.ExportAgentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.ExportAgentResponse other) {
      if (other == com.google.cloud.dialogflow.v2beta1.ExportAgentResponse.getDefaultInstance()) return this;
      switch (other.getAgentCase()) {
        case AGENT_URI: {
          agentCase_ = 1;
          agent_ = other.agent_;
          onChanged();
          break;
        }
        case AGENT_CONTENT: {
          setAgentContent(other.getAgentContent());
          break;
        }
        case AGENT_NOT_SET: {
          break;
        }
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
      com.google.cloud.dialogflow.v2beta1.ExportAgentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.ExportAgentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int agentCase_ = 0;
    private java.lang.Object agent_;
    public AgentCase
        getAgentCase() {
      return AgentCase.forNumber(
          agentCase_);
    }

    public Builder clearAgent() {
      agentCase_ = 0;
      agent_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * The URI to a file containing the exported agent. This field is populated
     * only if `agent_uri` is specified in `ExportAgentRequest`.
     * </pre>
     *
     * <code>string agent_uri = 1;</code>
     */
    public java.lang.String getAgentUri() {
      java.lang.Object ref = "";
      if (agentCase_ == 1) {
        ref = agent_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (agentCase_ == 1) {
          agent_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URI to a file containing the exported agent. This field is populated
     * only if `agent_uri` is specified in `ExportAgentRequest`.
     * </pre>
     *
     * <code>string agent_uri = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAgentUriBytes() {
      java.lang.Object ref = "";
      if (agentCase_ == 1) {
        ref = agent_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (agentCase_ == 1) {
          agent_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URI to a file containing the exported agent. This field is populated
     * only if `agent_uri` is specified in `ExportAgentRequest`.
     * </pre>
     *
     * <code>string agent_uri = 1;</code>
     */
    public Builder setAgentUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  agentCase_ = 1;
      agent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URI to a file containing the exported agent. This field is populated
     * only if `agent_uri` is specified in `ExportAgentRequest`.
     * </pre>
     *
     * <code>string agent_uri = 1;</code>
     */
    public Builder clearAgentUri() {
      if (agentCase_ == 1) {
        agentCase_ = 0;
        agent_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The URI to a file containing the exported agent. This field is populated
     * only if `agent_uri` is specified in `ExportAgentRequest`.
     * </pre>
     *
     * <code>string agent_uri = 1;</code>
     */
    public Builder setAgentUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      agentCase_ = 1;
      agent_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * The exported agent.
     * Example for how to export an agent to a zip file via a command line:
     * curl &#92;
     *   'https://dialogflow.googleapis.com/v2beta1/projects/&lt;project_name&gt;/agent:export'&#92;
     *   -X POST &#92;
     *   -H 'Authorization: Bearer '$(gcloud auth print-access-token) &#92;
     *   -H 'Accept: application/json' &#92;
     *   -H 'Content-Type: application/json' &#92;
     *   --compressed &#92;
     *   --data-binary '{}' &#92;
     * | grep agentContent | sed -e 's/.*"agentContent": "&#92;([^"]*&#92;)".*&#47;&#92;1/' &#92;
     * | base64 --decode &gt; &lt;agent zip file&gt;
     * </pre>
     *
     * <code>bytes agent_content = 2;</code>
     */
    public com.google.protobuf.ByteString getAgentContent() {
      if (agentCase_ == 2) {
        return (com.google.protobuf.ByteString) agent_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * The exported agent.
     * Example for how to export an agent to a zip file via a command line:
     * curl &#92;
     *   'https://dialogflow.googleapis.com/v2beta1/projects/&lt;project_name&gt;/agent:export'&#92;
     *   -X POST &#92;
     *   -H 'Authorization: Bearer '$(gcloud auth print-access-token) &#92;
     *   -H 'Accept: application/json' &#92;
     *   -H 'Content-Type: application/json' &#92;
     *   --compressed &#92;
     *   --data-binary '{}' &#92;
     * | grep agentContent | sed -e 's/.*"agentContent": "&#92;([^"]*&#92;)".*&#47;&#92;1/' &#92;
     * | base64 --decode &gt; &lt;agent zip file&gt;
     * </pre>
     *
     * <code>bytes agent_content = 2;</code>
     */
    public Builder setAgentContent(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  agentCase_ = 2;
      agent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The exported agent.
     * Example for how to export an agent to a zip file via a command line:
     * curl &#92;
     *   'https://dialogflow.googleapis.com/v2beta1/projects/&lt;project_name&gt;/agent:export'&#92;
     *   -X POST &#92;
     *   -H 'Authorization: Bearer '$(gcloud auth print-access-token) &#92;
     *   -H 'Accept: application/json' &#92;
     *   -H 'Content-Type: application/json' &#92;
     *   --compressed &#92;
     *   --data-binary '{}' &#92;
     * | grep agentContent | sed -e 's/.*"agentContent": "&#92;([^"]*&#92;)".*&#47;&#92;1/' &#92;
     * | base64 --decode &gt; &lt;agent zip file&gt;
     * </pre>
     *
     * <code>bytes agent_content = 2;</code>
     */
    public Builder clearAgentContent() {
      if (agentCase_ == 2) {
        agentCase_ = 0;
        agent_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.ExportAgentResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.ExportAgentResponse)
  private static final com.google.cloud.dialogflow.v2beta1.ExportAgentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.ExportAgentResponse();
  }

  public static com.google.cloud.dialogflow.v2beta1.ExportAgentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportAgentResponse>
      PARSER = new com.google.protobuf.AbstractParser<ExportAgentResponse>() {
    public ExportAgentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExportAgentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExportAgentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportAgentResponse> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dialogflow.v2beta1.ExportAgentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

