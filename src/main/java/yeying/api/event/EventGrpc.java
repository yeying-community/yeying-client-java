package yeying.api.event;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/event/event.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventGrpc {

  private EventGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.event.Event";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.event.EventOuterClass.ProduceRequest,
      yeying.api.event.EventOuterClass.ProduceResponse> getProduceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Produce",
      requestType = yeying.api.event.EventOuterClass.ProduceRequest.class,
      responseType = yeying.api.event.EventOuterClass.ProduceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.event.EventOuterClass.ProduceRequest,
      yeying.api.event.EventOuterClass.ProduceResponse> getProduceMethod() {
    io.grpc.MethodDescriptor<yeying.api.event.EventOuterClass.ProduceRequest, yeying.api.event.EventOuterClass.ProduceResponse> getProduceMethod;
    if ((getProduceMethod = EventGrpc.getProduceMethod) == null) {
      synchronized (EventGrpc.class) {
        if ((getProduceMethod = EventGrpc.getProduceMethod) == null) {
          EventGrpc.getProduceMethod = getProduceMethod =
              io.grpc.MethodDescriptor.<yeying.api.event.EventOuterClass.ProduceRequest, yeying.api.event.EventOuterClass.ProduceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Produce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.event.EventOuterClass.ProduceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.event.EventOuterClass.ProduceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventMethodDescriptorSupplier("Produce"))
              .build();
        }
      }
    }
    return getProduceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.event.EventOuterClass.ConsumeRequest,
      yeying.api.event.EventOuterClass.ConsumeResponse> getConsumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Consume",
      requestType = yeying.api.event.EventOuterClass.ConsumeRequest.class,
      responseType = yeying.api.event.EventOuterClass.ConsumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.event.EventOuterClass.ConsumeRequest,
      yeying.api.event.EventOuterClass.ConsumeResponse> getConsumeMethod() {
    io.grpc.MethodDescriptor<yeying.api.event.EventOuterClass.ConsumeRequest, yeying.api.event.EventOuterClass.ConsumeResponse> getConsumeMethod;
    if ((getConsumeMethod = EventGrpc.getConsumeMethod) == null) {
      synchronized (EventGrpc.class) {
        if ((getConsumeMethod = EventGrpc.getConsumeMethod) == null) {
          EventGrpc.getConsumeMethod = getConsumeMethod =
              io.grpc.MethodDescriptor.<yeying.api.event.EventOuterClass.ConsumeRequest, yeying.api.event.EventOuterClass.ConsumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Consume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.event.EventOuterClass.ConsumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.event.EventOuterClass.ConsumeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventMethodDescriptorSupplier("Consume"))
              .build();
        }
      }
    }
    return getConsumeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventStub>() {
        @java.lang.Override
        public EventStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventStub(channel, callOptions);
        }
      };
    return EventStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static EventBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventBlockingV2Stub>() {
        @java.lang.Override
        public EventBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventBlockingV2Stub(channel, callOptions);
        }
      };
    return EventBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventBlockingStub>() {
        @java.lang.Override
        public EventBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventBlockingStub(channel, callOptions);
        }
      };
    return EventBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventFutureStub>() {
        @java.lang.Override
        public EventFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventFutureStub(channel, callOptions);
        }
      };
    return EventFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 某个服务作为客户端生成了事件，通常node会实现服务端，然后同步给用户
     * </pre>
     */
    default void produce(yeying.api.event.EventOuterClass.ProduceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.event.EventOuterClass.ProduceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProduceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 用户直接向生成事件的服务消费并给出处理意见
     * </pre>
     */
    default void consume(yeying.api.event.EventOuterClass.ConsumeRequest request,
        io.grpc.stub.StreamObserver<yeying.api.event.EventOuterClass.ConsumeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsumeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Event.
   */
  public static abstract class EventImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Event.
   */
  public static final class EventStub
      extends io.grpc.stub.AbstractAsyncStub<EventStub> {
    private EventStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventStub(channel, callOptions);
    }

    /**
     * <pre>
     * 某个服务作为客户端生成了事件，通常node会实现服务端，然后同步给用户
     * </pre>
     */
    public void produce(yeying.api.event.EventOuterClass.ProduceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.event.EventOuterClass.ProduceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProduceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户直接向生成事件的服务消费并给出处理意见
     * </pre>
     */
    public void consume(yeying.api.event.EventOuterClass.ConsumeRequest request,
        io.grpc.stub.StreamObserver<yeying.api.event.EventOuterClass.ConsumeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsumeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Event.
   */
  public static final class EventBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<EventBlockingV2Stub> {
    private EventBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 某个服务作为客户端生成了事件，通常node会实现服务端，然后同步给用户
     * </pre>
     */
    public yeying.api.event.EventOuterClass.ProduceResponse produce(yeying.api.event.EventOuterClass.ProduceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProduceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户直接向生成事件的服务消费并给出处理意见
     * </pre>
     */
    public yeying.api.event.EventOuterClass.ConsumeResponse consume(yeying.api.event.EventOuterClass.ConsumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsumeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Event.
   */
  public static final class EventBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventBlockingStub> {
    private EventBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 某个服务作为客户端生成了事件，通常node会实现服务端，然后同步给用户
     * </pre>
     */
    public yeying.api.event.EventOuterClass.ProduceResponse produce(yeying.api.event.EventOuterClass.ProduceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProduceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户直接向生成事件的服务消费并给出处理意见
     * </pre>
     */
    public yeying.api.event.EventOuterClass.ConsumeResponse consume(yeying.api.event.EventOuterClass.ConsumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsumeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Event.
   */
  public static final class EventFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventFutureStub> {
    private EventFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 某个服务作为客户端生成了事件，通常node会实现服务端，然后同步给用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.event.EventOuterClass.ProduceResponse> produce(
        yeying.api.event.EventOuterClass.ProduceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProduceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户直接向生成事件的服务消费并给出处理意见
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.event.EventOuterClass.ConsumeResponse> consume(
        yeying.api.event.EventOuterClass.ConsumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsumeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRODUCE = 0;
  private static final int METHODID_CONSUME = 1;

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
        case METHODID_PRODUCE:
          serviceImpl.produce((yeying.api.event.EventOuterClass.ProduceRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.event.EventOuterClass.ProduceResponse>) responseObserver);
          break;
        case METHODID_CONSUME:
          serviceImpl.consume((yeying.api.event.EventOuterClass.ConsumeRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.event.EventOuterClass.ConsumeResponse>) responseObserver);
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
          getProduceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.event.EventOuterClass.ProduceRequest,
              yeying.api.event.EventOuterClass.ProduceResponse>(
                service, METHODID_PRODUCE)))
        .addMethod(
          getConsumeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.event.EventOuterClass.ConsumeRequest,
              yeying.api.event.EventOuterClass.ConsumeResponse>(
                service, METHODID_CONSUME)))
        .build();
  }

  private static abstract class EventBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.event.EventOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Event");
    }
  }

  private static final class EventFileDescriptorSupplier
      extends EventBaseDescriptorSupplier {
    EventFileDescriptorSupplier() {}
  }

  private static final class EventMethodDescriptorSupplier
      extends EventBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EventMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EventGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventFileDescriptorSupplier())
              .addMethod(getProduceMethod())
              .addMethod(getConsumeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
