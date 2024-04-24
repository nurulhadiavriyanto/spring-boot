package com.bdn.springboot.ext.springBoot.listBarang.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListBarangResponse {
    private String status;
    private String message;
    //private String errorMessage;
    private PaginationContentResponse data;
}