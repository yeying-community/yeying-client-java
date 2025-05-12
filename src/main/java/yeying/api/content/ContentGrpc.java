package yeying.api.content;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 检查内容是否合规，为了保护数据隐私，要么是tee，要么是同态
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/content/content.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContentGrpc {

  private ContentGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.content.Content";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.content.ContentOuterClass.ValidateRequest,
      yeying.api.content.ContentOuterClass.ValidateResponse> getValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validate",
      requestType = yeying.api.content.ContentOuterClass.ValidateRequest.class,
      responseType = yeying.api.content.ContentOuterClass.ValidateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.content.ContentOuterClass.ValidateRequest,
      yeying.api.content.ContentOuterClass.ValidateResponse> getValidateMethod() {
    io.grpc.MethodDescriptor<yeying.api.content.ContentOuterClass.ValidateRequest, yeying.api.content.ContentOuterClass.ValidateResponse> getValidateMethod;
    if ((getValidateMethod = ContentGrpc.getValidateMethod) == null) {
      synchronized (ContentGrpc.class) {
        if ((getValidateMethod = ContentGrpc.getValidateMethod) == null) {
          ContentGrpc.getValidateMethod = getValidateMethod =
              io.grpc.MethodDescriptor.<yeying.api.content.ContentOuterClass.ValidateRequest, yeying.api.content.ContentOuterClass.ValidateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "validate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.content.ContentOuterClass.ValidateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.content.ContentOuterClass.ValidateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContentMethodDescriptorSupplier("validate"))
              .build();
        }
      }
    }
    return getValidateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContentStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContentStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContentStub>() {
        @java.lang.Override
        public ContentStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContentStub(channel, callOptions);
        }
      };
    return ContentStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ContentBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContentBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContentBlockingV2Stub>() {
        @java.lang.Override
        public ContentBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContentBlockingV2Stub(channel, callOptions);
        }
      };
    return ContentBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContentBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContentBlockingStub>() {
        @java.lang.Override
        public ContentBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContentBlockingStub(channel, callOptions);
        }
      };
    return ContentBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContentFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContentFutureStub>() {
        @java.lang.Override
        public ContentFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContentFutureStub(channel, callOptions);
        }
      };
    return ContentFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 检查内容是否合规，为了保护数据隐私，要么是tee，要么是同态
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 身份托管
     * </pre>
     */
    default void validate(yeying.api.content.ContentOuterClass.ValidateRequest request,
        io.grpc.stub.StreamObserver<yeying.api.content.ContentOuterClass.ValidateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Content.
   * <pre>
   * 检查内容是否合规，为了保护数据隐私，要么是tee，要么是同态
   * </pre>
   */
  public static abstract class ContentImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ContentGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Content.
   * <pre>
   * 检查内容是否合规，为了保护数据隐私，要么是tee，要么是同态
   * </pre>
   */
  public static final class ContentStub
      extends io.grpc.stub.AbstractAsyncStub<ContentStub> {
    private ContentStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContentStub(channel, callOptions);
    }

    /**
     * <pre>
     * 身份托管
     * </pre>
     */
    public void validate(yeying.api.content.ContentOuterClass.ValidateRequest request,
        io.grpc.stub.StreamObserver<yeying.api.content.ContentOuterClass.ValidateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Content.
   * <pre>
   * 检查内容是否合规，为了保护数据隐私，要么是tee，要么是同态
   * </pre>
   */
  public static final class ContentBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ContentBlockingV2Stub> {
    private ContentBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContentBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 身份托管
     * </pre>
     */
    public yeying.api.content.ContentOuterClass.ValidateResponse validate(yeying.api.content.ContentOuterClass.ValidateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Content.
   * <pre>
   * 检查内容是否合规，为了保护数据隐私，要么是tee，要么是同态
   * </pre>
   */
  public static final class ContentBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ContentBlockingStub> {
    private ContentBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContentBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 身份托管
     * </pre>
     */
    public yeying.api.content.ContentOuterClass.ValidateResponse validate(yeying.api.content.ContentOuterClass.ValidateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Content.
   * <pre>
   * 检查内容是否合规，为了保护数据隐私，要么是tee，要么是同态
   * </pre>
   */
  public static final class ContentFutureStub
      extends io.grpc.stub.AbstractFutureStub<ContentFutureStub> {
    private ContentFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContentFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 身份托管
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.content.ContentOuterClass.ValidateResponse> validate(
        yeying.api.content.ContentOuterClass.ValidateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE = 0;

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
        case METHODID_VALIDATE:
          serviceImpl.validate((yeying.api.content.ContentOuterClass.ValidateRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.content.ContentOuterClass.ValidateResponse>) responseObserver);
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
          getValidateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.content.ContentOuterClass.ValidateRequest,
              yeying.api.content.ContentOuterClass.ValidateResponse>(
                service, METHODID_VALIDATE)))
        .build();
  }

  private static abstract class ContentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.content.ContentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Content");
    }
  }

  private static final class ContentFileDescriptorSupplier
      extends ContentBaseDescriptorSupplier {
    ContentFileDescriptorSupplier() {}
  }

  private static final class ContentMethodDescriptorSupplier
      extends ContentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ContentMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ContentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContentFileDescriptorSupplier())
              .addMethod(getValidateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
