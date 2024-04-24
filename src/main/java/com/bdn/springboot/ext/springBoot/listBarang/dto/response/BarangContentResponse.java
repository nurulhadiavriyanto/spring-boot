package com.bdn.springboot.ext.springBoot.listBarang.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BarangContentResponse {
    private String id;
    private String nama;
    private BigDecimal jumlah;
    private String kedaluwarsa;
    private String insertDate;
    private String lastUpdate;
}
