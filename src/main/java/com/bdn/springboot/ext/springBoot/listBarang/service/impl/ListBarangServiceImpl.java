package com.bdn.springboot.ext.springBoot.listBarang.service.impl;

import com.bdn.springboot.ext.springBoot.listBarang.ListBarangApi;
import com.bdn.springboot.ext.springBoot.listBarang.dto.response.ListBarangResponse;
import com.bdn.springboot.ext.springBoot.listBarang.service.ListBarangService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ListBarangServiceImpl implements ListBarangService {
    private final ListBarangApi api;

    @Override
    public ListBarangResponse listBarang() {
        return api.listBarang();
    }
}
