#/bin/bash
protoc --proto_path=/src/main/protobuf/ --java_out=./src/main/java/ src/main/protobuf/Hello.proto