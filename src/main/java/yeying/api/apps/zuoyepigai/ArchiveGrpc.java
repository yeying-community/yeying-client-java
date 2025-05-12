package yeying.api.apps.zuoyepigai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *档案管理
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/apps/zuoyepigai/archive.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ArchiveGrpc {

  private ArchiveGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.apps.zuoyepigai.Archive";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest.class,
      responseType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse> getListMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse> getListMethod;
    if ((getListMethod = ArchiveGrpc.getListMethod) == null) {
      synchronized (ArchiveGrpc.class) {
        if ((getListMethod = ArchiveGrpc.getListMethod) == null) {
          ArchiveGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArchiveMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest.class,
      responseType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse> getDetailMethod;
    if ((getDetailMethod = ArchiveGrpc.getDetailMethod) == null) {
      synchronized (ArchiveGrpc.class) {
        if ((getDetailMethod = ArchiveGrpc.getDetailMethod) == null) {
          ArchiveGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArchiveMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse> getDetailByStudentDidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetailByStudentDid",
      requestType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest.class,
      responseType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse> getDetailByStudentDidMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse> getDetailByStudentDidMethod;
    if ((getDetailByStudentDidMethod = ArchiveGrpc.getDetailByStudentDidMethod) == null) {
      synchronized (ArchiveGrpc.class) {
        if ((getDetailByStudentDidMethod = ArchiveGrpc.getDetailByStudentDidMethod) == null) {
          ArchiveGrpc.getDetailByStudentDidMethod = getDetailByStudentDidMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetailByStudentDid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArchiveMethodDescriptorSupplier("DetailByStudentDid"))
              .build();
        }
      }
    }
    return getDetailByStudentDidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest.class,
      responseType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse> getAddMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse> getAddMethod;
    if ((getAddMethod = ArchiveGrpc.getAddMethod) == null) {
      synchronized (ArchiveGrpc.class) {
        if ((getAddMethod = ArchiveGrpc.getAddMethod) == null) {
          ArchiveGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArchiveMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest.class,
      responseType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ArchiveGrpc.getDeleteMethod) == null) {
      synchronized (ArchiveGrpc.class) {
        if ((getDeleteMethod = ArchiveGrpc.getDeleteMethod) == null) {
          ArchiveGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArchiveMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest.class,
      responseType = yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest,
      yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = ArchiveGrpc.getUpdateMethod) == null) {
      synchronized (ArchiveGrpc.class) {
        if ((getUpdateMethod = ArchiveGrpc.getUpdateMethod) == null) {
          ArchiveGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest, yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ArchiveMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArchiveStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArchiveStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArchiveStub>() {
        @java.lang.Override
        public ArchiveStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArchiveStub(channel, callOptions);
        }
      };
    return ArchiveStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ArchiveBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArchiveBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArchiveBlockingV2Stub>() {
        @java.lang.Override
        public ArchiveBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArchiveBlockingV2Stub(channel, callOptions);
        }
      };
    return ArchiveBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArchiveBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArchiveBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArchiveBlockingStub>() {
        @java.lang.Override
        public ArchiveBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArchiveBlockingStub(channel, callOptions);
        }
      };
    return ArchiveBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArchiveFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArchiveFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArchiveFutureStub>() {
        @java.lang.Override
        public ArchiveFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArchiveFutureStub(channel, callOptions);
        }
      };
    return ArchiveFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *档案管理
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 列表
     * </pre>
     */
    default void list(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 详情：老师调用，根据 uid 主键查询
     * </pre>
     */
    default void detail(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 详情：学生调用，根据 studentDid 调用
     * </pre>
     */
    default void detailByStudentDid(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailByStudentDidMethod(), responseObserver);
    }

    /**
     * <pre>
     * 添加
     * </pre>
     */
    default void add(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除
     * </pre>
     */
    default void delete(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 修改
     * </pre>
     */
    default void update(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Archive.
   * <pre>
   **
   *档案管理
   * </pre>
   */
  public static abstract class ArchiveImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ArchiveGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Archive.
   * <pre>
   **
   *档案管理
   * </pre>
   */
  public static final class ArchiveStub
      extends io.grpc.stub.AbstractAsyncStub<ArchiveStub> {
    private ArchiveStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArchiveStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArchiveStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public void list(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 详情：老师调用，根据 uid 主键查询
     * </pre>
     */
    public void detail(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 详情：学生调用，根据 studentDid 调用
     * </pre>
     */
    public void detailByStudentDid(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailByStudentDidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 添加
     * </pre>
     */
    public void add(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除
     * </pre>
     */
    public void delete(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 修改
     * </pre>
     */
    public void update(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Archive.
   * <pre>
   **
   *档案管理
   * </pre>
   */
  public static final class ArchiveBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ArchiveBlockingV2Stub> {
    private ArchiveBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArchiveBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArchiveBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse list(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 详情：老师调用，根据 uid 主键查询
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse detail(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 详情：学生调用，根据 studentDid 调用
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse detailByStudentDid(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailByStudentDidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 添加
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse add(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse delete(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 修改
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse update(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Archive.
   * <pre>
   **
   *档案管理
   * </pre>
   */
  public static final class ArchiveBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ArchiveBlockingStub> {
    private ArchiveBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArchiveBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArchiveBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse list(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 详情：老师调用，根据 uid 主键查询
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse detail(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 详情：学生调用，根据 studentDid 调用
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse detailByStudentDid(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailByStudentDidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 添加
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse add(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse delete(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 修改
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse update(yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Archive.
   * <pre>
   **
   *档案管理
   * </pre>
   */
  public static final class ArchiveFutureStub
      extends io.grpc.stub.AbstractFutureStub<ArchiveFutureStub> {
    private ArchiveFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArchiveFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArchiveFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse> list(
        yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 详情：老师调用，根据 uid 主键查询
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse> detail(
        yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 详情：学生调用，根据 studentDid 调用
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse> detailByStudentDid(
        yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailByStudentDidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 添加
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse> add(
        yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse> delete(
        yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 修改
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse> update(
        yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DETAIL = 1;
  private static final int METHODID_DETAIL_BY_STUDENT_DID = 2;
  private static final int METHODID_ADD = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_UPDATE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse>) responseObserver);
          break;
        case METHODID_DETAIL_BY_STUDENT_DID:
          serviceImpl.detailByStudentDid((yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListRequest,
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveListResponse>(
                service, METHODID_LIST)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailRequest,
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getDetailByStudentDidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentRequest,
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDetailStudentResponse>(
                service, METHODID_DETAIL_BY_STUDENT_DID)))
        .addMethod(
          getAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddRequest,
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveAddResponse>(
                service, METHODID_ADD)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteRequest,
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveDeleteResponse>(
                service, METHODID_DELETE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateRequest,
              yeying.api.apps.zuoyepigai.ArchiveOuterClass.ArchiveUpdateResponse>(
                service, METHODID_UPDATE)))
        .build();
  }

  private static abstract class ArchiveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArchiveBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.apps.zuoyepigai.ArchiveOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Archive");
    }
  }

  private static final class ArchiveFileDescriptorSupplier
      extends ArchiveBaseDescriptorSupplier {
    ArchiveFileDescriptorSupplier() {}
  }

  private static final class ArchiveMethodDescriptorSupplier
      extends ArchiveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ArchiveMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ArchiveGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArchiveFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getDetailMethod())
              .addMethod(getDetailByStudentDidMethod())
              .addMethod(getAddMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
