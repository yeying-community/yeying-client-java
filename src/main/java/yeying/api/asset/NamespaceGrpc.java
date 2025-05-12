package yeying.api.asset;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 命名空间，用于隔离和资产治理的目的，确保用一个用户在使用不同的应用时产生的资产信息互补干扰。同时也方便用户管理资产。
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/asset/namespace.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NamespaceGrpc {

  private NamespaceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.asset.Namespace";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest,
      yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest.class,
      responseType = yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest,
      yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest, yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse> getSearchMethod;
    if ((getSearchMethod = NamespaceGrpc.getSearchMethod) == null) {
      synchronized (NamespaceGrpc.class) {
        if ((getSearchMethod = NamespaceGrpc.getSearchMethod) == null) {
          NamespaceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest, yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NamespaceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest,
      yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest.class,
      responseType = yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest,
      yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest, yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse> getCreateMethod;
    if ((getCreateMethod = NamespaceGrpc.getCreateMethod) == null) {
      synchronized (NamespaceGrpc.class) {
        if ((getCreateMethod = NamespaceGrpc.getCreateMethod) == null) {
          NamespaceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest, yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NamespaceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest,
      yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest.class,
      responseType = yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest,
      yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest, yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse> getDetailMethod;
    if ((getDetailMethod = NamespaceGrpc.getDetailMethod) == null) {
      synchronized (NamespaceGrpc.class) {
        if ((getDetailMethod = NamespaceGrpc.getDetailMethod) == null) {
          NamespaceGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest, yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NamespaceMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest,
      yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest.class,
      responseType = yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest,
      yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest, yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse> getUpdateMethod;
    if ((getUpdateMethod = NamespaceGrpc.getUpdateMethod) == null) {
      synchronized (NamespaceGrpc.class) {
        if ((getUpdateMethod = NamespaceGrpc.getUpdateMethod) == null) {
          NamespaceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest, yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NamespaceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest,
      yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest.class,
      responseType = yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest,
      yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest, yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse> getDeleteMethod;
    if ((getDeleteMethod = NamespaceGrpc.getDeleteMethod) == null) {
      synchronized (NamespaceGrpc.class) {
        if ((getDeleteMethod = NamespaceGrpc.getDeleteMethod) == null) {
          NamespaceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest, yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NamespaceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NamespaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NamespaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NamespaceStub>() {
        @java.lang.Override
        public NamespaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NamespaceStub(channel, callOptions);
        }
      };
    return NamespaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static NamespaceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NamespaceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NamespaceBlockingV2Stub>() {
        @java.lang.Override
        public NamespaceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NamespaceBlockingV2Stub(channel, callOptions);
        }
      };
    return NamespaceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NamespaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NamespaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NamespaceBlockingStub>() {
        @java.lang.Override
        public NamespaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NamespaceBlockingStub(channel, callOptions);
        }
      };
    return NamespaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NamespaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NamespaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NamespaceFutureStub>() {
        @java.lang.Override
        public NamespaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NamespaceFutureStub(channel, callOptions);
        }
      };
    return NamespaceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 命名空间，用于隔离和资产治理的目的，确保用一个用户在使用不同的应用时产生的资产信息互补干扰。同时也方便用户管理资产。
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 搜索命名空间
     * </pre>
     */
    default void search(yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建命名空间
     * </pre>
     */
    default void create(yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 命名空间详情
     * </pre>
     */
    default void detail(yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新命名空间
     * </pre>
     */
    default void update(yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除命名空间
     * </pre>
     */
    default void delete(yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Namespace.
   * <pre>
   * 命名空间，用于隔离和资产治理的目的，确保用一个用户在使用不同的应用时产生的资产信息互补干扰。同时也方便用户管理资产。
   * </pre>
   */
  public static abstract class NamespaceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NamespaceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Namespace.
   * <pre>
   * 命名空间，用于隔离和资产治理的目的，确保用一个用户在使用不同的应用时产生的资产信息互补干扰。同时也方便用户管理资产。
   * </pre>
   */
  public static final class NamespaceStub
      extends io.grpc.stub.AbstractAsyncStub<NamespaceStub> {
    private NamespaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NamespaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NamespaceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索命名空间
     * </pre>
     */
    public void search(yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建命名空间
     * </pre>
     */
    public void create(yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 命名空间详情
     * </pre>
     */
    public void detail(yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新命名空间
     * </pre>
     */
    public void update(yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除命名空间
     * </pre>
     */
    public void delete(yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Namespace.
   * <pre>
   * 命名空间，用于隔离和资产治理的目的，确保用一个用户在使用不同的应用时产生的资产信息互补干扰。同时也方便用户管理资产。
   * </pre>
   */
  public static final class NamespaceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<NamespaceBlockingV2Stub> {
    private NamespaceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NamespaceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NamespaceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索命名空间
     * </pre>
     */
    public yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse search(yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建命名空间
     * </pre>
     */
    public yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse create(yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 命名空间详情
     * </pre>
     */
    public yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse detail(yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新命名空间
     * </pre>
     */
    public yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse update(yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除命名空间
     * </pre>
     */
    public yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse delete(yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Namespace.
   * <pre>
   * 命名空间，用于隔离和资产治理的目的，确保用一个用户在使用不同的应用时产生的资产信息互补干扰。同时也方便用户管理资产。
   * </pre>
   */
  public static final class NamespaceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NamespaceBlockingStub> {
    private NamespaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NamespaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NamespaceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索命名空间
     * </pre>
     */
    public yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse search(yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建命名空间
     * </pre>
     */
    public yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse create(yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 命名空间详情
     * </pre>
     */
    public yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse detail(yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新命名空间
     * </pre>
     */
    public yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse update(yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除命名空间
     * </pre>
     */
    public yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse delete(yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Namespace.
   * <pre>
   * 命名空间，用于隔离和资产治理的目的，确保用一个用户在使用不同的应用时产生的资产信息互补干扰。同时也方便用户管理资产。
   * </pre>
   */
  public static final class NamespaceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NamespaceFutureStub> {
    private NamespaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NamespaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NamespaceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索命名空间
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse> search(
        yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建命名空间
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse> create(
        yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 命名空间详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse> detail(
        yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新命名空间
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse> update(
        yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除命名空间
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse> delete(
        yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_DETAIL = 2;
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
        case METHODID_SEARCH:
          serviceImpl.search((yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse>) responseObserver);
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
              yeying.api.asset.NamespaceOuterClass.SearchNamespaceRequest,
              yeying.api.asset.NamespaceOuterClass.SearchNamespaceResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.NamespaceOuterClass.CreateNamespaceRequest,
              yeying.api.asset.NamespaceOuterClass.CreateNamespaceResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.NamespaceOuterClass.NamespaceDetailRequest,
              yeying.api.asset.NamespaceOuterClass.NamespaceDetailResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.NamespaceOuterClass.UpdateNamespaceRequest,
              yeying.api.asset.NamespaceOuterClass.UpdateNamespaceResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.NamespaceOuterClass.DeleteNamespaceRequest,
              yeying.api.asset.NamespaceOuterClass.DeleteNamespaceResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class NamespaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NamespaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.asset.NamespaceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Namespace");
    }
  }

  private static final class NamespaceFileDescriptorSupplier
      extends NamespaceBaseDescriptorSupplier {
    NamespaceFileDescriptorSupplier() {}
  }

  private static final class NamespaceMethodDescriptorSupplier
      extends NamespaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NamespaceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (NamespaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NamespaceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDetailMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
