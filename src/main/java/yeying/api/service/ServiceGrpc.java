package yeying.api.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * 节点提供服务登记、注销和查询的服务。
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/service/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.service.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.service.ServiceOuterClass.RegisterServiceRequest,
      yeying.api.service.ServiceOuterClass.RegisterServiceResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = yeying.api.service.ServiceOuterClass.RegisterServiceRequest.class,
      responseType = yeying.api.service.ServiceOuterClass.RegisterServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.service.ServiceOuterClass.RegisterServiceRequest,
      yeying.api.service.ServiceOuterClass.RegisterServiceResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<yeying.api.service.ServiceOuterClass.RegisterServiceRequest, yeying.api.service.ServiceOuterClass.RegisterServiceResponse> getRegisterMethod;
    if ((getRegisterMethod = ServiceGrpc.getRegisterMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRegisterMethod = ServiceGrpc.getRegisterMethod) == null) {
          ServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<yeying.api.service.ServiceOuterClass.RegisterServiceRequest, yeying.api.service.ServiceOuterClass.RegisterServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.service.ServiceOuterClass.RegisterServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.service.ServiceOuterClass.RegisterServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.service.ServiceOuterClass.SearchServiceRequest,
      yeying.api.service.ServiceOuterClass.SearchServiceResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.service.ServiceOuterClass.SearchServiceRequest.class,
      responseType = yeying.api.service.ServiceOuterClass.SearchServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.service.ServiceOuterClass.SearchServiceRequest,
      yeying.api.service.ServiceOuterClass.SearchServiceResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.service.ServiceOuterClass.SearchServiceRequest, yeying.api.service.ServiceOuterClass.SearchServiceResponse> getSearchMethod;
    if ((getSearchMethod = ServiceGrpc.getSearchMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getSearchMethod = ServiceGrpc.getSearchMethod) == null) {
          ServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.service.ServiceOuterClass.SearchServiceRequest, yeying.api.service.ServiceOuterClass.SearchServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.service.ServiceOuterClass.SearchServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.service.ServiceOuterClass.SearchServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.service.ServiceOuterClass.UnregisterServiceRequest,
      yeying.api.service.ServiceOuterClass.UnregisterServiceResponse> getUnregisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unregister",
      requestType = yeying.api.service.ServiceOuterClass.UnregisterServiceRequest.class,
      responseType = yeying.api.service.ServiceOuterClass.UnregisterServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.service.ServiceOuterClass.UnregisterServiceRequest,
      yeying.api.service.ServiceOuterClass.UnregisterServiceResponse> getUnregisterMethod() {
    io.grpc.MethodDescriptor<yeying.api.service.ServiceOuterClass.UnregisterServiceRequest, yeying.api.service.ServiceOuterClass.UnregisterServiceResponse> getUnregisterMethod;
    if ((getUnregisterMethod = ServiceGrpc.getUnregisterMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getUnregisterMethod = ServiceGrpc.getUnregisterMethod) == null) {
          ServiceGrpc.getUnregisterMethod = getUnregisterMethod =
              io.grpc.MethodDescriptor.<yeying.api.service.ServiceOuterClass.UnregisterServiceRequest, yeying.api.service.ServiceOuterClass.UnregisterServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unregister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.service.ServiceOuterClass.UnregisterServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.service.ServiceOuterClass.UnregisterServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Unregister"))
              .build();
        }
      }
    }
    return getUnregisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceStub>() {
        @java.lang.Override
        public ServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceStub(channel, callOptions);
        }
      };
    return ServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingV2Stub>() {
        @java.lang.Override
        public ServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub>() {
        @java.lang.Override
        public ServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub>() {
        @java.lang.Override
        public ServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * 节点提供服务登记、注销和查询的服务。
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 注册服务
     * </pre>
     */
    default void register(yeying.api.service.ServiceOuterClass.RegisterServiceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.service.ServiceOuterClass.RegisterServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     * <pre>
     * 搜索服务
     * </pre>
     */
    default void search(yeying.api.service.ServiceOuterClass.SearchServiceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.service.ServiceOuterClass.SearchServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 注销服务
     * </pre>
     */
    default void unregister(yeying.api.service.ServiceOuterClass.UnregisterServiceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.service.ServiceOuterClass.UnregisterServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnregisterMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Service.
   * <pre>
   **
   * 节点提供服务登记、注销和查询的服务。
   * </pre>
   */
  public static abstract class ServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Service.
   * <pre>
   **
   * 节点提供服务登记、注销和查询的服务。
   * </pre>
   */
  public static final class ServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceStub> {
    private ServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 注册服务
     * </pre>
     */
    public void register(yeying.api.service.ServiceOuterClass.RegisterServiceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.service.ServiceOuterClass.RegisterServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 搜索服务
     * </pre>
     */
    public void search(yeying.api.service.ServiceOuterClass.SearchServiceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.service.ServiceOuterClass.SearchServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 注销服务
     * </pre>
     */
    public void unregister(yeying.api.service.ServiceOuterClass.UnregisterServiceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.service.ServiceOuterClass.UnregisterServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnregisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Service.
   * <pre>
   **
   * 节点提供服务登记、注销和查询的服务。
   * </pre>
   */
  public static final class ServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ServiceBlockingV2Stub> {
    private ServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 注册服务
     * </pre>
     */
    public yeying.api.service.ServiceOuterClass.RegisterServiceResponse register(yeying.api.service.ServiceOuterClass.RegisterServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索服务
     * </pre>
     */
    public yeying.api.service.ServiceOuterClass.SearchServiceResponse search(yeying.api.service.ServiceOuterClass.SearchServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 注销服务
     * </pre>
     */
    public yeying.api.service.ServiceOuterClass.UnregisterServiceResponse unregister(yeying.api.service.ServiceOuterClass.UnregisterServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnregisterMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Service.
   * <pre>
   **
   * 节点提供服务登记、注销和查询的服务。
   * </pre>
   */
  public static final class ServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceBlockingStub> {
    private ServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 注册服务
     * </pre>
     */
    public yeying.api.service.ServiceOuterClass.RegisterServiceResponse register(yeying.api.service.ServiceOuterClass.RegisterServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索服务
     * </pre>
     */
    public yeying.api.service.ServiceOuterClass.SearchServiceResponse search(yeying.api.service.ServiceOuterClass.SearchServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 注销服务
     * </pre>
     */
    public yeying.api.service.ServiceOuterClass.UnregisterServiceResponse unregister(yeying.api.service.ServiceOuterClass.UnregisterServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnregisterMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Service.
   * <pre>
   **
   * 节点提供服务登记、注销和查询的服务。
   * </pre>
   */
  public static final class ServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceFutureStub> {
    private ServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 注册服务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.service.ServiceOuterClass.RegisterServiceResponse> register(
        yeying.api.service.ServiceOuterClass.RegisterServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 搜索服务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.service.ServiceOuterClass.SearchServiceResponse> search(
        yeying.api.service.ServiceOuterClass.SearchServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 注销服务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.service.ServiceOuterClass.UnregisterServiceResponse> unregister(
        yeying.api.service.ServiceOuterClass.UnregisterServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnregisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_UNREGISTER = 2;

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
        case METHODID_REGISTER:
          serviceImpl.register((yeying.api.service.ServiceOuterClass.RegisterServiceRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.service.ServiceOuterClass.RegisterServiceResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((yeying.api.service.ServiceOuterClass.SearchServiceRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.service.ServiceOuterClass.SearchServiceResponse>) responseObserver);
          break;
        case METHODID_UNREGISTER:
          serviceImpl.unregister((yeying.api.service.ServiceOuterClass.UnregisterServiceRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.service.ServiceOuterClass.UnregisterServiceResponse>) responseObserver);
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
          getRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.service.ServiceOuterClass.RegisterServiceRequest,
              yeying.api.service.ServiceOuterClass.RegisterServiceResponse>(
                service, METHODID_REGISTER)))
        .addMethod(
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.service.ServiceOuterClass.SearchServiceRequest,
              yeying.api.service.ServiceOuterClass.SearchServiceResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getUnregisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.service.ServiceOuterClass.UnregisterServiceRequest,
              yeying.api.service.ServiceOuterClass.UnregisterServiceResponse>(
                service, METHODID_UNREGISTER)))
        .build();
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.service.ServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service");
    }
  }

  private static final class ServiceFileDescriptorSupplier
      extends ServiceBaseDescriptorSupplier {
    ServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMethodDescriptorSupplier
      extends ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getSearchMethod())
              .addMethod(getUnregisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
