package yeying.api.asset;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/asset/recycle.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RecycleGrpc {

  private RecycleGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.asset.Recycle";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest,
      yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest.class,
      responseType = yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest,
      yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest, yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse> getSearchMethod;
    if ((getSearchMethod = RecycleGrpc.getSearchMethod) == null) {
      synchronized (RecycleGrpc.class) {
        if ((getSearchMethod = RecycleGrpc.getSearchMethod) == null) {
          RecycleGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest, yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecycleMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest,
      yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse> getRecoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Recover",
      requestType = yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest.class,
      responseType = yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest,
      yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse> getRecoverMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest, yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse> getRecoverMethod;
    if ((getRecoverMethod = RecycleGrpc.getRecoverMethod) == null) {
      synchronized (RecycleGrpc.class) {
        if ((getRecoverMethod = RecycleGrpc.getRecoverMethod) == null) {
          RecycleGrpc.getRecoverMethod = getRecoverMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest, yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Recover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecycleMethodDescriptorSupplier("Recover"))
              .build();
        }
      }
    }
    return getRecoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest,
      yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest.class,
      responseType = yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest,
      yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest, yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse> getRemoveMethod;
    if ((getRemoveMethod = RecycleGrpc.getRemoveMethod) == null) {
      synchronized (RecycleGrpc.class) {
        if ((getRemoveMethod = RecycleGrpc.getRemoveMethod) == null) {
          RecycleGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest, yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecycleMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecycleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecycleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecycleStub>() {
        @java.lang.Override
        public RecycleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecycleStub(channel, callOptions);
        }
      };
    return RecycleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RecycleBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecycleBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecycleBlockingV2Stub>() {
        @java.lang.Override
        public RecycleBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecycleBlockingV2Stub(channel, callOptions);
        }
      };
    return RecycleBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecycleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecycleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecycleBlockingStub>() {
        @java.lang.Override
        public RecycleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecycleBlockingStub(channel, callOptions);
        }
      };
    return RecycleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecycleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecycleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecycleFutureStub>() {
        @java.lang.Override
        public RecycleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecycleFutureStub(channel, callOptions);
        }
      };
    return RecycleFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     **
     * 从回收站里搜索资产
     * </pre>
     */
    default void search(yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 从回收站里恢复资产
     * </pre>
     */
    default void recover(yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecoverMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 从回收站里删除资产
     * </pre>
     */
    default void remove(yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Recycle.
   */
  public static abstract class RecycleImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RecycleGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Recycle.
   */
  public static final class RecycleStub
      extends io.grpc.stub.AbstractAsyncStub<RecycleStub> {
    private RecycleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecycleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecycleStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 从回收站里搜索资产
     * </pre>
     */
    public void search(yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 从回收站里恢复资产
     * </pre>
     */
    public void recover(yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 从回收站里删除资产
     * </pre>
     */
    public void remove(yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Recycle.
   */
  public static final class RecycleBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RecycleBlockingV2Stub> {
    private RecycleBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecycleBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecycleBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 从回收站里搜索资产
     * </pre>
     */
    public yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse search(yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 从回收站里恢复资产
     * </pre>
     */
    public yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse recover(yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecoverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 从回收站里删除资产
     * </pre>
     */
    public yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse remove(yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Recycle.
   */
  public static final class RecycleBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RecycleBlockingStub> {
    private RecycleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecycleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecycleBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 从回收站里搜索资产
     * </pre>
     */
    public yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse search(yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 从回收站里恢复资产
     * </pre>
     */
    public yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse recover(yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecoverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 从回收站里删除资产
     * </pre>
     */
    public yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse remove(yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Recycle.
   */
  public static final class RecycleFutureStub
      extends io.grpc.stub.AbstractFutureStub<RecycleFutureStub> {
    private RecycleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecycleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecycleFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 从回收站里搜索资产
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse> search(
        yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 从回收站里恢复资产
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse> recover(
        yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecoverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 从回收站里删除资产
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse> remove(
        yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_RECOVER = 1;
  private static final int METHODID_REMOVE = 2;

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
        case METHODID_SEARCH:
          serviceImpl.search((yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse>) responseObserver);
          break;
        case METHODID_RECOVER:
          serviceImpl.recover((yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse>) responseObserver);
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
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.RecycleOuterClass.SearchDeletedAssetRequest,
              yeying.api.asset.RecycleOuterClass.SearchDeletedAssetResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getRecoverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetRequest,
              yeying.api.asset.RecycleOuterClass.RecoverDeletedAssetResponse>(
                service, METHODID_RECOVER)))
        .addMethod(
          getRemoveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetRequest,
              yeying.api.asset.RecycleOuterClass.RemoveDeletedAssetResponse>(
                service, METHODID_REMOVE)))
        .build();
  }

  private static abstract class RecycleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecycleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.asset.RecycleOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Recycle");
    }
  }

  private static final class RecycleFileDescriptorSupplier
      extends RecycleBaseDescriptorSupplier {
    RecycleFileDescriptorSupplier() {}
  }

  private static final class RecycleMethodDescriptorSupplier
      extends RecycleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RecycleMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RecycleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecycleFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getRecoverMethod())
              .addMethod(getRemoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
