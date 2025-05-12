package yeying.api.asset;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/asset/link.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LinkGrpc {

  private LinkGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.asset.Link";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.CreateLinkRequest,
      yeying.api.asset.LinkOuterClass.CreateLinkResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yeying.api.asset.LinkOuterClass.CreateLinkRequest.class,
      responseType = yeying.api.asset.LinkOuterClass.CreateLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.CreateLinkRequest,
      yeying.api.asset.LinkOuterClass.CreateLinkResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.CreateLinkRequest, yeying.api.asset.LinkOuterClass.CreateLinkResponse> getCreateMethod;
    if ((getCreateMethod = LinkGrpc.getCreateMethod) == null) {
      synchronized (LinkGrpc.class) {
        if ((getCreateMethod = LinkGrpc.getCreateMethod) == null) {
          LinkGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.LinkOuterClass.CreateLinkRequest, yeying.api.asset.LinkOuterClass.CreateLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.CreateLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.CreateLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LinkMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.SearchLinkRequest,
      yeying.api.asset.LinkOuterClass.SearchLinkResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.asset.LinkOuterClass.SearchLinkRequest.class,
      responseType = yeying.api.asset.LinkOuterClass.SearchLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.SearchLinkRequest,
      yeying.api.asset.LinkOuterClass.SearchLinkResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.SearchLinkRequest, yeying.api.asset.LinkOuterClass.SearchLinkResponse> getSearchMethod;
    if ((getSearchMethod = LinkGrpc.getSearchMethod) == null) {
      synchronized (LinkGrpc.class) {
        if ((getSearchMethod = LinkGrpc.getSearchMethod) == null) {
          LinkGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.LinkOuterClass.SearchLinkRequest, yeying.api.asset.LinkOuterClass.SearchLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.SearchLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.SearchLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LinkMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.LinkDetailRequest,
      yeying.api.asset.LinkOuterClass.LinkDetailResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.asset.LinkOuterClass.LinkDetailRequest.class,
      responseType = yeying.api.asset.LinkOuterClass.LinkDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.LinkDetailRequest,
      yeying.api.asset.LinkOuterClass.LinkDetailResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.LinkDetailRequest, yeying.api.asset.LinkOuterClass.LinkDetailResponse> getDetailMethod;
    if ((getDetailMethod = LinkGrpc.getDetailMethod) == null) {
      synchronized (LinkGrpc.class) {
        if ((getDetailMethod = LinkGrpc.getDetailMethod) == null) {
          LinkGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.LinkOuterClass.LinkDetailRequest, yeying.api.asset.LinkOuterClass.LinkDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.LinkDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.LinkDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LinkMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.LinkVisitorRequest,
      yeying.api.asset.LinkOuterClass.LinkVisitorResponse> getVisitorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Visitor",
      requestType = yeying.api.asset.LinkOuterClass.LinkVisitorRequest.class,
      responseType = yeying.api.asset.LinkOuterClass.LinkVisitorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.LinkVisitorRequest,
      yeying.api.asset.LinkOuterClass.LinkVisitorResponse> getVisitorMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.LinkVisitorRequest, yeying.api.asset.LinkOuterClass.LinkVisitorResponse> getVisitorMethod;
    if ((getVisitorMethod = LinkGrpc.getVisitorMethod) == null) {
      synchronized (LinkGrpc.class) {
        if ((getVisitorMethod = LinkGrpc.getVisitorMethod) == null) {
          LinkGrpc.getVisitorMethod = getVisitorMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.LinkOuterClass.LinkVisitorRequest, yeying.api.asset.LinkOuterClass.LinkVisitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Visitor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.LinkVisitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.LinkVisitorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LinkMethodDescriptorSupplier("Visitor"))
              .build();
        }
      }
    }
    return getVisitorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.DisableLinkRequest,
      yeying.api.asset.LinkOuterClass.DisableLinkResponse> getDisableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Disable",
      requestType = yeying.api.asset.LinkOuterClass.DisableLinkRequest.class,
      responseType = yeying.api.asset.LinkOuterClass.DisableLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.DisableLinkRequest,
      yeying.api.asset.LinkOuterClass.DisableLinkResponse> getDisableMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.DisableLinkRequest, yeying.api.asset.LinkOuterClass.DisableLinkResponse> getDisableMethod;
    if ((getDisableMethod = LinkGrpc.getDisableMethod) == null) {
      synchronized (LinkGrpc.class) {
        if ((getDisableMethod = LinkGrpc.getDisableMethod) == null) {
          LinkGrpc.getDisableMethod = getDisableMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.LinkOuterClass.DisableLinkRequest, yeying.api.asset.LinkOuterClass.DisableLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Disable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.DisableLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.DisableLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LinkMethodDescriptorSupplier("Disable"))
              .build();
        }
      }
    }
    return getDisableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.UpdateLinkRequest,
      yeying.api.asset.LinkOuterClass.UpdateLinkResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yeying.api.asset.LinkOuterClass.UpdateLinkRequest.class,
      responseType = yeying.api.asset.LinkOuterClass.UpdateLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.UpdateLinkRequest,
      yeying.api.asset.LinkOuterClass.UpdateLinkResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.LinkOuterClass.UpdateLinkRequest, yeying.api.asset.LinkOuterClass.UpdateLinkResponse> getUpdateMethod;
    if ((getUpdateMethod = LinkGrpc.getUpdateMethod) == null) {
      synchronized (LinkGrpc.class) {
        if ((getUpdateMethod = LinkGrpc.getUpdateMethod) == null) {
          LinkGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.LinkOuterClass.UpdateLinkRequest, yeying.api.asset.LinkOuterClass.UpdateLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.UpdateLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.LinkOuterClass.UpdateLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LinkMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LinkStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LinkStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LinkStub>() {
        @java.lang.Override
        public LinkStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LinkStub(channel, callOptions);
        }
      };
    return LinkStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static LinkBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LinkBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LinkBlockingV2Stub>() {
        @java.lang.Override
        public LinkBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LinkBlockingV2Stub(channel, callOptions);
        }
      };
    return LinkBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LinkBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LinkBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LinkBlockingStub>() {
        @java.lang.Override
        public LinkBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LinkBlockingStub(channel, callOptions);
        }
      };
    return LinkBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LinkFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LinkFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LinkFutureStub>() {
        @java.lang.Override
        public LinkFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LinkFutureStub(channel, callOptions);
        }
      };
    return LinkFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 创建资产分享链接
     * </pre>
     */
    default void create(yeying.api.asset.LinkOuterClass.CreateLinkRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.CreateLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 搜索资产分享链接
     * </pre>
     */
    default void search(yeying.api.asset.LinkOuterClass.SearchLinkRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.SearchLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获得分享链接明细
     * </pre>
     */
    default void detail(yeying.api.asset.LinkOuterClass.LinkDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.LinkDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 分享链接的访问信息
     * </pre>
     */
    default void visitor(yeying.api.asset.LinkOuterClass.LinkVisitorRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.LinkVisitorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVisitorMethod(), responseObserver);
    }

    /**
     * <pre>
     * 取消分享
     * </pre>
     */
    default void disable(yeying.api.asset.LinkOuterClass.DisableLinkRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.DisableLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableMethod(), responseObserver);
    }

    /**
     * <pre>
     * 更新资产分享链接，实现变更、取消等功能
     * </pre>
     */
    default void update(yeying.api.asset.LinkOuterClass.UpdateLinkRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.UpdateLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Link.
   */
  public static abstract class LinkImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LinkGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Link.
   */
  public static final class LinkStub
      extends io.grpc.stub.AbstractAsyncStub<LinkStub> {
    private LinkStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LinkStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LinkStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建资产分享链接
     * </pre>
     */
    public void create(yeying.api.asset.LinkOuterClass.CreateLinkRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.CreateLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 搜索资产分享链接
     * </pre>
     */
    public void search(yeying.api.asset.LinkOuterClass.SearchLinkRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.SearchLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获得分享链接明细
     * </pre>
     */
    public void detail(yeying.api.asset.LinkOuterClass.LinkDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.LinkDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 分享链接的访问信息
     * </pre>
     */
    public void visitor(yeying.api.asset.LinkOuterClass.LinkVisitorRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.LinkVisitorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVisitorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 取消分享
     * </pre>
     */
    public void disable(yeying.api.asset.LinkOuterClass.DisableLinkRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.DisableLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新资产分享链接，实现变更、取消等功能
     * </pre>
     */
    public void update(yeying.api.asset.LinkOuterClass.UpdateLinkRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.UpdateLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Link.
   */
  public static final class LinkBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<LinkBlockingV2Stub> {
    private LinkBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LinkBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LinkBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建资产分享链接
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.CreateLinkResponse create(yeying.api.asset.LinkOuterClass.CreateLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索资产分享链接
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.SearchLinkResponse search(yeying.api.asset.LinkOuterClass.SearchLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获得分享链接明细
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.LinkDetailResponse detail(yeying.api.asset.LinkOuterClass.LinkDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 分享链接的访问信息
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.LinkVisitorResponse visitor(yeying.api.asset.LinkOuterClass.LinkVisitorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVisitorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 取消分享
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.DisableLinkResponse disable(yeying.api.asset.LinkOuterClass.DisableLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新资产分享链接，实现变更、取消等功能
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.UpdateLinkResponse update(yeying.api.asset.LinkOuterClass.UpdateLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Link.
   */
  public static final class LinkBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LinkBlockingStub> {
    private LinkBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LinkBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LinkBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建资产分享链接
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.CreateLinkResponse create(yeying.api.asset.LinkOuterClass.CreateLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索资产分享链接
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.SearchLinkResponse search(yeying.api.asset.LinkOuterClass.SearchLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获得分享链接明细
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.LinkDetailResponse detail(yeying.api.asset.LinkOuterClass.LinkDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 分享链接的访问信息
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.LinkVisitorResponse visitor(yeying.api.asset.LinkOuterClass.LinkVisitorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVisitorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 取消分享
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.DisableLinkResponse disable(yeying.api.asset.LinkOuterClass.DisableLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新资产分享链接，实现变更、取消等功能
     * </pre>
     */
    public yeying.api.asset.LinkOuterClass.UpdateLinkResponse update(yeying.api.asset.LinkOuterClass.UpdateLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Link.
   */
  public static final class LinkFutureStub
      extends io.grpc.stub.AbstractFutureStub<LinkFutureStub> {
    private LinkFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LinkFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LinkFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建资产分享链接
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.LinkOuterClass.CreateLinkResponse> create(
        yeying.api.asset.LinkOuterClass.CreateLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 搜索资产分享链接
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.LinkOuterClass.SearchLinkResponse> search(
        yeying.api.asset.LinkOuterClass.SearchLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获得分享链接明细
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.LinkOuterClass.LinkDetailResponse> detail(
        yeying.api.asset.LinkOuterClass.LinkDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 分享链接的访问信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.LinkOuterClass.LinkVisitorResponse> visitor(
        yeying.api.asset.LinkOuterClass.LinkVisitorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVisitorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 取消分享
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.LinkOuterClass.DisableLinkResponse> disable(
        yeying.api.asset.LinkOuterClass.DisableLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新资产分享链接，实现变更、取消等功能
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.LinkOuterClass.UpdateLinkResponse> update(
        yeying.api.asset.LinkOuterClass.UpdateLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_DETAIL = 2;
  private static final int METHODID_VISITOR = 3;
  private static final int METHODID_DISABLE = 4;
  private static final int METHODID_UPDATE = 5;

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
          serviceImpl.create((yeying.api.asset.LinkOuterClass.CreateLinkRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.CreateLinkResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((yeying.api.asset.LinkOuterClass.SearchLinkRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.SearchLinkResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.asset.LinkOuterClass.LinkDetailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.LinkDetailResponse>) responseObserver);
          break;
        case METHODID_VISITOR:
          serviceImpl.visitor((yeying.api.asset.LinkOuterClass.LinkVisitorRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.LinkVisitorResponse>) responseObserver);
          break;
        case METHODID_DISABLE:
          serviceImpl.disable((yeying.api.asset.LinkOuterClass.DisableLinkRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.DisableLinkResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yeying.api.asset.LinkOuterClass.UpdateLinkRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.LinkOuterClass.UpdateLinkResponse>) responseObserver);
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
              yeying.api.asset.LinkOuterClass.CreateLinkRequest,
              yeying.api.asset.LinkOuterClass.CreateLinkResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.LinkOuterClass.SearchLinkRequest,
              yeying.api.asset.LinkOuterClass.SearchLinkResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.LinkOuterClass.LinkDetailRequest,
              yeying.api.asset.LinkOuterClass.LinkDetailResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getVisitorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.LinkOuterClass.LinkVisitorRequest,
              yeying.api.asset.LinkOuterClass.LinkVisitorResponse>(
                service, METHODID_VISITOR)))
        .addMethod(
          getDisableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.LinkOuterClass.DisableLinkRequest,
              yeying.api.asset.LinkOuterClass.DisableLinkResponse>(
                service, METHODID_DISABLE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.LinkOuterClass.UpdateLinkRequest,
              yeying.api.asset.LinkOuterClass.UpdateLinkResponse>(
                service, METHODID_UPDATE)))
        .build();
  }

  private static abstract class LinkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LinkBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.asset.LinkOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Link");
    }
  }

  private static final class LinkFileDescriptorSupplier
      extends LinkBaseDescriptorSupplier {
    LinkFileDescriptorSupplier() {}
  }

  private static final class LinkMethodDescriptorSupplier
      extends LinkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LinkMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LinkGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LinkFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getSearchMethod())
              .addMethod(getDetailMethod())
              .addMethod(getVisitorMethod())
              .addMethod(getDisableMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
