package com.whizpath.openfeign.config;

import com.whizpath.openfeign.decoder.FeignErrorDecoder;
import feign.Logger;
import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class BookClientConfig1 {
    @Bean
    Logger.Level feignLoggerLevel(){
        return  Logger.Level.FULL;
    }
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptorBookService(@Value("${book-service-client.username}") String username,
                                                                              @Value("${book-service-client.password}") String password){
        System.out.println("basicAuthRequestInterceptorBookService");
        return new BasicAuthRequestInterceptor(username,password);
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new FeignErrorDecoder();
    }
    @Bean
    public RequestInterceptor requestInterceptor(@Value("${book-service-client.username}") String username,
                                                 @Value("${book-service-client.password}") String password) {
        return requestTemplate -> {
            requestTemplate.header("user", username);
            requestTemplate.header("password", password);
        };
    }
}
