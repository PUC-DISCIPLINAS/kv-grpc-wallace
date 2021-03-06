package com.grpc.keyvalue;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class ServerGrpc {


    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("----- Server start -----");
        System.out.println("****               *****\n\n");
        Server server = ServerBuilder.forPort(50051).addService(new KeyServiceImpl())
                .build();
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            server.shutdown();
        }));
        server.awaitTermination();
    }

}

