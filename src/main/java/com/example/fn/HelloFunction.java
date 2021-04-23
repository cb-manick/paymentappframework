package com.example.fn;

import com.fnproject.fn.api.httpgateway.HTTPGatewayContext;

public class HelloFunction {

    // HTTPGatewayContext context,
    public Message handleRequest(HTTPGatewayContext context,Message input) {

        String name = (input == null || input.getMessage().isEmpty()) ? "world"  : input.getMessage();
        return new Message("hello" + ", " + name + "!");
    }

}