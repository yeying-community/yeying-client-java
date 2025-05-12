package yeying.api.certificate;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/certificate/certificate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CertificateGrpc {

  private CertificateGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.certificate.Certificate";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.certificate.CertificateOuterClass.SignRequest,
      yeying.api.certificate.CertificateOuterClass.SignResponse> getSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sign",
      requestType = yeying.api.certificate.CertificateOuterClass.SignRequest.class,
      responseType = yeying.api.certificate.CertificateOuterClass.SignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.certificate.CertificateOuterClass.SignRequest,
      yeying.api.certificate.CertificateOuterClass.SignResponse> getSignMethod() {
    io.grpc.MethodDescriptor<yeying.api.certificate.CertificateOuterClass.SignRequest, yeying.api.certificate.CertificateOuterClass.SignResponse> getSignMethod;
    if ((getSignMethod = CertificateGrpc.getSignMethod) == null) {
      synchronized (CertificateGrpc.class) {
        if ((getSignMethod = CertificateGrpc.getSignMethod) == null) {
          CertificateGrpc.getSignMethod = getSignMethod =
              io.grpc.MethodDescriptor.<yeying.api.certificate.CertificateOuterClass.SignRequest, yeying.api.certificate.CertificateOuterClass.SignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.certificate.CertificateOuterClass.SignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.certificate.CertificateOuterClass.SignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateMethodDescriptorSupplier("Sign"))
              .build();
        }
      }
    }
    return getSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.certificate.CertificateOuterClass.GetRequest,
      yeying.api.certificate.CertificateOuterClass.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yeying.api.certificate.CertificateOuterClass.GetRequest.class,
      responseType = yeying.api.certificate.CertificateOuterClass.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.certificate.CertificateOuterClass.GetRequest,
      yeying.api.certificate.CertificateOuterClass.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<yeying.api.certificate.CertificateOuterClass.GetRequest, yeying.api.certificate.CertificateOuterClass.GetResponse> getGetMethod;
    if ((getGetMethod = CertificateGrpc.getGetMethod) == null) {
      synchronized (CertificateGrpc.class) {
        if ((getGetMethod = CertificateGrpc.getGetMethod) == null) {
          CertificateGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yeying.api.certificate.CertificateOuterClass.GetRequest, yeying.api.certificate.CertificateOuterClass.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.certificate.CertificateOuterClass.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.certificate.CertificateOuterClass.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CertificateStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateStub>() {
        @java.lang.Override
        public CertificateStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateStub(channel, callOptions);
        }
      };
    return CertificateStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CertificateBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateBlockingV2Stub>() {
        @java.lang.Override
        public CertificateBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateBlockingV2Stub(channel, callOptions);
        }
      };
    return CertificateBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CertificateBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateBlockingStub>() {
        @java.lang.Override
        public CertificateBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateBlockingStub(channel, callOptions);
        }
      };
    return CertificateBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CertificateFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateFutureStub>() {
        @java.lang.Override
        public CertificateFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateFutureStub(channel, callOptions);
        }
      };
    return CertificateFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sign(yeying.api.certificate.CertificateOuterClass.SignRequest request,
        io.grpc.stub.StreamObserver<yeying.api.certificate.CertificateOuterClass.SignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignMethod(), responseObserver);
    }

    /**
     */
    default void get(yeying.api.certificate.CertificateOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.certificate.CertificateOuterClass.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Certificate.
   */
  public static abstract class CertificateImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CertificateGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Certificate.
   */
  public static final class CertificateStub
      extends io.grpc.stub.AbstractAsyncStub<CertificateStub> {
    private CertificateStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateStub(channel, callOptions);
    }

    /**
     */
    public void sign(yeying.api.certificate.CertificateOuterClass.SignRequest request,
        io.grpc.stub.StreamObserver<yeying.api.certificate.CertificateOuterClass.SignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(yeying.api.certificate.CertificateOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.certificate.CertificateOuterClass.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Certificate.
   */
  public static final class CertificateBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CertificateBlockingV2Stub> {
    private CertificateBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public yeying.api.certificate.CertificateOuterClass.SignResponse sign(yeying.api.certificate.CertificateOuterClass.SignRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignMethod(), getCallOptions(), request);
    }

    /**
     */
    public yeying.api.certificate.CertificateOuterClass.GetResponse get(yeying.api.certificate.CertificateOuterClass.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Certificate.
   */
  public static final class CertificateBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CertificateBlockingStub> {
    private CertificateBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateBlockingStub(channel, callOptions);
    }

    /**
     */
    public yeying.api.certificate.CertificateOuterClass.SignResponse sign(yeying.api.certificate.CertificateOuterClass.SignRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignMethod(), getCallOptions(), request);
    }

    /**
     */
    public yeying.api.certificate.CertificateOuterClass.GetResponse get(yeying.api.certificate.CertificateOuterClass.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Certificate.
   */
  public static final class CertificateFutureStub
      extends io.grpc.stub.AbstractFutureStub<CertificateFutureStub> {
    private CertificateFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.certificate.CertificateOuterClass.SignResponse> sign(
        yeying.api.certificate.CertificateOuterClass.SignRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.certificate.CertificateOuterClass.GetResponse> get(
        yeying.api.certificate.CertificateOuterClass.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN = 0;
  private static final int METHODID_GET = 1;

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
        case METHODID_SIGN:
          serviceImpl.sign((yeying.api.certificate.CertificateOuterClass.SignRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.certificate.CertificateOuterClass.SignResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yeying.api.certificate.CertificateOuterClass.GetRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.certificate.CertificateOuterClass.GetResponse>) responseObserver);
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
          getSignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.certificate.CertificateOuterClass.SignRequest,
              yeying.api.certificate.CertificateOuterClass.SignResponse>(
                service, METHODID_SIGN)))
        .addMethod(
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.certificate.CertificateOuterClass.GetRequest,
              yeying.api.certificate.CertificateOuterClass.GetResponse>(
                service, METHODID_GET)))
        .build();
  }

  private static abstract class CertificateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CertificateBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.certificate.CertificateOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Certificate");
    }
  }

  private static final class CertificateFileDescriptorSupplier
      extends CertificateBaseDescriptorSupplier {
    CertificateFileDescriptorSupplier() {}
  }

  private static final class CertificateMethodDescriptorSupplier
      extends CertificateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CertificateMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CertificateGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CertificateFileDescriptorSupplier())
              .addMethod(getSignMethod())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
