package com.proto.key;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: KeyProto.proto")
public final class KeyServiceGrpc {

  private KeyServiceGrpc() {}

  public static final String SERVICE_NAME = "master.KeyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.key.Key_Value,
      com.proto.key.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = com.proto.key.Key_Value.class,
      responseType = com.proto.key.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.key.Key_Value,
      com.proto.key.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<com.proto.key.Key_Value, com.proto.key.PutResponse> getPutMethod;
    if ((getPutMethod = KeyServiceGrpc.getPutMethod) == null) {
      synchronized (KeyServiceGrpc.class) {
        if ((getPutMethod = KeyServiceGrpc.getPutMethod) == null) {
          KeyServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<com.proto.key.Key_Value, com.proto.key.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.key.Key_Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.key.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeyServiceMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.key.Key,
      com.proto.key.Value> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.proto.key.Key.class,
      responseType = com.proto.key.Value.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.key.Key,
      com.proto.key.Value> getGetMethod() {
    io.grpc.MethodDescriptor<com.proto.key.Key, com.proto.key.Value> getGetMethod;
    if ((getGetMethod = KeyServiceGrpc.getGetMethod) == null) {
      synchronized (KeyServiceGrpc.class) {
        if ((getGetMethod = KeyServiceGrpc.getGetMethod) == null) {
          KeyServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.proto.key.Key, com.proto.key.Value>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.key.Key.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.key.Value.getDefaultInstance()))
              .setSchemaDescriptor(new KeyServiceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.key.Empty,
      com.proto.key.ListKeys> getGetAllKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllKeys",
      requestType = com.proto.key.Empty.class,
      responseType = com.proto.key.ListKeys.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.key.Empty,
      com.proto.key.ListKeys> getGetAllKeysMethod() {
    io.grpc.MethodDescriptor<com.proto.key.Empty, com.proto.key.ListKeys> getGetAllKeysMethod;
    if ((getGetAllKeysMethod = KeyServiceGrpc.getGetAllKeysMethod) == null) {
      synchronized (KeyServiceGrpc.class) {
        if ((getGetAllKeysMethod = KeyServiceGrpc.getGetAllKeysMethod) == null) {
          KeyServiceGrpc.getGetAllKeysMethod = getGetAllKeysMethod =
              io.grpc.MethodDescriptor.<com.proto.key.Empty, com.proto.key.ListKeys>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.key.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.key.ListKeys.getDefaultInstance()))
              .setSchemaDescriptor(new KeyServiceMethodDescriptorSupplier("getAllKeys"))
              .build();
        }
      }
    }
    return getGetAllKeysMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyServiceStub>() {
        @java.lang.Override
        public KeyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyServiceStub(channel, callOptions);
        }
      };
    return KeyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyServiceBlockingStub>() {
        @java.lang.Override
        public KeyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyServiceBlockingStub(channel, callOptions);
        }
      };
    return KeyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeyServiceFutureStub>() {
        @java.lang.Override
        public KeyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeyServiceFutureStub(channel, callOptions);
        }
      };
    return KeyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void put(com.proto.key.Key_Value request,
        io.grpc.stub.StreamObserver<com.proto.key.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void get(com.proto.key.Key request,
        io.grpc.stub.StreamObserver<com.proto.key.Value> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void getAllKeys(com.proto.key.Empty request,
        io.grpc.stub.StreamObserver<com.proto.key.ListKeys> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllKeysMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.key.Key_Value,
                com.proto.key.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.key.Key,
                com.proto.key.Value>(
                  this, METHODID_GET)))
          .addMethod(
            getGetAllKeysMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.key.Empty,
                com.proto.key.ListKeys>(
                  this, METHODID_GET_ALL_KEYS)))
          .build();
    }
  }

  /**
   */
  public static final class KeyServiceStub extends io.grpc.stub.AbstractAsyncStub<KeyServiceStub> {
    private KeyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyServiceStub(channel, callOptions);
    }

    /**
     */
    public void put(com.proto.key.Key_Value request,
        io.grpc.stub.StreamObserver<com.proto.key.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.proto.key.Key request,
        io.grpc.stub.StreamObserver<com.proto.key.Value> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllKeys(com.proto.key.Empty request,
        io.grpc.stub.StreamObserver<com.proto.key.ListKeys> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllKeysMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeyServiceBlockingStub> {
    private KeyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.key.PutResponse put(com.proto.key.Key_Value request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.key.Value get(com.proto.key.Key request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.key.ListKeys> getAllKeys(
        com.proto.key.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllKeysMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeyServiceFutureStub> {
    private KeyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.key.PutResponse> put(
        com.proto.key.Key_Value request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.key.Value> get(
        com.proto.key.Key request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_GET_ALL_KEYS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((com.proto.key.Key_Value) request,
              (io.grpc.stub.StreamObserver<com.proto.key.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.proto.key.Key) request,
              (io.grpc.stub.StreamObserver<com.proto.key.Value>) responseObserver);
          break;
        case METHODID_GET_ALL_KEYS:
          serviceImpl.getAllKeys((com.proto.key.Empty) request,
              (io.grpc.stub.StreamObserver<com.proto.key.ListKeys>) responseObserver);
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

  private static abstract class KeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.key.KeyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyService");
    }
  }

  private static final class KeyServiceFileDescriptorSupplier
      extends KeyServiceBaseDescriptorSupplier {
    KeyServiceFileDescriptorSupplier() {}
  }

  private static final class KeyServiceMethodDescriptorSupplier
      extends KeyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyServiceFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetAllKeysMethod())
              .build();
        }
      }
    }
    return result;
  }
}
