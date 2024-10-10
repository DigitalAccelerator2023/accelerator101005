package com.digi.accelerator101005.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2024-10-10T18:54:26.707+05:30")

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
