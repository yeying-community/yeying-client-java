package yeying.api.llm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/llm/llm.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LlmGrpc {

  private LlmGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.llm.Llm";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.TranslateRequest,
      yeying.api.llm.LlmOuterClass.TranslateResponse> getTranslateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Translate",
      requestType = yeying.api.llm.LlmOuterClass.TranslateRequest.class,
      responseType = yeying.api.llm.LlmOuterClass.TranslateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.TranslateRequest,
      yeying.api.llm.LlmOuterClass.TranslateResponse> getTranslateMethod() {
    io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.TranslateRequest, yeying.api.llm.LlmOuterClass.TranslateResponse> getTranslateMethod;
    if ((getTranslateMethod = LlmGrpc.getTranslateMethod) == null) {
      synchronized (LlmGrpc.class) {
        if ((getTranslateMethod = LlmGrpc.getTranslateMethod) == null) {
          LlmGrpc.getTranslateMethod = getTranslateMethod =
              io.grpc.MethodDescriptor.<yeying.api.llm.LlmOuterClass.TranslateRequest, yeying.api.llm.LlmOuterClass.TranslateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Translate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.LlmOuterClass.TranslateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.LlmOuterClass.TranslateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmMethodDescriptorSupplier("Translate"))
              .build();
        }
      }
    }
    return getTranslateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.CompleteRequest,
      yeying.api.llm.LlmOuterClass.CompleteResponse> getCompleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Complete",
      requestType = yeying.api.llm.LlmOuterClass.CompleteRequest.class,
      responseType = yeying.api.llm.LlmOuterClass.CompleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.CompleteRequest,
      yeying.api.llm.LlmOuterClass.CompleteResponse> getCompleteMethod() {
    io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.CompleteRequest, yeying.api.llm.LlmOuterClass.CompleteResponse> getCompleteMethod;
    if ((getCompleteMethod = LlmGrpc.getCompleteMethod) == null) {
      synchronized (LlmGrpc.class) {
        if ((getCompleteMethod = LlmGrpc.getCompleteMethod) == null) {
          LlmGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<yeying.api.llm.LlmOuterClass.CompleteRequest, yeying.api.llm.LlmOuterClass.CompleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.LlmOuterClass.CompleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.LlmOuterClass.CompleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmMethodDescriptorSupplier("Complete"))
              .build();
        }
      }
    }
    return getCompleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.EditRequest,
      yeying.api.llm.LlmOuterClass.EditResponse> getEditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Edit",
      requestType = yeying.api.llm.LlmOuterClass.EditRequest.class,
      responseType = yeying.api.llm.LlmOuterClass.EditResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.EditRequest,
      yeying.api.llm.LlmOuterClass.EditResponse> getEditMethod() {
    io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.EditRequest, yeying.api.llm.LlmOuterClass.EditResponse> getEditMethod;
    if ((getEditMethod = LlmGrpc.getEditMethod) == null) {
      synchronized (LlmGrpc.class) {
        if ((getEditMethod = LlmGrpc.getEditMethod) == null) {
          LlmGrpc.getEditMethod = getEditMethod =
              io.grpc.MethodDescriptor.<yeying.api.llm.LlmOuterClass.EditRequest, yeying.api.llm.LlmOuterClass.EditResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Edit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.LlmOuterClass.EditRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.LlmOuterClass.EditResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmMethodDescriptorSupplier("Edit"))
              .build();
        }
      }
    }
    return getEditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.GenerateRequest,
      yeying.api.llm.LlmOuterClass.GenerateResponse> getGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Generate",
      requestType = yeying.api.llm.LlmOuterClass.GenerateRequest.class,
      responseType = yeying.api.llm.LlmOuterClass.GenerateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.GenerateRequest,
      yeying.api.llm.LlmOuterClass.GenerateResponse> getGenerateMethod() {
    io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.GenerateRequest, yeying.api.llm.LlmOuterClass.GenerateResponse> getGenerateMethod;
    if ((getGenerateMethod = LlmGrpc.getGenerateMethod) == null) {
      synchronized (LlmGrpc.class) {
        if ((getGenerateMethod = LlmGrpc.getGenerateMethod) == null) {
          LlmGrpc.getGenerateMethod = getGenerateMethod =
              io.grpc.MethodDescriptor.<yeying.api.llm.LlmOuterClass.GenerateRequest, yeying.api.llm.LlmOuterClass.GenerateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Generate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.LlmOuterClass.GenerateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.LlmOuterClass.GenerateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmMethodDescriptorSupplier("Generate"))
              .build();
        }
      }
    }
    return getGenerateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.SpeechRequest,
      yeying.api.llm.LlmOuterClass.SpeechResponse> getSpeechMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Speech",
      requestType = yeying.api.llm.LlmOuterClass.SpeechRequest.class,
      responseType = yeying.api.llm.LlmOuterClass.SpeechResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.SpeechRequest,
      yeying.api.llm.LlmOuterClass.SpeechResponse> getSpeechMethod() {
    io.grpc.MethodDescriptor<yeying.api.llm.LlmOuterClass.SpeechRequest, yeying.api.llm.LlmOuterClass.SpeechResponse> getSpeechMethod;
    if ((getSpeechMethod = LlmGrpc.getSpeechMethod) == null) {
      synchronized (LlmGrpc.class) {
        if ((getSpeechMethod = LlmGrpc.getSpeechMethod) == null) {
          LlmGrpc.getSpeechMethod = getSpeechMethod =
              io.grpc.MethodDescriptor.<yeying.api.llm.LlmOuterClass.SpeechRequest, yeying.api.llm.LlmOuterClass.SpeechResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Speech"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.LlmOuterClass.SpeechRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.llm.LlmOuterClass.SpeechResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LlmMethodDescriptorSupplier("Speech"))
              .build();
        }
      }
    }
    return getSpeechMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LlmStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LlmStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LlmStub>() {
        @java.lang.Override
        public LlmStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LlmStub(channel, callOptions);
        }
      };
    return LlmStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static LlmBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LlmBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LlmBlockingV2Stub>() {
        @java.lang.Override
        public LlmBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LlmBlockingV2Stub(channel, callOptions);
        }
      };
    return LlmBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LlmBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LlmBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LlmBlockingStub>() {
        @java.lang.Override
        public LlmBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LlmBlockingStub(channel, callOptions);
        }
      };
    return LlmBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LlmFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LlmFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LlmFutureStub>() {
        @java.lang.Override
        public LlmFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LlmFutureStub(channel, callOptions);
        }
      };
    return LlmFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 不同语言的文字翻译工作
     * </pre>
     */
    default void translate(yeying.api.llm.LlmOuterClass.TranslateRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.TranslateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTranslateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 内容补全
     * </pre>
     */
    default void complete(yeying.api.llm.LlmOuterClass.CompleteRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.CompleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 编辑图片
     * </pre>
     */
    default void edit(yeying.api.llm.LlmOuterClass.EditRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.EditResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditMethod(), responseObserver);
    }

    /**
     * <pre>
     * 文本生成图片
     * </pre>
     */
    default void generate(yeying.api.llm.LlmOuterClass.GenerateRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.GenerateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 文本生语音
     * </pre>
     */
    default void speech(yeying.api.llm.LlmOuterClass.SpeechRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.SpeechResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpeechMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Llm.
   */
  public static abstract class LlmImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LlmGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Llm.
   */
  public static final class LlmStub
      extends io.grpc.stub.AbstractAsyncStub<LlmStub> {
    private LlmStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LlmStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LlmStub(channel, callOptions);
    }

    /**
     * <pre>
     * 不同语言的文字翻译工作
     * </pre>
     */
    public void translate(yeying.api.llm.LlmOuterClass.TranslateRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.TranslateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTranslateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 内容补全
     * </pre>
     */
    public void complete(yeying.api.llm.LlmOuterClass.CompleteRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.CompleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCompleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 编辑图片
     * </pre>
     */
    public void edit(yeying.api.llm.LlmOuterClass.EditRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.EditResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 文本生成图片
     * </pre>
     */
    public void generate(yeying.api.llm.LlmOuterClass.GenerateRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.GenerateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGenerateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 文本生语音
     * </pre>
     */
    public void speech(yeying.api.llm.LlmOuterClass.SpeechRequest request,
        io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.SpeechResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpeechMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Llm.
   */
  public static final class LlmBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<LlmBlockingV2Stub> {
    private LlmBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LlmBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LlmBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 不同语言的文字翻译工作
     * </pre>
     */
    public yeying.api.llm.LlmOuterClass.TranslateResponse translate(yeying.api.llm.LlmOuterClass.TranslateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTranslateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 内容补全
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, yeying.api.llm.LlmOuterClass.CompleteResponse>
        complete(yeying.api.llm.LlmOuterClass.CompleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getCompleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 编辑图片
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, yeying.api.llm.LlmOuterClass.EditResponse>
        edit(yeying.api.llm.LlmOuterClass.EditRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getEditMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 文本生成图片
     * </pre>
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, yeying.api.llm.LlmOuterClass.GenerateResponse>
        generate(yeying.api.llm.LlmOuterClass.GenerateRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getGenerateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 文本生语音
     * </pre>
     */
    public yeying.api.llm.LlmOuterClass.SpeechResponse speech(yeying.api.llm.LlmOuterClass.SpeechRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpeechMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Llm.
   */
  public static final class LlmBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LlmBlockingStub> {
    private LlmBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LlmBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LlmBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 不同语言的文字翻译工作
     * </pre>
     */
    public yeying.api.llm.LlmOuterClass.TranslateResponse translate(yeying.api.llm.LlmOuterClass.TranslateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTranslateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 内容补全
     * </pre>
     */
    public java.util.Iterator<yeying.api.llm.LlmOuterClass.CompleteResponse> complete(
        yeying.api.llm.LlmOuterClass.CompleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCompleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 编辑图片
     * </pre>
     */
    public java.util.Iterator<yeying.api.llm.LlmOuterClass.EditResponse> edit(
        yeying.api.llm.LlmOuterClass.EditRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEditMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 文本生成图片
     * </pre>
     */
    public java.util.Iterator<yeying.api.llm.LlmOuterClass.GenerateResponse> generate(
        yeying.api.llm.LlmOuterClass.GenerateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGenerateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 文本生语音
     * </pre>
     */
    public yeying.api.llm.LlmOuterClass.SpeechResponse speech(yeying.api.llm.LlmOuterClass.SpeechRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpeechMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Llm.
   */
  public static final class LlmFutureStub
      extends io.grpc.stub.AbstractFutureStub<LlmFutureStub> {
    private LlmFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LlmFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LlmFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 不同语言的文字翻译工作
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.llm.LlmOuterClass.TranslateResponse> translate(
        yeying.api.llm.LlmOuterClass.TranslateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTranslateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 文本生语音
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.llm.LlmOuterClass.SpeechResponse> speech(
        yeying.api.llm.LlmOuterClass.SpeechRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpeechMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSLATE = 0;
  private static final int METHODID_COMPLETE = 1;
  private static final int METHODID_EDIT = 2;
  private static final int METHODID_GENERATE = 3;
  private static final int METHODID_SPEECH = 4;

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
        case METHODID_TRANSLATE:
          serviceImpl.translate((yeying.api.llm.LlmOuterClass.TranslateRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.TranslateResponse>) responseObserver);
          break;
        case METHODID_COMPLETE:
          serviceImpl.complete((yeying.api.llm.LlmOuterClass.CompleteRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.CompleteResponse>) responseObserver);
          break;
        case METHODID_EDIT:
          serviceImpl.edit((yeying.api.llm.LlmOuterClass.EditRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.EditResponse>) responseObserver);
          break;
        case METHODID_GENERATE:
          serviceImpl.generate((yeying.api.llm.LlmOuterClass.GenerateRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.GenerateResponse>) responseObserver);
          break;
        case METHODID_SPEECH:
          serviceImpl.speech((yeying.api.llm.LlmOuterClass.SpeechRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.llm.LlmOuterClass.SpeechResponse>) responseObserver);
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
          getTranslateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.llm.LlmOuterClass.TranslateRequest,
              yeying.api.llm.LlmOuterClass.TranslateResponse>(
                service, METHODID_TRANSLATE)))
        .addMethod(
          getCompleteMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              yeying.api.llm.LlmOuterClass.CompleteRequest,
              yeying.api.llm.LlmOuterClass.CompleteResponse>(
                service, METHODID_COMPLETE)))
        .addMethod(
          getEditMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              yeying.api.llm.LlmOuterClass.EditRequest,
              yeying.api.llm.LlmOuterClass.EditResponse>(
                service, METHODID_EDIT)))
        .addMethod(
          getGenerateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              yeying.api.llm.LlmOuterClass.GenerateRequest,
              yeying.api.llm.LlmOuterClass.GenerateResponse>(
                service, METHODID_GENERATE)))
        .addMethod(
          getSpeechMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.llm.LlmOuterClass.SpeechRequest,
              yeying.api.llm.LlmOuterClass.SpeechResponse>(
                service, METHODID_SPEECH)))
        .build();
  }

  private static abstract class LlmBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LlmBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.llm.LlmOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Llm");
    }
  }

  private static final class LlmFileDescriptorSupplier
      extends LlmBaseDescriptorSupplier {
    LlmFileDescriptorSupplier() {}
  }

  private static final class LlmMethodDescriptorSupplier
      extends LlmBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LlmMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LlmGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LlmFileDescriptorSupplier())
              .addMethod(getTranslateMethod())
              .addMethod(getCompleteMethod())
              .addMethod(getEditMethod())
              .addMethod(getGenerateMethod())
              .addMethod(getSpeechMethod())
              .build();
        }
      }
    }
    return result;
  }
}
