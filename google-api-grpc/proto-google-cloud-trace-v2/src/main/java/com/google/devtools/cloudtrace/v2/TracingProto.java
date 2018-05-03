// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v2/tracing.proto

package com.google.devtools.cloudtrace.v2;

public final class TracingProto {
  private TracingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/devtools/cloudtrace/v2/tracing." +
      "proto\022\035google.devtools.cloudtrace.v2\032\034go" +
      "ogle/api/annotations.proto\032)google/devto" +
      "ols/cloudtrace/v2/trace.proto\032\033google/pr" +
      "otobuf/empty.proto\032\037google/protobuf/time" +
      "stamp.proto\"Z\n\026BatchWriteSpansRequest\022\014\n" +
      "\004name\030\001 \001(\t\0222\n\005spans\030\002 \003(\0132#.google.devt" +
      "ools.cloudtrace.v2.Span2\257\002\n\014TraceService" +
      "\022\224\001\n\017BatchWriteSpans\0225.google.devtools.c" +
      "loudtrace.v2.BatchWriteSpansRequest\032\026.go" +
      "ogle.protobuf.Empty\"2\202\323\344\223\002,\"\'/v2/{name=p" +
      "rojects/*}/traces:batchWrite:\001*\022\207\001\n\nCrea" +
      "teSpan\022#.google.devtools.cloudtrace.v2.S" +
      "pan\032#.google.devtools.cloudtrace.v2.Span" +
      "\"/\202\323\344\223\002)\"$/v2/{name=projects/*/traces/*}" +
      "/spans:\001*B\254\001\n!com.google.devtools.cloudt" +
      "race.v2B\014TracingProtoP\001ZGgoogle.golang.o" +
      "rg/genproto/googleapis/devtools/cloudtra" +
      "ce/v2;cloudtrace\252\002\025Google.Cloud.Trace.V2" +
      "\312\002\025Google\\Cloud\\Trace\\V2b\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.devtools.cloudtrace.v2.TraceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_descriptor,
        new java.lang.String[] { "Name", "Spans", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.devtools.cloudtrace.v2.TraceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
