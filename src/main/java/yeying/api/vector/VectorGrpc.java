package yeying.api.vector;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/vector/vector.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VectorGrpc {

  private VectorGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.vector.Vector";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.vector.VectorOuterClass.VectorRequest,
      yeying.api.vector.VectorOuterClass.VectorResponse> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = yeying.api.vector.VectorOuterClass.VectorRequest.class,
      responseType = yeying.api.vector.VectorOuterClass.VectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.vector.VectorOuterClass.VectorRequest,
      yeying.api.vector.VectorOuterClass.VectorResponse> getQueryMethod() {
    io.grpc.MethodDescriptor<yeying.api.vector.VectorOuterClass.VectorRequest, yeying.api.vector.VectorOuterClass.VectorResponse> getQueryMethod;
    if ((getQueryMethod = VectorGrpc.getQueryMethod) == null) {
      synchronized (VectorGrpc.class) {
        if ((getQueryMethod = VectorGrpc.getQueryMethod) == null) {
          VectorGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<yeying.api.vector.VectorOuterClass.VectorRequest, yeying.api.vector.VectorOuterClass.VectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.vector.VectorOuterClass.VectorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.vector.VectorOuterClass.VectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VectorMethodDescriptorSupplier("Query"))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VectorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VectorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VectorStub>() {
        @java.lang.Override
        public VectorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VectorStub(channel, callOptions);
        }
      };
    return VectorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static VectorBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VectorBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VectorBlockingV2Stub>() {
        @java.lang.Override
        public VectorBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VectorBlockingV2Stub(channel, callOptions);
        }
      };
    return VectorBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VectorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VectorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VectorBlockingStub>() {
        @java.lang.Override
        public VectorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VectorBlockingStub(channel, callOptions);
        }
      };
    return VectorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VectorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VectorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VectorFutureStub>() {
        @java.lang.Override
        public VectorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VectorFutureStub(channel, callOptions);
        }
      };
    return VectorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void query(yeying.api.vector.VectorOuterClass.VectorRequest request,
        io.grpc.stub.StreamObserver<yeying.api.vector.VectorOuterClass.VectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Vector.
   */
  public static abstract class VectorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VectorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Vector.
   */
  public static final class VectorStub
      extends io.grpc.stub.AbstractAsyncStub<VectorStub> {
    private VectorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VectorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VectorStub(channel, callOptions);
    }

    /**
     */
    public void query(yeying.api.vector.VectorOuterClass.VectorRequest request,
        io.grpc.stub.StreamObserver<yeying.api.vector.VectorOuterClass.VectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Vector.
   */
  public static final class VectorBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<VectorBlockingV2Stub> {
    private VectorBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VectorBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VectorBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public yeying.api.vector.VectorOuterClass.VectorResponse query(yeying.api.vector.VectorOuterClass.VectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Vector.
   */
  public static final class VectorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VectorBlockingStub> {
    private VectorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VectorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VectorBlockingStub(channel, callOptions);
    }

    /**
     */
    public yeying.api.vector.VectorOuterClass.VectorResponse query(yeying.api.vector.VectorOuterClass.VectorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Vector.
   */
  public static final class VectorFutureStub
      extends io.grpc.stub.AbstractFutureStub<VectorFutureStub> {
    private VectorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VectorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VectorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.vector.VectorOuterClass.VectorResponse> query(
        yeying.api.vector.VectorOuterClass.VectorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY = 0;

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
        case METHODID_QUERY:
          serviceImpl.query((yeying.api.vector.VectorOuterClass.VectorRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.vector.VectorOuterClass.VectorResponse>) responseObserver);
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
          getQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.vector.VectorOuterClass.VectorRequest,
              yeying.api.vector.VectorOuterClass.VectorResponse>(
                service, METHODID_QUERY)))
        .build();
  }

  private static abstract class VectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VectorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.vector.VectorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Vector");
    }
  }

  private static final class VectorFileDescriptorSupplier
      extends VectorBaseDescriptorSupplier {
    VectorFileDescriptorSupplier() {}
  }

  private static final class VectorMethodDescriptorSupplier
      extends VectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VectorMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VectorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VectorFileDescriptorSupplier())
              .addMethod(getQueryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
