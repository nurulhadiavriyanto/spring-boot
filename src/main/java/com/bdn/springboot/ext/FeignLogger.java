package com.bdn.springboot.ext;

import feign.Feign;
import feign.Logger;
import feign.RequestInterceptor;
import feign.Retryer;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public final class FeignLogger {
    public static Feign.Builder builder() {
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .retryer(Retryer.NEVER_RETRY)
                .logLevel(Logger.Level.FULL);
    }

    public static Feign.Builder builder(Logger logger) {
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(logger)
                .retryer(Retryer.NEVER_RETRY)
                .logLevel(Logger.Level.FULL);
    }

    public static Feign.Builder builder(Logger logger, RequestInterceptor requestInterceptor) {
        return Feign.builder()
                .requestInterceptor(requestInterceptor)
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(logger)
                .retryer(Retryer.NEVER_RETRY)
                .logLevel(Logger.Level.FULL);
    }
}
