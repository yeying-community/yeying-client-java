package yeying.api.asset;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *整个资产仓库基于分布式数字身份和资产内容哈希驱动，并能够在不同资产仓库间转移
 *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
 *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
 *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
 *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
 *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
 *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
 *仓库使用场景：
 *1、创作场景，知识产权证明
 *2、代码包分发场景，比如软件包，模型包等
 *3、数字资产，类似nft等
 *资产定位逻辑：
 *采用三元组唯一定位，(用户身份、命名空间、哈希值)
 *命名空间的定位逻辑：某个用户下面是唯一的，命名空间所有者，可以指定多个参与者，用于存储完成某项工作生成资产数据，这些资产数据属于命名空间所有者
 *资产的定位逻辑：每个命名空间是隔离的，同一个所有者，同一个命名空间，资产哈希值必须唯一
 *资产块的定位逻辑：每个命名空间是隔离的，用一个所有者，同一个命名空间，资产块是唯一的，资产块维持一个引用计数，其逻辑如下：
 *- 当有一个新资产放入命名空间，则引用计数加1；
 *- 当有一个老资产移出命名空间，则引用计数减1；
 *当某个资产块的引用计数为0，表示没有和资产仓库服务签约，只是临时存储，通常分块上传完成以后就会立即签约，但是考虑委托第三方服务生成的数据直接放到命名
 *空间，第三方服务没有命名空间所有者的私钥，无法和资产仓库完成签约，只能先上传，事后由命名空间所有者完成签名；
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/asset/asset.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssetGrpc {

  private AssetGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.asset.Asset";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.SearchAssetRequest,
      yeying.api.asset.AssetOuterClass.SearchAssetResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = yeying.api.asset.AssetOuterClass.SearchAssetRequest.class,
      responseType = yeying.api.asset.AssetOuterClass.SearchAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.SearchAssetRequest,
      yeying.api.asset.AssetOuterClass.SearchAssetResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.SearchAssetRequest, yeying.api.asset.AssetOuterClass.SearchAssetResponse> getSearchMethod;
    if ((getSearchMethod = AssetGrpc.getSearchMethod) == null) {
      synchronized (AssetGrpc.class) {
        if ((getSearchMethod = AssetGrpc.getSearchMethod) == null) {
          AssetGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.AssetOuterClass.SearchAssetRequest, yeying.api.asset.AssetOuterClass.SearchAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.AssetOuterClass.SearchAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.AssetOuterClass.SearchAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.SignAssetRequest,
      yeying.api.asset.AssetOuterClass.SignAssetResponse> getSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sign",
      requestType = yeying.api.asset.AssetOuterClass.SignAssetRequest.class,
      responseType = yeying.api.asset.AssetOuterClass.SignAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.SignAssetRequest,
      yeying.api.asset.AssetOuterClass.SignAssetResponse> getSignMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.SignAssetRequest, yeying.api.asset.AssetOuterClass.SignAssetResponse> getSignMethod;
    if ((getSignMethod = AssetGrpc.getSignMethod) == null) {
      synchronized (AssetGrpc.class) {
        if ((getSignMethod = AssetGrpc.getSignMethod) == null) {
          AssetGrpc.getSignMethod = getSignMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.AssetOuterClass.SignAssetRequest, yeying.api.asset.AssetOuterClass.SignAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.AssetOuterClass.SignAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.AssetOuterClass.SignAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetMethodDescriptorSupplier("Sign"))
              .build();
        }
      }
    }
    return getSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.UpdateAssetRequest,
      yeying.api.asset.AssetOuterClass.UpdateAssetResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = yeying.api.asset.AssetOuterClass.UpdateAssetRequest.class,
      responseType = yeying.api.asset.AssetOuterClass.UpdateAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.UpdateAssetRequest,
      yeying.api.asset.AssetOuterClass.UpdateAssetResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.UpdateAssetRequest, yeying.api.asset.AssetOuterClass.UpdateAssetResponse> getUpdateMethod;
    if ((getUpdateMethod = AssetGrpc.getUpdateMethod) == null) {
      synchronized (AssetGrpc.class) {
        if ((getUpdateMethod = AssetGrpc.getUpdateMethod) == null) {
          AssetGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.AssetOuterClass.UpdateAssetRequest, yeying.api.asset.AssetOuterClass.UpdateAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.AssetOuterClass.UpdateAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.AssetOuterClass.UpdateAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.AssetDetailRequest,
      yeying.api.asset.AssetOuterClass.AssetDetailResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.asset.AssetOuterClass.AssetDetailRequest.class,
      responseType = yeying.api.asset.AssetOuterClass.AssetDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.AssetDetailRequest,
      yeying.api.asset.AssetOuterClass.AssetDetailResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.AssetDetailRequest, yeying.api.asset.AssetOuterClass.AssetDetailResponse> getDetailMethod;
    if ((getDetailMethod = AssetGrpc.getDetailMethod) == null) {
      synchronized (AssetGrpc.class) {
        if ((getDetailMethod = AssetGrpc.getDetailMethod) == null) {
          AssetGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.AssetOuterClass.AssetDetailRequest, yeying.api.asset.AssetOuterClass.AssetDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.AssetOuterClass.AssetDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.AssetOuterClass.AssetDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.DeleteAssetRequest,
      yeying.api.asset.AssetOuterClass.DeleteAssetResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = yeying.api.asset.AssetOuterClass.DeleteAssetRequest.class,
      responseType = yeying.api.asset.AssetOuterClass.DeleteAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.DeleteAssetRequest,
      yeying.api.asset.AssetOuterClass.DeleteAssetResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<yeying.api.asset.AssetOuterClass.DeleteAssetRequest, yeying.api.asset.AssetOuterClass.DeleteAssetResponse> getDeleteMethod;
    if ((getDeleteMethod = AssetGrpc.getDeleteMethod) == null) {
      synchronized (AssetGrpc.class) {
        if ((getDeleteMethod = AssetGrpc.getDeleteMethod) == null) {
          AssetGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<yeying.api.asset.AssetOuterClass.DeleteAssetRequest, yeying.api.asset.AssetOuterClass.DeleteAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.AssetOuterClass.DeleteAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.asset.AssetOuterClass.DeleteAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssetMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssetStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetStub>() {
        @java.lang.Override
        public AssetStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetStub(channel, callOptions);
        }
      };
    return AssetStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AssetBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetBlockingV2Stub>() {
        @java.lang.Override
        public AssetBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetBlockingV2Stub(channel, callOptions);
        }
      };
    return AssetBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssetBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetBlockingStub>() {
        @java.lang.Override
        public AssetBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetBlockingStub(channel, callOptions);
        }
      };
    return AssetBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssetFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssetFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssetFutureStub>() {
        @java.lang.Override
        public AssetFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssetFutureStub(channel, callOptions);
        }
      };
    return AssetFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *整个资产仓库基于分布式数字身份和资产内容哈希驱动，并能够在不同资产仓库间转移
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *仓库使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   *资产定位逻辑：
   *采用三元组唯一定位，(用户身份、命名空间、哈希值)
   *命名空间的定位逻辑：某个用户下面是唯一的，命名空间所有者，可以指定多个参与者，用于存储完成某项工作生成资产数据，这些资产数据属于命名空间所有者
   *资产的定位逻辑：每个命名空间是隔离的，同一个所有者，同一个命名空间，资产哈希值必须唯一
   *资产块的定位逻辑：每个命名空间是隔离的，用一个所有者，同一个命名空间，资产块是唯一的，资产块维持一个引用计数，其逻辑如下：
   *- 当有一个新资产放入命名空间，则引用计数加1；
   *- 当有一个老资产移出命名空间，则引用计数减1；
   *当某个资产块的引用计数为0，表示没有和资产仓库服务签约，只是临时存储，通常分块上传完成以后就会立即签约，但是考虑委托第三方服务生成的数据直接放到命名
   *空间，第三方服务没有命名空间所有者的私钥，无法和资产仓库完成签约，只能先上传，事后由命名空间所有者完成签名；
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     **
     * 检索数字内容，基于数字内容的元信息检索，比如哈希值、时间、类型、名称等, 如果什么条件都不传入，则按照默认的排序顺序，返回第一个10条记录。
     * </pre>
     */
    default void search(yeying.api.asset.AssetOuterClass.SearchAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.SearchAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 以事务的形式和存储供应商签订协议并入库，当所有资产块入库成功后，资产的信息发送到后端服务签字确认，涵盖了新的资产和新的版本入库；
     * 1、根据规则，自动生成新的版本，资产身份不变，但是资产内容的哈希值会变
     * </pre>
     */
    default void sign(yeying.api.asset.AssetOuterClass.SignAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.SignAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 更新资产元信息
     * </pre>
     */
    default void update(yeying.api.asset.AssetOuterClass.UpdateAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.UpdateAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 获得资产详细信息，提供该接口是为了更灵活处理资产信息，资产信息的复杂主要是几个方面：
     * 1、资产分块，资产的块信息可能会很大
     * 2、多版本，资产描述信息也会很大
     * 3、分散存储，如果资产过大，可能会被存储到不同的供应商
     * </pre>
     */
    default void detail(yeying.api.asset.AssetOuterClass.AssetDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.AssetDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * 删除资产，不回立即删除，而是放入回收站；资产支持多版本，在删除的时候，采取头或者尾部删除，不能从中间删除，确保版本的链条能够正常工作；
     * </pre>
     */
    default void delete(yeying.api.asset.AssetOuterClass.DeleteAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.DeleteAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Asset.
   * <pre>
   **
   *整个资产仓库基于分布式数字身份和资产内容哈希驱动，并能够在不同资产仓库间转移
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *仓库使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   *资产定位逻辑：
   *采用三元组唯一定位，(用户身份、命名空间、哈希值)
   *命名空间的定位逻辑：某个用户下面是唯一的，命名空间所有者，可以指定多个参与者，用于存储完成某项工作生成资产数据，这些资产数据属于命名空间所有者
   *资产的定位逻辑：每个命名空间是隔离的，同一个所有者，同一个命名空间，资产哈希值必须唯一
   *资产块的定位逻辑：每个命名空间是隔离的，用一个所有者，同一个命名空间，资产块是唯一的，资产块维持一个引用计数，其逻辑如下：
   *- 当有一个新资产放入命名空间，则引用计数加1；
   *- 当有一个老资产移出命名空间，则引用计数减1；
   *当某个资产块的引用计数为0，表示没有和资产仓库服务签约，只是临时存储，通常分块上传完成以后就会立即签约，但是考虑委托第三方服务生成的数据直接放到命名
   *空间，第三方服务没有命名空间所有者的私钥，无法和资产仓库完成签约，只能先上传，事后由命名空间所有者完成签名；
   * </pre>
   */
  public static abstract class AssetImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AssetGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Asset.
   * <pre>
   **
   *整个资产仓库基于分布式数字身份和资产内容哈希驱动，并能够在不同资产仓库间转移
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *仓库使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   *资产定位逻辑：
   *采用三元组唯一定位，(用户身份、命名空间、哈希值)
   *命名空间的定位逻辑：某个用户下面是唯一的，命名空间所有者，可以指定多个参与者，用于存储完成某项工作生成资产数据，这些资产数据属于命名空间所有者
   *资产的定位逻辑：每个命名空间是隔离的，同一个所有者，同一个命名空间，资产哈希值必须唯一
   *资产块的定位逻辑：每个命名空间是隔离的，用一个所有者，同一个命名空间，资产块是唯一的，资产块维持一个引用计数，其逻辑如下：
   *- 当有一个新资产放入命名空间，则引用计数加1；
   *- 当有一个老资产移出命名空间，则引用计数减1；
   *当某个资产块的引用计数为0，表示没有和资产仓库服务签约，只是临时存储，通常分块上传完成以后就会立即签约，但是考虑委托第三方服务生成的数据直接放到命名
   *空间，第三方服务没有命名空间所有者的私钥，无法和资产仓库完成签约，只能先上传，事后由命名空间所有者完成签名；
   * </pre>
   */
  public static final class AssetStub
      extends io.grpc.stub.AbstractAsyncStub<AssetStub> {
    private AssetStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 检索数字内容，基于数字内容的元信息检索，比如哈希值、时间、类型、名称等, 如果什么条件都不传入，则按照默认的排序顺序，返回第一个10条记录。
     * </pre>
     */
    public void search(yeying.api.asset.AssetOuterClass.SearchAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.SearchAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 以事务的形式和存储供应商签订协议并入库，当所有资产块入库成功后，资产的信息发送到后端服务签字确认，涵盖了新的资产和新的版本入库；
     * 1、根据规则，自动生成新的版本，资产身份不变，但是资产内容的哈希值会变
     * </pre>
     */
    public void sign(yeying.api.asset.AssetOuterClass.SignAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.SignAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 更新资产元信息
     * </pre>
     */
    public void update(yeying.api.asset.AssetOuterClass.UpdateAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.UpdateAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 获得资产详细信息，提供该接口是为了更灵活处理资产信息，资产信息的复杂主要是几个方面：
     * 1、资产分块，资产的块信息可能会很大
     * 2、多版本，资产描述信息也会很大
     * 3、分散存储，如果资产过大，可能会被存储到不同的供应商
     * </pre>
     */
    public void detail(yeying.api.asset.AssetOuterClass.AssetDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.AssetDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * 删除资产，不回立即删除，而是放入回收站；资产支持多版本，在删除的时候，采取头或者尾部删除，不能从中间删除，确保版本的链条能够正常工作；
     * </pre>
     */
    public void delete(yeying.api.asset.AssetOuterClass.DeleteAssetRequest request,
        io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.DeleteAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Asset.
   * <pre>
   **
   *整个资产仓库基于分布式数字身份和资产内容哈希驱动，并能够在不同资产仓库间转移
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *仓库使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   *资产定位逻辑：
   *采用三元组唯一定位，(用户身份、命名空间、哈希值)
   *命名空间的定位逻辑：某个用户下面是唯一的，命名空间所有者，可以指定多个参与者，用于存储完成某项工作生成资产数据，这些资产数据属于命名空间所有者
   *资产的定位逻辑：每个命名空间是隔离的，同一个所有者，同一个命名空间，资产哈希值必须唯一
   *资产块的定位逻辑：每个命名空间是隔离的，用一个所有者，同一个命名空间，资产块是唯一的，资产块维持一个引用计数，其逻辑如下：
   *- 当有一个新资产放入命名空间，则引用计数加1；
   *- 当有一个老资产移出命名空间，则引用计数减1；
   *当某个资产块的引用计数为0，表示没有和资产仓库服务签约，只是临时存储，通常分块上传完成以后就会立即签约，但是考虑委托第三方服务生成的数据直接放到命名
   *空间，第三方服务没有命名空间所有者的私钥，无法和资产仓库完成签约，只能先上传，事后由命名空间所有者完成签名；
   * </pre>
   */
  public static final class AssetBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AssetBlockingV2Stub> {
    private AssetBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 检索数字内容，基于数字内容的元信息检索，比如哈希值、时间、类型、名称等, 如果什么条件都不传入，则按照默认的排序顺序，返回第一个10条记录。
     * </pre>
     */
    public yeying.api.asset.AssetOuterClass.SearchAssetResponse search(yeying.api.asset.AssetOuterClass.SearchAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 以事务的形式和存储供应商签订协议并入库，当所有资产块入库成功后，资产的信息发送到后端服务签字确认，涵盖了新的资产和新的版本入库；
     * 1、根据规则，自动生成新的版本，资产身份不变，但是资产内容的哈希值会变
     * </pre>
     */
    public yeying.api.asset.AssetOuterClass.SignAssetResponse sign(yeying.api.asset.AssetOuterClass.SignAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 更新资产元信息
     * </pre>
     */
    public yeying.api.asset.AssetOuterClass.UpdateAssetResponse update(yeying.api.asset.AssetOuterClass.UpdateAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 获得资产详细信息，提供该接口是为了更灵活处理资产信息，资产信息的复杂主要是几个方面：
     * 1、资产分块，资产的块信息可能会很大
     * 2、多版本，资产描述信息也会很大
     * 3、分散存储，如果资产过大，可能会被存储到不同的供应商
     * </pre>
     */
    public yeying.api.asset.AssetOuterClass.AssetDetailResponse detail(yeying.api.asset.AssetOuterClass.AssetDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 删除资产，不回立即删除，而是放入回收站；资产支持多版本，在删除的时候，采取头或者尾部删除，不能从中间删除，确保版本的链条能够正常工作；
     * </pre>
     */
    public yeying.api.asset.AssetOuterClass.DeleteAssetResponse delete(yeying.api.asset.AssetOuterClass.DeleteAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Asset.
   * <pre>
   **
   *整个资产仓库基于分布式数字身份和资产内容哈希驱动，并能够在不同资产仓库间转移
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *仓库使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   *资产定位逻辑：
   *采用三元组唯一定位，(用户身份、命名空间、哈希值)
   *命名空间的定位逻辑：某个用户下面是唯一的，命名空间所有者，可以指定多个参与者，用于存储完成某项工作生成资产数据，这些资产数据属于命名空间所有者
   *资产的定位逻辑：每个命名空间是隔离的，同一个所有者，同一个命名空间，资产哈希值必须唯一
   *资产块的定位逻辑：每个命名空间是隔离的，用一个所有者，同一个命名空间，资产块是唯一的，资产块维持一个引用计数，其逻辑如下：
   *- 当有一个新资产放入命名空间，则引用计数加1；
   *- 当有一个老资产移出命名空间，则引用计数减1；
   *当某个资产块的引用计数为0，表示没有和资产仓库服务签约，只是临时存储，通常分块上传完成以后就会立即签约，但是考虑委托第三方服务生成的数据直接放到命名
   *空间，第三方服务没有命名空间所有者的私钥，无法和资产仓库完成签约，只能先上传，事后由命名空间所有者完成签名；
   * </pre>
   */
  public static final class AssetBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AssetBlockingStub> {
    private AssetBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 检索数字内容，基于数字内容的元信息检索，比如哈希值、时间、类型、名称等, 如果什么条件都不传入，则按照默认的排序顺序，返回第一个10条记录。
     * </pre>
     */
    public yeying.api.asset.AssetOuterClass.SearchAssetResponse search(yeying.api.asset.AssetOuterClass.SearchAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 以事务的形式和存储供应商签订协议并入库，当所有资产块入库成功后，资产的信息发送到后端服务签字确认，涵盖了新的资产和新的版本入库；
     * 1、根据规则，自动生成新的版本，资产身份不变，但是资产内容的哈希值会变
     * </pre>
     */
    public yeying.api.asset.AssetOuterClass.SignAssetResponse sign(yeying.api.asset.AssetOuterClass.SignAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 更新资产元信息
     * </pre>
     */
    public yeying.api.asset.AssetOuterClass.UpdateAssetResponse update(yeying.api.asset.AssetOuterClass.UpdateAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 获得资产详细信息，提供该接口是为了更灵活处理资产信息，资产信息的复杂主要是几个方面：
     * 1、资产分块，资产的块信息可能会很大
     * 2、多版本，资产描述信息也会很大
     * 3、分散存储，如果资产过大，可能会被存储到不同的供应商
     * </pre>
     */
    public yeying.api.asset.AssetOuterClass.AssetDetailResponse detail(yeying.api.asset.AssetOuterClass.AssetDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * 删除资产，不回立即删除，而是放入回收站；资产支持多版本，在删除的时候，采取头或者尾部删除，不能从中间删除，确保版本的链条能够正常工作；
     * </pre>
     */
    public yeying.api.asset.AssetOuterClass.DeleteAssetResponse delete(yeying.api.asset.AssetOuterClass.DeleteAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Asset.
   * <pre>
   **
   *整个资产仓库基于分布式数字身份和资产内容哈希驱动，并能够在不同资产仓库间转移
   *开放的分散式仓库网络的接口设计，参考了现实世界中的仓库，逻辑如下：
   *1、数字资产有两个标识，一个是数字资产的身份标识，可以是分布式数字身份，也可以是用户自定义的身份ID，另一个是数字资产内容的哈希值；
   *2、数字资产入库，发送到指定存储网络中的节点，可以指定副本数量，一方面保证内容不会因为单个节点故障而丢失，另外也保证内容的可访问性；
   *3、存储复用，如果两份资产哈希值一样，分两种情况来看，如果资产的所有者一样，则仓库会主动告知身份持有者存在重复，如果资产的所有者不同，会增加引用；
   *4、授权数字资产，所有者和使用者立交易关系，确保使用者根据指定的策略访问数据，仓库会统计数字资产的使用情况，比如统计内容取（浏览）的次数评估内容热度
   *，或者统计内容存的次数（收藏）评估内容质量，目的是更好的分配存储资源；
   *仓库使用场景：
   *1、创作场景，知识产权证明
   *2、代码包分发场景，比如软件包，模型包等
   *3、数字资产，类似nft等
   *资产定位逻辑：
   *采用三元组唯一定位，(用户身份、命名空间、哈希值)
   *命名空间的定位逻辑：某个用户下面是唯一的，命名空间所有者，可以指定多个参与者，用于存储完成某项工作生成资产数据，这些资产数据属于命名空间所有者
   *资产的定位逻辑：每个命名空间是隔离的，同一个所有者，同一个命名空间，资产哈希值必须唯一
   *资产块的定位逻辑：每个命名空间是隔离的，用一个所有者，同一个命名空间，资产块是唯一的，资产块维持一个引用计数，其逻辑如下：
   *- 当有一个新资产放入命名空间，则引用计数加1；
   *- 当有一个老资产移出命名空间，则引用计数减1；
   *当某个资产块的引用计数为0，表示没有和资产仓库服务签约，只是临时存储，通常分块上传完成以后就会立即签约，但是考虑委托第三方服务生成的数据直接放到命名
   *空间，第三方服务没有命名空间所有者的私钥，无法和资产仓库完成签约，只能先上传，事后由命名空间所有者完成签名；
   * </pre>
   */
  public static final class AssetFutureStub
      extends io.grpc.stub.AbstractFutureStub<AssetFutureStub> {
    private AssetFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssetFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssetFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * 检索数字内容，基于数字内容的元信息检索，比如哈希值、时间、类型、名称等, 如果什么条件都不传入，则按照默认的排序顺序，返回第一个10条记录。
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.AssetOuterClass.SearchAssetResponse> search(
        yeying.api.asset.AssetOuterClass.SearchAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 以事务的形式和存储供应商签订协议并入库，当所有资产块入库成功后，资产的信息发送到后端服务签字确认，涵盖了新的资产和新的版本入库；
     * 1、根据规则，自动生成新的版本，资产身份不变，但是资产内容的哈希值会变
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.AssetOuterClass.SignAssetResponse> sign(
        yeying.api.asset.AssetOuterClass.SignAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 更新资产元信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.AssetOuterClass.UpdateAssetResponse> update(
        yeying.api.asset.AssetOuterClass.UpdateAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 获得资产详细信息，提供该接口是为了更灵活处理资产信息，资产信息的复杂主要是几个方面：
     * 1、资产分块，资产的块信息可能会很大
     * 2、多版本，资产描述信息也会很大
     * 3、分散存储，如果资产过大，可能会被存储到不同的供应商
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.AssetOuterClass.AssetDetailResponse> detail(
        yeying.api.asset.AssetOuterClass.AssetDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * 删除资产，不回立即删除，而是放入回收站；资产支持多版本，在删除的时候，采取头或者尾部删除，不能从中间删除，确保版本的链条能够正常工作；
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.asset.AssetOuterClass.DeleteAssetResponse> delete(
        yeying.api.asset.AssetOuterClass.DeleteAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_SIGN = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DETAIL = 3;
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
          serviceImpl.search((yeying.api.asset.AssetOuterClass.SearchAssetRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.SearchAssetResponse>) responseObserver);
          break;
        case METHODID_SIGN:
          serviceImpl.sign((yeying.api.asset.AssetOuterClass.SignAssetRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.SignAssetResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((yeying.api.asset.AssetOuterClass.UpdateAssetRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.UpdateAssetResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.asset.AssetOuterClass.AssetDetailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.AssetDetailResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((yeying.api.asset.AssetOuterClass.DeleteAssetRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.asset.AssetOuterClass.DeleteAssetResponse>) responseObserver);
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
              yeying.api.asset.AssetOuterClass.SearchAssetRequest,
              yeying.api.asset.AssetOuterClass.SearchAssetResponse>(
                service, METHODID_SEARCH)))
        .addMethod(
          getSignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.AssetOuterClass.SignAssetRequest,
              yeying.api.asset.AssetOuterClass.SignAssetResponse>(
                service, METHODID_SIGN)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.AssetOuterClass.UpdateAssetRequest,
              yeying.api.asset.AssetOuterClass.UpdateAssetResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.AssetOuterClass.AssetDetailRequest,
              yeying.api.asset.AssetOuterClass.AssetDetailResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.asset.AssetOuterClass.DeleteAssetRequest,
              yeying.api.asset.AssetOuterClass.DeleteAssetResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class AssetBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssetBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.asset.AssetOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Asset");
    }
  }

  private static final class AssetFileDescriptorSupplier
      extends AssetBaseDescriptorSupplier {
    AssetFileDescriptorSupplier() {}
  }

  private static final class AssetMethodDescriptorSupplier
      extends AssetBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AssetMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AssetGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssetFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getSignMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDetailMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
