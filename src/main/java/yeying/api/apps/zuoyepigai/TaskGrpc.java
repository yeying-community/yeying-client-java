package yeying.api.apps.zuoyepigai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *老师教学任务管理
 *对应的 DB 表：zuoyepigai.teaching_tasks
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/apps/zuoyepigai/task.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TaskGrpc {

  private TaskGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.apps.zuoyepigai.Task";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest,
      yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest.class,
      responseType = yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest,
      yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse> getAddMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest, yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse> getAddMethod;
    if ((getAddMethod = TaskGrpc.getAddMethod) == null) {
      synchronized (TaskGrpc.class) {
        if ((getAddMethod = TaskGrpc.getAddMethod) == null) {
          TaskGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest, yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest,
      yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest.class,
      responseType = yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest,
      yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest, yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse> getDetailMethod;
    if ((getDetailMethod = TaskGrpc.getDetailMethod) == null) {
      synchronized (TaskGrpc.class) {
        if ((getDetailMethod = TaskGrpc.getDetailMethod) == null) {
          TaskGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest, yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest,
      yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest.class,
      responseType = yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest,
      yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse> getListMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest, yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse> getListMethod;
    if ((getListMethod = TaskGrpc.getListMethod) == null) {
      synchronized (TaskGrpc.class) {
        if ((getListMethod = TaskGrpc.getListMethod) == null) {
          TaskGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest, yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest,
      yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest.class,
      responseType = yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest,
      yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest, yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse> getUpdateMethod;
    if ((getUpdateMethod = TaskGrpc.getUpdateMethod) == null) {
      synchronized (TaskGrpc.class) {
        if ((getUpdateMethod = TaskGrpc.getUpdateMethod) == null) {
          TaskGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest, yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest,
      yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest.class,
      responseType = yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest,
      yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest, yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse> getDeleteMethod;
    if ((getDeleteMethod = TaskGrpc.getDeleteMethod) == null) {
      synchronized (TaskGrpc.class) {
        if ((getDeleteMethod = TaskGrpc.getDeleteMethod) == null) {
          TaskGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest, yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskStub>() {
        @java.lang.Override
        public TaskStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskStub(channel, callOptions);
        }
      };
    return TaskStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static TaskBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskBlockingV2Stub>() {
        @java.lang.Override
        public TaskBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskBlockingV2Stub(channel, callOptions);
        }
      };
    return TaskBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskBlockingStub>() {
        @java.lang.Override
        public TaskBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskBlockingStub(channel, callOptions);
        }
      };
    return TaskBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskFutureStub>() {
        @java.lang.Override
        public TaskFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskFutureStub(channel, callOptions);
        }
      };
    return TaskFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *老师教学任务管理
   *对应的 DB 表：zuoyepigai.teaching_tasks
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 创建任务：由老师负创建教学任务
     * </pre>
     */
    default void add(yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * 任务详情
     * </pre>
     */
    default void detail(yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 任务列表
     * </pre>
     */
    default void list(yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新任务
     * </pre>
     */
    default void update(yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除任务
     * </pre>
     */
    default void delete(yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Task.
   * <pre>
   **
   *老师教学任务管理
   *对应的 DB 表：zuoyepigai.teaching_tasks
   * </pre>
   */
  public static abstract class TaskImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TaskGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Task.
   * <pre>
   **
   *老师教学任务管理
   *对应的 DB 表：zuoyepigai.teaching_tasks
   * </pre>
   */
  public static final class TaskStub
      extends io.grpc.stub.AbstractAsyncStub<TaskStub> {
    private TaskStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建任务：由老师负创建教学任务
     * </pre>
     */
    public void add(yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 任务详情
     * </pre>
     */
    public void detail(yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 任务列表
     * </pre>
     */
    public void list(yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新任务
     * </pre>
     */
    public void update(yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除任务
     * </pre>
     */
    public void delete(yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Task.
   * <pre>
   **
   *老师教学任务管理
   *对应的 DB 表：zuoyepigai.teaching_tasks
   * </pre>
   */
  public static final class TaskBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TaskBlockingV2Stub> {
    private TaskBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建任务：由老师负创建教学任务
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse add(yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 任务详情
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse detail(yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 任务列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse list(yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新任务
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse update(yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除任务
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse delete(yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Task.
   * <pre>
   **
   *老师教学任务管理
   *对应的 DB 表：zuoyepigai.teaching_tasks
   * </pre>
   */
  public static final class TaskBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TaskBlockingStub> {
    private TaskBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建任务：由老师负创建教学任务
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse add(yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 任务详情
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse detail(yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 任务列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse list(yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新任务
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse update(yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除任务
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse delete(yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Task.
   * <pre>
   **
   *老师教学任务管理
   *对应的 DB 表：zuoyepigai.teaching_tasks
   * </pre>
   */
  public static final class TaskFutureStub
      extends io.grpc.stub.AbstractFutureStub<TaskFutureStub> {
    private TaskFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建任务：由老师负创建教学任务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse> add(
        yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 任务详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse> detail(
        yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 任务列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse> list(
        yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新任务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse> update(
        yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除任务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse> delete(
        yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest request) {
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
          serviceImpl.add((yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse>) responseObserver);
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
              yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskRequest,
              yeying.api.apps.zuoyepigai.TaskOuterClass.AddTaskResponse>(
                service, METHODID_ADD)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskRequest,
              yeying.api.apps.zuoyepigai.TaskOuterClass.DetailTaskResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskRequest,
              yeying.api.apps.zuoyepigai.TaskOuterClass.ListTaskResponse>(
                service, METHODID_LIST)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskRequest,
              yeying.api.apps.zuoyepigai.TaskOuterClass.UpdateTaskResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskRequest,
              yeying.api.apps.zuoyepigai.TaskOuterClass.DeleteTaskResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class TaskBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.apps.zuoyepigai.TaskOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Task");
    }
  }

  private static final class TaskFileDescriptorSupplier
      extends TaskBaseDescriptorSupplier {
    TaskFileDescriptorSupplier() {}
  }

  private static final class TaskMethodDescriptorSupplier
      extends TaskBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TaskMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TaskGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskFileDescriptorSupplier())
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
