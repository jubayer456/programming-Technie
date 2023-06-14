package com.programmingTechnie.productservice.service;

import com.programmingTechnie.productservice.dto.ProductRequestDto;
import com.programmingTechnie.productservice.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {
    void productCreated(ProductRequestDto productRequestDto);

    List<ProductResponseDto> getAllProduct();
}
