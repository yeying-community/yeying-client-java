package yeying.api.store;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
 *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
 *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
 *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
 *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
 *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
 *分散式存储网络的使用场景：
 *1、创作场景，知识产权证明
 *2、代码包分发场景，比如软件包，模型包等
 *3、数字资产，类似nft等
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/warehouse/warehouse.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WarehouseGrpc {

  private WarehouseGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.store.Warehouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.store.WarehouseOuterClass.GetStateRequest,
      yeying.api.store.WarehouseOuterClass.GetStateResponse> getGetStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetState",
      requestType = yeying.api.store.WarehouseOuterClass.GetStateRequest.class,
      responseType = yeying.api.store.WarehouseOuterClass.GetStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.store.WarehouseOuterClass.GetStateRequest,
      yeying.api.store.WarehouseOuterClass.GetStateResponse> getGetStateMethod() {
    io.grpc.MethodDescriptor<yeying.api.store.WarehouseOuterClass.GetStateRequest, yeying.api.store.WarehouseOuterClass.GetStateResponse> getGetStateMethod;
    if ((getGetStateMethod = WarehouseGrpc.getGetStateMethod) == null) {
      synchronized (WarehouseGrpc.class) {
        if ((getGetStateMethod = WarehouseGrpc.getGetStateMethod) == null) {
          WarehouseGrpc.getGetStateMethod = getGetStateMethod =
              io.grpc.MethodDescriptor.<yeying.api.store.WarehouseOuterClass.GetStateRequest, yeying.api.store.WarehouseOuterClass.GetStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.store.WarehouseOuterClass.GetStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.store.WarehouseOuterClass.GetStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WarehouseMethodDescriptorSupplier("GetState"))
              .build();
        }
      }
    }
    return getGetStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.store.WarehouseOuterClass.TransferRequest,
      yeying.api.store.WarehouseOuterClass.GetStateResponse> getTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transfer",
      requestType = yeying.api.store.WarehouseOuterClass.TransferRequest.class,
      responseType = yeying.api.store.WarehouseOuterClass.GetStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.store.WarehouseOuterClass.TransferRequest,
      yeying.api.store.WarehouseOuterClass.GetStateResponse> getTransferMethod() {
    io.grpc.MethodDescriptor<yeying.api.store.WarehouseOuterClass.TransferRequest, yeying.api.store.WarehouseOuterClass.GetStateResponse> getTransferMethod;
    if ((getTransferMethod = WarehouseGrpc.getTransferMethod) == null) {
      synchronized (WarehouseGrpc.class) {
        if ((getTransferMethod = WarehouseGrpc.getTransferMethod) == null) {
          WarehouseGrpc.getTransferMethod = getTransferMethod =
              io.grpc.MethodDescriptor.<yeying.api.store.WarehouseOuterClass.TransferRequest, yeying.api.store.WarehouseOuterClass.GetStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.store.WarehouseOuterClass.TransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.store.WarehouseOuterClass.GetStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WarehouseMethodDescriptorSupplier("Transfer"))
              .build();
        }
      }
    }
    return getTransferMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WarehouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseStub>() {
        @java.lang.Override
        public WarehouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseStub(channel, callOptions);
        }
      };
    return WarehouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static WarehouseBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseBlockingV2Stub>() {
        @java.lang.Override
        public WarehouseBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseBlockingV2Stub(channel, callOptions);
        }
      };
    return WarehouseBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WarehouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseBlockingStub>() {
        @java.lang.Override
        public WarehouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseBlockingStub(channel, callOptions);
        }
      };
    return WarehouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WarehouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseFutureStub>() {
        @java.lang.Override
        public WarehouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseFutureStub(channel, callOptions);
        }
      };
    return WarehouseFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *分散式存储网络的使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     **
     * 仓库和仓库之间同步数字资产，或者用户和仓库者之间
     * </pre>
     */
    default void getState(yeying.api.store.WarehouseOuterClass.GetStateRequest request,
        io.grpc.stub.StreamObserver<yeying.api.store.WarehouseOuterClass.GetStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStateMethod(), responseObserver);
    }

    /**
     */
    default void transfer(yeying.api.store.WarehouseOuterClass.TransferRequest request,
        io.grpc.stub.StreamObserver<yeying.api.store.WarehouseOuterClass.GetStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Warehouse.
   * <pre>
   **
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *分散式存储网络的使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   * </pre>
   */
  public static abstract class WarehouseImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WarehouseGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Warehouse.
   * <pre>
   **
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *分散式存储网络的使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   * </pre>
   */
  public static final class WarehouseStub
      extends io.grpc.stub.AbstractAsyncStub<WarehouseStub> {
    private WarehouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 仓库和仓库之间同步数字资产，或者用户和仓库者之间
     * </pre>
     */
    public void getState(yeying.api.store.WarehouseOuterClass.GetStateRequest request,
        io.grpc.stub.StreamObserver<yeying.api.store.WarehouseOuterClass.GetStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transfer(yeying.api.store.WarehouseOuterClass.TransferRequest request,
        io.grpc.stub.StreamObserver<yeying.api.store.WarehouseOuterClass.GetStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Warehouse.
   * <pre>
   **
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *分散式存储网络的使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   * </pre>
   */
  public static final class WarehouseBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<WarehouseBlockingV2Stub> {
    private WarehouseBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 仓库和仓库之间同步数字资产，或者用户和仓库者之间
     * </pre>
     */
    public yeying.api.store.WarehouseOuterClass.GetStateResponse getState(yeying.api.store.WarehouseOuterClass.GetStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yeying.api.store.WarehouseOuterClass.GetStateResponse transfer(yeying.api.store.WarehouseOuterClass.TransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Warehouse.
   * <pre>
   **
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *分散式存储网络的使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   * </pre>
   */
  public static final class WarehouseBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WarehouseBlockingStub> {
    private WarehouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 仓库和仓库之间同步数字资产，或者用户和仓库者之间
     * </pre>
     */
    public yeying.api.store.WarehouseOuterClass.GetStateResponse getState(yeying.api.store.WarehouseOuterClass.GetStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public yeying.api.store.WarehouseOuterClass.GetStateResponse transfer(yeying.api.store.WarehouseOuterClass.TransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Warehouse.
   * <pre>
   **
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *分散式存储网络的使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   * </pre>
   */
  public static final class WarehouseFutureStub
      extends io.grpc.stub.AbstractFutureStub<WarehouseFutureStub> {
    private WarehouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 仓库和仓库之间同步数字资产，或者用户和仓库者之间
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.store.WarehouseOuterClass.GetStateResponse> getState(
        yeying.api.store.WarehouseOuterClass.GetStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.store.WarehouseOuterClass.GetStateResponse> transfer(
        yeying.api.store.WarehouseOuterClass.TransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATE = 0;
  private static final int METHODID_TRANSFER = 1;

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
        case METHODID_GET_STATE:
          serviceImpl.getState((yeying.api.store.WarehouseOuterClass.GetStateRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.store.WarehouseOuterClass.GetStateResponse>) responseObserver);
          break;
        case METHODID_TRANSFER:
          serviceImpl.transfer((yeying.api.store.WarehouseOuterClass.TransferRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.store.WarehouseOuterClass.GetStateResponse>) responseObserver);
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
          getGetStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.store.WarehouseOuterClass.GetStateRequest,
              yeying.api.store.WarehouseOuterClass.GetStateResponse>(
                service, METHODID_GET_STATE)))
        .addMethod(
          getTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.store.WarehouseOuterClass.TransferRequest,
              yeying.api.store.WarehouseOuterClass.GetStateResponse>(
                service, METHODID_TRANSFER)))
        .build();
  }

  private static abstract class WarehouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WarehouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.store.WarehouseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Warehouse");
    }
  }

  private static final class WarehouseFileDescriptorSupplier
      extends WarehouseBaseDescriptorSupplier {
    WarehouseFileDescriptorSupplier() {}
  }

  private static final class WarehouseMethodDescriptorSupplier
      extends WarehouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WarehouseMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WarehouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WarehouseFileDescriptorSupplier())
              .addMethod(getGetStateMethod())
              .addMethod(getTransferMethod())
              .build();
        }
      }
    }
    return result;
  }
}
