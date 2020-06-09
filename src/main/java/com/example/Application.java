package com.example;

import io.grpc.ServerBuilder;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerBuilder.forPort(1972).addService(new Greeter()).build().start().awaitTermination();
    }
}
