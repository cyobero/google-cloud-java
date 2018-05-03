// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ReidentifyContentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ReidentifyContentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The re-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   */
  boolean hasItem();
  /**
   * <pre>
   * The re-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   */
  com.google.privacy.dlp.v2.ContentItem getItem();
  /**
   * <pre>
   * The re-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   */
  com.google.privacy.dlp.v2.ContentItemOrBuilder getItemOrBuilder();

  /**
   * <pre>
   * An overview of the changes that were made to the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
   */
  boolean hasOverview();
  /**
   * <pre>
   * An overview of the changes that were made to the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
   */
  com.google.privacy.dlp.v2.TransformationOverview getOverview();
  /**
   * <pre>
   * An overview of the changes that were made to the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
   */
  com.google.privacy.dlp.v2.TransformationOverviewOrBuilder getOverviewOrBuilder();
}
