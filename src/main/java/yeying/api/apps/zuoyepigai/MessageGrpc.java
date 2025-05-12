package yeying.api.apps.zuoyepigai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *消息盒子
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/apps/zuoyepigai/message.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MessageGrpc {

  private MessageGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.apps.zuoyepigai.Message";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest,
      yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest.class,
      responseType = yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest,
      yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse> getListMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest, yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse> getListMethod;
    if ((getListMethod = MessageGrpc.getListMethod) == null) {
      synchronized (MessageGrpc.class) {
        if ((getListMethod = MessageGrpc.getListMethod) == null) {
          MessageGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest, yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest,
      yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest.class,
      responseType = yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest,
      yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest, yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse> getCountMethod;
    if ((getCountMethod = MessageGrpc.getCountMethod) == null) {
      synchronized (MessageGrpc.class) {
        if ((getCountMethod = MessageGrpc.getCountMethod) == null) {
          MessageGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest, yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest,
      yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse> getListByMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBy",
      requestType = yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest.class,
      responseType = yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest,
      yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse> getListByMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest, yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse> getListByMethod;
    if ((getListByMethod = MessageGrpc.getListByMethod) == null) {
      synchronized (MessageGrpc.class) {
        if ((getListByMethod = MessageGrpc.getListByMethod) == null) {
          MessageGrpc.getListByMethod = getListByMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest, yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageMethodDescriptorSupplier("ListBy"))
              .build();
        }
      }
    }
    return getListByMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest,
      yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse> getMarkAsReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkAsRead",
      requestType = yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest.class,
      responseType = yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest,
      yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse> getMarkAsReadMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest, yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse> getMarkAsReadMethod;
    if ((getMarkAsReadMethod = MessageGrpc.getMarkAsReadMethod) == null) {
      synchronized (MessageGrpc.class) {
        if ((getMarkAsReadMethod = MessageGrpc.getMarkAsReadMethod) == null) {
          MessageGrpc.getMarkAsReadMethod = getMarkAsReadMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest, yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkAsRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessageMethodDescriptorSupplier("MarkAsRead"))
              .build();
        }
      }
    }
    return getMarkAsReadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageStub>() {
        @java.lang.Override
        public MessageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageStub(channel, callOptions);
        }
      };
    return MessageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static MessageBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageBlockingV2Stub>() {
        @java.lang.Override
        public MessageBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageBlockingV2Stub(channel, callOptions);
        }
      };
    return MessageBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageBlockingStub>() {
        @java.lang.Override
        public MessageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageBlockingStub(channel, callOptions);
        }
      };
    return MessageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessageFutureStub>() {
        @java.lang.Override
        public MessageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessageFutureStub(channel, callOptions);
        }
      };
    return MessageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *消息盒子
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 列表
     * </pre>
     */
    default void list(yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询消息数量
     * </pre>
     */
    default void count(yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据状态查询消息已读数量和未读数量
     * </pre>
     */
    default void listBy(yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListByMethod(), responseObserver);
    }

    /**
     * <pre>
     * 标记为已读
     * </pre>
     */
    default void markAsRead(yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkAsReadMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Message.
   * <pre>
   **
   *消息盒子
   * </pre>
   */
  public static abstract class MessageImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MessageGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Message.
   * <pre>
   **
   *消息盒子
   * </pre>
   */
  public static final class MessageStub
      extends io.grpc.stub.AbstractAsyncStub<MessageStub> {
    private MessageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public void list(yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询消息数量
     * </pre>
     */
    public void count(yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据状态查询消息已读数量和未读数量
     * </pre>
     */
    public void listBy(yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListByMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 标记为已读
     * </pre>
     */
    public void markAsRead(yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkAsReadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Message.
   * <pre>
   **
   *消息盒子
   * </pre>
   */
  public static final class MessageBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<MessageBlockingV2Stub> {
    private MessageBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse list(yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询消息数量
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse count(yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据状态查询消息已读数量和未读数量
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse listBy(yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListByMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 标记为已读
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse markAsRead(yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkAsReadMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Message.
   * <pre>
   **
   *消息盒子
   * </pre>
   */
  public static final class MessageBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MessageBlockingStub> {
    private MessageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse list(yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询消息数量
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse count(yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据状态查询消息已读数量和未读数量
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse listBy(yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListByMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 标记为已读
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse markAsRead(yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkAsReadMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Message.
   * <pre>
   **
   *消息盒子
   * </pre>
   */
  public static final class MessageFutureStub
      extends io.grpc.stub.AbstractFutureStub<MessageFutureStub> {
    private MessageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse> list(
        yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询消息数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse> count(
        yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据状态查询消息已读数量和未读数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse> listBy(
        yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListByMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 标记为已读
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse> markAsRead(
        yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkAsReadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_COUNT = 1;
  private static final int METHODID_LIST_BY = 2;
  private static final int METHODID_MARK_AS_READ = 3;

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
          serviceImpl.list((yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse>) responseObserver);
          break;
        case METHODID_LIST_BY:
          serviceImpl.listBy((yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse>) responseObserver);
          break;
        case METHODID_MARK_AS_READ:
          serviceImpl.markAsRead((yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse>) responseObserver);
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
              yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListRequest,
              yeying.api.apps.zuoyepigai.MessageOuterClass.MessageListResponse>(
                service, METHODID_LIST)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.MessageOuterClass.CountRequest,
              yeying.api.apps.zuoyepigai.MessageOuterClass.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getListByMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.MessageOuterClass.ListByRequest,
              yeying.api.apps.zuoyepigai.MessageOuterClass.ListByResponse>(
                service, METHODID_LIST_BY)))
        .addMethod(
          getMarkAsReadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadRequest,
              yeying.api.apps.zuoyepigai.MessageOuterClass.MarkAsReadResponse>(
                service, METHODID_MARK_AS_READ)))
        .build();
  }

  private static abstract class MessageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.apps.zuoyepigai.MessageOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Message");
    }
  }

  private static final class MessageFileDescriptorSupplier
      extends MessageBaseDescriptorSupplier {
    MessageFileDescriptorSupplier() {}
  }

  private static final class MessageMethodDescriptorSupplier
      extends MessageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MessageMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MessageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessageFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getCountMethod())
              .addMethod(getListByMethod())
              .addMethod(getMarkAsReadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
