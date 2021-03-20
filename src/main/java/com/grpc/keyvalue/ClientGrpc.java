package com.grpc.keyvalue;

import com.proto.key.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;


public class ClientGrpc {


        public static void main(String[] args) {
            System.out.println("abrir");
            ClientGrpc main = new ClientGrpc();
            main.run(() -> {});
        }

        private void run(Runnable runnable){
            System.out.println("++++++ Client running ++++++\n");
            System.out.println("******** Commands *******\n\n");
            System.out.println("put [key] [value]\n");
            System.out.println("get [key]\n");
            System.out.println("list \n");
            System.out.println("quit \n");
            System.out.println("INSERT COMMAND: \n\n\n");

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                    .usePlaintext()
                    .build();
            KeyServiceGrpc.KeyServiceBlockingStub clientGrpc = KeyServiceGrpc.newBlockingStub(channel);

            Scanner read = new Scanner(System.in);
            boolean quit = false;
            String[] splitCommand = read.nextLine().split("\\s+");
            String command = splitCommand[0];

           while (!quit) {

                switch (command) {
                    case "put":
                        // CREATE KEY
                        System.out.println("\n-------- put command -------");
                        System.out.println("********             *******\n");
                        PutResponse createUserResponse = clientGrpc.put(
                                Key_Value.newBuilder()
                                        .setKey(splitCommand[2])
                                        .setValue(splitCommand[1])
                                        .build()
                        );
                        System.out.println(createUserResponse);
                        break;
                    case "get":
                        // GET KEY
                        System.out.println("\n-------- Get Command -------");
                        System.out.println("********             *******\n");
                        Value getKeyResponse = clientGrpc.get(
                                Key.newBuilder().setKey(splitCommand[1]).build()
                        );
                        System.out.println("key: " + splitCommand[1] + " Value: " + getKeyResponse.getValue());
                        break;
                    case "list":
                        // LIST USERS
                        System.out.println("\n-------- list key -------");
                        System.out.println("********          *******\n");
                        clientGrpc.getAllKeys(Empty.newBuilder().build()).forEachRemaining(
                                listKeyResponse -> System.out.println("Key: " + listKeyResponse.getKey())
                        );
                        runnable.run();
                        break;
                    case "quit":
                        quit = true;


                }
                if(quit == false) {
                    splitCommand = read.nextLine().split("\\s+");
                    command = splitCommand[0];
                }
              }

//







        }
}
