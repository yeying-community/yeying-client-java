package yeying.api.bulletin;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/bulletin/bulletin.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BulletinGrpc {

  private BulletinGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.bulletin.Bulletin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.bulletin.BulletinOuterClass.BulletinListRequest,
      yeying.api.bulletin.BulletinOuterClass.BulletinListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yeying.api.bulletin.BulletinOuterClass.BulletinListRequest.class,
      responseType = yeying.api.bulletin.BulletinOuterClass.BulletinListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.bulletin.BulletinOuterClass.BulletinListRequest,
      yeying.api.bulletin.BulletinOuterClass.BulletinListResponse> getListMethod() {
    io.grpc.MethodDescriptor<yeying.api.bulletin.BulletinOuterClass.BulletinListRequest, yeying.api.bulletin.BulletinOuterClass.BulletinListResponse> getListMethod;
    if ((getListMethod = BulletinGrpc.getListMethod) == null) {
      synchronized (BulletinGrpc.class) {
        if ((getListMethod = BulletinGrpc.getListMethod) == null) {
          BulletinGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yeying.api.bulletin.BulletinOuterClass.BulletinListRequest, yeying.api.bulletin.BulletinOuterClass.BulletinListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.bulletin.BulletinOuterClass.BulletinListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.bulletin.BulletinOuterClass.BulletinListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BulletinMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BulletinStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BulletinStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BulletinStub>() {
        @java.lang.Override
        public BulletinStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BulletinStub(channel, callOptions);
        }
      };
    return BulletinStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static BulletinBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BulletinBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BulletinBlockingV2Stub>() {
        @java.lang.Override
        public BulletinBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BulletinBlockingV2Stub(channel, callOptions);
        }
      };
    return BulletinBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BulletinBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BulletinBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BulletinBlockingStub>() {
        @java.lang.Override
        public BulletinBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BulletinBlockingStub(channel, callOptions);
        }
      };
    return BulletinBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BulletinFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BulletinFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BulletinFutureStub>() {
        @java.lang.Override
        public BulletinFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BulletinFutureStub(channel, callOptions);
        }
      };
    return BulletinFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void list(yeying.api.bulletin.BulletinOuterClass.BulletinListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.bulletin.BulletinOuterClass.BulletinListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Bulletin.
   */
  public static abstract class BulletinImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BulletinGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Bulletin.
   */
  public static final class BulletinStub
      extends io.grpc.stub.AbstractAsyncStub<BulletinStub> {
    private BulletinStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulletinStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BulletinStub(channel, callOptions);
    }

    /**
     */
    public void list(yeying.api.bulletin.BulletinOuterClass.BulletinListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.bulletin.BulletinOuterClass.BulletinListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Bulletin.
   */
  public static final class BulletinBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<BulletinBlockingV2Stub> {
    private BulletinBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulletinBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BulletinBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public yeying.api.bulletin.BulletinOuterClass.BulletinListResponse list(yeying.api.bulletin.BulletinOuterClass.BulletinListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Bulletin.
   */
  public static final class BulletinBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BulletinBlockingStub> {
    private BulletinBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulletinBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BulletinBlockingStub(channel, callOptions);
    }

    /**
     */
    public yeying.api.bulletin.BulletinOuterClass.BulletinListResponse list(yeying.api.bulletin.BulletinOuterClass.BulletinListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Bulletin.
   */
  public static final class BulletinFutureStub
      extends io.grpc.stub.AbstractFutureStub<BulletinFutureStub> {
    private BulletinFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulletinFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BulletinFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.bulletin.BulletinOuterClass.BulletinListResponse> list(
        yeying.api.bulletin.BulletinOuterClass.BulletinListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

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
          serviceImpl.list((yeying.api.bulletin.BulletinOuterClass.BulletinListRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.bulletin.BulletinOuterClass.BulletinListResponse>) responseObserver);
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
              yeying.api.bulletin.BulletinOuterClass.BulletinListRequest,
              yeying.api.bulletin.BulletinOuterClass.BulletinListResponse>(
                service, METHODID_LIST)))
        .build();
  }

  private static abstract class BulletinBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BulletinBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.bulletin.BulletinOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Bulletin");
    }
  }

  private static final class BulletinFileDescriptorSupplier
      extends BulletinBaseDescriptorSupplier {
    BulletinFileDescriptorSupplier() {}
  }

  private static final class BulletinMethodDescriptorSupplier
      extends BulletinBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BulletinMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BulletinGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BulletinFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
