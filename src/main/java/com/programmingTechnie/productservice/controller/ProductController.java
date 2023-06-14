package com.programmingTechnie.productservice.controller;

import com.programmingTechnie.productservice.dto.ProductRequestDto;
import com.programmingTechnie.productservice.dto.ProductResponseDto;
import com.programmingTechnie.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/product")
public class ProductController {
    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void productCreated(@RequestBody ProductRequestDto productRequestDto) {
    productService.productCreated(productRequestDto);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponseDto> productCreated() {
       return productService.getAllProduct();
    }
}
