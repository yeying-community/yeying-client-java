package yeying.api.identity;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 提供身份托管和维护服务，目前还不支持托管加密的身份，需要有资质，需要补齐的能力；
 * 1、至少二要素身份认证；
 * 2、保护隐私零知识证名；
 * 2、支持密钥恢复；
 * 3、服务器故障导致丢失，需要支持分散式存储；
 * 4、支持加密硬件；
 * 5、至少要两把密钥，一把由身份所有者保管，一把是服务保管；
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/identity/identity.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IdentityGrpc {

  private IdentityGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.identity.Identity";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.DepositRequest,
      yeying.api.identity.IdentityOuterClass.DepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = yeying.api.identity.IdentityOuterClass.DepositRequest.class,
      responseType = yeying.api.identity.IdentityOuterClass.DepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.DepositRequest,
      yeying.api.identity.IdentityOuterClass.DepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.DepositRequest, yeying.api.identity.IdentityOuterClass.DepositResponse> getDepositMethod;
    if ((getDepositMethod = IdentityGrpc.getDepositMethod) == null) {
      synchronized (IdentityGrpc.class) {
        if ((getDepositMethod = IdentityGrpc.getDepositMethod) == null) {
          IdentityGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<yeying.api.identity.IdentityOuterClass.DepositRequest, yeying.api.identity.IdentityOuterClass.DepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.identity.IdentityOuterClass.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.identity.IdentityOuterClass.DepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.RetrieveRequest,
      yeying.api.identity.IdentityOuterClass.RetrieveResponse> getRetrieveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retrieve",
      requestType = yeying.api.identity.IdentityOuterClass.RetrieveRequest.class,
      responseType = yeying.api.identity.IdentityOuterClass.RetrieveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.RetrieveRequest,
      yeying.api.identity.IdentityOuterClass.RetrieveResponse> getRetrieveMethod() {
    io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.RetrieveRequest, yeying.api.identity.IdentityOuterClass.RetrieveResponse> getRetrieveMethod;
    if ((getRetrieveMethod = IdentityGrpc.getRetrieveMethod) == null) {
      synchronized (IdentityGrpc.class) {
        if ((getRetrieveMethod = IdentityGrpc.getRetrieveMethod) == null) {
          IdentityGrpc.getRetrieveMethod = getRetrieveMethod =
              io.grpc.MethodDescriptor.<yeying.api.identity.IdentityOuterClass.RetrieveRequest, yeying.api.identity.IdentityOuterClass.RetrieveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Retrieve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.identity.IdentityOuterClass.RetrieveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.identity.IdentityOuterClass.RetrieveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityMethodDescriptorSupplier("Retrieve"))
              .build();
        }
      }
    }
    return getRetrieveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.QueryRequest,
      yeying.api.identity.IdentityOuterClass.QueryResponse> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = yeying.api.identity.IdentityOuterClass.QueryRequest.class,
      responseType = yeying.api.identity.IdentityOuterClass.QueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.QueryRequest,
      yeying.api.identity.IdentityOuterClass.QueryResponse> getQueryMethod() {
    io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.QueryRequest, yeying.api.identity.IdentityOuterClass.QueryResponse> getQueryMethod;
    if ((getQueryMethod = IdentityGrpc.getQueryMethod) == null) {
      synchronized (IdentityGrpc.class) {
        if ((getQueryMethod = IdentityGrpc.getQueryMethod) == null) {
          IdentityGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<yeying.api.identity.IdentityOuterClass.QueryRequest, yeying.api.identity.IdentityOuterClass.QueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.identity.IdentityOuterClass.QueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.identity.IdentityOuterClass.QueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityMethodDescriptorSupplier("Query"))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.ShareRequest,
      yeying.api.identity.IdentityOuterClass.ShareResponse> getShareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Share",
      requestType = yeying.api.identity.IdentityOuterClass.ShareRequest.class,
      responseType = yeying.api.identity.IdentityOuterClass.ShareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.ShareRequest,
      yeying.api.identity.IdentityOuterClass.ShareResponse> getShareMethod() {
    io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.ShareRequest, yeying.api.identity.IdentityOuterClass.ShareResponse> getShareMethod;
    if ((getShareMethod = IdentityGrpc.getShareMethod) == null) {
      synchronized (IdentityGrpc.class) {
        if ((getShareMethod = IdentityGrpc.getShareMethod) == null) {
          IdentityGrpc.getShareMethod = getShareMethod =
              io.grpc.MethodDescriptor.<yeying.api.identity.IdentityOuterClass.ShareRequest, yeying.api.identity.IdentityOuterClass.ShareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Share"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.identity.IdentityOuterClass.ShareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.identity.IdentityOuterClass.ShareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityMethodDescriptorSupplier("Share"))
              .build();
        }
      }
    }
    return getShareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.CancelRequest,
      yeying.api.identity.IdentityOuterClass.CancelResponse> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = yeying.api.identity.IdentityOuterClass.CancelRequest.class,
      responseType = yeying.api.identity.IdentityOuterClass.CancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.CancelRequest,
      yeying.api.identity.IdentityOuterClass.CancelResponse> getCancelMethod() {
    io.grpc.MethodDescriptor<yeying.api.identity.IdentityOuterClass.CancelRequest, yeying.api.identity.IdentityOuterClass.CancelResponse> getCancelMethod;
    if ((getCancelMethod = IdentityGrpc.getCancelMethod) == null) {
      synchronized (IdentityGrpc.class) {
        if ((getCancelMethod = IdentityGrpc.getCancelMethod) == null) {
          IdentityGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<yeying.api.identity.IdentityOuterClass.CancelRequest, yeying.api.identity.IdentityOuterClass.CancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.identity.IdentityOuterClass.CancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.identity.IdentityOuterClass.CancelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdentityStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityStub>() {
        @java.lang.Override
        public IdentityStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityStub(channel, callOptions);
        }
      };
    return IdentityStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static IdentityBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityBlockingV2Stub>() {
        @java.lang.Override
        public IdentityBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityBlockingV2Stub(channel, callOptions);
        }
      };
    return IdentityBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdentityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityBlockingStub>() {
        @java.lang.Override
        public IdentityBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityBlockingStub(channel, callOptions);
        }
      };
    return IdentityBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdentityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityFutureStub>() {
        @java.lang.Override
        public IdentityFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityFutureStub(channel, callOptions);
        }
      };
    return IdentityFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 提供身份托管和维护服务，目前还不支持托管加密的身份，需要有资质，需要补齐的能力；
   * 1、至少二要素身份认证；
   * 2、保护隐私零知识证名；
   * 2、支持密钥恢复；
   * 3、服务器故障导致丢失，需要支持分散式存储；
   * 4、支持加密硬件；
   * 5、至少要两把密钥，一把由身份所有者保管，一把是服务保管；
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 身份托管
     * </pre>
     */
    default void deposit(yeying.api.identity.IdentityOuterClass.DepositRequest request,
        io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.DepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * 取回身份
     * </pre>
     */
    default void retrieve(yeying.api.identity.IdentityOuterClass.RetrieveRequest request,
        io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.RetrieveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询身份名片
     * </pre>
     */
    default void query(yeying.api.identity.IdentityOuterClass.QueryRequest request,
        io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.QueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     * <pre>
     * 分享身份名片
     * </pre>
     */
    default void share(yeying.api.identity.IdentityOuterClass.ShareRequest request,
        io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.ShareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShareMethod(), responseObserver);
    }

    /**
     * <pre>
     * 取消托管
     * </pre>
     */
    default void cancel(yeying.api.identity.IdentityOuterClass.CancelRequest request,
        io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.CancelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Identity.
   * <pre>
   * 提供身份托管和维护服务，目前还不支持托管加密的身份，需要有资质，需要补齐的能力；
   * 1、至少二要素身份认证；
   * 2、保护隐私零知识证名；
   * 2、支持密钥恢复；
   * 3、服务器故障导致丢失，需要支持分散式存储；
   * 4、支持加密硬件；
   * 5、至少要两把密钥，一把由身份所有者保管，一把是服务保管；
   * </pre>
   */
  public static abstract class IdentityImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IdentityGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Identity.
   * <pre>
   * 提供身份托管和维护服务，目前还不支持托管加密的身份，需要有资质，需要补齐的能力；
   * 1、至少二要素身份认证；
   * 2、保护隐私零知识证名；
   * 2、支持密钥恢复；
   * 3、服务器故障导致丢失，需要支持分散式存储；
   * 4、支持加密硬件；
   * 5、至少要两把密钥，一把由身份所有者保管，一把是服务保管；
   * </pre>
   */
  public static final class IdentityStub
      extends io.grpc.stub.AbstractAsyncStub<IdentityStub> {
    private IdentityStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityStub(channel, callOptions);
    }

    /**
     * <pre>
     * 身份托管
     * </pre>
     */
    public void deposit(yeying.api.identity.IdentityOuterClass.DepositRequest request,
        io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.DepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 取回身份
     * </pre>
     */
    public void retrieve(yeying.api.identity.IdentityOuterClass.RetrieveRequest request,
        io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.RetrieveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询身份名片
     * </pre>
     */
    public void query(yeying.api.identity.IdentityOuterClass.QueryRequest request,
        io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.QueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 分享身份名片
     * </pre>
     */
    public void share(yeying.api.identity.IdentityOuterClass.ShareRequest request,
        io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.ShareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 取消托管
     * </pre>
     */
    public void cancel(yeying.api.identity.IdentityOuterClass.CancelRequest request,
        io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.CancelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Identity.
   * <pre>
   * 提供身份托管和维护服务，目前还不支持托管加密的身份，需要有资质，需要补齐的能力；
   * 1、至少二要素身份认证；
   * 2、保护隐私零知识证名；
   * 2、支持密钥恢复；
   * 3、服务器故障导致丢失，需要支持分散式存储；
   * 4、支持加密硬件；
   * 5、至少要两把密钥，一把由身份所有者保管，一把是服务保管；
   * </pre>
   */
  public static final class IdentityBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<IdentityBlockingV2Stub> {
    private IdentityBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 身份托管
     * </pre>
     */
    public yeying.api.identity.IdentityOuterClass.DepositResponse deposit(yeying.api.identity.IdentityOuterClass.DepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 取回身份
     * </pre>
     */
    public yeying.api.identity.IdentityOuterClass.RetrieveResponse retrieve(yeying.api.identity.IdentityOuterClass.RetrieveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询身份名片
     * </pre>
     */
    public yeying.api.identity.IdentityOuterClass.QueryResponse query(yeying.api.identity.IdentityOuterClass.QueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 分享身份名片
     * </pre>
     */
    public yeying.api.identity.IdentityOuterClass.ShareResponse share(yeying.api.identity.IdentityOuterClass.ShareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 取消托管
     * </pre>
     */
    public yeying.api.identity.IdentityOuterClass.CancelResponse cancel(yeying.api.identity.IdentityOuterClass.CancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Identity.
   * <pre>
   * 提供身份托管和维护服务，目前还不支持托管加密的身份，需要有资质，需要补齐的能力；
   * 1、至少二要素身份认证；
   * 2、保护隐私零知识证名；
   * 2、支持密钥恢复；
   * 3、服务器故障导致丢失，需要支持分散式存储；
   * 4、支持加密硬件；
   * 5、至少要两把密钥，一把由身份所有者保管，一把是服务保管；
   * </pre>
   */
  public static final class IdentityBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IdentityBlockingStub> {
    private IdentityBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 身份托管
     * </pre>
     */
    public yeying.api.identity.IdentityOuterClass.DepositResponse deposit(yeying.api.identity.IdentityOuterClass.DepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 取回身份
     * </pre>
     */
    public yeying.api.identity.IdentityOuterClass.RetrieveResponse retrieve(yeying.api.identity.IdentityOuterClass.RetrieveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询身份名片
     * </pre>
     */
    public yeying.api.identity.IdentityOuterClass.QueryResponse query(yeying.api.identity.IdentityOuterClass.QueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 分享身份名片
     * </pre>
     */
    public yeying.api.identity.IdentityOuterClass.ShareResponse share(yeying.api.identity.IdentityOuterClass.ShareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 取消托管
     * </pre>
     */
    public yeying.api.identity.IdentityOuterClass.CancelResponse cancel(yeying.api.identity.IdentityOuterClass.CancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Identity.
   * <pre>
   * 提供身份托管和维护服务，目前还不支持托管加密的身份，需要有资质，需要补齐的能力；
   * 1、至少二要素身份认证；
   * 2、保护隐私零知识证名；
   * 2、支持密钥恢复；
   * 3、服务器故障导致丢失，需要支持分散式存储；
   * 4、支持加密硬件；
   * 5、至少要两把密钥，一把由身份所有者保管，一把是服务保管；
   * </pre>
   */
  public static final class IdentityFutureStub
      extends io.grpc.stub.AbstractFutureStub<IdentityFutureStub> {
    private IdentityFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 身份托管
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.identity.IdentityOuterClass.DepositResponse> deposit(
        yeying.api.identity.IdentityOuterClass.DepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 取回身份
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.identity.IdentityOuterClass.RetrieveResponse> retrieve(
        yeying.api.identity.IdentityOuterClass.RetrieveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询身份名片
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.identity.IdentityOuterClass.QueryResponse> query(
        yeying.api.identity.IdentityOuterClass.QueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 分享身份名片
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.identity.IdentityOuterClass.ShareResponse> share(
        yeying.api.identity.IdentityOuterClass.ShareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 取消托管
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.identity.IdentityOuterClass.CancelResponse> cancel(
        yeying.api.identity.IdentityOuterClass.CancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSIT = 0;
  private static final int METHODID_RETRIEVE = 1;
  private static final int METHODID_QUERY = 2;
  private static final int METHODID_SHARE = 3;
  private static final int METHODID_CANCEL = 4;

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
        case METHODID_DEPOSIT:
          serviceImpl.deposit((yeying.api.identity.IdentityOuterClass.DepositRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.DepositResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((yeying.api.identity.IdentityOuterClass.RetrieveRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.RetrieveResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((yeying.api.identity.IdentityOuterClass.QueryRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.QueryResponse>) responseObserver);
          break;
        case METHODID_SHARE:
          serviceImpl.share((yeying.api.identity.IdentityOuterClass.ShareRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.ShareResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((yeying.api.identity.IdentityOuterClass.CancelRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.identity.IdentityOuterClass.CancelResponse>) responseObserver);
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
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.identity.IdentityOuterClass.DepositRequest,
              yeying.api.identity.IdentityOuterClass.DepositResponse>(
                service, METHODID_DEPOSIT)))
        .addMethod(
          getRetrieveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.identity.IdentityOuterClass.RetrieveRequest,
              yeying.api.identity.IdentityOuterClass.RetrieveResponse>(
                service, METHODID_RETRIEVE)))
        .addMethod(
          getQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.identity.IdentityOuterClass.QueryRequest,
              yeying.api.identity.IdentityOuterClass.QueryResponse>(
                service, METHODID_QUERY)))
        .addMethod(
          getShareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.identity.IdentityOuterClass.ShareRequest,
              yeying.api.identity.IdentityOuterClass.ShareResponse>(
                service, METHODID_SHARE)))
        .addMethod(
          getCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.identity.IdentityOuterClass.CancelRequest,
              yeying.api.identity.IdentityOuterClass.CancelResponse>(
                service, METHODID_CANCEL)))
        .build();
  }

  private static abstract class IdentityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdentityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.identity.IdentityOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Identity");
    }
  }

  private static final class IdentityFileDescriptorSupplier
      extends IdentityBaseDescriptorSupplier {
    IdentityFileDescriptorSupplier() {}
  }

  private static final class IdentityMethodDescriptorSupplier
      extends IdentityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IdentityMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IdentityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdentityFileDescriptorSupplier())
              .addMethod(getDepositMethod())
              .addMethod(getRetrieveMethod())
              .addMethod(getQueryMethod())
              .addMethod(getShareMethod())
              .addMethod(getCancelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
