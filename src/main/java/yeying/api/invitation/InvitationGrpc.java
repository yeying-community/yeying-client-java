package yeying.api.invitation;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/invitation/invitation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InvitationGrpc {

  private InvitationGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.invitation.Invitation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest,
      yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest.class,
      responseType = yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest,
      yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest, yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse> getCreateMethod;
    if ((getCreateMethod = InvitationGrpc.getCreateMethod) == null) {
      synchronized (InvitationGrpc.class) {
        if ((getCreateMethod = InvitationGrpc.getCreateMethod) == null) {
          InvitationGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest, yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InvitationMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest,
      yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest.class,
      responseType = yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest,
      yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest, yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse> getSearchMethod;
    if ((getSearchMethod = InvitationGrpc.getSearchMethod) == null) {
      synchronized (InvitationGrpc.class) {
        if ((getSearchMethod = InvitationGrpc.getSearchMethod) == null) {
          InvitationGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest, yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InvitationMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest,
      yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest.class,
      responseType = yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest,
      yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest, yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse> getDetailMethod;
    if ((getDetailMethod = InvitationGrpc.getDetailMethod) == null) {
      synchronized (InvitationGrpc.class) {
        if ((getDetailMethod = InvitationGrpc.getDetailMethod) == null) {
          InvitationGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest, yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InvitationMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InvitationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InvitationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InvitationStub>() {
        @java.lang.Override
        public InvitationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InvitationStub(channel, callOptions);
        }
      };
    return InvitationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static InvitationBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InvitationBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InvitationBlockingV2Stub>() {
        @java.lang.Override
        public InvitationBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InvitationBlockingV2Stub(channel, callOptions);
        }
      };
    return InvitationBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InvitationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InvitationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InvitationBlockingStub>() {
        @java.lang.Override
        public InvitationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InvitationBlockingStub(channel, callOptions);
        }
      };
    return InvitationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InvitationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InvitationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InvitationFutureStub>() {
        @java.lang.Override
        public InvitationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InvitationFutureStub(channel, callOptions);
        }
      };
    return InvitationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 创建邀请码，通常是服务所有者才有权限创建
     * </pre>
     */
    default void create(yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 搜索邀请码
     * </pre>
     */
    default void search(yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询邀请码详情
     * </pre>
     */
    default void detail(yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Invitation.
   */
  public static abstract class InvitationImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InvitationGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Invitation.
   */
  public static final class InvitationStub
      extends io.grpc.stub.AbstractAsyncStub<InvitationStub> {
    private InvitationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvitationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InvitationStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建邀请码，通常是服务所有者才有权限创建
     * </pre>
     */
    public void create(yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 搜索邀请码
     * </pre>
     */
    public void search(yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest request,
        io.grpc.stub.StreamObserver<yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询邀请码详情
     * </pre>
     */
    public void detail(yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Invitation.
   */
  public static final class InvitationBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<InvitationBlockingV2Stub> {
    private InvitationBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvitationBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InvitationBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建邀请码，通常是服务所有者才有权限创建
     * </pre>
     */
    public yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse create(yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索邀请码
     * </pre>
     */
    public yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse search(yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询邀请码详情
     * </pre>
     */
    public yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse detail(yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Invitation.
   */
  public static final class InvitationBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InvitationBlockingStub> {
    private InvitationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvitationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InvitationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建邀请码，通常是服务所有者才有权限创建
     * </pre>
     */
    public yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse create(yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索邀请码
     * </pre>
     */
    public yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse search(yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询邀请码详情
     * </pre>
     */
    public yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse detail(yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Invitation.
   */
  public static final class InvitationFutureStub
      extends io.grpc.stub.AbstractFutureStub<InvitationFutureStub> {
    private InvitationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvitationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InvitationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 创建邀请码，通常是服务所有者才有权限创建
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse> create(
        yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 搜索邀请码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse> search(
        yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询邀请码详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse> detail(
        yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_DETAIL = 2;

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
          serviceImpl.create((yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse>) responseObserver);
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
              yeying.api.invitation.InvitationOuterClass.CreateInvitationRequest,
              yeying.api.invitation.InvitationOuterClass.CreateInvitationResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.invitation.InvitationOuterClass.SearchInvitationRequest,
              yeying.api.invitation.InvitationOuterClass.SearchInvitationResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.invitation.InvitationOuterClass.InvitationDetailRequest,
              yeying.api.invitation.InvitationOuterClass.InvitationDetailResponse>(
                service, METHODID_DETAIL)))
        .build();
  }

  private static abstract class InvitationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InvitationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.invitation.InvitationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Invitation");
    }
  }

  private static final class InvitationFileDescriptorSupplier
      extends InvitationBaseDescriptorSupplier {
    InvitationFileDescriptorSupplier() {}
  }

  private static final class InvitationMethodDescriptorSupplier
      extends InvitationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InvitationMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InvitationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InvitationFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getSearchMethod())
              .addMethod(getDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
