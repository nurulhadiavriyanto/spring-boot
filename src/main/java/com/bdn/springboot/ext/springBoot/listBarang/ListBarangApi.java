package com.bdn.springboot.ext.springBoot.listBarang;

import com.bdn.springboot.ext.springBoot.listBarang.dto.response.ListBarangResponse;
import feign.RequestLine;

public interface ListBarangApi {
    @RequestLine("GET")
    ListBarangResponse listBarang();
}
