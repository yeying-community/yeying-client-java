package yeying.api.apps.zuoyepigai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *错题管理
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/apps/zuoyepigai/mistakes.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MistakesGrpc {

  private MistakesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.apps.zuoyepigai.Mistakes";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest.class,
      responseType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse> getListMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse> getListMethod;
    if ((getListMethod = MistakesGrpc.getListMethod) == null) {
      synchronized (MistakesGrpc.class) {
        if ((getListMethod = MistakesGrpc.getListMethod) == null) {
          MistakesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MistakesMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse> getDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detail",
      requestType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest.class,
      responseType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse> getDetailMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse> getDetailMethod;
    if ((getDetailMethod = MistakesGrpc.getDetailMethod) == null) {
      synchronized (MistakesGrpc.class) {
        if ((getDetailMethod = MistakesGrpc.getDetailMethod) == null) {
          MistakesGrpc.getDetailMethod = getDetailMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MistakesMethodDescriptorSupplier("Detail"))
              .build();
        }
      }
    }
    return getDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse> getAnalysisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Analysis",
      requestType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest.class,
      responseType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse> getAnalysisMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse> getAnalysisMethod;
    if ((getAnalysisMethod = MistakesGrpc.getAnalysisMethod) == null) {
      synchronized (MistakesGrpc.class) {
        if ((getAnalysisMethod = MistakesGrpc.getAnalysisMethod) == null) {
          MistakesGrpc.getAnalysisMethod = getAnalysisMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Analysis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MistakesMethodDescriptorSupplier("Analysis"))
              .build();
        }
      }
    }
    return getAnalysisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse> getMakeCorrectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeCorrection",
      requestType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest.class,
      responseType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse> getMakeCorrectionMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse> getMakeCorrectionMethod;
    if ((getMakeCorrectionMethod = MistakesGrpc.getMakeCorrectionMethod) == null) {
      synchronized (MistakesGrpc.class) {
        if ((getMakeCorrectionMethod = MistakesGrpc.getMakeCorrectionMethod) == null) {
          MistakesGrpc.getMakeCorrectionMethod = getMakeCorrectionMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MakeCorrection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MistakesMethodDescriptorSupplier("MakeCorrection"))
              .build();
        }
      }
    }
    return getMakeCorrectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse> getPrintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Print",
      requestType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest.class,
      responseType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse> getPrintMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse> getPrintMethod;
    if ((getPrintMethod = MistakesGrpc.getPrintMethod) == null) {
      synchronized (MistakesGrpc.class) {
        if ((getPrintMethod = MistakesGrpc.getPrintMethod) == null) {
          MistakesGrpc.getPrintMethod = getPrintMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Print"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MistakesMethodDescriptorSupplier("Print"))
              .build();
        }
      }
    }
    return getPrintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse> getSubmitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Submit",
      requestType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest.class,
      responseType = yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest,
      yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse> getSubmitMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse> getSubmitMethod;
    if ((getSubmitMethod = MistakesGrpc.getSubmitMethod) == null) {
      synchronized (MistakesGrpc.class) {
        if ((getSubmitMethod = MistakesGrpc.getSubmitMethod) == null) {
          MistakesGrpc.getSubmitMethod = getSubmitMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest, yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Submit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MistakesMethodDescriptorSupplier("Submit"))
              .build();
        }
      }
    }
    return getSubmitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MistakesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MistakesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MistakesStub>() {
        @java.lang.Override
        public MistakesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MistakesStub(channel, callOptions);
        }
      };
    return MistakesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static MistakesBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MistakesBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MistakesBlockingV2Stub>() {
        @java.lang.Override
        public MistakesBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MistakesBlockingV2Stub(channel, callOptions);
        }
      };
    return MistakesBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MistakesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MistakesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MistakesBlockingStub>() {
        @java.lang.Override
        public MistakesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MistakesBlockingStub(channel, callOptions);
        }
      };
    return MistakesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MistakesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MistakesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MistakesFutureStub>() {
        @java.lang.Override
        public MistakesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MistakesFutureStub(channel, callOptions);
        }
      };
    return MistakesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *错题管理
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 列表
     * </pre>
     */
    default void list(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 详情
     * </pre>
     */
    default void detail(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 错误分析
     * </pre>
     */
    default void analysis(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnalysisMethod(), responseObserver);
    }

    /**
     * <pre>
     * 错误订正
     * </pre>
     */
    default void makeCorrection(yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMakeCorrectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 打印错题题目
     * </pre>
     */
    default void print(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrintMethod(), responseObserver);
    }

    /**
     * <pre>
     * 提交订正的题目，重新生成图片，提交大模型批改
     * </pre>
     */
    default void submit(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Mistakes.
   * <pre>
   **
   *错题管理
   * </pre>
   */
  public static abstract class MistakesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MistakesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Mistakes.
   * <pre>
   **
   *错题管理
   * </pre>
   */
  public static final class MistakesStub
      extends io.grpc.stub.AbstractAsyncStub<MistakesStub> {
    private MistakesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MistakesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MistakesStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public void list(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 详情
     * </pre>
     */
    public void detail(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 错误分析
     * </pre>
     */
    public void analysis(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnalysisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 错误订正
     * </pre>
     */
    public void makeCorrection(yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMakeCorrectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 打印错题题目
     * </pre>
     */
    public void print(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 提交订正的题目，重新生成图片，提交大模型批改
     * </pre>
     */
    public void submit(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Mistakes.
   * <pre>
   **
   *错题管理
   * </pre>
   */
  public static final class MistakesBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<MistakesBlockingV2Stub> {
    private MistakesBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MistakesBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MistakesBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse list(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 详情
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse detail(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 错误分析
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse analysis(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalysisMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 错误订正
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse makeCorrection(yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMakeCorrectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 打印错题题目
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse print(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrintMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 提交订正的题目，重新生成图片，提交大模型批改
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse submit(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Mistakes.
   * <pre>
   **
   *错题管理
   * </pre>
   */
  public static final class MistakesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MistakesBlockingStub> {
    private MistakesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MistakesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MistakesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse list(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 详情
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse detail(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 错误分析
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse analysis(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalysisMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 错误订正
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse makeCorrection(yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMakeCorrectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 打印错题题目
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse print(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrintMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 提交订正的题目，重新生成图片，提交大模型批改
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse submit(yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Mistakes.
   * <pre>
   **
   *错题管理
   * </pre>
   */
  public static final class MistakesFutureStub
      extends io.grpc.stub.AbstractFutureStub<MistakesFutureStub> {
    private MistakesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MistakesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MistakesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse> list(
        yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse> detail(
        yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 错误分析
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse> analysis(
        yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnalysisMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 错误订正
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse> makeCorrection(
        yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMakeCorrectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 打印错题题目
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse> print(
        yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrintMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 提交订正的题目，重新生成图片，提交大模型批改
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse> submit(
        yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_DETAIL = 1;
  private static final int METHODID_ANALYSIS = 2;
  private static final int METHODID_MAKE_CORRECTION = 3;
  private static final int METHODID_PRINT = 4;
  private static final int METHODID_SUBMIT = 5;

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
        case METHODID_LIST:
          serviceImpl.list((yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse>) responseObserver);
          break;
        case METHODID_DETAIL:
          serviceImpl.detail((yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse>) responseObserver);
          break;
        case METHODID_ANALYSIS:
          serviceImpl.analysis((yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse>) responseObserver);
          break;
        case METHODID_MAKE_CORRECTION:
          serviceImpl.makeCorrection((yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse>) responseObserver);
          break;
        case METHODID_PRINT:
          serviceImpl.print((yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse>) responseObserver);
          break;
        case METHODID_SUBMIT:
          serviceImpl.submit((yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse>) responseObserver);
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
          getListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListRequest,
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesListResponse>(
                service, METHODID_LIST)))
        .addMethod(
          getDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailRequest,
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesDetailResponse>(
                service, METHODID_DETAIL)))
        .addMethod(
          getAnalysisMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisRequest,
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesAnalysisResponse>(
                service, METHODID_ANALYSIS)))
        .addMethod(
          getMakeCorrectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionRequest,
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MakeCorrectionResponse>(
                service, METHODID_MAKE_CORRECTION)))
        .addMethod(
          getPrintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintRequest,
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesPrintResponse>(
                service, METHODID_PRINT)))
        .addMethod(
          getSubmitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitRequest,
              yeying.api.apps.zuoyepigai.MistakesOuterClass.MistakesSubmitResponse>(
                service, METHODID_SUBMIT)))
        .build();
  }

  private static abstract class MistakesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MistakesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.apps.zuoyepigai.MistakesOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Mistakes");
    }
  }

  private static final class MistakesFileDescriptorSupplier
      extends MistakesBaseDescriptorSupplier {
    MistakesFileDescriptorSupplier() {}
  }

  private static final class MistakesMethodDescriptorSupplier
      extends MistakesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MistakesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MistakesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MistakesFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getDetailMethod())
              .addMethod(getAnalysisMethod())
              .addMethod(getMakeCorrectionMethod())
              .addMethod(getPrintMethod())
              .addMethod(getSubmitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
