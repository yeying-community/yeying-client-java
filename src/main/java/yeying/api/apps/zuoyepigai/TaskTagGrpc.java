package yeying.api.apps.zuoyepigai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *教学任务标签管理
 *对应的 DB 表：zuoyepigai.task_tag
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/apps/zuoyepigai/tasktag.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TaskTagGrpc {

  private TaskTagGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.apps.zuoyepigai.TaskTag";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest,
      yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest.class,
      responseType = yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest,
      yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse> getAddMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest, yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse> getAddMethod;
    if ((getAddMethod = TaskTagGrpc.getAddMethod) == null) {
      synchronized (TaskTagGrpc.class) {
        if ((getAddMethod = TaskTagGrpc.getAddMethod) == null) {
          TaskTagGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest, yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskTagMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest,
      yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest.class,
      responseType = yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest,
      yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest, yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse> getDetailMethod;
    if ((getDetailMethod = TaskTagGrpc.getDetailMethod) == null) {
      synchronized (TaskTagGrpc.class) {
        if ((getDetailMethod = TaskTagGrpc.getDetailMethod) == null) {
          TaskTagGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest, yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskTagMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest,
      yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest.class,
      responseType = yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest,
      yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse> getListMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest, yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse> getListMethod;
    if ((getListMethod = TaskTagGrpc.getListMethod) == null) {
      synchronized (TaskTagGrpc.class) {
        if ((getListMethod = TaskTagGrpc.getListMethod) == null) {
          TaskTagGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest, yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskTagMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest,
      yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest.class,
      responseType = yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest,
      yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest, yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse> getUpdateMethod;
    if ((getUpdateMethod = TaskTagGrpc.getUpdateMethod) == null) {
      synchronized (TaskTagGrpc.class) {
        if ((getUpdateMethod = TaskTagGrpc.getUpdateMethod) == null) {
          TaskTagGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest, yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskTagMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest,
      yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest.class,
      responseType = yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest,
      yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest, yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse> getDeleteMethod;
    if ((getDeleteMethod = TaskTagGrpc.getDeleteMethod) == null) {
      synchronized (TaskTagGrpc.class) {
        if ((getDeleteMethod = TaskTagGrpc.getDeleteMethod) == null) {
          TaskTagGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest, yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskTagMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskTagStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskTagStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskTagStub>() {
        @java.lang.Override
        public TaskTagStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskTagStub(channel, callOptions);
        }
      };
    return TaskTagStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static TaskTagBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskTagBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskTagBlockingV2Stub>() {
        @java.lang.Override
        public TaskTagBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskTagBlockingV2Stub(channel, callOptions);
        }
      };
    return TaskTagBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskTagBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskTagBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskTagBlockingStub>() {
        @java.lang.Override
        public TaskTagBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskTagBlockingStub(channel, callOptions);
        }
      };
    return TaskTagBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskTagFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskTagFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskTagFutureStub>() {
        @java.lang.Override
        public TaskTagFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskTagFutureStub(channel, callOptions);
        }
      };
    return TaskTagFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *教学任务标签管理
   *对应的 DB 表：zuoyepigai.task_tag
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 创建任务标签：由老师负创建教学任务标签
     * </pre>
     */
    default void add(yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * 任务标签详情
     * </pre>
     */
    default void detail(yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 任务标签列表
     * </pre>
     */
    default void list(yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新任务标签
     * </pre>
     */
    default void update(yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除任务标签
     * </pre>
     */
    default void delete(yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TaskTag.
   * <pre>
   **
   *教学任务标签管理
   *对应的 DB 表：zuoyepigai.task_tag
   * </pre>
   */
  public static abstract class TaskTagImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TaskTagGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TaskTag.
   * <pre>
   **
   *教学任务标签管理
   *对应的 DB 表：zuoyepigai.task_tag
   * </pre>
   */
  public static final class TaskTagStub
      extends io.grpc.stub.AbstractAsyncStub<TaskTagStub> {
    private TaskTagStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskTagStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskTagStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建任务标签：由老师负创建教学任务标签
     * </pre>
     */
    public void add(yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 任务标签详情
     * </pre>
     */
    public void detail(yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 任务标签列表
     * </pre>
     */
    public void list(yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新任务标签
     * </pre>
     */
    public void update(yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除任务标签
     * </pre>
     */
    public void delete(yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TaskTag.
   * <pre>
   **
   *教学任务标签管理
   *对应的 DB 表：zuoyepigai.task_tag
   * </pre>
   */
  public static final class TaskTagBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TaskTagBlockingV2Stub> {
    private TaskTagBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskTagBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskTagBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建任务标签：由老师负创建教学任务标签
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse add(yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 任务标签详情
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse detail(yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 任务标签列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse list(yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新任务标签
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse update(yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除任务标签
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse delete(yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service TaskTag.
   * <pre>
   **
   *教学任务标签管理
   *对应的 DB 表：zuoyepigai.task_tag
   * </pre>
   */
  public static final class TaskTagBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TaskTagBlockingStub> {
    private TaskTagBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskTagBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskTagBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建任务标签：由老师负创建教学任务标签
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse add(yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 任务标签详情
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse detail(yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 任务标签列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse list(yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新任务标签
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse update(yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除任务标签
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse delete(yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TaskTag.
   * <pre>
   **
   *教学任务标签管理
   *对应的 DB 表：zuoyepigai.task_tag
   * </pre>
   */
  public static final class TaskTagFutureStub
      extends io.grpc.stub.AbstractFutureStub<TaskTagFutureStub> {
    private TaskTagFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskTagFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskTagFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建任务标签：由老师负创建教学任务标签
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse> add(
        yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 任务标签详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse> detail(
        yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 任务标签列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse> list(
        yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新任务标签
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse> update(
        yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除任务标签
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse> delete(
        yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest request) {
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
          serviceImpl.add((yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse>) responseObserver);
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
              yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagRequest,
              yeying.api.apps.zuoyepigai.Tasktag.AddTaskTagResponse>(
                service, METHODID_ADD)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagRequest,
              yeying.api.apps.zuoyepigai.Tasktag.DetailTaskTagResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagRequest,
              yeying.api.apps.zuoyepigai.Tasktag.ListTaskTagResponse>(
                service, METHODID_LIST)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagRequest,
              yeying.api.apps.zuoyepigai.Tasktag.UpdateTaskTagResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagRequest,
              yeying.api.apps.zuoyepigai.Tasktag.DeleteTaskTagResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class TaskTagBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskTagBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.apps.zuoyepigai.Tasktag.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskTag");
    }
  }

  private static final class TaskTagFileDescriptorSupplier
      extends TaskTagBaseDescriptorSupplier {
    TaskTagFileDescriptorSupplier() {}
  }

  private static final class TaskTagMethodDescriptorSupplier
      extends TaskTagBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TaskTagMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TaskTagGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskTagFileDescriptorSupplier())
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
