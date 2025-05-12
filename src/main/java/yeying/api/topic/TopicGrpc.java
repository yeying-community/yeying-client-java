package yeying.api.topic;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/spider/topic.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TopicGrpc {

  private TopicGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.topic.Topic";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.topic.TopicOuterClass.SearchRequest,
      yeying.api.topic.TopicOuterClass.SearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.topic.TopicOuterClass.SearchRequest.class,
      responseType = yeying.api.topic.TopicOuterClass.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.topic.TopicOuterClass.SearchRequest,
      yeying.api.topic.TopicOuterClass.SearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.topic.TopicOuterClass.SearchRequest, yeying.api.topic.TopicOuterClass.SearchResponse> getSearchMethod;
    if ((getSearchMethod = TopicGrpc.getSearchMethod) == null) {
      synchronized (TopicGrpc.class) {
        if ((getSearchMethod = TopicGrpc.getSearchMethod) == null) {
          TopicGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.topic.TopicOuterClass.SearchRequest, yeying.api.topic.TopicOuterClass.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.topic.TopicOuterClass.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.topic.TopicOuterClass.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TopicMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.topic.TopicOuterClass.SubscribeRequest,
      yeying.api.topic.TopicOuterClass.SubscribeResponse> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = yeying.api.topic.TopicOuterClass.SubscribeRequest.class,
      responseType = yeying.api.topic.TopicOuterClass.SubscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.topic.TopicOuterClass.SubscribeRequest,
      yeying.api.topic.TopicOuterClass.SubscribeResponse> getSubscribeMethod() {
    io.grpc.MethodDescriptor<yeying.api.topic.TopicOuterClass.SubscribeRequest, yeying.api.topic.TopicOuterClass.SubscribeResponse> getSubscribeMethod;
    if ((getSubscribeMethod = TopicGrpc.getSubscribeMethod) == null) {
      synchronized (TopicGrpc.class) {
        if ((getSubscribeMethod = TopicGrpc.getSubscribeMethod) == null) {
          TopicGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<yeying.api.topic.TopicOuterClass.SubscribeRequest, yeying.api.topic.TopicOuterClass.SubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.topic.TopicOuterClass.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.topic.TopicOuterClass.SubscribeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TopicMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.topic.TopicOuterClass.UnsubscribeRequest,
      yeying.api.topic.TopicOuterClass.UnsubscribeResponse> getUnsubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unsubscribe",
      requestType = yeying.api.topic.TopicOuterClass.UnsubscribeRequest.class,
      responseType = yeying.api.topic.TopicOuterClass.UnsubscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.topic.TopicOuterClass.UnsubscribeRequest,
      yeying.api.topic.TopicOuterClass.UnsubscribeResponse> getUnsubscribeMethod() {
    io.grpc.MethodDescriptor<yeying.api.topic.TopicOuterClass.UnsubscribeRequest, yeying.api.topic.TopicOuterClass.UnsubscribeResponse> getUnsubscribeMethod;
    if ((getUnsubscribeMethod = TopicGrpc.getUnsubscribeMethod) == null) {
      synchronized (TopicGrpc.class) {
        if ((getUnsubscribeMethod = TopicGrpc.getUnsubscribeMethod) == null) {
          TopicGrpc.getUnsubscribeMethod = getUnsubscribeMethod =
              io.grpc.MethodDescriptor.<yeying.api.topic.TopicOuterClass.UnsubscribeRequest, yeying.api.topic.TopicOuterClass.UnsubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unsubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.topic.TopicOuterClass.UnsubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.topic.TopicOuterClass.UnsubscribeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TopicMethodDescriptorSupplier("Unsubscribe"))
              .build();
        }
      }
    }
    return getUnsubscribeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TopicStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicStub>() {
        @java.lang.Override
        public TopicStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicStub(channel, callOptions);
        }
      };
    return TopicStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static TopicBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicBlockingV2Stub>() {
        @java.lang.Override
        public TopicBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicBlockingV2Stub(channel, callOptions);
        }
      };
    return TopicBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TopicBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicBlockingStub>() {
        @java.lang.Override
        public TopicBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicBlockingStub(channel, callOptions);
        }
      };
    return TopicBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TopicFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopicFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopicFutureStub>() {
        @java.lang.Override
        public TopicFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopicFutureStub(channel, callOptions);
        }
      };
    return TopicFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 搜索订阅
     * </pre>
     */
    default void search(yeying.api.topic.TopicOuterClass.SearchRequest request,
        io.grpc.stub.StreamObserver<yeying.api.topic.TopicOuterClass.SearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 订阅
     * </pre>
     */
    default void subscribe(yeying.api.topic.TopicOuterClass.SubscribeRequest request,
        io.grpc.stub.StreamObserver<yeying.api.topic.TopicOuterClass.SubscribeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 取消订阅
     * </pre>
     */
    default void unsubscribe(yeying.api.topic.TopicOuterClass.UnsubscribeRequest request,
        io.grpc.stub.StreamObserver<yeying.api.topic.TopicOuterClass.UnsubscribeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnsubscribeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Topic.
   */
  public static abstract class TopicImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TopicGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Topic.
   */
  public static final class TopicStub
      extends io.grpc.stub.AbstractAsyncStub<TopicStub> {
    private TopicStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索订阅
     * </pre>
     */
    public void search(yeying.api.topic.TopicOuterClass.SearchRequest request,
        io.grpc.stub.StreamObserver<yeying.api.topic.TopicOuterClass.SearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 订阅
     * </pre>
     */
    public void subscribe(yeying.api.topic.TopicOuterClass.SubscribeRequest request,
        io.grpc.stub.StreamObserver<yeying.api.topic.TopicOuterClass.SubscribeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 取消订阅
     * </pre>
     */
    public void unsubscribe(yeying.api.topic.TopicOuterClass.UnsubscribeRequest request,
        io.grpc.stub.StreamObserver<yeying.api.topic.TopicOuterClass.UnsubscribeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnsubscribeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Topic.
   */
  public static final class TopicBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TopicBlockingV2Stub> {
    private TopicBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索订阅
     * </pre>
     */
    public yeying.api.topic.TopicOuterClass.SearchResponse search(yeying.api.topic.TopicOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 订阅
     * </pre>
     */
    public yeying.api.topic.TopicOuterClass.SubscribeResponse subscribe(yeying.api.topic.TopicOuterClass.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 取消订阅
     * </pre>
     */
    public yeying.api.topic.TopicOuterClass.UnsubscribeResponse unsubscribe(yeying.api.topic.TopicOuterClass.UnsubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnsubscribeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Topic.
   */
  public static final class TopicBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TopicBlockingStub> {
    private TopicBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索订阅
     * </pre>
     */
    public yeying.api.topic.TopicOuterClass.SearchResponse search(yeying.api.topic.TopicOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 订阅
     * </pre>
     */
    public yeying.api.topic.TopicOuterClass.SubscribeResponse subscribe(yeying.api.topic.TopicOuterClass.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 取消订阅
     * </pre>
     */
    public yeying.api.topic.TopicOuterClass.UnsubscribeResponse unsubscribe(yeying.api.topic.TopicOuterClass.UnsubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnsubscribeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Topic.
   */
  public static final class TopicFutureStub
      extends io.grpc.stub.AbstractFutureStub<TopicFutureStub> {
    private TopicFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopicFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopicFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索订阅
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.topic.TopicOuterClass.SearchResponse> search(
        yeying.api.topic.TopicOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 订阅
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.topic.TopicOuterClass.SubscribeResponse> subscribe(
        yeying.api.topic.TopicOuterClass.SubscribeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 取消订阅
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.topic.TopicOuterClass.UnsubscribeResponse> unsubscribe(
        yeying.api.topic.TopicOuterClass.UnsubscribeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnsubscribeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_SUBSCRIBE = 1;
  private static final int METHODID_UNSUBSCRIBE = 2;

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
          serviceImpl.search((yeying.api.topic.TopicOuterClass.SearchRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.topic.TopicOuterClass.SearchResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((yeying.api.topic.TopicOuterClass.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.topic.TopicOuterClass.SubscribeResponse>) responseObserver);
          break;
        case METHODID_UNSUBSCRIBE:
          serviceImpl.unsubscribe((yeying.api.topic.TopicOuterClass.UnsubscribeRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.topic.TopicOuterClass.UnsubscribeResponse>) responseObserver);
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
              yeying.api.topic.TopicOuterClass.SearchRequest,
              yeying.api.topic.TopicOuterClass.SearchResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.topic.TopicOuterClass.SubscribeRequest,
              yeying.api.topic.TopicOuterClass.SubscribeResponse>(
                service, METHODID_SUBSCRIBE)))
        .addMethod(
          getUnsubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.topic.TopicOuterClass.UnsubscribeRequest,
              yeying.api.topic.TopicOuterClass.UnsubscribeResponse>(
                service, METHODID_UNSUBSCRIBE)))
        .build();
  }

  private static abstract class TopicBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TopicBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.topic.TopicOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Topic");
    }
  }

  private static final class TopicFileDescriptorSupplier
      extends TopicBaseDescriptorSupplier {
    TopicFileDescriptorSupplier() {}
  }

  private static final class TopicMethodDescriptorSupplier
      extends TopicBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TopicMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TopicGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TopicFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getSubscribeMethod())
              .addMethod(getUnsubscribeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
