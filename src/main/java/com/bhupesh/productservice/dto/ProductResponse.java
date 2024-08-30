package com.bhupesh.productservice.dto;

import lombok.Builder;

@Builder
public record ProductResponse(
        String id,
        String name,
        String description,
        Double price,
        String skuCode
) {
}
