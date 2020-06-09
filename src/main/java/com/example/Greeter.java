package com.example;

import greeter.GreeterGrpc;
import greeter.GreeterOuterClass;
import io.grpc.stub.StreamObserver;

public class Greeter extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(GreeterOuterClass.HelloRequest request, StreamObserver<GreeterOuterClass.HelloResponse> responseObserver) {
        responseObserver.onNext(GreeterOuterClass.HelloResponse.newBuilder().setGreeting(String.format("Hello, %s!", request.getName())).build());
        responseObserver.onCompleted();
    }
}
