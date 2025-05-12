package yeying.api.llm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/llm/provider.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProviderGrpc {

  private ProviderGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.llm.Provider";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest,
      yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse> getDescriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Descriptions",
      requestType = yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest.class,
      responseType = yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest,
      yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse> getDescriptionsMethod() {
    io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest, yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse> getDescriptionsMethod;
    if ((getDescriptionsMethod = ProviderGrpc.getDescriptionsMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getDescriptionsMethod = ProviderGrpc.getDescriptionsMethod) == null) {
          ProviderGrpc.getDescriptionsMethod = getDescriptionsMethod =
              io.grpc.MethodDescriptor.<yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest, yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Descriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("Descriptions"))
              .build();
        }
      }
    }
    return getDescriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.ProviderModelsRequest,
      yeying.api.llm.ProviderOuterClass.ProviderModelsResponse> getModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Models",
      requestType = yeying.api.llm.ProviderOuterClass.ProviderModelsRequest.class,
      responseType = yeying.api.llm.ProviderOuterClass.ProviderModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.ProviderModelsRequest,
      yeying.api.llm.ProviderOuterClass.ProviderModelsResponse> getModelsMethod() {
    io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.ProviderModelsRequest, yeying.api.llm.ProviderOuterClass.ProviderModelsResponse> getModelsMethod;
    if ((getModelsMethod = ProviderGrpc.getModelsMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getModelsMethod = ProviderGrpc.getModelsMethod) == null) {
          ProviderGrpc.getModelsMethod = getModelsMethod =
              io.grpc.MethodDescriptor.<yeying.api.llm.ProviderOuterClass.ProviderModelsRequest, yeying.api.llm.ProviderOuterClass.ProviderModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Models"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.ProviderModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.ProviderModelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("Models"))
              .build();
        }
      }
    }
    return getModelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.SearchProviderRequest,
      yeying.api.llm.ProviderOuterClass.SearchProviderResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.llm.ProviderOuterClass.SearchProviderRequest.class,
      responseType = yeying.api.llm.ProviderOuterClass.SearchProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.SearchProviderRequest,
      yeying.api.llm.ProviderOuterClass.SearchProviderResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.SearchProviderRequest, yeying.api.llm.ProviderOuterClass.SearchProviderResponse> getSearchMethod;
    if ((getSearchMethod = ProviderGrpc.getSearchMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getSearchMethod = ProviderGrpc.getSearchMethod) == null) {
          ProviderGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.llm.ProviderOuterClass.SearchProviderRequest, yeying.api.llm.ProviderOuterClass.SearchProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.SearchProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.SearchProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.ProviderDetailRequest,
      yeying.api.llm.ProviderOuterClass.ProviderDetailResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.llm.ProviderOuterClass.ProviderDetailRequest.class,
      responseType = yeying.api.llm.ProviderOuterClass.ProviderDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.ProviderDetailRequest,
      yeying.api.llm.ProviderOuterClass.ProviderDetailResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.ProviderDetailRequest, yeying.api.llm.ProviderOuterClass.ProviderDetailResponse> getDetailMethod;
    if ((getDetailMethod = ProviderGrpc.getDetailMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getDetailMethod = ProviderGrpc.getDetailMethod) == null) {
          ProviderGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.llm.ProviderOuterClass.ProviderDetailRequest, yeying.api.llm.ProviderOuterClass.ProviderDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.ProviderDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.ProviderDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.AddProviderRequest,
      yeying.api.llm.ProviderOuterClass.AddProviderResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = yeying.api.llm.ProviderOuterClass.AddProviderRequest.class,
      responseType = yeying.api.llm.ProviderOuterClass.AddProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.AddProviderRequest,
      yeying.api.llm.ProviderOuterClass.AddProviderResponse> getAddMethod() {
    io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.AddProviderRequest, yeying.api.llm.ProviderOuterClass.AddProviderResponse> getAddMethod;
    if ((getAddMethod = ProviderGrpc.getAddMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getAddMethod = ProviderGrpc.getAddMethod) == null) {
          ProviderGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<yeying.api.llm.ProviderOuterClass.AddProviderRequest, yeying.api.llm.ProviderOuterClass.AddProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.AddProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.AddProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.DeleteProviderRequest,
      yeying.api.llm.ProviderOuterClass.DeleteProviderResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yeying.api.llm.ProviderOuterClass.DeleteProviderRequest.class,
      responseType = yeying.api.llm.ProviderOuterClass.DeleteProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.DeleteProviderRequest,
      yeying.api.llm.ProviderOuterClass.DeleteProviderResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yeying.api.llm.ProviderOuterClass.DeleteProviderRequest, yeying.api.llm.ProviderOuterClass.DeleteProviderResponse> getDeleteMethod;
    if ((getDeleteMethod = ProviderGrpc.getDeleteMethod) == null) {
      synchronized (ProviderGrpc.class) {
        if ((getDeleteMethod = ProviderGrpc.getDeleteMethod) == null) {
          ProviderGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yeying.api.llm.ProviderOuterClass.DeleteProviderRequest, yeying.api.llm.ProviderOuterClass.DeleteProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.DeleteProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.ProviderOuterClass.DeleteProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProviderMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProviderStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProviderStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProviderStub>() {
        @java.lang.Override
        public ProviderStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProviderStub(channel, callOptions);
        }
      };
    return ProviderStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProviderBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProviderBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProviderBlockingV2Stub>() {
        @java.lang.Override
        public ProviderBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProviderBlockingV2Stub(channel, callOptions);
        }
      };
    return ProviderBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProviderBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProviderBlockingStub>() {
        @java.lang.Override
        public ProviderBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProviderBlockingStub(channel, callOptions);
        }
      };
    return ProviderBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProviderFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProviderFutureStub>() {
        @java.lang.Override
        public ProviderFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProviderFutureStub(channel, callOptions);
        }
      };
    return ProviderFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 供应商描述列表
     * </pre>
     */
    default void descriptions(yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 供应商模型
     * </pre>
     */
    default void models(yeying.api.llm.ProviderOuterClass.ProviderModelsRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.ProviderModelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 搜索添加的供应商
     * </pre>
     */
    default void search(yeying.api.llm.ProviderOuterClass.SearchProviderRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.SearchProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 供应商状态
     * </pre>
     */
    default void detail(yeying.api.llm.ProviderOuterClass.ProviderDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.ProviderDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 添加新供应商配置
     * </pre>
     */
    default void add(yeying.api.llm.ProviderOuterClass.AddProviderRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.AddProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除供应商
     * </pre>
     */
    default void delete(yeying.api.llm.ProviderOuterClass.DeleteProviderRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.DeleteProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Provider.
   */
  public static abstract class ProviderImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProviderGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Provider.
   */
  public static final class ProviderStub
      extends io.grpc.stub.AbstractAsyncStub<ProviderStub> {
    private ProviderStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProviderStub(channel, callOptions);
    }

    /**
     * <pre>
     * 供应商描述列表
     * </pre>
     */
    public void descriptions(yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 供应商模型
     * </pre>
     */
    public void models(yeying.api.llm.ProviderOuterClass.ProviderModelsRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.ProviderModelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 搜索添加的供应商
     * </pre>
     */
    public void search(yeying.api.llm.ProviderOuterClass.SearchProviderRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.SearchProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 供应商状态
     * </pre>
     */
    public void detail(yeying.api.llm.ProviderOuterClass.ProviderDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.ProviderDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 添加新供应商配置
     * </pre>
     */
    public void add(yeying.api.llm.ProviderOuterClass.AddProviderRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.AddProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除供应商
     * </pre>
     */
    public void delete(yeying.api.llm.ProviderOuterClass.DeleteProviderRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.DeleteProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Provider.
   */
  public static final class ProviderBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProviderBlockingV2Stub> {
    private ProviderBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProviderBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 供应商描述列表
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse descriptions(yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 供应商模型
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.ProviderModelsResponse models(yeying.api.llm.ProviderOuterClass.ProviderModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索添加的供应商
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.SearchProviderResponse search(yeying.api.llm.ProviderOuterClass.SearchProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 供应商状态
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.ProviderDetailResponse detail(yeying.api.llm.ProviderOuterClass.ProviderDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 添加新供应商配置
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.AddProviderResponse add(yeying.api.llm.ProviderOuterClass.AddProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除供应商
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.DeleteProviderResponse delete(yeying.api.llm.ProviderOuterClass.DeleteProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Provider.
   */
  public static final class ProviderBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProviderBlockingStub> {
    private ProviderBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProviderBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 供应商描述列表
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse descriptions(yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 供应商模型
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.ProviderModelsResponse models(yeying.api.llm.ProviderOuterClass.ProviderModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索添加的供应商
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.SearchProviderResponse search(yeying.api.llm.ProviderOuterClass.SearchProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 供应商状态
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.ProviderDetailResponse detail(yeying.api.llm.ProviderOuterClass.ProviderDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 添加新供应商配置
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.AddProviderResponse add(yeying.api.llm.ProviderOuterClass.AddProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除供应商
     * </pre>
     */
    public yeying.api.llm.ProviderOuterClass.DeleteProviderResponse delete(yeying.api.llm.ProviderOuterClass.DeleteProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Provider.
   */
  public static final class ProviderFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProviderFutureStub> {
    private ProviderFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProviderFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProviderFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 供应商描述列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse> descriptions(
        yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 供应商模型
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.llm.ProviderOuterClass.ProviderModelsResponse> models(
        yeying.api.llm.ProviderOuterClass.ProviderModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 搜索添加的供应商
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.llm.ProviderOuterClass.SearchProviderResponse> search(
        yeying.api.llm.ProviderOuterClass.SearchProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 供应商状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.llm.ProviderOuterClass.ProviderDetailResponse> detail(
        yeying.api.llm.ProviderOuterClass.ProviderDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 添加新供应商配置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.llm.ProviderOuterClass.AddProviderResponse> add(
        yeying.api.llm.ProviderOuterClass.AddProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除供应商
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.llm.ProviderOuterClass.DeleteProviderResponse> delete(
        yeying.api.llm.ProviderOuterClass.DeleteProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DESCRIPTIONS = 0;
  private static final int METHODID_MODELS = 1;
  private static final int METHODID_SEARCH = 2;
  private static final int METHODID_DETAIL = 3;
  private static final int METHODID_ADD = 4;
  private static final int METHODID_DELETE = 5;

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
        case METHODID_DESCRIPTIONS:
          serviceImpl.descriptions((yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse>) responseObserver);
          break;
        case METHODID_MODELS:
          serviceImpl.models((yeying.api.llm.ProviderOuterClass.ProviderModelsRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.ProviderModelsResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((yeying.api.llm.ProviderOuterClass.SearchProviderRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.SearchProviderResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.llm.ProviderOuterClass.ProviderDetailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.ProviderDetailResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((yeying.api.llm.ProviderOuterClass.AddProviderRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.AddProviderResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yeying.api.llm.ProviderOuterClass.DeleteProviderRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.llm.ProviderOuterClass.DeleteProviderResponse>) responseObserver);
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
          getDescriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.llm.ProviderOuterClass.ProviderDescriptionsRequest,
              yeying.api.llm.ProviderOuterClass.ProviderDescriptionsResponse>(
                service, METHODID_DESCRIPTIONS)))
        .addMethod(
          getModelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.llm.ProviderOuterClass.ProviderModelsRequest,
              yeying.api.llm.ProviderOuterClass.ProviderModelsResponse>(
                service, METHODID_MODELS)))
        .addMethod(
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.llm.ProviderOuterClass.SearchProviderRequest,
              yeying.api.llm.ProviderOuterClass.SearchProviderResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.llm.ProviderOuterClass.ProviderDetailRequest,
              yeying.api.llm.ProviderOuterClass.ProviderDetailResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.llm.ProviderOuterClass.AddProviderRequest,
              yeying.api.llm.ProviderOuterClass.AddProviderResponse>(
                service, METHODID_ADD)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.llm.ProviderOuterClass.DeleteProviderRequest,
              yeying.api.llm.ProviderOuterClass.DeleteProviderResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class ProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProviderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.llm.ProviderOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Provider");
    }
  }

  private static final class ProviderFileDescriptorSupplier
      extends ProviderBaseDescriptorSupplier {
    ProviderFileDescriptorSupplier() {}
  }

  private static final class ProviderMethodDescriptorSupplier
      extends ProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProviderMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProviderFileDescriptorSupplier())
              .addMethod(getDescriptionsMethod())
              .addMethod(getModelsMethod())
              .addMethod(getSearchMethod())
              .addMethod(getDetailMethod())
              .addMethod(getAddMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
