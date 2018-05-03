// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/webhook.proto

package com.google.cloud.dialogflow.v2;

public interface OriginalDetectIntentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.OriginalDetectIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The source of this request, e.g., `google`, `facebook`, `slack`. It is set
   * by Dialogflow-owned servers.
   * </pre>
   *
   * <code>string source = 1;</code>
   */
  java.lang.String getSource();
  /**
   * <pre>
   * The source of this request, e.g., `google`, `facebook`, `slack`. It is set
   * by Dialogflow-owned servers.
   * </pre>
   *
   * <code>string source = 1;</code>
   */
  com.google.protobuf.ByteString
      getSourceBytes();

  /**
   * <pre>
   * Optional. This field is set to the value of `QueryParameters.payload` field
   * passed in the request.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   */
  boolean hasPayload();
  /**
   * <pre>
   * Optional. This field is set to the value of `QueryParameters.payload` field
   * passed in the request.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   */
  com.google.protobuf.Struct getPayload();
  /**
   * <pre>
   * Optional. This field is set to the value of `QueryParameters.payload` field
   * passed in the request.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();
}
