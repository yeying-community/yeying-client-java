package yeying.api.social;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/social/social.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SocialGrpc {

  private SocialGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.social.Social";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.social.SocialOuterClass.MakeFriendsRequest,
      yeying.api.social.SocialOuterClass.MakeFriendsResponse> getMakeFriendsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeFriends",
      requestType = yeying.api.social.SocialOuterClass.MakeFriendsRequest.class,
      responseType = yeying.api.social.SocialOuterClass.MakeFriendsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.social.SocialOuterClass.MakeFriendsRequest,
      yeying.api.social.SocialOuterClass.MakeFriendsResponse> getMakeFriendsMethod() {
    io.grpc.MethodDescriptor<yeying.api.social.SocialOuterClass.MakeFriendsRequest, yeying.api.social.SocialOuterClass.MakeFriendsResponse> getMakeFriendsMethod;
    if ((getMakeFriendsMethod = SocialGrpc.getMakeFriendsMethod) == null) {
      synchronized (SocialGrpc.class) {
        if ((getMakeFriendsMethod = SocialGrpc.getMakeFriendsMethod) == null) {
          SocialGrpc.getMakeFriendsMethod = getMakeFriendsMethod =
              io.grpc.MethodDescriptor.<yeying.api.social.SocialOuterClass.MakeFriendsRequest, yeying.api.social.SocialOuterClass.MakeFriendsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MakeFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.social.SocialOuterClass.MakeFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.social.SocialOuterClass.MakeFriendsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SocialMethodDescriptorSupplier("MakeFriends"))
              .build();
        }
      }
    }
    return getMakeFriendsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.social.SocialOuterClass.GetFriendsRequest,
      yeying.api.social.SocialOuterClass.GetFriendResponse> getGetFriendsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFriends",
      requestType = yeying.api.social.SocialOuterClass.GetFriendsRequest.class,
      responseType = yeying.api.social.SocialOuterClass.GetFriendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.social.SocialOuterClass.GetFriendsRequest,
      yeying.api.social.SocialOuterClass.GetFriendResponse> getGetFriendsMethod() {
    io.grpc.MethodDescriptor<yeying.api.social.SocialOuterClass.GetFriendsRequest, yeying.api.social.SocialOuterClass.GetFriendResponse> getGetFriendsMethod;
    if ((getGetFriendsMethod = SocialGrpc.getGetFriendsMethod) == null) {
      synchronized (SocialGrpc.class) {
        if ((getGetFriendsMethod = SocialGrpc.getGetFriendsMethod) == null) {
          SocialGrpc.getGetFriendsMethod = getGetFriendsMethod =
              io.grpc.MethodDescriptor.<yeying.api.social.SocialOuterClass.GetFriendsRequest, yeying.api.social.SocialOuterClass.GetFriendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFriends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.social.SocialOuterClass.GetFriendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.social.SocialOuterClass.GetFriendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SocialMethodDescriptorSupplier("GetFriends"))
              .build();
        }
      }
    }
    return getGetFriendsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SocialStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocialStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocialStub>() {
        @java.lang.Override
        public SocialStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocialStub(channel, callOptions);
        }
      };
    return SocialStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static SocialBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocialBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocialBlockingV2Stub>() {
        @java.lang.Override
        public SocialBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocialBlockingV2Stub(channel, callOptions);
        }
      };
    return SocialBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SocialBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocialBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocialBlockingStub>() {
        @java.lang.Override
        public SocialBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocialBlockingStub(channel, callOptions);
        }
      };
    return SocialBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SocialFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SocialFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SocialFutureStub>() {
        @java.lang.Override
        public SocialFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SocialFutureStub(channel, callOptions);
        }
      };
    return SocialFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void makeFriends(yeying.api.social.SocialOuterClass.MakeFriendsRequest request,
        io.grpc.stub.StreamObserver<yeying.api.social.SocialOuterClass.MakeFriendsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMakeFriendsMethod(), responseObserver);
    }

    /**
     */
    default void getFriends(yeying.api.social.SocialOuterClass.GetFriendsRequest request,
        io.grpc.stub.StreamObserver<yeying.api.social.SocialOuterClass.GetFriendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFriendsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Social.
   */
  public static abstract class SocialImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SocialGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Social.
   */
  public static final class SocialStub
      extends io.grpc.stub.AbstractAsyncStub<SocialStub> {
    private SocialStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocialStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocialStub(channel, callOptions);
    }

    /**
     */
    public void makeFriends(yeying.api.social.SocialOuterClass.MakeFriendsRequest request,
        io.grpc.stub.StreamObserver<yeying.api.social.SocialOuterClass.MakeFriendsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMakeFriendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFriends(yeying.api.social.SocialOuterClass.GetFriendsRequest request,
        io.grpc.stub.StreamObserver<yeying.api.social.SocialOuterClass.GetFriendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFriendsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Social.
   */
  public static final class SocialBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<SocialBlockingV2Stub> {
    private SocialBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocialBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocialBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public yeying.api.social.SocialOuterClass.MakeFriendsResponse makeFriends(yeying.api.social.SocialOuterClass.MakeFriendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMakeFriendsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yeying.api.social.SocialOuterClass.GetFriendResponse getFriends(yeying.api.social.SocialOuterClass.GetFriendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFriendsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Social.
   */
  public static final class SocialBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SocialBlockingStub> {
    private SocialBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocialBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocialBlockingStub(channel, callOptions);
    }

    /**
     */
    public yeying.api.social.SocialOuterClass.MakeFriendsResponse makeFriends(yeying.api.social.SocialOuterClass.MakeFriendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMakeFriendsMethod(), getCallOptions(), request);
    }

    /**
     */
    public yeying.api.social.SocialOuterClass.GetFriendResponse getFriends(yeying.api.social.SocialOuterClass.GetFriendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFriendsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Social.
   */
  public static final class SocialFutureStub
      extends io.grpc.stub.AbstractFutureStub<SocialFutureStub> {
    private SocialFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocialFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SocialFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.social.SocialOuterClass.MakeFriendsResponse> makeFriends(
        yeying.api.social.SocialOuterClass.MakeFriendsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMakeFriendsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.social.SocialOuterClass.GetFriendResponse> getFriends(
        yeying.api.social.SocialOuterClass.GetFriendsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFriendsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MAKE_FRIENDS = 0;
  private static final int METHODID_GET_FRIENDS = 1;

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
        case METHODID_MAKE_FRIENDS:
          serviceImpl.makeFriends((yeying.api.social.SocialOuterClass.MakeFriendsRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.social.SocialOuterClass.MakeFriendsResponse>) responseObserver);
          break;
        case METHODID_GET_FRIENDS:
          serviceImpl.getFriends((yeying.api.social.SocialOuterClass.GetFriendsRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.social.SocialOuterClass.GetFriendResponse>) responseObserver);
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
          getMakeFriendsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.social.SocialOuterClass.MakeFriendsRequest,
              yeying.api.social.SocialOuterClass.MakeFriendsResponse>(
                service, METHODID_MAKE_FRIENDS)))
        .addMethod(
          getGetFriendsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.social.SocialOuterClass.GetFriendsRequest,
              yeying.api.social.SocialOuterClass.GetFriendResponse>(
                service, METHODID_GET_FRIENDS)))
        .build();
  }

  private static abstract class SocialBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SocialBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.social.SocialOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Social");
    }
  }

  private static final class SocialFileDescriptorSupplier
      extends SocialBaseDescriptorSupplier {
    SocialFileDescriptorSupplier() {}
  }

  private static final class SocialMethodDescriptorSupplier
      extends SocialBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SocialMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SocialGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SocialFileDescriptorSupplier())
              .addMethod(getMakeFriendsMethod())
              .addMethod(getGetFriendsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
