package yeying.api.apps.zuoyepigai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *学生组
 *对应的 DB 表：zuoyepigai.student_group
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/apps/zuoyepigai/group.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GroupGrpc {

  private GroupGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.apps.zuoyepigai.Group";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest,
      yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest.class,
      responseType = yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest,
      yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse> getAddMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest, yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse> getAddMethod;
    if ((getAddMethod = GroupGrpc.getAddMethod) == null) {
      synchronized (GroupGrpc.class) {
        if ((getAddMethod = GroupGrpc.getAddMethod) == null) {
          GroupGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest, yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest,
      yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest.class,
      responseType = yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest,
      yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest, yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse> getDetailMethod;
    if ((getDetailMethod = GroupGrpc.getDetailMethod) == null) {
      synchronized (GroupGrpc.class) {
        if ((getDetailMethod = GroupGrpc.getDetailMethod) == null) {
          GroupGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest, yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest,
      yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest.class,
      responseType = yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest,
      yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse> getListMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest, yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse> getListMethod;
    if ((getListMethod = GroupGrpc.getListMethod) == null) {
      synchronized (GroupGrpc.class) {
        if ((getListMethod = GroupGrpc.getListMethod) == null) {
          GroupGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest, yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest,
      yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest.class,
      responseType = yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest,
      yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest, yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse> getUpdateMethod;
    if ((getUpdateMethod = GroupGrpc.getUpdateMethod) == null) {
      synchronized (GroupGrpc.class) {
        if ((getUpdateMethod = GroupGrpc.getUpdateMethod) == null) {
          GroupGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest, yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest,
      yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest.class,
      responseType = yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest,
      yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest, yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse> getDeleteMethod;
    if ((getDeleteMethod = GroupGrpc.getDeleteMethod) == null) {
      synchronized (GroupGrpc.class) {
        if ((getDeleteMethod = GroupGrpc.getDeleteMethod) == null) {
          GroupGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest, yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GroupMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GroupStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupStub>() {
        @java.lang.Override
        public GroupStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupStub(channel, callOptions);
        }
      };
    return GroupStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static GroupBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupBlockingV2Stub>() {
        @java.lang.Override
        public GroupBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupBlockingV2Stub(channel, callOptions);
        }
      };
    return GroupBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GroupBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupBlockingStub>() {
        @java.lang.Override
        public GroupBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupBlockingStub(channel, callOptions);
        }
      };
    return GroupBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GroupFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GroupFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GroupFutureStub>() {
        @java.lang.Override
        public GroupFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GroupFutureStub(channel, callOptions);
        }
      };
    return GroupFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *学生组
   *对应的 DB 表：zuoyepigai.student_group
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 创建学生组
     * </pre>
     */
    default void add(yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * 学生组详情
     * </pre>
     */
    default void detail(yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 学生组列表
     * </pre>
     */
    default void list(yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新学生组
     * </pre>
     */
    default void update(yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除学生组
     * </pre>
     */
    default void delete(yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Group.
   * <pre>
   **
   *学生组
   *对应的 DB 表：zuoyepigai.student_group
   * </pre>
   */
  public static abstract class GroupImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GroupGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Group.
   * <pre>
   **
   *学生组
   *对应的 DB 表：zuoyepigai.student_group
   * </pre>
   */
  public static final class GroupStub
      extends io.grpc.stub.AbstractAsyncStub<GroupStub> {
    private GroupStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建学生组
     * </pre>
     */
    public void add(yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 学生组详情
     * </pre>
     */
    public void detail(yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 学生组列表
     * </pre>
     */
    public void list(yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新学生组
     * </pre>
     */
    public void update(yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除学生组
     * </pre>
     */
    public void delete(yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Group.
   * <pre>
   **
   *学生组
   *对应的 DB 表：zuoyepigai.student_group
   * </pre>
   */
  public static final class GroupBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<GroupBlockingV2Stub> {
    private GroupBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建学生组
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse add(yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 学生组详情
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse detail(yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 学生组列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse list(yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新学生组
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse update(yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除学生组
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse delete(yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Group.
   * <pre>
   **
   *学生组
   *对应的 DB 表：zuoyepigai.student_group
   * </pre>
   */
  public static final class GroupBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GroupBlockingStub> {
    private GroupBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建学生组
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse add(yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 学生组详情
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse detail(yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 学生组列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse list(yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新学生组
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse update(yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除学生组
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse delete(yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Group.
   * <pre>
   **
   *学生组
   *对应的 DB 表：zuoyepigai.student_group
   * </pre>
   */
  public static final class GroupFutureStub
      extends io.grpc.stub.AbstractFutureStub<GroupFutureStub> {
    private GroupFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GroupFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GroupFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建学生组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse> add(
        yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 学生组详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse> detail(
        yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 学生组列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse> list(
        yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新学生组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse> update(
        yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除学生组
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse> delete(
        yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_DETAIL = 1;
  private static final int METHODID_LIST = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

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
          serviceImpl.add((yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse>) responseObserver);
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
              yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupRequest,
              yeying.api.apps.zuoyepigai.GroupOuterClass.AddGroupResponse>(
                service, METHODID_ADD)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupRequest,
              yeying.api.apps.zuoyepigai.GroupOuterClass.DetailGroupResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupRequest,
              yeying.api.apps.zuoyepigai.GroupOuterClass.ListGroupResponse>(
                service, METHODID_LIST)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupRequest,
              yeying.api.apps.zuoyepigai.GroupOuterClass.UpdateGroupResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupRequest,
              yeying.api.apps.zuoyepigai.GroupOuterClass.DeleteGroupResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class GroupBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GroupBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.apps.zuoyepigai.GroupOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Group");
    }
  }

  private static final class GroupFileDescriptorSupplier
      extends GroupBaseDescriptorSupplier {
    GroupFileDescriptorSupplier() {}
  }

  private static final class GroupMethodDescriptorSupplier
      extends GroupBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GroupMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GroupGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GroupFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getDetailMethod())
              .addMethod(getListMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
