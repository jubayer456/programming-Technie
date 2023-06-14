package com.programmingTechnie.productservice.service.Imp;

import com.programmingTechnie.productservice.dto.ProductRequestDto;
import com.programmingTechnie.productservice.dto.ProductResponseDto;
import com.programmingTechnie.productservice.entity.ProductEntity;
import com.programmingTechnie.productservice.mapper.ProductMapping;
import com.programmingTechnie.productservice.repository.ProductRepository;
import com.programmingTechnie.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {
private final ProductRepository productRepository;
    @Override
    public void productCreated(ProductRequestDto productRequestDto) {
        ProductEntity product= ProductMapping.ProductRequestDtoToEntity(productRequestDto);
        productRepository.save(product);
    }

    @Override
    public List<ProductResponseDto> getAllProduct() {
        List<ProductEntity> products=productRepository.findAll();
        return products.stream().map(ProductMapping::ProductEntityToDto).toList();
    }
}
