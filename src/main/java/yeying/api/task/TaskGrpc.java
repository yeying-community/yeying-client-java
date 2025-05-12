package yeying.api.task;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/task/task.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TaskGrpc {

  private TaskGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.task.Task";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.task.TaskOuterClass.CreateTaskRequest,
      yeying.api.task.TaskOuterClass.CreateTaskResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yeying.api.task.TaskOuterClass.CreateTaskRequest.class,
      responseType = yeying.api.task.TaskOuterClass.CreateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.task.TaskOuterClass.CreateTaskRequest,
      yeying.api.task.TaskOuterClass.CreateTaskResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yeying.api.task.TaskOuterClass.CreateTaskRequest, yeying.api.task.TaskOuterClass.CreateTaskResponse> getCreateMethod;
    if ((getCreateMethod = TaskGrpc.getCreateMethod) == null) {
      synchronized (TaskGrpc.class) {
        if ((getCreateMethod = TaskGrpc.getCreateMethod) == null) {
          TaskGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yeying.api.task.TaskOuterClass.CreateTaskRequest, yeying.api.task.TaskOuterClass.CreateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.task.TaskOuterClass.CreateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.task.TaskOuterClass.CreateTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void create(yeying.api.task.TaskOuterClass.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.task.TaskOuterClass.CreateTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Task.
   */
  public static abstract class TaskImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TaskGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Task.
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
     */
    public void create(yeying.api.task.TaskOuterClass.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<yeying.api.task.TaskOuterClass.CreateTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Task.
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
     */
    public yeying.api.task.TaskOuterClass.CreateTaskResponse create(yeying.api.task.TaskOuterClass.CreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Task.
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
     */
    public yeying.api.task.TaskOuterClass.CreateTaskResponse create(yeying.api.task.TaskOuterClass.CreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Task.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.task.TaskOuterClass.CreateTaskResponse> create(
        yeying.api.task.TaskOuterClass.CreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;

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
          serviceImpl.create((yeying.api.task.TaskOuterClass.CreateTaskRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.task.TaskOuterClass.CreateTaskResponse>) responseObserver);
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
              yeying.api.task.TaskOuterClass.CreateTaskRequest,
              yeying.api.task.TaskOuterClass.CreateTaskResponse>(
                service, METHODID_CREATE)))
        .build();
  }

  private static abstract class TaskBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.task.TaskOuterClass.getDescriptor();
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
              .addMethod(getCreateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
