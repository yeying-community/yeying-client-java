package yeying.api.apps.zuoyepigai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *资产仓库管理
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/apps/zuoyepigai/warehouse.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WarehouseGrpc {

  private WarehouseGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.apps.zuoyepigai.Warehouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest,
      yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest.class,
      responseType = yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest,
      yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse> getAddMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest, yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse> getAddMethod;
    if ((getAddMethod = WarehouseGrpc.getAddMethod) == null) {
      synchronized (WarehouseGrpc.class) {
        if ((getAddMethod = WarehouseGrpc.getAddMethod) == null) {
          WarehouseGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest, yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WarehouseMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest,
      yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest.class,
      responseType = yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest,
      yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse> getListMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest, yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse> getListMethod;
    if ((getListMethod = WarehouseGrpc.getListMethod) == null) {
      synchronized (WarehouseGrpc.class) {
        if ((getListMethod = WarehouseGrpc.getListMethod) == null) {
          WarehouseGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest, yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WarehouseMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest,
      yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest.class,
      responseType = yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest,
      yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest, yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse> getDetailMethod;
    if ((getDetailMethod = WarehouseGrpc.getDetailMethod) == null) {
      synchronized (WarehouseGrpc.class) {
        if ((getDetailMethod = WarehouseGrpc.getDetailMethod) == null) {
          WarehouseGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest, yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WarehouseMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WarehouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseStub>() {
        @java.lang.Override
        public WarehouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseStub(channel, callOptions);
        }
      };
    return WarehouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static WarehouseBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseBlockingV2Stub>() {
        @java.lang.Override
        public WarehouseBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseBlockingV2Stub(channel, callOptions);
        }
      };
    return WarehouseBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WarehouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseBlockingStub>() {
        @java.lang.Override
        public WarehouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseBlockingStub(channel, callOptions);
        }
      };
    return WarehouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WarehouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseFutureStub>() {
        @java.lang.Override
        public WarehouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseFutureStub(channel, callOptions);
        }
      };
    return WarehouseFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *资产仓库管理
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     **
     *资产上传：例如上传试卷：
     *1: 上传空白试卷
     *2: 上传空白试卷 + 对应的答案
     *3: 上传已作答的试卷
     * </pre>
     */
    default void add(yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *资产列表
     * </pre>
     */
    default void list(yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *资产列表
     * </pre>
     */
    default void detail(yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Warehouse.
   * <pre>
   **
   *资产仓库管理
   * </pre>
   */
  public static abstract class WarehouseImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WarehouseGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Warehouse.
   * <pre>
   **
   *资产仓库管理
   * </pre>
   */
  public static final class WarehouseStub
      extends io.grpc.stub.AbstractAsyncStub<WarehouseStub> {
    private WarehouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *资产上传：例如上传试卷：
     *1: 上传空白试卷
     *2: 上传空白试卷 + 对应的答案
     *3: 上传已作答的试卷
     * </pre>
     */
    public void add(yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *资产列表
     * </pre>
     */
    public void list(yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *资产列表
     * </pre>
     */
    public void detail(yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Warehouse.
   * <pre>
   **
   *资产仓库管理
   * </pre>
   */
  public static final class WarehouseBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<WarehouseBlockingV2Stub> {
    private WarehouseBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *资产上传：例如上传试卷：
     *1: 上传空白试卷
     *2: 上传空白试卷 + 对应的答案
     *3: 上传已作答的试卷
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse add(yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *资产列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse list(yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *资产列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse detail(yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Warehouse.
   * <pre>
   **
   *资产仓库管理
   * </pre>
   */
  public static final class WarehouseBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WarehouseBlockingStub> {
    private WarehouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *资产上传：例如上传试卷：
     *1: 上传空白试卷
     *2: 上传空白试卷 + 对应的答案
     *3: 上传已作答的试卷
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse add(yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *资产列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse list(yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *资产列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse detail(yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Warehouse.
   * <pre>
   **
   *资产仓库管理
   * </pre>
   */
  public static final class WarehouseFutureStub
      extends io.grpc.stub.AbstractFutureStub<WarehouseFutureStub> {
    private WarehouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     *资产上传：例如上传试卷：
     *1: 上传空白试卷
     *2: 上传空白试卷 + 对应的答案
     *3: 上传已作答的试卷
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse> add(
        yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *资产列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse> list(
        yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *资产列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse> detail(
        yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_DETAIL = 2;

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
        case METHODID_ADD:
          serviceImpl.add((yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse>) responseObserver);
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
          getAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseRequest,
              yeying.api.apps.zuoyepigai.WarehouseOuterClass.AddWarehouseResponse>(
                service, METHODID_ADD)))
        .addMethod(
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseRequest,
              yeying.api.apps.zuoyepigai.WarehouseOuterClass.ListWarehouseResponse>(
                service, METHODID_LIST)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseRequest,
              yeying.api.apps.zuoyepigai.WarehouseOuterClass.DetailWarehouseResponse>(
                service, METHODID_DETAIL)))
        .build();
  }

  private static abstract class WarehouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WarehouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.apps.zuoyepigai.WarehouseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Warehouse");
    }
  }

  private static final class WarehouseFileDescriptorSupplier
      extends WarehouseBaseDescriptorSupplier {
    WarehouseFileDescriptorSupplier() {}
  }

  private static final class WarehouseMethodDescriptorSupplier
      extends WarehouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WarehouseMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WarehouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WarehouseFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getListMethod())
              .addMethod(getDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
