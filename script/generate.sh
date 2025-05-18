protoc --proto_path=../yeying-idl \
       --java_out=src/main/java \
       --grpc-java_out=src/main/java \
       ../yeying-idl/yeying/api/**/*.proto


protoc --proto_path=../yeying-idl \
       --java_out=src/main/java \
       --grpc-java_out=src/main/java \
       ../yeying-idl/yeying/api/apps/zuoyepigai/*.proto


mvn clean install

