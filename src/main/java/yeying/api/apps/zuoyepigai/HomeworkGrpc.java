package yeying.api.apps.zuoyepigai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *作业管理
 *对应 DB 表： zuoyepigai.school_assignment
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/apps/zuoyepigai/homework.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HomeworkGrpc {

  private HomeworkGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.apps.zuoyepigai.Homework";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest,
      yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest.class,
      responseType = yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest,
      yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse> getListMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest, yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse> getListMethod;
    if ((getListMethod = HomeworkGrpc.getListMethod) == null) {
      synchronized (HomeworkGrpc.class) {
        if ((getListMethod = HomeworkGrpc.getListMethod) == null) {
          HomeworkGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest, yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HomeworkMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest,
      yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest.class,
      responseType = yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest,
      yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest, yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse> getDetailMethod;
    if ((getDetailMethod = HomeworkGrpc.getDetailMethod) == null) {
      synchronized (HomeworkGrpc.class) {
        if ((getDetailMethod = HomeworkGrpc.getDetailMethod) == null) {
          HomeworkGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest, yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HomeworkMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HomeworkStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeworkStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeworkStub>() {
        @java.lang.Override
        public HomeworkStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeworkStub(channel, callOptions);
        }
      };
    return HomeworkStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static HomeworkBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeworkBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeworkBlockingV2Stub>() {
        @java.lang.Override
        public HomeworkBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeworkBlockingV2Stub(channel, callOptions);
        }
      };
    return HomeworkBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HomeworkBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeworkBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeworkBlockingStub>() {
        @java.lang.Override
        public HomeworkBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeworkBlockingStub(channel, callOptions);
        }
      };
    return HomeworkBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HomeworkFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeworkFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeworkFutureStub>() {
        @java.lang.Override
        public HomeworkFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeworkFutureStub(channel, callOptions);
        }
      };
    return HomeworkFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *作业管理
   *对应 DB 表： zuoyepigai.school_assignment
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 列表
     * </pre>
     */
    default void list(yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 详情
     * </pre>
     */
    default void detail(yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Homework.
   * <pre>
   **
   *作业管理
   *对应 DB 表： zuoyepigai.school_assignment
   * </pre>
   */
  public static abstract class HomeworkImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HomeworkGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Homework.
   * <pre>
   **
   *作业管理
   *对应 DB 表： zuoyepigai.school_assignment
   * </pre>
   */
  public static final class HomeworkStub
      extends io.grpc.stub.AbstractAsyncStub<HomeworkStub> {
    private HomeworkStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeworkStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeworkStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public void list(yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 详情
     * </pre>
     */
    public void detail(yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Homework.
   * <pre>
   **
   *作业管理
   *对应 DB 表： zuoyepigai.school_assignment
   * </pre>
   */
  public static final class HomeworkBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<HomeworkBlockingV2Stub> {
    private HomeworkBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeworkBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeworkBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse list(yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 详情
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse detail(yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Homework.
   * <pre>
   **
   *作业管理
   *对应 DB 表： zuoyepigai.school_assignment
   * </pre>
   */
  public static final class HomeworkBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HomeworkBlockingStub> {
    private HomeworkBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeworkBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeworkBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse list(yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 详情
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse detail(yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Homework.
   * <pre>
   **
   *作业管理
   *对应 DB 表： zuoyepigai.school_assignment
   * </pre>
   */
  public static final class HomeworkFutureStub
      extends io.grpc.stub.AbstractFutureStub<HomeworkFutureStub> {
    private HomeworkFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeworkFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeworkFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse> list(
        yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse> detail(
        yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DETAIL = 1;

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
          serviceImpl.list((yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse>) responseObserver);
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
              yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListRequest,
              yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkListResponse>(
                service, METHODID_LIST)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailRequest,
              yeying.api.apps.zuoyepigai.HomeworkOuterClass.HomeworkDetailResponse>(
                service, METHODID_DETAIL)))
        .build();
  }

  private static abstract class HomeworkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HomeworkBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.apps.zuoyepigai.HomeworkOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Homework");
    }
  }

  private static final class HomeworkFileDescriptorSupplier
      extends HomeworkBaseDescriptorSupplier {
    HomeworkFileDescriptorSupplier() {}
  }

  private static final class HomeworkMethodDescriptorSupplier
      extends HomeworkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HomeworkMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HomeworkGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HomeworkFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
