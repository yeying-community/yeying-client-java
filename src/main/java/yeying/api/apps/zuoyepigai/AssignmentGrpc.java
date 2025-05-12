package yeying.api.apps.zuoyepigai;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 *作业管理
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: yeying/api/apps/zuoyepigai/assignment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssignmentGrpc {

  private AssignmentGrpc() {}

  public static final java.lang.String SERVICE_NAME = "yeying.api.apps.zuoyepigai.Assignment";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest,
      yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest.class,
      responseType = yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest,
      yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse> getUploadMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest, yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse> getUploadMethod;
    if ((getUploadMethod = AssignmentGrpc.getUploadMethod) == null) {
      synchronized (AssignmentGrpc.class) {
        if ((getUploadMethod = AssignmentGrpc.getUploadMethod) == null) {
          AssignmentGrpc.getUploadMethod = getUploadMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest, yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssignmentMethodDescriptorSupplier("Upload"))
              .build();
        }
      }
    }
    return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest,
      yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse> getBigModelGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BigModelGenerate",
      requestType = yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest.class,
      responseType = yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest,
      yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse> getBigModelGenerateMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest, yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse> getBigModelGenerateMethod;
    if ((getBigModelGenerateMethod = AssignmentGrpc.getBigModelGenerateMethod) == null) {
      synchronized (AssignmentGrpc.class) {
        if ((getBigModelGenerateMethod = AssignmentGrpc.getBigModelGenerateMethod) == null) {
          AssignmentGrpc.getBigModelGenerateMethod = getBigModelGenerateMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest, yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BigModelGenerate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssignmentMethodDescriptorSupplier("BigModelGenerate"))
              .build();
        }
      }
    }
    return getBigModelGenerateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest,
      yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse> getArtificialGenerateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArtificialGenerate",
      requestType = yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest.class,
      responseType = yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest,
      yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse> getArtificialGenerateMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest, yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse> getArtificialGenerateMethod;
    if ((getArtificialGenerateMethod = AssignmentGrpc.getArtificialGenerateMethod) == null) {
      synchronized (AssignmentGrpc.class) {
        if ((getArtificialGenerateMethod = AssignmentGrpc.getArtificialGenerateMethod) == null) {
          AssignmentGrpc.getArtificialGenerateMethod = getArtificialGenerateMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest, yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArtificialGenerate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssignmentMethodDescriptorSupplier("ArtificialGenerate"))
              .build();
        }
      }
    }
    return getArtificialGenerateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest,
      yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse> getStudentActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StudentAction",
      requestType = yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest.class,
      responseType = yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest,
      yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse> getStudentActionMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest, yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse> getStudentActionMethod;
    if ((getStudentActionMethod = AssignmentGrpc.getStudentActionMethod) == null) {
      synchronized (AssignmentGrpc.class) {
        if ((getStudentActionMethod = AssignmentGrpc.getStudentActionMethod) == null) {
          AssignmentGrpc.getStudentActionMethod = getStudentActionMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest, yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StudentAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssignmentMethodDescriptorSupplier("StudentAction"))
              .build();
        }
      }
    }
    return getStudentActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest,
      yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse> getCorrectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Correction",
      requestType = yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest.class,
      responseType = yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest,
      yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse> getCorrectionMethod() {
    io.grpc.MethodDescriptor<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest, yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse> getCorrectionMethod;
    if ((getCorrectionMethod = AssignmentGrpc.getCorrectionMethod) == null) {
      synchronized (AssignmentGrpc.class) {
        if ((getCorrectionMethod = AssignmentGrpc.getCorrectionMethod) == null) {
          AssignmentGrpc.getCorrectionMethod = getCorrectionMethod =
              io.grpc.MethodDescriptor.<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest, yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Correction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssignmentMethodDescriptorSupplier("Correction"))
              .build();
        }
      }
    }
    return getCorrectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssignmentStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssignmentStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssignmentStub>() {
        @java.lang.Override
        public AssignmentStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssignmentStub(channel, callOptions);
        }
      };
    return AssignmentStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AssignmentBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssignmentBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssignmentBlockingV2Stub>() {
        @java.lang.Override
        public AssignmentBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssignmentBlockingV2Stub(channel, callOptions);
        }
      };
    return AssignmentBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssignmentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssignmentBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssignmentBlockingStub>() {
        @java.lang.Override
        public AssignmentBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssignmentBlockingStub(channel, callOptions);
        }
      };
    return AssignmentBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssignmentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssignmentFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssignmentFutureStub>() {
        @java.lang.Override
        public AssignmentFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssignmentFutureStub(channel, callOptions);
        }
      };
    return AssignmentFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   *作业管理
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 老师上传作业, 图片题目识别 (OCR)，将图片上的题目转换为文字信息存储到 DB
     * 对应 DB 表：
     * zuoyepigai.test_paper，试卷
     * zuoyepigai.question_collection，题目
     * zuoyepigai.answer_collection，答案
     * zuoyepigai.warehouse，资产仓库
     * </pre>
     */
    default void upload(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * 大模型生成答案 (做题)，从题库中获取题目，调用解题的大模型生成对应题目的答案，并保存到 DB
     * 对应 DB 表：
     * zuoyepigai.test_paper，试卷
     * zuoyepigai.question_collection，题目
     * zuoyepigai.answer_collection，答案
     * zuoyepigai.warehouse，资产仓库
     * </pre>
     */
    default void bigModelGenerate(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBigModelGenerateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 人工生成答案，人工做题，拍照上传生成题库答案
     * </pre>
     */
    default void artificialGenerate(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArtificialGenerateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 学生加减，该任务对那些学生可见和不可见，老师可以自己来调整
     * </pre>
     */
    default void studentAction(yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStudentActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * 作业批改，学生做完试卷后提交给老师，老师统一拍照上传批改处理
     * </pre>
     */
    default void correction(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCorrectionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Assignment.
   * <pre>
   **
   *作业管理
   * </pre>
   */
  public static abstract class AssignmentImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AssignmentGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Assignment.
   * <pre>
   **
   *作业管理
   * </pre>
   */
  public static final class AssignmentStub
      extends io.grpc.stub.AbstractAsyncStub<AssignmentStub> {
    private AssignmentStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssignmentStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssignmentStub(channel, callOptions);
    }

    /**
     * <pre>
     * 老师上传作业, 图片题目识别 (OCR)，将图片上的题目转换为文字信息存储到 DB
     * 对应 DB 表：
     * zuoyepigai.test_paper，试卷
     * zuoyepigai.question_collection，题目
     * zuoyepigai.answer_collection，答案
     * zuoyepigai.warehouse，资产仓库
     * </pre>
     */
    public void upload(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 大模型生成答案 (做题)，从题库中获取题目，调用解题的大模型生成对应题目的答案，并保存到 DB
     * 对应 DB 表：
     * zuoyepigai.test_paper，试卷
     * zuoyepigai.question_collection，题目
     * zuoyepigai.answer_collection，答案
     * zuoyepigai.warehouse，资产仓库
     * </pre>
     */
    public void bigModelGenerate(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBigModelGenerateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 人工生成答案，人工做题，拍照上传生成题库答案
     * </pre>
     */
    public void artificialGenerate(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArtificialGenerateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 学生加减，该任务对那些学生可见和不可见，老师可以自己来调整
     * </pre>
     */
    public void studentAction(yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStudentActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 作业批改，学生做完试卷后提交给老师，老师统一拍照上传批改处理
     * </pre>
     */
    public void correction(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest request,
        io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCorrectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Assignment.
   * <pre>
   **
   *作业管理
   * </pre>
   */
  public static final class AssignmentBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AssignmentBlockingV2Stub> {
    private AssignmentBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssignmentBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssignmentBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 老师上传作业, 图片题目识别 (OCR)，将图片上的题目转换为文字信息存储到 DB
     * 对应 DB 表：
     * zuoyepigai.test_paper，试卷
     * zuoyepigai.question_collection，题目
     * zuoyepigai.answer_collection，答案
     * zuoyepigai.warehouse，资产仓库
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse upload(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 大模型生成答案 (做题)，从题库中获取题目，调用解题的大模型生成对应题目的答案，并保存到 DB
     * 对应 DB 表：
     * zuoyepigai.test_paper，试卷
     * zuoyepigai.question_collection，题目
     * zuoyepigai.answer_collection，答案
     * zuoyepigai.warehouse，资产仓库
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse bigModelGenerate(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBigModelGenerateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 人工生成答案，人工做题，拍照上传生成题库答案
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse artificialGenerate(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArtificialGenerateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 学生加减，该任务对那些学生可见和不可见，老师可以自己来调整
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse studentAction(yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStudentActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 作业批改，学生做完试卷后提交给老师，老师统一拍照上传批改处理
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse correction(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCorrectionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Assignment.
   * <pre>
   **
   *作业管理
   * </pre>
   */
  public static final class AssignmentBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AssignmentBlockingStub> {
    private AssignmentBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssignmentBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssignmentBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 老师上传作业, 图片题目识别 (OCR)，将图片上的题目转换为文字信息存储到 DB
     * 对应 DB 表：
     * zuoyepigai.test_paper，试卷
     * zuoyepigai.question_collection，题目
     * zuoyepigai.answer_collection，答案
     * zuoyepigai.warehouse，资产仓库
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse upload(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 大模型生成答案 (做题)，从题库中获取题目，调用解题的大模型生成对应题目的答案，并保存到 DB
     * 对应 DB 表：
     * zuoyepigai.test_paper，试卷
     * zuoyepigai.question_collection，题目
     * zuoyepigai.answer_collection，答案
     * zuoyepigai.warehouse，资产仓库
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse bigModelGenerate(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBigModelGenerateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 人工生成答案，人工做题，拍照上传生成题库答案
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse artificialGenerate(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArtificialGenerateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 学生加减，该任务对那些学生可见和不可见，老师可以自己来调整
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse studentAction(yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStudentActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 作业批改，学生做完试卷后提交给老师，老师统一拍照上传批改处理
     * </pre>
     */
    public yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse correction(yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCorrectionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Assignment.
   * <pre>
   **
   *作业管理
   * </pre>
   */
  public static final class AssignmentFutureStub
      extends io.grpc.stub.AbstractFutureStub<AssignmentFutureStub> {
    private AssignmentFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssignmentFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssignmentFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 老师上传作业, 图片题目识别 (OCR)，将图片上的题目转换为文字信息存储到 DB
     * 对应 DB 表：
     * zuoyepigai.test_paper，试卷
     * zuoyepigai.question_collection，题目
     * zuoyepigai.answer_collection，答案
     * zuoyepigai.warehouse，资产仓库
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse> upload(
        yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 大模型生成答案 (做题)，从题库中获取题目，调用解题的大模型生成对应题目的答案，并保存到 DB
     * 对应 DB 表：
     * zuoyepigai.test_paper，试卷
     * zuoyepigai.question_collection，题目
     * zuoyepigai.answer_collection，答案
     * zuoyepigai.warehouse，资产仓库
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse> bigModelGenerate(
        yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBigModelGenerateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 人工生成答案，人工做题，拍照上传生成题库答案
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse> artificialGenerate(
        yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArtificialGenerateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 学生加减，该任务对那些学生可见和不可见，老师可以自己来调整
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse> studentAction(
        yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStudentActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 作业批改，学生做完试卷后提交给老师，老师统一拍照上传批改处理
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse> correction(
        yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCorrectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD = 0;
  private static final int METHODID_BIG_MODEL_GENERATE = 1;
  private static final int METHODID_ARTIFICIAL_GENERATE = 2;
  private static final int METHODID_STUDENT_ACTION = 3;
  private static final int METHODID_CORRECTION = 4;

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
        case METHODID_UPLOAD:
          serviceImpl.upload((yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse>) responseObserver);
          break;
        case METHODID_BIG_MODEL_GENERATE:
          serviceImpl.bigModelGenerate((yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse>) responseObserver);
          break;
        case METHODID_ARTIFICIAL_GENERATE:
          serviceImpl.artificialGenerate((yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse>) responseObserver);
          break;
        case METHODID_STUDENT_ACTION:
          serviceImpl.studentAction((yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse>) responseObserver);
          break;
        case METHODID_CORRECTION:
          serviceImpl.correction((yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest) request,
              (io.grpc.stub.StreamObserver<yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse>) responseObserver);
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
          getUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadRequest,
              yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentUploadResponse>(
                service, METHODID_UPLOAD)))
        .addMethod(
          getBigModelGenerateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelRequest,
              yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentBigModelResponse>(
                service, METHODID_BIG_MODEL_GENERATE)))
        .addMethod(
          getArtificialGenerateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialRequest,
              yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentArtificialResponse>(
                service, METHODID_ARTIFICIAL_GENERATE)))
        .addMethod(
          getStudentActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionRequest,
              yeying.api.apps.zuoyepigai.AssignmentOuterClass.StudentActionResponse>(
                service, METHODID_STUDENT_ACTION)))
        .addMethod(
          getCorrectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionRequest,
              yeying.api.apps.zuoyepigai.AssignmentOuterClass.AssignmentCorrectionResponse>(
                service, METHODID_CORRECTION)))
        .build();
  }

  private static abstract class AssignmentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssignmentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return yeying.api.apps.zuoyepigai.AssignmentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Assignment");
    }
  }

  private static final class AssignmentFileDescriptorSupplier
      extends AssignmentBaseDescriptorSupplier {
    AssignmentFileDescriptorSupplier() {}
  }

  private static final class AssignmentMethodDescriptorSupplier
      extends AssignmentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AssignmentMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AssignmentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssignmentFileDescriptorSupplier())
              .addMethod(getUploadMethod())
              .addMethod(getBigModelGenerateMethod())
              .addMethod(getArtificialGenerateMethod())
              .addMethod(getStudentActionMethod())
              .addMethod(getCorrectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
