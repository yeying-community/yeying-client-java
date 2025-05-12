package yeying.api.session;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/session/session.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SessionGrpc {

  private SessionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.session.Session";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.CreateSessionRequest,
      yeying.api.session.SessionOuterClass.CreateSessionResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yeying.api.session.SessionOuterClass.CreateSessionRequest.class,
      responseType = yeying.api.session.SessionOuterClass.CreateSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.CreateSessionRequest,
      yeying.api.session.SessionOuterClass.CreateSessionResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.CreateSessionRequest, yeying.api.session.SessionOuterClass.CreateSessionResponse> getCreateMethod;
    if ((getCreateMethod = SessionGrpc.getCreateMethod) == null) {
      synchronized (SessionGrpc.class) {
        if ((getCreateMethod = SessionGrpc.getCreateMethod) == null) {
          SessionGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yeying.api.session.SessionOuterClass.CreateSessionRequest, yeying.api.session.SessionOuterClass.CreateSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.session.SessionOuterClass.CreateSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.session.SessionOuterClass.CreateSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.DeleteSessionRequest,
      yeying.api.session.SessionOuterClass.DeleteSessionResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yeying.api.session.SessionOuterClass.DeleteSessionRequest.class,
      responseType = yeying.api.session.SessionOuterClass.DeleteSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.DeleteSessionRequest,
      yeying.api.session.SessionOuterClass.DeleteSessionResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.DeleteSessionRequest, yeying.api.session.SessionOuterClass.DeleteSessionResponse> getDeleteMethod;
    if ((getDeleteMethod = SessionGrpc.getDeleteMethod) == null) {
      synchronized (SessionGrpc.class) {
        if ((getDeleteMethod = SessionGrpc.getDeleteMethod) == null) {
          SessionGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yeying.api.session.SessionOuterClass.DeleteSessionRequest, yeying.api.session.SessionOuterClass.DeleteSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.session.SessionOuterClass.DeleteSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.session.SessionOuterClass.DeleteSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.SessionDetailRequest,
      yeying.api.session.SessionOuterClass.SessionDetailResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.session.SessionOuterClass.SessionDetailRequest.class,
      responseType = yeying.api.session.SessionOuterClass.SessionDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.SessionDetailRequest,
      yeying.api.session.SessionOuterClass.SessionDetailResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.SessionDetailRequest, yeying.api.session.SessionOuterClass.SessionDetailResponse> getDetailMethod;
    if ((getDetailMethod = SessionGrpc.getDetailMethod) == null) {
      synchronized (SessionGrpc.class) {
        if ((getDetailMethod = SessionGrpc.getDetailMethod) == null) {
          SessionGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.session.SessionOuterClass.SessionDetailRequest, yeying.api.session.SessionOuterClass.SessionDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.session.SessionOuterClass.SessionDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.session.SessionOuterClass.SessionDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.SearchSessionRequest,
      yeying.api.session.SessionOuterClass.SearchSessionResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.session.SessionOuterClass.SearchSessionRequest.class,
      responseType = yeying.api.session.SessionOuterClass.SearchSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.SearchSessionRequest,
      yeying.api.session.SessionOuterClass.SearchSessionResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.SearchSessionRequest, yeying.api.session.SessionOuterClass.SearchSessionResponse> getSearchMethod;
    if ((getSearchMethod = SessionGrpc.getSearchMethod) == null) {
      synchronized (SessionGrpc.class) {
        if ((getSearchMethod = SessionGrpc.getSearchMethod) == null) {
          SessionGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.session.SessionOuterClass.SearchSessionRequest, yeying.api.session.SessionOuterClass.SearchSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.session.SessionOuterClass.SearchSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.session.SessionOuterClass.SearchSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.UpdateSessionRequest,
      yeying.api.session.SessionOuterClass.UpdateSessionResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yeying.api.session.SessionOuterClass.UpdateSessionRequest.class,
      responseType = yeying.api.session.SessionOuterClass.UpdateSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.UpdateSessionRequest,
      yeying.api.session.SessionOuterClass.UpdateSessionResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<yeying.api.session.SessionOuterClass.UpdateSessionRequest, yeying.api.session.SessionOuterClass.UpdateSessionResponse> getUpdateMethod;
    if ((getUpdateMethod = SessionGrpc.getUpdateMethod) == null) {
      synchronized (SessionGrpc.class) {
        if ((getUpdateMethod = SessionGrpc.getUpdateMethod) == null) {
          SessionGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yeying.api.session.SessionOuterClass.UpdateSessionRequest, yeying.api.session.SessionOuterClass.UpdateSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.session.SessionOuterClass.UpdateSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.session.SessionOuterClass.UpdateSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionStub>() {
        @java.lang.Override
        public SessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionStub(channel, callOptions);
        }
      };
    return SessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SessionBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionBlockingV2Stub>() {
        @java.lang.Override
        public SessionBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionBlockingV2Stub(channel, callOptions);
        }
      };
    return SessionBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionBlockingStub>() {
        @java.lang.Override
        public SessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionBlockingStub(channel, callOptions);
        }
      };
    return SessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionFutureStub>() {
        @java.lang.Override
        public SessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionFutureStub(channel, callOptions);
        }
      };
    return SessionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 创建会话
     * </pre>
     */
    default void create(yeying.api.session.SessionOuterClass.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.CreateSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除会话
     * </pre>
     */
    default void delete(yeying.api.session.SessionOuterClass.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.DeleteSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 搜索会话
     * </pre>
     */
    default void detail(yeying.api.session.SessionOuterClass.SessionDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.SessionDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 搜索会话
     * </pre>
     */
    default void search(yeying.api.session.SessionOuterClass.SearchSessionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.SearchSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新会话
     * </pre>
     */
    default void update(yeying.api.session.SessionOuterClass.UpdateSessionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.UpdateSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Session.
   */
  public static abstract class SessionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SessionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Session.
   */
  public static final class SessionStub
      extends io.grpc.stub.AbstractAsyncStub<SessionStub> {
    private SessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建会话
     * </pre>
     */
    public void create(yeying.api.session.SessionOuterClass.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.CreateSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除会话
     * </pre>
     */
    public void delete(yeying.api.session.SessionOuterClass.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.DeleteSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 搜索会话
     * </pre>
     */
    public void detail(yeying.api.session.SessionOuterClass.SessionDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.SessionDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 搜索会话
     * </pre>
     */
    public void search(yeying.api.session.SessionOuterClass.SearchSessionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.SearchSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新会话
     * </pre>
     */
    public void update(yeying.api.session.SessionOuterClass.UpdateSessionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.UpdateSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Session.
   */
  public static final class SessionBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SessionBlockingV2Stub> {
    private SessionBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建会话
     * </pre>
     */
    public yeying.api.session.SessionOuterClass.CreateSessionResponse create(yeying.api.session.SessionOuterClass.CreateSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除会话
     * </pre>
     */
    public yeying.api.session.SessionOuterClass.DeleteSessionResponse delete(yeying.api.session.SessionOuterClass.DeleteSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索会话
     * </pre>
     */
    public yeying.api.session.SessionOuterClass.SessionDetailResponse detail(yeying.api.session.SessionOuterClass.SessionDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索会话
     * </pre>
     */
    public yeying.api.session.SessionOuterClass.SearchSessionResponse search(yeying.api.session.SessionOuterClass.SearchSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新会话
     * </pre>
     */
    public yeying.api.session.SessionOuterClass.UpdateSessionResponse update(yeying.api.session.SessionOuterClass.UpdateSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Session.
   */
  public static final class SessionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SessionBlockingStub> {
    private SessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建会话
     * </pre>
     */
    public yeying.api.session.SessionOuterClass.CreateSessionResponse create(yeying.api.session.SessionOuterClass.CreateSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除会话
     * </pre>
     */
    public yeying.api.session.SessionOuterClass.DeleteSessionResponse delete(yeying.api.session.SessionOuterClass.DeleteSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索会话
     * </pre>
     */
    public yeying.api.session.SessionOuterClass.SessionDetailResponse detail(yeying.api.session.SessionOuterClass.SessionDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索会话
     * </pre>
     */
    public yeying.api.session.SessionOuterClass.SearchSessionResponse search(yeying.api.session.SessionOuterClass.SearchSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新会话
     * </pre>
     */
    public yeying.api.session.SessionOuterClass.UpdateSessionResponse update(yeying.api.session.SessionOuterClass.UpdateSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Session.
   */
  public static final class SessionFutureStub
      extends io.grpc.stub.AbstractFutureStub<SessionFutureStub> {
    private SessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建会话
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.session.SessionOuterClass.CreateSessionResponse> create(
        yeying.api.session.SessionOuterClass.CreateSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除会话
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.session.SessionOuterClass.DeleteSessionResponse> delete(
        yeying.api.session.SessionOuterClass.DeleteSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 搜索会话
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.session.SessionOuterClass.SessionDetailResponse> detail(
        yeying.api.session.SessionOuterClass.SessionDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 搜索会话
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.session.SessionOuterClass.SearchSessionResponse> search(
        yeying.api.session.SessionOuterClass.SearchSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新会话
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.session.SessionOuterClass.UpdateSessionResponse> update(
        yeying.api.session.SessionOuterClass.UpdateSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_DETAIL = 2;
  private static final int METHODID_SEARCH = 3;
  private static final int METHODID_UPDATE = 4;

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
        case METHODID_CREATE:
          serviceImpl.create((yeying.api.session.SessionOuterClass.CreateSessionRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.CreateSessionResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yeying.api.session.SessionOuterClass.DeleteSessionRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.DeleteSessionResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.session.SessionOuterClass.SessionDetailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.SessionDetailResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((yeying.api.session.SessionOuterClass.SearchSessionRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.SearchSessionResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yeying.api.session.SessionOuterClass.UpdateSessionRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.session.SessionOuterClass.UpdateSessionResponse>) responseObserver);
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
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.session.SessionOuterClass.CreateSessionRequest,
              yeying.api.session.SessionOuterClass.CreateSessionResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.session.SessionOuterClass.DeleteSessionRequest,
              yeying.api.session.SessionOuterClass.DeleteSessionResponse>(
                service, METHODID_DELETE)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.session.SessionOuterClass.SessionDetailRequest,
              yeying.api.session.SessionOuterClass.SessionDetailResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.session.SessionOuterClass.SearchSessionRequest,
              yeying.api.session.SessionOuterClass.SearchSessionResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.session.SessionOuterClass.UpdateSessionRequest,
              yeying.api.session.SessionOuterClass.UpdateSessionResponse>(
                service, METHODID_UPDATE)))
        .build();
  }

  private static abstract class SessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.session.SessionOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Session");
    }
  }

  private static final class SessionFileDescriptorSupplier
      extends SessionBaseDescriptorSupplier {
    SessionFileDescriptorSupplier() {}
  }

  private static final class SessionMethodDescriptorSupplier
      extends SessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SessionMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SessionFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getDetailMethod())
              .addMethod(getSearchMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
