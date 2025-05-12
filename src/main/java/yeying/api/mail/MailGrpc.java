package yeying.api.mail;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *定义一个邮件服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/mail/mail.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MailGrpc {

  private MailGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.mail.Mail";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.mail.MailOuterClass.SendMailRequest,
      yeying.api.mail.MailOuterClass.SendMailResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = yeying.api.mail.MailOuterClass.SendMailRequest.class,
      responseType = yeying.api.mail.MailOuterClass.SendMailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.mail.MailOuterClass.SendMailRequest,
      yeying.api.mail.MailOuterClass.SendMailResponse> getSendMethod() {
    io.grpc.MethodDescriptor<yeying.api.mail.MailOuterClass.SendMailRequest, yeying.api.mail.MailOuterClass.SendMailResponse> getSendMethod;
    if ((getSendMethod = MailGrpc.getSendMethod) == null) {
      synchronized (MailGrpc.class) {
        if ((getSendMethod = MailGrpc.getSendMethod) == null) {
          MailGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<yeying.api.mail.MailOuterClass.SendMailRequest, yeying.api.mail.MailOuterClass.SendMailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.mail.MailOuterClass.SendMailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.mail.MailOuterClass.SendMailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MailMethodDescriptorSupplier("Send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.mail.MailOuterClass.VerifyMailRequest,
      yeying.api.mail.MailOuterClass.VerifyMailResponse> getVerifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Verify",
      requestType = yeying.api.mail.MailOuterClass.VerifyMailRequest.class,
      responseType = yeying.api.mail.MailOuterClass.VerifyMailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.mail.MailOuterClass.VerifyMailRequest,
      yeying.api.mail.MailOuterClass.VerifyMailResponse> getVerifyMethod() {
    io.grpc.MethodDescriptor<yeying.api.mail.MailOuterClass.VerifyMailRequest, yeying.api.mail.MailOuterClass.VerifyMailResponse> getVerifyMethod;
    if ((getVerifyMethod = MailGrpc.getVerifyMethod) == null) {
      synchronized (MailGrpc.class) {
        if ((getVerifyMethod = MailGrpc.getVerifyMethod) == null) {
          MailGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<yeying.api.mail.MailOuterClass.VerifyMailRequest, yeying.api.mail.MailOuterClass.VerifyMailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.mail.MailOuterClass.VerifyMailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.mail.MailOuterClass.VerifyMailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MailMethodDescriptorSupplier("Verify"))
              .build();
        }
      }
    }
    return getVerifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MailStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MailStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MailStub>() {
        @java.lang.Override
        public MailStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MailStub(channel, callOptions);
        }
      };
    return MailStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static MailBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MailBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MailBlockingV2Stub>() {
        @java.lang.Override
        public MailBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MailBlockingV2Stub(channel, callOptions);
        }
      };
    return MailBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MailBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MailBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MailBlockingStub>() {
        @java.lang.Override
        public MailBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MailBlockingStub(channel, callOptions);
        }
      };
    return MailBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MailFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MailFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MailFutureStub>() {
        @java.lang.Override
        public MailFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MailFutureStub(channel, callOptions);
        }
      };
    return MailFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *定义一个邮件服务
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void send(yeying.api.mail.MailOuterClass.SendMailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.mail.MailOuterClass.SendMailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     */
    default void verify(yeying.api.mail.MailOuterClass.VerifyMailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.mail.MailOuterClass.VerifyMailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Mail.
   * <pre>
   **
   *定义一个邮件服务
   * </pre>
   */
  public static abstract class MailImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MailGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Mail.
   * <pre>
   **
   *定义一个邮件服务
   * </pre>
   */
  public static final class MailStub
      extends io.grpc.stub.AbstractAsyncStub<MailStub> {
    private MailStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MailStub(channel, callOptions);
    }

    /**
     */
    public void send(yeying.api.mail.MailOuterClass.SendMailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.mail.MailOuterClass.SendMailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verify(yeying.api.mail.MailOuterClass.VerifyMailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.mail.MailOuterClass.VerifyMailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Mail.
   * <pre>
   **
   *定义一个邮件服务
   * </pre>
   */
  public static final class MailBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<MailBlockingV2Stub> {
    private MailBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MailBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public yeying.api.mail.MailOuterClass.SendMailResponse send(yeying.api.mail.MailOuterClass.SendMailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     */
    public yeying.api.mail.MailOuterClass.VerifyMailResponse verify(yeying.api.mail.MailOuterClass.VerifyMailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Mail.
   * <pre>
   **
   *定义一个邮件服务
   * </pre>
   */
  public static final class MailBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MailBlockingStub> {
    private MailBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MailBlockingStub(channel, callOptions);
    }

    /**
     */
    public yeying.api.mail.MailOuterClass.SendMailResponse send(yeying.api.mail.MailOuterClass.SendMailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     */
    public yeying.api.mail.MailOuterClass.VerifyMailResponse verify(yeying.api.mail.MailOuterClass.VerifyMailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Mail.
   * <pre>
   **
   *定义一个邮件服务
   * </pre>
   */
  public static final class MailFutureStub
      extends io.grpc.stub.AbstractFutureStub<MailFutureStub> {
    private MailFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MailFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.mail.MailOuterClass.SendMailResponse> send(
        yeying.api.mail.MailOuterClass.SendMailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.mail.MailOuterClass.VerifyMailResponse> verify(
        yeying.api.mail.MailOuterClass.VerifyMailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;
  private static final int METHODID_VERIFY = 1;

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
        case METHODID_SEND:
          serviceImpl.send((yeying.api.mail.MailOuterClass.SendMailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.mail.MailOuterClass.SendMailResponse>) responseObserver);
          break;
        case METHODID_VERIFY:
          serviceImpl.verify((yeying.api.mail.MailOuterClass.VerifyMailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.mail.MailOuterClass.VerifyMailResponse>) responseObserver);
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
          getSendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.mail.MailOuterClass.SendMailRequest,
              yeying.api.mail.MailOuterClass.SendMailResponse>(
                service, METHODID_SEND)))
        .addMethod(
          getVerifyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.mail.MailOuterClass.VerifyMailRequest,
              yeying.api.mail.MailOuterClass.VerifyMailResponse>(
                service, METHODID_VERIFY)))
        .build();
  }

  private static abstract class MailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MailBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.mail.MailOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Mail");
    }
  }

  private static final class MailFileDescriptorSupplier
      extends MailBaseDescriptorSupplier {
    MailFileDescriptorSupplier() {}
  }

  private static final class MailMethodDescriptorSupplier
      extends MailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MailMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MailGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MailFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .addMethod(getVerifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
