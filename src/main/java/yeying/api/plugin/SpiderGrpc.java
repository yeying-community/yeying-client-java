package yeying.api.plugin;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/spider/spider.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SpiderGrpc {

  private SpiderGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.plugin.Spider";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.SearchRequest,
      yeying.api.plugin.SpiderOuterClass.SearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.plugin.SpiderOuterClass.SearchRequest.class,
      responseType = yeying.api.plugin.SpiderOuterClass.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.SearchRequest,
      yeying.api.plugin.SpiderOuterClass.SearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.SearchRequest, yeying.api.plugin.SpiderOuterClass.SearchResponse> getSearchMethod;
    if ((getSearchMethod = SpiderGrpc.getSearchMethod) == null) {
      synchronized (SpiderGrpc.class) {
        if ((getSearchMethod = SpiderGrpc.getSearchMethod) == null) {
          SpiderGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.plugin.SpiderOuterClass.SearchRequest, yeying.api.plugin.SpiderOuterClass.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.plugin.SpiderOuterClass.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.plugin.SpiderOuterClass.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpiderMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.InstallRequest,
      yeying.api.plugin.SpiderOuterClass.InstallResponse> getInstallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Install",
      requestType = yeying.api.plugin.SpiderOuterClass.InstallRequest.class,
      responseType = yeying.api.plugin.SpiderOuterClass.InstallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.InstallRequest,
      yeying.api.plugin.SpiderOuterClass.InstallResponse> getInstallMethod() {
    io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.InstallRequest, yeying.api.plugin.SpiderOuterClass.InstallResponse> getInstallMethod;
    if ((getInstallMethod = SpiderGrpc.getInstallMethod) == null) {
      synchronized (SpiderGrpc.class) {
        if ((getInstallMethod = SpiderGrpc.getInstallMethod) == null) {
          SpiderGrpc.getInstallMethod = getInstallMethod =
              io.grpc.MethodDescriptor.<yeying.api.plugin.SpiderOuterClass.InstallRequest, yeying.api.plugin.SpiderOuterClass.InstallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Install"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.plugin.SpiderOuterClass.InstallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.plugin.SpiderOuterClass.InstallResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpiderMethodDescriptorSupplier("Install"))
              .build();
        }
      }
    }
    return getInstallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.InstallRequest,
      yeying.api.plugin.SpiderOuterClass.InstallResponse> getUpgradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upgrade",
      requestType = yeying.api.plugin.SpiderOuterClass.InstallRequest.class,
      responseType = yeying.api.plugin.SpiderOuterClass.InstallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.InstallRequest,
      yeying.api.plugin.SpiderOuterClass.InstallResponse> getUpgradeMethod() {
    io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.InstallRequest, yeying.api.plugin.SpiderOuterClass.InstallResponse> getUpgradeMethod;
    if ((getUpgradeMethod = SpiderGrpc.getUpgradeMethod) == null) {
      synchronized (SpiderGrpc.class) {
        if ((getUpgradeMethod = SpiderGrpc.getUpgradeMethod) == null) {
          SpiderGrpc.getUpgradeMethod = getUpgradeMethod =
              io.grpc.MethodDescriptor.<yeying.api.plugin.SpiderOuterClass.InstallRequest, yeying.api.plugin.SpiderOuterClass.InstallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upgrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.plugin.SpiderOuterClass.InstallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.plugin.SpiderOuterClass.InstallResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpiderMethodDescriptorSupplier("Upgrade"))
              .build();
        }
      }
    }
    return getUpgradeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.InstallRequest,
      yeying.api.plugin.SpiderOuterClass.InstallResponse> getConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Config",
      requestType = yeying.api.plugin.SpiderOuterClass.InstallRequest.class,
      responseType = yeying.api.plugin.SpiderOuterClass.InstallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.InstallRequest,
      yeying.api.plugin.SpiderOuterClass.InstallResponse> getConfigMethod() {
    io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.InstallRequest, yeying.api.plugin.SpiderOuterClass.InstallResponse> getConfigMethod;
    if ((getConfigMethod = SpiderGrpc.getConfigMethod) == null) {
      synchronized (SpiderGrpc.class) {
        if ((getConfigMethod = SpiderGrpc.getConfigMethod) == null) {
          SpiderGrpc.getConfigMethod = getConfigMethod =
              io.grpc.MethodDescriptor.<yeying.api.plugin.SpiderOuterClass.InstallRequest, yeying.api.plugin.SpiderOuterClass.InstallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Config"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.plugin.SpiderOuterClass.InstallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.plugin.SpiderOuterClass.InstallResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpiderMethodDescriptorSupplier("Config"))
              .build();
        }
      }
    }
    return getConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.UninstallRequest,
      yeying.api.plugin.SpiderOuterClass.UninstallResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = yeying.api.plugin.SpiderOuterClass.UninstallRequest.class,
      responseType = yeying.api.plugin.SpiderOuterClass.UninstallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.UninstallRequest,
      yeying.api.plugin.SpiderOuterClass.UninstallResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<yeying.api.plugin.SpiderOuterClass.UninstallRequest, yeying.api.plugin.SpiderOuterClass.UninstallResponse> getRemoveMethod;
    if ((getRemoveMethod = SpiderGrpc.getRemoveMethod) == null) {
      synchronized (SpiderGrpc.class) {
        if ((getRemoveMethod = SpiderGrpc.getRemoveMethod) == null) {
          SpiderGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<yeying.api.plugin.SpiderOuterClass.UninstallRequest, yeying.api.plugin.SpiderOuterClass.UninstallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.plugin.SpiderOuterClass.UninstallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.plugin.SpiderOuterClass.UninstallResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SpiderMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpiderStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpiderStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpiderStub>() {
        @java.lang.Override
        public SpiderStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpiderStub(channel, callOptions);
        }
      };
    return SpiderStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SpiderBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpiderBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpiderBlockingV2Stub>() {
        @java.lang.Override
        public SpiderBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpiderBlockingV2Stub(channel, callOptions);
        }
      };
    return SpiderBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpiderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpiderBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpiderBlockingStub>() {
        @java.lang.Override
        public SpiderBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpiderBlockingStub(channel, callOptions);
        }
      };
    return SpiderBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpiderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpiderFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpiderFutureStub>() {
        @java.lang.Override
        public SpiderFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpiderFutureStub(channel, callOptions);
        }
      };
    return SpiderFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 搜索
     * </pre>
     */
    default void search(yeying.api.plugin.SpiderOuterClass.SearchRequest request,
        io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.SearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 安装
     * </pre>
     */
    default void install(yeying.api.plugin.SpiderOuterClass.InstallRequest request,
        io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.InstallResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstallMethod(), responseObserver);
    }

    /**
     * <pre>
     * 升级
     * </pre>
     */
    default void upgrade(yeying.api.plugin.SpiderOuterClass.InstallRequest request,
        io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.InstallResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpgradeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 配置
     * </pre>
     */
    default void config(yeying.api.plugin.SpiderOuterClass.InstallRequest request,
        io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.InstallResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * 卸载
     * </pre>
     */
    default void remove(yeying.api.plugin.SpiderOuterClass.UninstallRequest request,
        io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.UninstallResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Spider.
   */
  public static abstract class SpiderImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SpiderGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Spider.
   */
  public static final class SpiderStub
      extends io.grpc.stub.AbstractAsyncStub<SpiderStub> {
    private SpiderStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpiderStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpiderStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索
     * </pre>
     */
    public void search(yeying.api.plugin.SpiderOuterClass.SearchRequest request,
        io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.SearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 安装
     * </pre>
     */
    public void install(yeying.api.plugin.SpiderOuterClass.InstallRequest request,
        io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.InstallResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 升级
     * </pre>
     */
    public void upgrade(yeying.api.plugin.SpiderOuterClass.InstallRequest request,
        io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.InstallResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpgradeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 配置
     * </pre>
     */
    public void config(yeying.api.plugin.SpiderOuterClass.InstallRequest request,
        io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.InstallResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 卸载
     * </pre>
     */
    public void remove(yeying.api.plugin.SpiderOuterClass.UninstallRequest request,
        io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.UninstallResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Spider.
   */
  public static final class SpiderBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SpiderBlockingV2Stub> {
    private SpiderBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpiderBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpiderBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索
     * </pre>
     */
    public yeying.api.plugin.SpiderOuterClass.SearchResponse search(yeying.api.plugin.SpiderOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 安装
     * </pre>
     */
    public yeying.api.plugin.SpiderOuterClass.InstallResponse install(yeying.api.plugin.SpiderOuterClass.InstallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 升级
     * </pre>
     */
    public yeying.api.plugin.SpiderOuterClass.InstallResponse upgrade(yeying.api.plugin.SpiderOuterClass.InstallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpgradeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 配置
     * </pre>
     */
    public yeying.api.plugin.SpiderOuterClass.InstallResponse config(yeying.api.plugin.SpiderOuterClass.InstallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 卸载
     * </pre>
     */
    public yeying.api.plugin.SpiderOuterClass.UninstallResponse remove(yeying.api.plugin.SpiderOuterClass.UninstallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Spider.
   */
  public static final class SpiderBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SpiderBlockingStub> {
    private SpiderBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpiderBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpiderBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索
     * </pre>
     */
    public yeying.api.plugin.SpiderOuterClass.SearchResponse search(yeying.api.plugin.SpiderOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 安装
     * </pre>
     */
    public yeying.api.plugin.SpiderOuterClass.InstallResponse install(yeying.api.plugin.SpiderOuterClass.InstallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 升级
     * </pre>
     */
    public yeying.api.plugin.SpiderOuterClass.InstallResponse upgrade(yeying.api.plugin.SpiderOuterClass.InstallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpgradeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 配置
     * </pre>
     */
    public yeying.api.plugin.SpiderOuterClass.InstallResponse config(yeying.api.plugin.SpiderOuterClass.InstallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 卸载
     * </pre>
     */
    public yeying.api.plugin.SpiderOuterClass.UninstallResponse remove(yeying.api.plugin.SpiderOuterClass.UninstallRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Spider.
   */
  public static final class SpiderFutureStub
      extends io.grpc.stub.AbstractFutureStub<SpiderFutureStub> {
    private SpiderFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpiderFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpiderFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.plugin.SpiderOuterClass.SearchResponse> search(
        yeying.api.plugin.SpiderOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 安装
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.plugin.SpiderOuterClass.InstallResponse> install(
        yeying.api.plugin.SpiderOuterClass.InstallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 升级
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.plugin.SpiderOuterClass.InstallResponse> upgrade(
        yeying.api.plugin.SpiderOuterClass.InstallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpgradeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 配置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.plugin.SpiderOuterClass.InstallResponse> config(
        yeying.api.plugin.SpiderOuterClass.InstallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 卸载
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.plugin.SpiderOuterClass.UninstallResponse> remove(
        yeying.api.plugin.SpiderOuterClass.UninstallRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_INSTALL = 1;
  private static final int METHODID_UPGRADE = 2;
  private static final int METHODID_CONFIG = 3;
  private static final int METHODID_REMOVE = 4;

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
        case METHODID_SEARCH:
          serviceImpl.search((yeying.api.plugin.SpiderOuterClass.SearchRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.SearchResponse>) responseObserver);
          break;
        case METHODID_INSTALL:
          serviceImpl.install((yeying.api.plugin.SpiderOuterClass.InstallRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.InstallResponse>) responseObserver);
          break;
        case METHODID_UPGRADE:
          serviceImpl.upgrade((yeying.api.plugin.SpiderOuterClass.InstallRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.InstallResponse>) responseObserver);
          break;
        case METHODID_CONFIG:
          serviceImpl.config((yeying.api.plugin.SpiderOuterClass.InstallRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.InstallResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((yeying.api.plugin.SpiderOuterClass.UninstallRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.plugin.SpiderOuterClass.UninstallResponse>) responseObserver);
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
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.plugin.SpiderOuterClass.SearchRequest,
              yeying.api.plugin.SpiderOuterClass.SearchResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getInstallMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.plugin.SpiderOuterClass.InstallRequest,
              yeying.api.plugin.SpiderOuterClass.InstallResponse>(
                service, METHODID_INSTALL)))
        .addMethod(
          getUpgradeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.plugin.SpiderOuterClass.InstallRequest,
              yeying.api.plugin.SpiderOuterClass.InstallResponse>(
                service, METHODID_UPGRADE)))
        .addMethod(
          getConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.plugin.SpiderOuterClass.InstallRequest,
              yeying.api.plugin.SpiderOuterClass.InstallResponse>(
                service, METHODID_CONFIG)))
        .addMethod(
          getRemoveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.plugin.SpiderOuterClass.UninstallRequest,
              yeying.api.plugin.SpiderOuterClass.UninstallResponse>(
                service, METHODID_REMOVE)))
        .build();
  }

  private static abstract class SpiderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpiderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.plugin.SpiderOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Spider");
    }
  }

  private static final class SpiderFileDescriptorSupplier
      extends SpiderBaseDescriptorSupplier {
    SpiderFileDescriptorSupplier() {}
  }

  private static final class SpiderMethodDescriptorSupplier
      extends SpiderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SpiderMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SpiderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpiderFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getInstallMethod())
              .addMethod(getUpgradeMethod())
              .addMethod(getConfigMethod())
              .addMethod(getRemoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
