package com.service.service2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-11-24T05:34:42.082Z")

@RpcSchema(schemaId = "service2")
public class Service2Impl implements Service2{

    @Autowired
    private Service2Delegate service2Delegate;


    public String helloworld(String name) {

        return service2Delegate.helloworld(name);
    }

}
