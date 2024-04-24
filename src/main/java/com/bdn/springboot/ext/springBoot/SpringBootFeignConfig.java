package com.bdn.springboot.ext.springBoot;

import com.bdn.springboot.ext.FeignLogger;
import com.bdn.springboot.ext.springBoot.listBarang.ListBarangApi;
import feign.Request;
import feign.Retryer;
import feign.codec.ErrorDecoder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SpringBootFeignConfig {
    @Value("${list.barang}")
    public String listBarangUrl;

    @Bean
    public ListBarangApi listBankApi() {
        return FeignLogger.builder()
                .retryer(new Retryer.Default())
                .errorDecoder(new ErrorDecoder.Default())
                .options(new Request.Options())
                .target(ListBarangApi.class, listBarangUrl);
    }
}