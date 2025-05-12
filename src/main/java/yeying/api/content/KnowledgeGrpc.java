package yeying.api.content;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * 数字内容的流动采用生产、存储、服务分离的技术，也就是采归采、存归存、取归取方式。以文本内容为例，爬取内容、创作内容、分发内容、以及阅读内容，独立
 * 运作，只要接口版本匹配就能工作，然后以创作和阅读作为网络驱动力和激励核心因素，主要目的有两个：
 * 1、促进在分散式网络（web3网络中）中从新分配网络资源和流量；
 * 2、减少重复工作，协作保持内容新鲜度；
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/knowledge/knowledge.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KnowledgeGrpc {

  private KnowledgeGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.content.Knowledge";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.content.KnowledgeOuterClass.SearchRequest,
      yeying.api.content.KnowledgeOuterClass.SearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.content.KnowledgeOuterClass.SearchRequest.class,
      responseType = yeying.api.content.KnowledgeOuterClass.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.content.KnowledgeOuterClass.SearchRequest,
      yeying.api.content.KnowledgeOuterClass.SearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.content.KnowledgeOuterClass.SearchRequest, yeying.api.content.KnowledgeOuterClass.SearchResponse> getSearchMethod;
    if ((getSearchMethod = KnowledgeGrpc.getSearchMethod) == null) {
      synchronized (KnowledgeGrpc.class) {
        if ((getSearchMethod = KnowledgeGrpc.getSearchMethod) == null) {
          KnowledgeGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.content.KnowledgeOuterClass.SearchRequest, yeying.api.content.KnowledgeOuterClass.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.content.KnowledgeOuterClass.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.content.KnowledgeOuterClass.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KnowledgeMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.content.KnowledgeOuterClass.AppendRequest,
      yeying.api.content.KnowledgeOuterClass.AppendResponse> getAppendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Append",
      requestType = yeying.api.content.KnowledgeOuterClass.AppendRequest.class,
      responseType = yeying.api.content.KnowledgeOuterClass.AppendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.content.KnowledgeOuterClass.AppendRequest,
      yeying.api.content.KnowledgeOuterClass.AppendResponse> getAppendMethod() {
    io.grpc.MethodDescriptor<yeying.api.content.KnowledgeOuterClass.AppendRequest, yeying.api.content.KnowledgeOuterClass.AppendResponse> getAppendMethod;
    if ((getAppendMethod = KnowledgeGrpc.getAppendMethod) == null) {
      synchronized (KnowledgeGrpc.class) {
        if ((getAppendMethod = KnowledgeGrpc.getAppendMethod) == null) {
          KnowledgeGrpc.getAppendMethod = getAppendMethod =
              io.grpc.MethodDescriptor.<yeying.api.content.KnowledgeOuterClass.AppendRequest, yeying.api.content.KnowledgeOuterClass.AppendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Append"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.content.KnowledgeOuterClass.AppendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.content.KnowledgeOuterClass.AppendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KnowledgeMethodDescriptorSupplier("Append"))
              .build();
        }
      }
    }
    return getAppendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KnowledgeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KnowledgeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KnowledgeStub>() {
        @java.lang.Override
        public KnowledgeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KnowledgeStub(channel, callOptions);
        }
      };
    return KnowledgeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static KnowledgeBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KnowledgeBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KnowledgeBlockingV2Stub>() {
        @java.lang.Override
        public KnowledgeBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KnowledgeBlockingV2Stub(channel, callOptions);
        }
      };
    return KnowledgeBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KnowledgeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KnowledgeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KnowledgeBlockingStub>() {
        @java.lang.Override
        public KnowledgeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KnowledgeBlockingStub(channel, callOptions);
        }
      };
    return KnowledgeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KnowledgeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KnowledgeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KnowledgeFutureStub>() {
        @java.lang.Override
        public KnowledgeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KnowledgeFutureStub(channel, callOptions);
        }
      };
    return KnowledgeFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * 数字内容的流动采用生产、存储、服务分离的技术，也就是采归采、存归存、取归取方式。以文本内容为例，爬取内容、创作内容、分发内容、以及阅读内容，独立
   * 运作，只要接口版本匹配就能工作，然后以创作和阅读作为网络驱动力和激励核心因素，主要目的有两个：
   * 1、促进在分散式网络（web3网络中）中从新分配网络资源和流量；
   * 2、减少重复工作，协作保持内容新鲜度；
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     **
     * 内容通知
     * </pre>
     */
    default void search(yeying.api.content.KnowledgeOuterClass.SearchRequest request,
        io.grpc.stub.StreamObserver<yeying.api.content.KnowledgeOuterClass.SearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 内容保鲜
     * </pre>
     */
    default void append(yeying.api.content.KnowledgeOuterClass.AppendRequest request,
        io.grpc.stub.StreamObserver<yeying.api.content.KnowledgeOuterClass.AppendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Knowledge.
   * <pre>
   **
   * 数字内容的流动采用生产、存储、服务分离的技术，也就是采归采、存归存、取归取方式。以文本内容为例，爬取内容、创作内容、分发内容、以及阅读内容，独立
   * 运作，只要接口版本匹配就能工作，然后以创作和阅读作为网络驱动力和激励核心因素，主要目的有两个：
   * 1、促进在分散式网络（web3网络中）中从新分配网络资源和流量；
   * 2、减少重复工作，协作保持内容新鲜度；
   * </pre>
   */
  public static abstract class KnowledgeImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return KnowledgeGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Knowledge.
   * <pre>
   **
   * 数字内容的流动采用生产、存储、服务分离的技术，也就是采归采、存归存、取归取方式。以文本内容为例，爬取内容、创作内容、分发内容、以及阅读内容，独立
   * 运作，只要接口版本匹配就能工作，然后以创作和阅读作为网络驱动力和激励核心因素，主要目的有两个：
   * 1、促进在分散式网络（web3网络中）中从新分配网络资源和流量；
   * 2、减少重复工作，协作保持内容新鲜度；
   * </pre>
   */
  public static final class KnowledgeStub
      extends io.grpc.stub.AbstractAsyncStub<KnowledgeStub> {
    private KnowledgeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KnowledgeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KnowledgeStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 内容通知
     * </pre>
     */
    public void search(yeying.api.content.KnowledgeOuterClass.SearchRequest request,
        io.grpc.stub.StreamObserver<yeying.api.content.KnowledgeOuterClass.SearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 内容保鲜
     * </pre>
     */
    public void append(yeying.api.content.KnowledgeOuterClass.AppendRequest request,
        io.grpc.stub.StreamObserver<yeying.api.content.KnowledgeOuterClass.AppendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Knowledge.
   * <pre>
   **
   * 数字内容的流动采用生产、存储、服务分离的技术，也就是采归采、存归存、取归取方式。以文本内容为例，爬取内容、创作内容、分发内容、以及阅读内容，独立
   * 运作，只要接口版本匹配就能工作，然后以创作和阅读作为网络驱动力和激励核心因素，主要目的有两个：
   * 1、促进在分散式网络（web3网络中）中从新分配网络资源和流量；
   * 2、减少重复工作，协作保持内容新鲜度；
   * </pre>
   */
  public static final class KnowledgeBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<KnowledgeBlockingV2Stub> {
    private KnowledgeBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KnowledgeBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KnowledgeBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 内容通知
     * </pre>
     */
    public yeying.api.content.KnowledgeOuterClass.SearchResponse search(yeying.api.content.KnowledgeOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 内容保鲜
     * </pre>
     */
    public yeying.api.content.KnowledgeOuterClass.AppendResponse append(yeying.api.content.KnowledgeOuterClass.AppendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Knowledge.
   * <pre>
   **
   * 数字内容的流动采用生产、存储、服务分离的技术，也就是采归采、存归存、取归取方式。以文本内容为例，爬取内容、创作内容、分发内容、以及阅读内容，独立
   * 运作，只要接口版本匹配就能工作，然后以创作和阅读作为网络驱动力和激励核心因素，主要目的有两个：
   * 1、促进在分散式网络（web3网络中）中从新分配网络资源和流量；
   * 2、减少重复工作，协作保持内容新鲜度；
   * </pre>
   */
  public static final class KnowledgeBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<KnowledgeBlockingStub> {
    private KnowledgeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KnowledgeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KnowledgeBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 内容通知
     * </pre>
     */
    public yeying.api.content.KnowledgeOuterClass.SearchResponse search(yeying.api.content.KnowledgeOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 内容保鲜
     * </pre>
     */
    public yeying.api.content.KnowledgeOuterClass.AppendResponse append(yeying.api.content.KnowledgeOuterClass.AppendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Knowledge.
   * <pre>
   **
   * 数字内容的流动采用生产、存储、服务分离的技术，也就是采归采、存归存、取归取方式。以文本内容为例，爬取内容、创作内容、分发内容、以及阅读内容，独立
   * 运作，只要接口版本匹配就能工作，然后以创作和阅读作为网络驱动力和激励核心因素，主要目的有两个：
   * 1、促进在分散式网络（web3网络中）中从新分配网络资源和流量；
   * 2、减少重复工作，协作保持内容新鲜度；
   * </pre>
   */
  public static final class KnowledgeFutureStub
      extends io.grpc.stub.AbstractFutureStub<KnowledgeFutureStub> {
    private KnowledgeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KnowledgeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KnowledgeFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 内容通知
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.content.KnowledgeOuterClass.SearchResponse> search(
        yeying.api.content.KnowledgeOuterClass.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 内容保鲜
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.content.KnowledgeOuterClass.AppendResponse> append(
        yeying.api.content.KnowledgeOuterClass.AppendRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_APPEND = 1;

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
          serviceImpl.search((yeying.api.content.KnowledgeOuterClass.SearchRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.content.KnowledgeOuterClass.SearchResponse>) responseObserver);
          break;
        case METHODID_APPEND:
          serviceImpl.append((yeying.api.content.KnowledgeOuterClass.AppendRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.content.KnowledgeOuterClass.AppendResponse>) responseObserver);
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
              yeying.api.content.KnowledgeOuterClass.SearchRequest,
              yeying.api.content.KnowledgeOuterClass.SearchResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getAppendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.content.KnowledgeOuterClass.AppendRequest,
              yeying.api.content.KnowledgeOuterClass.AppendResponse>(
                service, METHODID_APPEND)))
        .build();
  }

  private static abstract class KnowledgeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KnowledgeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.content.KnowledgeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Knowledge");
    }
  }

  private static final class KnowledgeFileDescriptorSupplier
      extends KnowledgeBaseDescriptorSupplier {
    KnowledgeFileDescriptorSupplier() {}
  }

  private static final class KnowledgeMethodDescriptorSupplier
      extends KnowledgeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    KnowledgeMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (KnowledgeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KnowledgeFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getAppendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
