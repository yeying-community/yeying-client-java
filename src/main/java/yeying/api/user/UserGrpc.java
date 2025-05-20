package yeying.api.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/user/user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserGrpc {

  private UserGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.user.User";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.AddUserRequest,
      yeying.api.user.UserOuterClass.AddUserResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = yeying.api.user.UserOuterClass.AddUserRequest.class,
      responseType = yeying.api.user.UserOuterClass.AddUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.AddUserRequest,
      yeying.api.user.UserOuterClass.AddUserResponse> getAddMethod() {
    io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.AddUserRequest, yeying.api.user.UserOuterClass.AddUserResponse> getAddMethod;
    if ((getAddMethod = UserGrpc.getAddMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getAddMethod = UserGrpc.getAddMethod) == null) {
          UserGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<yeying.api.user.UserOuterClass.AddUserRequest, yeying.api.user.UserOuterClass.AddUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.AddUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.AddUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UserDetailRequest,
      yeying.api.user.UserOuterClass.UserDetailResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.user.UserOuterClass.UserDetailRequest.class,
      responseType = yeying.api.user.UserOuterClass.UserDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UserDetailRequest,
      yeying.api.user.UserOuterClass.UserDetailResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UserDetailRequest, yeying.api.user.UserOuterClass.UserDetailResponse> getDetailMethod;
    if ((getDetailMethod = UserGrpc.getDetailMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getDetailMethod = UserGrpc.getDetailMethod) == null) {
          UserGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.user.UserOuterClass.UserDetailRequest, yeying.api.user.UserOuterClass.UserDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.UserDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.UserDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UserListRequest,
      yeying.api.user.UserOuterClass.UserListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yeying.api.user.UserOuterClass.UserListRequest.class,
      responseType = yeying.api.user.UserOuterClass.UserListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UserListRequest,
      yeying.api.user.UserOuterClass.UserListResponse> getListMethod() {
    io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UserListRequest, yeying.api.user.UserOuterClass.UserListResponse> getListMethod;
    if ((getListMethod = UserGrpc.getListMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getListMethod = UserGrpc.getListMethod) == null) {
          UserGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yeying.api.user.UserOuterClass.UserListRequest, yeying.api.user.UserOuterClass.UserListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.UserListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.UserListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.DeleteUserRequest,
      yeying.api.user.UserOuterClass.DeleteUserResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yeying.api.user.UserOuterClass.DeleteUserRequest.class,
      responseType = yeying.api.user.UserOuterClass.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.DeleteUserRequest,
      yeying.api.user.UserOuterClass.DeleteUserResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.DeleteUserRequest, yeying.api.user.UserOuterClass.DeleteUserResponse> getDeleteMethod;
    if ((getDeleteMethod = UserGrpc.getDeleteMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getDeleteMethod = UserGrpc.getDeleteMethod) == null) {
          UserGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yeying.api.user.UserOuterClass.DeleteUserRequest, yeying.api.user.UserOuterClass.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.DeleteUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UpdateUserRequest,
      yeying.api.user.UserOuterClass.UpdateUserResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yeying.api.user.UserOuterClass.UpdateUserRequest.class,
      responseType = yeying.api.user.UserOuterClass.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UpdateUserRequest,
      yeying.api.user.UserOuterClass.UpdateUserResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UpdateUserRequest, yeying.api.user.UserOuterClass.UpdateUserResponse> getUpdateMethod;
    if ((getUpdateMethod = UserGrpc.getUpdateMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getUpdateMethod = UserGrpc.getUpdateMethod) == null) {
          UserGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yeying.api.user.UserOuterClass.UpdateUserRequest, yeying.api.user.UserOuterClass.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UpdateStatusRequest,
      yeying.api.user.UserOuterClass.UpdateStatusResponse> getUpdateStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStatus",
      requestType = yeying.api.user.UserOuterClass.UpdateStatusRequest.class,
      responseType = yeying.api.user.UserOuterClass.UpdateStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UpdateStatusRequest,
      yeying.api.user.UserOuterClass.UpdateStatusResponse> getUpdateStatusMethod() {
    io.grpc.MethodDescriptor<yeying.api.user.UserOuterClass.UpdateStatusRequest, yeying.api.user.UserOuterClass.UpdateStatusResponse> getUpdateStatusMethod;
    if ((getUpdateStatusMethod = UserGrpc.getUpdateStatusMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getUpdateStatusMethod = UserGrpc.getUpdateStatusMethod) == null) {
          UserGrpc.getUpdateStatusMethod = getUpdateStatusMethod =
              io.grpc.MethodDescriptor.<yeying.api.user.UserOuterClass.UpdateStatusRequest, yeying.api.user.UserOuterClass.UpdateStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.UpdateStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.user.UserOuterClass.UpdateStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("UpdateStatus"))
              .build();
        }
      }
    }
    return getUpdateStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserStub>() {
        @java.lang.Override
        public UserStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserStub(channel, callOptions);
        }
      };
    return UserStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UserBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserBlockingV2Stub>() {
        @java.lang.Override
        public UserBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserBlockingV2Stub(channel, callOptions);
        }
      };
    return UserBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserBlockingStub>() {
        @java.lang.Override
        public UserBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserBlockingStub(channel, callOptions);
        }
      };
    return UserBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserFutureStub>() {
        @java.lang.Override
        public UserFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserFutureStub(channel, callOptions);
        }
      };
    return UserFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 添加用户
     * </pre>
     */
    default void add(yeying.api.user.UserOuterClass.AddUserRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.AddUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取用户
     * </pre>
     */
    default void detail(yeying.api.user.UserOuterClass.UserDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UserDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 用户列表
     * </pre>
     */
    default void list(yeying.api.user.UserOuterClass.UserListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UserListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除用户
     * </pre>
     */
    default void delete(yeying.api.user.UserOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 修改用户信息
     * </pre>
     */
    default void update(yeying.api.user.UserOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 修改用户状态，冻结/解冻
     * </pre>
     */
    default void updateStatus(yeying.api.user.UserOuterClass.UpdateStatusRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UpdateStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service User.
   */
  public static abstract class UserImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service User.
   */
  public static final class UserStub
      extends io.grpc.stub.AbstractAsyncStub<UserStub> {
    private UserStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加用户
     * </pre>
     */
    public void add(yeying.api.user.UserOuterClass.AddUserRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.AddUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取用户
     * </pre>
     */
    public void detail(yeying.api.user.UserOuterClass.UserDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UserDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户列表
     * </pre>
     */
    public void list(yeying.api.user.UserOuterClass.UserListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UserListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除用户
     * </pre>
     */
    public void delete(yeying.api.user.UserOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 修改用户信息
     * </pre>
     */
    public void update(yeying.api.user.UserOuterClass.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 修改用户状态，冻结/解冻
     * </pre>
     */
    public void updateStatus(yeying.api.user.UserOuterClass.UpdateStatusRequest request,
        io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UpdateStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service User.
   */
  public static final class UserBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UserBlockingV2Stub> {
    private UserBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加用户
     * </pre>
     */
    public yeying.api.user.UserOuterClass.AddUserResponse add(yeying.api.user.UserOuterClass.AddUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取用户
     * </pre>
     */
    public yeying.api.user.UserOuterClass.UserDetailResponse detail(yeying.api.user.UserOuterClass.UserDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户列表
     * </pre>
     */
    public yeying.api.user.UserOuterClass.UserListResponse list(yeying.api.user.UserOuterClass.UserListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除用户
     * </pre>
     */
    public yeying.api.user.UserOuterClass.DeleteUserResponse delete(yeying.api.user.UserOuterClass.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 修改用户信息
     * </pre>
     */
    public yeying.api.user.UserOuterClass.UpdateUserResponse update(yeying.api.user.UserOuterClass.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 修改用户状态，冻结/解冻
     * </pre>
     */
    public yeying.api.user.UserOuterClass.UpdateStatusResponse updateStatus(yeying.api.user.UserOuterClass.UpdateStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service User.
   */
  public static final class UserBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserBlockingStub> {
    private UserBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加用户
     * </pre>
     */
    public yeying.api.user.UserOuterClass.AddUserResponse add(yeying.api.user.UserOuterClass.AddUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取用户
     * </pre>
     */
    public yeying.api.user.UserOuterClass.UserDetailResponse detail(yeying.api.user.UserOuterClass.UserDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户列表
     * </pre>
     */
    public yeying.api.user.UserOuterClass.UserListResponse list(yeying.api.user.UserOuterClass.UserListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除用户
     * </pre>
     */
    public yeying.api.user.UserOuterClass.DeleteUserResponse delete(yeying.api.user.UserOuterClass.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 修改用户信息
     * </pre>
     */
    public yeying.api.user.UserOuterClass.UpdateUserResponse update(yeying.api.user.UserOuterClass.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 修改用户状态，冻结/解冻
     * </pre>
     */
    public yeying.api.user.UserOuterClass.UpdateStatusResponse updateStatus(yeying.api.user.UserOuterClass.UpdateStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service User.
   */
  public static final class UserFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserFutureStub> {
    private UserFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.user.UserOuterClass.AddUserResponse> add(
        yeying.api.user.UserOuterClass.AddUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.user.UserOuterClass.UserDetailResponse> detail(
        yeying.api.user.UserOuterClass.UserDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.user.UserOuterClass.UserListResponse> list(
        yeying.api.user.UserOuterClass.UserListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.user.UserOuterClass.DeleteUserResponse> delete(
        yeying.api.user.UserOuterClass.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 修改用户信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.user.UserOuterClass.UpdateUserResponse> update(
        yeying.api.user.UserOuterClass.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 修改用户状态，冻结/解冻
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.user.UserOuterClass.UpdateStatusResponse> updateStatus(
        yeying.api.user.UserOuterClass.UpdateStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_DETAIL = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_UPDATE_STATUS = 5;

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
        case METHODID_ADD:
          serviceImpl.add((yeying.api.user.UserOuterClass.AddUserRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.AddUserResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.user.UserOuterClass.UserDetailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UserDetailResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yeying.api.user.UserOuterClass.UserListRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UserListResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yeying.api.user.UserOuterClass.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.DeleteUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yeying.api.user.UserOuterClass.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STATUS:
          serviceImpl.updateStatus((yeying.api.user.UserOuterClass.UpdateStatusRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.user.UserOuterClass.UpdateStatusResponse>) responseObserver);
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
          getAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.user.UserOuterClass.AddUserRequest,
              yeying.api.user.UserOuterClass.AddUserResponse>(
                service, METHODID_ADD)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.user.UserOuterClass.UserDetailRequest,
              yeying.api.user.UserOuterClass.UserDetailResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.user.UserOuterClass.UserListRequest,
              yeying.api.user.UserOuterClass.UserListResponse>(
                service, METHODID_LIST)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.user.UserOuterClass.DeleteUserRequest,
              yeying.api.user.UserOuterClass.DeleteUserResponse>(
                service, METHODID_DELETE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.user.UserOuterClass.UpdateUserRequest,
              yeying.api.user.UserOuterClass.UpdateUserResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getUpdateStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.user.UserOuterClass.UpdateStatusRequest,
              yeying.api.user.UserOuterClass.UpdateStatusResponse>(
                service, METHODID_UPDATE_STATUS)))
        .build();
  }

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.user.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getDetailMethod())
              .addMethod(getListMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getUpdateStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
