package com.digi.accelerator101005.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-10-10T18:54:26.707+05:30")

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
