/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/crawled_url.proto

package com.google.cloud.websecurityscanner.v1beta;

public final class CrawledUrlProto {
  private CrawledUrlProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1beta_CrawledUrl_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1beta_CrawledUrl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/websecurityscanner/v1beta"
          + "/crawled_url.proto\022&google.cloud.websecu"
          + "rityscanner.v1beta\"<\n\nCrawledUrl\022\023\n\013http"
          + "_method\030\001 \001(\t\022\013\n\003url\030\002 \001(\t\022\014\n\004body\030\003 \001(\t"
          + "B\302\001\n*com.google.cloud.websecurityscanner"
          + ".v1betaB\017CrawledUrlProtoP\001ZXgoogle.golan"
          + "g.org/genproto/googleapis/cloud/websecur"
          + "ityscanner/v1beta;websecurityscanner\312\002&G"
          + "oogle\\Cloud\\WebSecurityScanner\\V1betab\006p"
          + "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    internal_static_google_cloud_websecurityscanner_v1beta_CrawledUrl_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1beta_CrawledUrl_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1beta_CrawledUrl_descriptor,
            new java.lang.String[] {
              "HttpMethod", "Url", "Body",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
