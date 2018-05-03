// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p2beta1/image_annotator.proto

package com.google.cloud.vision.v1p2beta1;

public interface AsyncBatchAnnotateFilesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest> 
      getRequestsList();
  /**
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest getRequests(int index);
  /**
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  int getRequestsCount();
  /**
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequestOrBuilder> 
      getRequestsOrBuilderList();
  /**
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.AsyncAnnotateFileRequestOrBuilder getRequestsOrBuilder(
      int index);
}
