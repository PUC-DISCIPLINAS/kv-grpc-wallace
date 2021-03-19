package com.grpc.keyvalue;

import com.proto.key.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

public class KeyServiceImpl extends KeyServiceGrpc.KeyServiceImplBase {
    ArrayList<KeyValue> collects = new ArrayList<KeyValue>();

    @Override
    public void put(Key_Value request, StreamObserver<PutResponse> responseObserver) {
        KeyValue k = new KeyValue(request.getValue(), request.getKey());
        collects.add(k);
        PutResponse res = PutResponse.newBuilder().setRes("Insert sucessfull").build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void get(Key request, StreamObserver<Value> responseObserver) {
        Value res = Value.newBuilder().setValue("Não Encontrado").build();;
        for(KeyValue x : collects) {
            if(x.key.equals(request.getKey())) {
                 res = Value.newBuilder().setValue(x.value).build();
            }
        }
        System.out.println("Get Command");
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllKeys(Empty request, StreamObserver<ListKeys> responseObserver) {
        System.out.println("Streaming users");
        collects.iterator().forEachRemaining(document -> responseObserver.onNext(
                ListKeys.newBuilder()
                        .setKey(document.key)
                        .build()
        ));
        responseObserver.onCompleted();
    }
}
