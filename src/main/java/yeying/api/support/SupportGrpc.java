package yeying.api.support;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/support/support.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SupportGrpc {

  private SupportGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.support.Support";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.support.SupportOuterClass.CollectSupportRequest,
      yeying.api.support.SupportOuterClass.CollectSupportResponse> getCollectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Collect",
      requestType = yeying.api.support.SupportOuterClass.CollectSupportRequest.class,
      responseType = yeying.api.support.SupportOuterClass.CollectSupportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.support.SupportOuterClass.CollectSupportRequest,
      yeying.api.support.SupportOuterClass.CollectSupportResponse> getCollectMethod() {
    io.grpc.MethodDescriptor<yeying.api.support.SupportOuterClass.CollectSupportRequest, yeying.api.support.SupportOuterClass.CollectSupportResponse> getCollectMethod;
    if ((getCollectMethod = SupportGrpc.getCollectMethod) == null) {
      synchronized (SupportGrpc.class) {
        if ((getCollectMethod = SupportGrpc.getCollectMethod) == null) {
          SupportGrpc.getCollectMethod = getCollectMethod =
              io.grpc.MethodDescriptor.<yeying.api.support.SupportOuterClass.CollectSupportRequest, yeying.api.support.SupportOuterClass.CollectSupportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Collect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.support.SupportOuterClass.CollectSupportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.support.SupportOuterClass.CollectSupportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupportMethodDescriptorSupplier("Collect"))
              .build();
        }
      }
    }
    return getCollectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SupportStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SupportStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SupportStub>() {
        @java.lang.Override
        public SupportStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SupportStub(channel, callOptions);
        }
      };
    return SupportStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SupportBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SupportBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SupportBlockingV2Stub>() {
        @java.lang.Override
        public SupportBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SupportBlockingV2Stub(channel, callOptions);
        }
      };
    return SupportBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SupportBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SupportBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SupportBlockingStub>() {
        @java.lang.Override
        public SupportBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SupportBlockingStub(channel, callOptions);
        }
      };
    return SupportBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SupportFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SupportFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SupportFutureStub>() {
        @java.lang.Override
        public SupportFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SupportFutureStub(channel, callOptions);
        }
      };
    return SupportFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void collect(yeying.api.support.SupportOuterClass.CollectSupportRequest request,
        io.grpc.stub.StreamObserver<yeying.api.support.SupportOuterClass.CollectSupportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Support.
   */
  public static abstract class SupportImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SupportGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Support.
   */
  public static final class SupportStub
      extends io.grpc.stub.AbstractAsyncStub<SupportStub> {
    private SupportStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupportStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SupportStub(channel, callOptions);
    }

    /**
     */
    public void collect(yeying.api.support.SupportOuterClass.CollectSupportRequest request,
        io.grpc.stub.StreamObserver<yeying.api.support.SupportOuterClass.CollectSupportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Support.
   */
  public static final class SupportBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SupportBlockingV2Stub> {
    private SupportBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupportBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SupportBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public yeying.api.support.SupportOuterClass.CollectSupportResponse collect(yeying.api.support.SupportOuterClass.CollectSupportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Support.
   */
  public static final class SupportBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SupportBlockingStub> {
    private SupportBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupportBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SupportBlockingStub(channel, callOptions);
    }

    /**
     */
    public yeying.api.support.SupportOuterClass.CollectSupportResponse collect(yeying.api.support.SupportOuterClass.CollectSupportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Support.
   */
  public static final class SupportFutureStub
      extends io.grpc.stub.AbstractFutureStub<SupportFutureStub> {
    private SupportFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupportFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SupportFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.support.SupportOuterClass.CollectSupportResponse> collect(
        yeying.api.support.SupportOuterClass.CollectSupportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COLLECT = 0;

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
        case METHODID_COLLECT:
          serviceImpl.collect((yeying.api.support.SupportOuterClass.CollectSupportRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.support.SupportOuterClass.CollectSupportResponse>) responseObserver);
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
          getCollectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.support.SupportOuterClass.CollectSupportRequest,
              yeying.api.support.SupportOuterClass.CollectSupportResponse>(
                service, METHODID_COLLECT)))
        .build();
  }

  private static abstract class SupportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SupportBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.support.SupportOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Support");
    }
  }

  private static final class SupportFileDescriptorSupplier
      extends SupportBaseDescriptorSupplier {
    SupportFileDescriptorSupplier() {}
  }

  private static final class SupportMethodDescriptorSupplier
      extends SupportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SupportMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SupportGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SupportFileDescriptorSupplier())
              .addMethod(getCollectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
