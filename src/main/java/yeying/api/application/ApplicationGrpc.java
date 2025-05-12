package yeying.api.application;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * 节点自带的应用和后面发布的应用，夜莺社区提供一个节点和一组组网协议。当然其他的社团或者个人，也可以基于源代码，发布自己的节点和一组组网协议，当然
 * 也可以加入到夜莺社区的网络。
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/application/application.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ApplicationGrpc {

  private ApplicationGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.application.Application";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.SearchApplicationRequest,
      yeying.api.application.ApplicationOuterClass.SearchApplicationResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.application.ApplicationOuterClass.SearchApplicationRequest.class,
      responseType = yeying.api.application.ApplicationOuterClass.SearchApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.SearchApplicationRequest,
      yeying.api.application.ApplicationOuterClass.SearchApplicationResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.SearchApplicationRequest, yeying.api.application.ApplicationOuterClass.SearchApplicationResponse> getSearchMethod;
    if ((getSearchMethod = ApplicationGrpc.getSearchMethod) == null) {
      synchronized (ApplicationGrpc.class) {
        if ((getSearchMethod = ApplicationGrpc.getSearchMethod) == null) {
          ApplicationGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.application.ApplicationOuterClass.SearchApplicationRequest, yeying.api.application.ApplicationOuterClass.SearchApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.SearchApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.SearchApplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.AuditApplicationRequest,
      yeying.api.application.ApplicationOuterClass.AuditApplicationResponse> getAuditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Audit",
      requestType = yeying.api.application.ApplicationOuterClass.AuditApplicationRequest.class,
      responseType = yeying.api.application.ApplicationOuterClass.AuditApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.AuditApplicationRequest,
      yeying.api.application.ApplicationOuterClass.AuditApplicationResponse> getAuditMethod() {
    io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.AuditApplicationRequest, yeying.api.application.ApplicationOuterClass.AuditApplicationResponse> getAuditMethod;
    if ((getAuditMethod = ApplicationGrpc.getAuditMethod) == null) {
      synchronized (ApplicationGrpc.class) {
        if ((getAuditMethod = ApplicationGrpc.getAuditMethod) == null) {
          ApplicationGrpc.getAuditMethod = getAuditMethod =
              io.grpc.MethodDescriptor.<yeying.api.application.ApplicationOuterClass.AuditApplicationRequest, yeying.api.application.ApplicationOuterClass.AuditApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Audit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.AuditApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.AuditApplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationMethodDescriptorSupplier("Audit"))
              .build();
        }
      }
    }
    return getAuditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.CreateApplicationRequest,
      yeying.api.application.ApplicationOuterClass.CreateApplicationResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yeying.api.application.ApplicationOuterClass.CreateApplicationRequest.class,
      responseType = yeying.api.application.ApplicationOuterClass.CreateApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.CreateApplicationRequest,
      yeying.api.application.ApplicationOuterClass.CreateApplicationResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.CreateApplicationRequest, yeying.api.application.ApplicationOuterClass.CreateApplicationResponse> getCreateMethod;
    if ((getCreateMethod = ApplicationGrpc.getCreateMethod) == null) {
      synchronized (ApplicationGrpc.class) {
        if ((getCreateMethod = ApplicationGrpc.getCreateMethod) == null) {
          ApplicationGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yeying.api.application.ApplicationOuterClass.CreateApplicationRequest, yeying.api.application.ApplicationOuterClass.CreateApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.CreateApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.CreateApplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest,
      yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest.class,
      responseType = yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest,
      yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest, yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse> getDetailMethod;
    if ((getDetailMethod = ApplicationGrpc.getDetailMethod) == null) {
      synchronized (ApplicationGrpc.class) {
        if ((getDetailMethod = ApplicationGrpc.getDetailMethod) == null) {
          ApplicationGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest, yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest,
      yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse> getOfflineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Offline",
      requestType = yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest.class,
      responseType = yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest,
      yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse> getOfflineMethod() {
    io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest, yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse> getOfflineMethod;
    if ((getOfflineMethod = ApplicationGrpc.getOfflineMethod) == null) {
      synchronized (ApplicationGrpc.class) {
        if ((getOfflineMethod = ApplicationGrpc.getOfflineMethod) == null) {
          ApplicationGrpc.getOfflineMethod = getOfflineMethod =
              io.grpc.MethodDescriptor.<yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest, yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Offline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationMethodDescriptorSupplier("Offline"))
              .build();
        }
      }
    }
    return getOfflineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest,
      yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse> getOnlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Online",
      requestType = yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest.class,
      responseType = yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest,
      yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse> getOnlineMethod() {
    io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest, yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse> getOnlineMethod;
    if ((getOnlineMethod = ApplicationGrpc.getOnlineMethod) == null) {
      synchronized (ApplicationGrpc.class) {
        if ((getOnlineMethod = ApplicationGrpc.getOnlineMethod) == null) {
          ApplicationGrpc.getOnlineMethod = getOnlineMethod =
              io.grpc.MethodDescriptor.<yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest, yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Online"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationMethodDescriptorSupplier("Online"))
              .build();
        }
      }
    }
    return getOnlineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest,
      yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest.class,
      responseType = yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest,
      yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest, yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse> getDeleteMethod;
    if ((getDeleteMethod = ApplicationGrpc.getDeleteMethod) == null) {
      synchronized (ApplicationGrpc.class) {
        if ((getDeleteMethod = ApplicationGrpc.getDeleteMethod) == null) {
          ApplicationGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest, yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplicationMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApplicationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplicationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplicationStub>() {
        @java.lang.Override
        public ApplicationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplicationStub(channel, callOptions);
        }
      };
    return ApplicationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ApplicationBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplicationBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplicationBlockingV2Stub>() {
        @java.lang.Override
        public ApplicationBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplicationBlockingV2Stub(channel, callOptions);
        }
      };
    return ApplicationBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApplicationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplicationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplicationBlockingStub>() {
        @java.lang.Override
        public ApplicationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplicationBlockingStub(channel, callOptions);
        }
      };
    return ApplicationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApplicationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplicationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplicationFutureStub>() {
        @java.lang.Override
        public ApplicationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplicationFutureStub(channel, callOptions);
        }
      };
    return ApplicationFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * 节点自带的应用和后面发布的应用，夜莺社区提供一个节点和一组组网协议。当然其他的社团或者个人，也可以基于源代码，发布自己的节点和一组组网协议，当然
   * 也可以加入到夜莺社区的网络。
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 搜索应用 
     * </pre>
     */
    default void search(yeying.api.application.ApplicationOuterClass.SearchApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.SearchApplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 应用审计 
     * </pre>
     */
    default void audit(yeying.api.application.ApplicationOuterClass.AuditApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.AuditApplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuditMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建应用 
     * </pre>
     */
    default void create(yeying.api.application.ApplicationOuterClass.CreateApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.CreateApplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 应用详情 
     * </pre>
     */
    default void detail(yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 下架应用 
     * </pre>
     */
    default void offline(yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOfflineMethod(), responseObserver);
    }

    /**
     * <pre>
     * 上架应用 
     * </pre>
     */
    default void online(yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnlineMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除应用 
     * </pre>
     */
    default void delete(yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Application.
   * <pre>
   **
   * 节点自带的应用和后面发布的应用，夜莺社区提供一个节点和一组组网协议。当然其他的社团或者个人，也可以基于源代码，发布自己的节点和一组组网协议，当然
   * 也可以加入到夜莺社区的网络。
   * </pre>
   */
  public static abstract class ApplicationImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ApplicationGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Application.
   * <pre>
   **
   * 节点自带的应用和后面发布的应用，夜莺社区提供一个节点和一组组网协议。当然其他的社团或者个人，也可以基于源代码，发布自己的节点和一组组网协议，当然
   * 也可以加入到夜莺社区的网络。
   * </pre>
   */
  public static final class ApplicationStub
      extends io.grpc.stub.AbstractAsyncStub<ApplicationStub> {
    private ApplicationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplicationStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索应用 
     * </pre>
     */
    public void search(yeying.api.application.ApplicationOuterClass.SearchApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.SearchApplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 应用审计 
     * </pre>
     */
    public void audit(yeying.api.application.ApplicationOuterClass.AuditApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.AuditApplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建应用 
     * </pre>
     */
    public void create(yeying.api.application.ApplicationOuterClass.CreateApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.CreateApplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 应用详情 
     * </pre>
     */
    public void detail(yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 下架应用 
     * </pre>
     */
    public void offline(yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOfflineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 上架应用 
     * </pre>
     */
    public void online(yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnlineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除应用 
     * </pre>
     */
    public void delete(yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Application.
   * <pre>
   **
   * 节点自带的应用和后面发布的应用，夜莺社区提供一个节点和一组组网协议。当然其他的社团或者个人，也可以基于源代码，发布自己的节点和一组组网协议，当然
   * 也可以加入到夜莺社区的网络。
   * </pre>
   */
  public static final class ApplicationBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ApplicationBlockingV2Stub> {
    private ApplicationBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplicationBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索应用 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.SearchApplicationResponse search(yeying.api.application.ApplicationOuterClass.SearchApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 应用审计 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.AuditApplicationResponse audit(yeying.api.application.ApplicationOuterClass.AuditApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuditMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建应用 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.CreateApplicationResponse create(yeying.api.application.ApplicationOuterClass.CreateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 应用详情 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse detail(yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 下架应用 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse offline(yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOfflineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 上架应用 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse online(yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnlineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除应用 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse delete(yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Application.
   * <pre>
   **
   * 节点自带的应用和后面发布的应用，夜莺社区提供一个节点和一组组网协议。当然其他的社团或者个人，也可以基于源代码，发布自己的节点和一组组网协议，当然
   * 也可以加入到夜莺社区的网络。
   * </pre>
   */
  public static final class ApplicationBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ApplicationBlockingStub> {
    private ApplicationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplicationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索应用 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.SearchApplicationResponse search(yeying.api.application.ApplicationOuterClass.SearchApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 应用审计 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.AuditApplicationResponse audit(yeying.api.application.ApplicationOuterClass.AuditApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuditMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建应用 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.CreateApplicationResponse create(yeying.api.application.ApplicationOuterClass.CreateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 应用详情 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse detail(yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 下架应用 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse offline(yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOfflineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 上架应用 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse online(yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnlineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除应用 
     * </pre>
     */
    public yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse delete(yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Application.
   * <pre>
   **
   * 节点自带的应用和后面发布的应用，夜莺社区提供一个节点和一组组网协议。当然其他的社团或者个人，也可以基于源代码，发布自己的节点和一组组网协议，当然
   * 也可以加入到夜莺社区的网络。
   * </pre>
   */
  public static final class ApplicationFutureStub
      extends io.grpc.stub.AbstractFutureStub<ApplicationFutureStub> {
    private ApplicationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplicationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 搜索应用 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.application.ApplicationOuterClass.SearchApplicationResponse> search(
        yeying.api.application.ApplicationOuterClass.SearchApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 应用审计 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.application.ApplicationOuterClass.AuditApplicationResponse> audit(
        yeying.api.application.ApplicationOuterClass.AuditApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuditMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建应用 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.application.ApplicationOuterClass.CreateApplicationResponse> create(
        yeying.api.application.ApplicationOuterClass.CreateApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 应用详情 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse> detail(
        yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 下架应用 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse> offline(
        yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOfflineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 上架应用 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse> online(
        yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnlineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除应用 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse> delete(
        yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_AUDIT = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_DETAIL = 3;
  private static final int METHODID_OFFLINE = 4;
  private static final int METHODID_ONLINE = 5;
  private static final int METHODID_DELETE = 6;

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
          serviceImpl.search((yeying.api.application.ApplicationOuterClass.SearchApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.SearchApplicationResponse>) responseObserver);
          break;
        case METHODID_AUDIT:
          serviceImpl.audit((yeying.api.application.ApplicationOuterClass.AuditApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.AuditApplicationResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((yeying.api.application.ApplicationOuterClass.CreateApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.CreateApplicationResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse>) responseObserver);
          break;
        case METHODID_OFFLINE:
          serviceImpl.offline((yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse>) responseObserver);
          break;
        case METHODID_ONLINE:
          serviceImpl.online((yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse>) responseObserver);
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
              yeying.api.application.ApplicationOuterClass.SearchApplicationRequest,
              yeying.api.application.ApplicationOuterClass.SearchApplicationResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getAuditMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.application.ApplicationOuterClass.AuditApplicationRequest,
              yeying.api.application.ApplicationOuterClass.AuditApplicationResponse>(
                service, METHODID_AUDIT)))
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.application.ApplicationOuterClass.CreateApplicationRequest,
              yeying.api.application.ApplicationOuterClass.CreateApplicationResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.application.ApplicationOuterClass.ApplicationDetailRequest,
              yeying.api.application.ApplicationOuterClass.ApplicationDetailResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getOfflineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.application.ApplicationOuterClass.OfflineApplicationRequest,
              yeying.api.application.ApplicationOuterClass.OfflineApplicationResponse>(
                service, METHODID_OFFLINE)))
        .addMethod(
          getOnlineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.application.ApplicationOuterClass.OnlineApplicationRequest,
              yeying.api.application.ApplicationOuterClass.OnlineApplicationResponse>(
                service, METHODID_ONLINE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.application.ApplicationOuterClass.DeleteApplicationRequest,
              yeying.api.application.ApplicationOuterClass.DeleteApplicationResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class ApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApplicationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.application.ApplicationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Application");
    }
  }

  private static final class ApplicationFileDescriptorSupplier
      extends ApplicationBaseDescriptorSupplier {
    ApplicationFileDescriptorSupplier() {}
  }

  private static final class ApplicationMethodDescriptorSupplier
      extends ApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ApplicationMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ApplicationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApplicationFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getAuditMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDetailMethod())
              .addMethod(getOfflineMethod())
              .addMethod(getOnlineMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
