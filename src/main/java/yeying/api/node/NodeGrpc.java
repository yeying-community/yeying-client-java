package yeying.api.node;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * 每一个服务都是一个节点，提供通用的接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/node/node.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NodeGrpc {

  private NodeGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.node.Node";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.node.NodeOuterClass.HealthCheckRequest,
      yeying.api.node.NodeOuterClass.HealthCheckResponse> getHealthCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HealthCheck",
      requestType = yeying.api.node.NodeOuterClass.HealthCheckRequest.class,
      responseType = yeying.api.node.NodeOuterClass.HealthCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.node.NodeOuterClass.HealthCheckRequest,
      yeying.api.node.NodeOuterClass.HealthCheckResponse> getHealthCheckMethod() {
    io.grpc.MethodDescriptor<yeying.api.node.NodeOuterClass.HealthCheckRequest, yeying.api.node.NodeOuterClass.HealthCheckResponse> getHealthCheckMethod;
    if ((getHealthCheckMethod = NodeGrpc.getHealthCheckMethod) == null) {
      synchronized (NodeGrpc.class) {
        if ((getHealthCheckMethod = NodeGrpc.getHealthCheckMethod) == null) {
          NodeGrpc.getHealthCheckMethod = getHealthCheckMethod =
              io.grpc.MethodDescriptor.<yeying.api.node.NodeOuterClass.HealthCheckRequest, yeying.api.node.NodeOuterClass.HealthCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HealthCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.node.NodeOuterClass.HealthCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.node.NodeOuterClass.HealthCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeMethodDescriptorSupplier("HealthCheck"))
              .build();
        }
      }
    }
    return getHealthCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.node.NodeOuterClass.WhoamiRequest,
      yeying.api.node.NodeOuterClass.WhoamiResponse> getWhoamiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Whoami",
      requestType = yeying.api.node.NodeOuterClass.WhoamiRequest.class,
      responseType = yeying.api.node.NodeOuterClass.WhoamiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.node.NodeOuterClass.WhoamiRequest,
      yeying.api.node.NodeOuterClass.WhoamiResponse> getWhoamiMethod() {
    io.grpc.MethodDescriptor<yeying.api.node.NodeOuterClass.WhoamiRequest, yeying.api.node.NodeOuterClass.WhoamiResponse> getWhoamiMethod;
    if ((getWhoamiMethod = NodeGrpc.getWhoamiMethod) == null) {
      synchronized (NodeGrpc.class) {
        if ((getWhoamiMethod = NodeGrpc.getWhoamiMethod) == null) {
          NodeGrpc.getWhoamiMethod = getWhoamiMethod =
              io.grpc.MethodDescriptor.<yeying.api.node.NodeOuterClass.WhoamiRequest, yeying.api.node.NodeOuterClass.WhoamiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Whoami"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.node.NodeOuterClass.WhoamiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.node.NodeOuterClass.WhoamiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NodeMethodDescriptorSupplier("Whoami"))
              .build();
        }
      }
    }
    return getWhoamiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NodeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeStub>() {
        @java.lang.Override
        public NodeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeStub(channel, callOptions);
        }
      };
    return NodeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static NodeBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeBlockingV2Stub>() {
        @java.lang.Override
        public NodeBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeBlockingV2Stub(channel, callOptions);
        }
      };
    return NodeBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NodeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeBlockingStub>() {
        @java.lang.Override
        public NodeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeBlockingStub(channel, callOptions);
        }
      };
    return NodeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NodeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NodeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NodeFutureStub>() {
        @java.lang.Override
        public NodeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NodeFutureStub(channel, callOptions);
        }
      };
    return NodeFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * 每一个服务都是一个节点，提供通用的接口
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void healthCheck(yeying.api.node.NodeOuterClass.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<yeying.api.node.NodeOuterClass.HealthCheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHealthCheckMethod(), responseObserver);
    }

    /**
     */
    default void whoami(yeying.api.node.NodeOuterClass.WhoamiRequest request,
        io.grpc.stub.StreamObserver<yeying.api.node.NodeOuterClass.WhoamiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWhoamiMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Node.
   * <pre>
   **
   * 每一个服务都是一个节点，提供通用的接口
   * </pre>
   */
  public static abstract class NodeImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NodeGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Node.
   * <pre>
   **
   * 每一个服务都是一个节点，提供通用的接口
   * </pre>
   */
  public static final class NodeStub
      extends io.grpc.stub.AbstractAsyncStub<NodeStub> {
    private NodeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeStub(channel, callOptions);
    }

    /**
     */
    public void healthCheck(yeying.api.node.NodeOuterClass.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<yeying.api.node.NodeOuterClass.HealthCheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void whoami(yeying.api.node.NodeOuterClass.WhoamiRequest request,
        io.grpc.stub.StreamObserver<yeying.api.node.NodeOuterClass.WhoamiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWhoamiMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Node.
   * <pre>
   **
   * 每一个服务都是一个节点，提供通用的接口
   * </pre>
   */
  public static final class NodeBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<NodeBlockingV2Stub> {
    private NodeBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public yeying.api.node.NodeOuterClass.HealthCheckResponse healthCheck(yeying.api.node.NodeOuterClass.HealthCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHealthCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public yeying.api.node.NodeOuterClass.WhoamiResponse whoami(yeying.api.node.NodeOuterClass.WhoamiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWhoamiMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Node.
   * <pre>
   **
   * 每一个服务都是一个节点，提供通用的接口
   * </pre>
   */
  public static final class NodeBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NodeBlockingStub> {
    private NodeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeBlockingStub(channel, callOptions);
    }

    /**
     */
    public yeying.api.node.NodeOuterClass.HealthCheckResponse healthCheck(yeying.api.node.NodeOuterClass.HealthCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHealthCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public yeying.api.node.NodeOuterClass.WhoamiResponse whoami(yeying.api.node.NodeOuterClass.WhoamiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWhoamiMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Node.
   * <pre>
   **
   * 每一个服务都是一个节点，提供通用的接口
   * </pre>
   */
  public static final class NodeFutureStub
      extends io.grpc.stub.AbstractFutureStub<NodeFutureStub> {
    private NodeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NodeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NodeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.node.NodeOuterClass.HealthCheckResponse> healthCheck(
        yeying.api.node.NodeOuterClass.HealthCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.node.NodeOuterClass.WhoamiResponse> whoami(
        yeying.api.node.NodeOuterClass.WhoamiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWhoamiMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HEALTH_CHECK = 0;
  private static final int METHODID_WHOAMI = 1;

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
        case METHODID_HEALTH_CHECK:
          serviceImpl.healthCheck((yeying.api.node.NodeOuterClass.HealthCheckRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.node.NodeOuterClass.HealthCheckResponse>) responseObserver);
          break;
        case METHODID_WHOAMI:
          serviceImpl.whoami((yeying.api.node.NodeOuterClass.WhoamiRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.node.NodeOuterClass.WhoamiResponse>) responseObserver);
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
          getHealthCheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.node.NodeOuterClass.HealthCheckRequest,
              yeying.api.node.NodeOuterClass.HealthCheckResponse>(
                service, METHODID_HEALTH_CHECK)))
        .addMethod(
          getWhoamiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.node.NodeOuterClass.WhoamiRequest,
              yeying.api.node.NodeOuterClass.WhoamiResponse>(
                service, METHODID_WHOAMI)))
        .build();
  }

  private static abstract class NodeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NodeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.node.NodeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Node");
    }
  }

  private static final class NodeFileDescriptorSupplier
      extends NodeBaseDescriptorSupplier {
    NodeFileDescriptorSupplier() {}
  }

  private static final class NodeMethodDescriptorSupplier
      extends NodeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NodeMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (NodeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NodeFileDescriptorSupplier())
              .addMethod(getHealthCheckMethod())
              .addMethod(getWhoamiMethod())
              .build();
        }
      }
    }
    return result;
  }
}
