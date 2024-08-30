package com.bhupesh.productservice.dto;

import lombok.Builder;

@Builder
public record ProductRequest(
        String name,
        String description,
        Double price,
        String skuCode
) {
}