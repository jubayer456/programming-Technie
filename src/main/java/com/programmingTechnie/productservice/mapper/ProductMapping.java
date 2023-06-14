package com.programmingTechnie.productservice.mapper;

import com.programmingTechnie.productservice.dto.ProductRequestDto;
import com.programmingTechnie.productservice.dto.ProductResponseDto;
import com.programmingTechnie.productservice.entity.ProductEntity;

public class ProductMapping {
    public static ProductEntity ProductRequestDtoToEntity(ProductRequestDto productRequestDto){
        return ProductEntity.builder()
                .name(productRequestDto.getName())
                .description(productRequestDto.getDescription())
                .price((productRequestDto.getPrice()))
                .build();
    }
    public static ProductResponseDto ProductEntityToDto(ProductEntity productEntity){
        return ProductResponseDto.builder()
                .productId(productEntity.getProductId())
                .name(productEntity.getName())
                .description(productEntity.getDescription())
                .price((productEntity.getPrice()))
                .build();
    }
}
