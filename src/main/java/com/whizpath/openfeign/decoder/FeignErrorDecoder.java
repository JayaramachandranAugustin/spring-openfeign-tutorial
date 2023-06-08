package com.whizpath.openfeign.decoder;

import com.whizpath.openfeign.exception.BadRequestException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder {


    @Override
    public Exception decode(String s, Response response) {
        switch (response.status()){
            case 400:
                return new BadRequestException("Bad request error from Book service");
            default:
                return new Exception("Generic error");
        }
    }
}
