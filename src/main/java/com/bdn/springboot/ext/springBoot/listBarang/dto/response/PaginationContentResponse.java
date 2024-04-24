package com.bdn.springboot.ext.springBoot.listBarang.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaginationContentResponse {
    private List<BarangContentResponse> content;
    private PageableContent pageable;
    private BigDecimal totalElements;
    private BigDecimal totalPages;
    private boolean last;
    private BigDecimal size;
    private BigDecimal number;
    private PageableContent.SortContent sort;
    private BigDecimal numberOfElements;
    private boolean first;
    private boolean empty;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PageableContent {
        private BigDecimal pageNumber;
        private BigDecimal pageSize;
        private SortContent sort;
        private BigDecimal offset;
        private boolean paged;
        private boolean unpaged;

        @Data
        @Builder
        @AllArgsConstructor
        @NoArgsConstructor
        public static class SortContent {
            private boolean empty;
            private boolean unsorted;
            private boolean sorted;
        }
    }
}
