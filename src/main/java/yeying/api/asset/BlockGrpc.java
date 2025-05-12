package yeying.api.asset;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *站在存储供应商的角度，数据和资产是有区别，数据有可能是有价值，也可能没有价值，但是存储供应商是没有感知，只有用户能够感知到。当用户和存储供应商之间签
 *约了以后，用户明确告知存储供应商数据是有价值的，并愿意支付一定的报酬，存储供应商才会认为数据是资产，这种资产可以在不同的存储供应商之间流通。在签约之
 *前，数据存储在临时存储区不能流通，只是某个存储供应商和用户之间临时的约定，所以也不会有版本的概念
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/asset/block.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BlockGrpc {

  private BlockGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.asset.Block";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.PutBlockRequest,
      yeying.api.asset.BlockOuterClass.PutBlockResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = yeying.api.asset.BlockOuterClass.PutBlockRequest.class,
      responseType = yeying.api.asset.BlockOuterClass.PutBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.PutBlockRequest,
      yeying.api.asset.BlockOuterClass.PutBlockResponse> getPutMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.PutBlockRequest, yeying.api.asset.BlockOuterClass.PutBlockResponse> getPutMethod;
    if ((getPutMethod = BlockGrpc.getPutMethod) == null) {
      synchronized (BlockGrpc.class) {
        if ((getPutMethod = BlockGrpc.getPutMethod) == null) {
          BlockGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.BlockOuterClass.PutBlockRequest, yeying.api.asset.BlockOuterClass.PutBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.BlockOuterClass.PutBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.BlockOuterClass.PutBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlockMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.StreamPutBlockRequest,
      yeying.api.asset.BlockOuterClass.StreamPutBlockResponse> getStreamPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamPut",
      requestType = yeying.api.asset.BlockOuterClass.StreamPutBlockRequest.class,
      responseType = yeying.api.asset.BlockOuterClass.StreamPutBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.StreamPutBlockRequest,
      yeying.api.asset.BlockOuterClass.StreamPutBlockResponse> getStreamPutMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.StreamPutBlockRequest, yeying.api.asset.BlockOuterClass.StreamPutBlockResponse> getStreamPutMethod;
    if ((getStreamPutMethod = BlockGrpc.getStreamPutMethod) == null) {
      synchronized (BlockGrpc.class) {
        if ((getStreamPutMethod = BlockGrpc.getStreamPutMethod) == null) {
          BlockGrpc.getStreamPutMethod = getStreamPutMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.BlockOuterClass.StreamPutBlockRequest, yeying.api.asset.BlockOuterClass.StreamPutBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamPut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.BlockOuterClass.StreamPutBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.BlockOuterClass.StreamPutBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlockMethodDescriptorSupplier("StreamPut"))
              .build();
        }
      }
    }
    return getStreamPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.ConfirmBlockRequest,
      yeying.api.asset.BlockOuterClass.ConfirmBlockResponse> getConfirmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Confirm",
      requestType = yeying.api.asset.BlockOuterClass.ConfirmBlockRequest.class,
      responseType = yeying.api.asset.BlockOuterClass.ConfirmBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.ConfirmBlockRequest,
      yeying.api.asset.BlockOuterClass.ConfirmBlockResponse> getConfirmMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.ConfirmBlockRequest, yeying.api.asset.BlockOuterClass.ConfirmBlockResponse> getConfirmMethod;
    if ((getConfirmMethod = BlockGrpc.getConfirmMethod) == null) {
      synchronized (BlockGrpc.class) {
        if ((getConfirmMethod = BlockGrpc.getConfirmMethod) == null) {
          BlockGrpc.getConfirmMethod = getConfirmMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.BlockOuterClass.ConfirmBlockRequest, yeying.api.asset.BlockOuterClass.ConfirmBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Confirm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.BlockOuterClass.ConfirmBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.BlockOuterClass.ConfirmBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlockMethodDescriptorSupplier("Confirm"))
              .build();
        }
      }
    }
    return getConfirmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.GetBlockRequest,
      yeying.api.asset.BlockOuterClass.GetBlockResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = yeying.api.asset.BlockOuterClass.GetBlockRequest.class,
      responseType = yeying.api.asset.BlockOuterClass.GetBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.GetBlockRequest,
      yeying.api.asset.BlockOuterClass.GetBlockResponse> getGetMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.GetBlockRequest, yeying.api.asset.BlockOuterClass.GetBlockResponse> getGetMethod;
    if ((getGetMethod = BlockGrpc.getGetMethod) == null) {
      synchronized (BlockGrpc.class) {
        if ((getGetMethod = BlockGrpc.getGetMethod) == null) {
          BlockGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.BlockOuterClass.GetBlockRequest, yeying.api.asset.BlockOuterClass.GetBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.BlockOuterClass.GetBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.BlockOuterClass.GetBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlockMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.StreamGetBlockRequest,
      yeying.api.asset.BlockOuterClass.StreamGetBlockResponse> getStreamGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamGet",
      requestType = yeying.api.asset.BlockOuterClass.StreamGetBlockRequest.class,
      responseType = yeying.api.asset.BlockOuterClass.StreamGetBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.StreamGetBlockRequest,
      yeying.api.asset.BlockOuterClass.StreamGetBlockResponse> getStreamGetMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.BlockOuterClass.StreamGetBlockRequest, yeying.api.asset.BlockOuterClass.StreamGetBlockResponse> getStreamGetMethod;
    if ((getStreamGetMethod = BlockGrpc.getStreamGetMethod) == null) {
      synchronized (BlockGrpc.class) {
        if ((getStreamGetMethod = BlockGrpc.getStreamGetMethod) == null) {
          BlockGrpc.getStreamGetMethod = getStreamGetMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.BlockOuterClass.StreamGetBlockRequest, yeying.api.asset.BlockOuterClass.StreamGetBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.BlockOuterClass.StreamGetBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.BlockOuterClass.StreamGetBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlockMethodDescriptorSupplier("StreamGet"))
              .build();
        }
      }
    }
    return getStreamGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlockStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlockStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlockStub>() {
        @java.lang.Override
        public BlockStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlockStub(channel, callOptions);
        }
      };
    return BlockStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static BlockBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlockBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlockBlockingV2Stub>() {
        @java.lang.Override
        public BlockBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlockBlockingV2Stub(channel, callOptions);
        }
      };
    return BlockBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlockBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlockBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlockBlockingStub>() {
        @java.lang.Override
        public BlockBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlockBlockingStub(channel, callOptions);
        }
      };
    return BlockBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlockFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlockFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlockFutureStub>() {
        @java.lang.Override
        public BlockFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlockFutureStub(channel, callOptions);
        }
      };
    return BlockFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *站在存储供应商的角度，数据和资产是有区别，数据有可能是有价值，也可能没有价值，但是存储供应商是没有感知，只有用户能够感知到。当用户和存储供应商之间签
   *约了以后，用户明确告知存储供应商数据是有价值的，并愿意支付一定的报酬，存储供应商才会认为数据是资产，这种资产可以在不同的存储供应商之间流通。在签约之
   *前，数据存储在临时存储区不能流通，只是某个存储供应商和用户之间临时的约定，所以也不会有版本的概念
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     **
     * 前端浏览器不支持client stream，按块上传接口，以块的形式放在临时存储区，资产签约时，这个块就会被挪到数据区，持久化存储。
     * 每个资产id只会保存一个块，确保业务层面始终存储和获取最新的块，也就是会覆盖之前的资产块，如果需要形成版本，就需要及时和存储供应商之间完成签约
     * 形成版本。
     * </pre>
     */
    default void put(yeying.api.asset.BlockOuterClass.PutBlockRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.PutBlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 按块流式上传，1，发送chunk的简要信息；2，上传资产块的内容；3，确认资产块的完整信息；
     * </pre>
     */
    default io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.StreamPutBlockRequest> streamPut(
        io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.StreamPutBlockResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamPutMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 检查该用户的资产块是否已经存在，如果存在则返回资产块元信息，如果不存在但是块哈希已存在则创建该用户的资产块
     * </pre>
     */
    default void confirm(yeying.api.asset.BlockOuterClass.ConfirmBlockRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.ConfirmBlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 前端浏览器不支持server stream，提供一个非流式的下载接口
     * </pre>
     */
    default void get(yeying.api.asset.BlockOuterClass.GetBlockRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.GetBlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 分块出库数字内容
     * </pre>
     */
    default io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.StreamGetBlockRequest> streamGet(
        io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.StreamGetBlockResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamGetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Block.
   * <pre>
   **
   *站在存储供应商的角度，数据和资产是有区别，数据有可能是有价值，也可能没有价值，但是存储供应商是没有感知，只有用户能够感知到。当用户和存储供应商之间签
   *约了以后，用户明确告知存储供应商数据是有价值的，并愿意支付一定的报酬，存储供应商才会认为数据是资产，这种资产可以在不同的存储供应商之间流通。在签约之
   *前，数据存储在临时存储区不能流通，只是某个存储供应商和用户之间临时的约定，所以也不会有版本的概念
   * </pre>
   */
  public static abstract class BlockImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BlockGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Block.
   * <pre>
   **
   *站在存储供应商的角度，数据和资产是有区别，数据有可能是有价值，也可能没有价值，但是存储供应商是没有感知，只有用户能够感知到。当用户和存储供应商之间签
   *约了以后，用户明确告知存储供应商数据是有价值的，并愿意支付一定的报酬，存储供应商才会认为数据是资产，这种资产可以在不同的存储供应商之间流通。在签约之
   *前，数据存储在临时存储区不能流通，只是某个存储供应商和用户之间临时的约定，所以也不会有版本的概念
   * </pre>
   */
  public static final class BlockStub
      extends io.grpc.stub.AbstractAsyncStub<BlockStub> {
    private BlockStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlockStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 前端浏览器不支持client stream，按块上传接口，以块的形式放在临时存储区，资产签约时，这个块就会被挪到数据区，持久化存储。
     * 每个资产id只会保存一个块，确保业务层面始终存储和获取最新的块，也就是会覆盖之前的资产块，如果需要形成版本，就需要及时和存储供应商之间完成签约
     * 形成版本。
     * </pre>
     */
    public void put(yeying.api.asset.BlockOuterClass.PutBlockRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.PutBlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 按块流式上传，1，发送chunk的简要信息；2，上传资产块的内容；3，确认资产块的完整信息；
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.StreamPutBlockRequest> streamPut(
        io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.StreamPutBlockResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamPutMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     **
     * 检查该用户的资产块是否已经存在，如果存在则返回资产块元信息，如果不存在但是块哈希已存在则创建该用户的资产块
     * </pre>
     */
    public void confirm(yeying.api.asset.BlockOuterClass.ConfirmBlockRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.ConfirmBlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 前端浏览器不支持server stream，提供一个非流式的下载接口
     * </pre>
     */
    public void get(yeying.api.asset.BlockOuterClass.GetBlockRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.GetBlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 分块出库数字内容
     * </pre>
     */
    public io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.StreamGetBlockRequest> streamGet(
        io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.StreamGetBlockResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamGetMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Block.
   * <pre>
   **
   *站在存储供应商的角度，数据和资产是有区别，数据有可能是有价值，也可能没有价值，但是存储供应商是没有感知，只有用户能够感知到。当用户和存储供应商之间签
   *约了以后，用户明确告知存储供应商数据是有价值的，并愿意支付一定的报酬，存储供应商才会认为数据是资产，这种资产可以在不同的存储供应商之间流通。在签约之
   *前，数据存储在临时存储区不能流通，只是某个存储供应商和用户之间临时的约定，所以也不会有版本的概念
   * </pre>
   */
  public static final class BlockBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<BlockBlockingV2Stub> {
    private BlockBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlockBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 前端浏览器不支持client stream，按块上传接口，以块的形式放在临时存储区，资产签约时，这个块就会被挪到数据区，持久化存储。
     * 每个资产id只会保存一个块，确保业务层面始终存储和获取最新的块，也就是会覆盖之前的资产块，如果需要形成版本，就需要及时和存储供应商之间完成签约
     * 形成版本。
     * </pre>
     */
    public yeying.api.asset.BlockOuterClass.PutBlockResponse put(yeying.api.asset.BlockOuterClass.PutBlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 按块流式上传，1，发送chunk的简要信息；2，上传资产块的内容；3，确认资产块的完整信息；
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<yeying.api.asset.BlockOuterClass.StreamPutBlockRequest, yeying.api.asset.BlockOuterClass.StreamPutBlockResponse>
        streamPut() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getStreamPutMethod(), getCallOptions());
    }

    /**
     * <pre>
     **
     * 检查该用户的资产块是否已经存在，如果存在则返回资产块元信息，如果不存在但是块哈希已存在则创建该用户的资产块
     * </pre>
     */
    public yeying.api.asset.BlockOuterClass.ConfirmBlockResponse confirm(yeying.api.asset.BlockOuterClass.ConfirmBlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 前端浏览器不支持server stream，提供一个非流式的下载接口
     * </pre>
     */
    public yeying.api.asset.BlockOuterClass.GetBlockResponse get(yeying.api.asset.BlockOuterClass.GetBlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 分块出库数字内容
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<yeying.api.asset.BlockOuterClass.StreamGetBlockRequest, yeying.api.asset.BlockOuterClass.StreamGetBlockResponse>
        streamGet() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getStreamGetMethod(), getCallOptions());
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Block.
   * <pre>
   **
   *站在存储供应商的角度，数据和资产是有区别，数据有可能是有价值，也可能没有价值，但是存储供应商是没有感知，只有用户能够感知到。当用户和存储供应商之间签
   *约了以后，用户明确告知存储供应商数据是有价值的，并愿意支付一定的报酬，存储供应商才会认为数据是资产，这种资产可以在不同的存储供应商之间流通。在签约之
   *前，数据存储在临时存储区不能流通，只是某个存储供应商和用户之间临时的约定，所以也不会有版本的概念
   * </pre>
   */
  public static final class BlockBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BlockBlockingStub> {
    private BlockBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlockBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 前端浏览器不支持client stream，按块上传接口，以块的形式放在临时存储区，资产签约时，这个块就会被挪到数据区，持久化存储。
     * 每个资产id只会保存一个块，确保业务层面始终存储和获取最新的块，也就是会覆盖之前的资产块，如果需要形成版本，就需要及时和存储供应商之间完成签约
     * 形成版本。
     * </pre>
     */
    public yeying.api.asset.BlockOuterClass.PutBlockResponse put(yeying.api.asset.BlockOuterClass.PutBlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 检查该用户的资产块是否已经存在，如果存在则返回资产块元信息，如果不存在但是块哈希已存在则创建该用户的资产块
     * </pre>
     */
    public yeying.api.asset.BlockOuterClass.ConfirmBlockResponse confirm(yeying.api.asset.BlockOuterClass.ConfirmBlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 前端浏览器不支持server stream，提供一个非流式的下载接口
     * </pre>
     */
    public yeying.api.asset.BlockOuterClass.GetBlockResponse get(yeying.api.asset.BlockOuterClass.GetBlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Block.
   * <pre>
   **
   *站在存储供应商的角度，数据和资产是有区别，数据有可能是有价值，也可能没有价值，但是存储供应商是没有感知，只有用户能够感知到。当用户和存储供应商之间签
   *约了以后，用户明确告知存储供应商数据是有价值的，并愿意支付一定的报酬，存储供应商才会认为数据是资产，这种资产可以在不同的存储供应商之间流通。在签约之
   *前，数据存储在临时存储区不能流通，只是某个存储供应商和用户之间临时的约定，所以也不会有版本的概念
   * </pre>
   */
  public static final class BlockFutureStub
      extends io.grpc.stub.AbstractFutureStub<BlockFutureStub> {
    private BlockFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlockFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 前端浏览器不支持client stream，按块上传接口，以块的形式放在临时存储区，资产签约时，这个块就会被挪到数据区，持久化存储。
     * 每个资产id只会保存一个块，确保业务层面始终存储和获取最新的块，也就是会覆盖之前的资产块，如果需要形成版本，就需要及时和存储供应商之间完成签约
     * 形成版本。
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.BlockOuterClass.PutBlockResponse> put(
        yeying.api.asset.BlockOuterClass.PutBlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 检查该用户的资产块是否已经存在，如果存在则返回资产块元信息，如果不存在但是块哈希已存在则创建该用户的资产块
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.BlockOuterClass.ConfirmBlockResponse> confirm(
        yeying.api.asset.BlockOuterClass.ConfirmBlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 前端浏览器不支持server stream，提供一个非流式的下载接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.BlockOuterClass.GetBlockResponse> get(
        yeying.api.asset.BlockOuterClass.GetBlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_CONFIRM = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_STREAM_PUT = 3;
  private static final int METHODID_STREAM_GET = 4;

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
        case METHODID_PUT:
          serviceImpl.put((yeying.api.asset.BlockOuterClass.PutBlockRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.PutBlockResponse>) responseObserver);
          break;
        case METHODID_CONFIRM:
          serviceImpl.confirm((yeying.api.asset.BlockOuterClass.ConfirmBlockRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.ConfirmBlockResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((yeying.api.asset.BlockOuterClass.GetBlockRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.GetBlockResponse>) responseObserver);
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
        case METHODID_STREAM_PUT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamPut(
              (io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.StreamPutBlockResponse>) responseObserver);
        case METHODID_STREAM_GET:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamGet(
              (io.grpc.stub.StreamObserver<yeying.api.asset.BlockOuterClass.StreamGetBlockResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.BlockOuterClass.PutBlockRequest,
              yeying.api.asset.BlockOuterClass.PutBlockResponse>(
                service, METHODID_PUT)))
        .addMethod(
          getStreamPutMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              yeying.api.asset.BlockOuterClass.StreamPutBlockRequest,
              yeying.api.asset.BlockOuterClass.StreamPutBlockResponse>(
                service, METHODID_STREAM_PUT)))
        .addMethod(
          getConfirmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.BlockOuterClass.ConfirmBlockRequest,
              yeying.api.asset.BlockOuterClass.ConfirmBlockResponse>(
                service, METHODID_CONFIRM)))
        .addMethod(
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.BlockOuterClass.GetBlockRequest,
              yeying.api.asset.BlockOuterClass.GetBlockResponse>(
                service, METHODID_GET)))
        .addMethod(
          getStreamGetMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              yeying.api.asset.BlockOuterClass.StreamGetBlockRequest,
              yeying.api.asset.BlockOuterClass.StreamGetBlockResponse>(
                service, METHODID_STREAM_GET)))
        .build();
  }

  private static abstract class BlockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlockBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.asset.BlockOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Block");
    }
  }

  private static final class BlockFileDescriptorSupplier
      extends BlockBaseDescriptorSupplier {
    BlockFileDescriptorSupplier() {}
  }

  private static final class BlockMethodDescriptorSupplier
      extends BlockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BlockMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BlockGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlockFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getStreamPutMethod())
              .addMethod(getConfirmMethod())
              .addMethod(getGetMethod())
              .addMethod(getStreamGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
