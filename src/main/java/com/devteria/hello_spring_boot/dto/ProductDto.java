package com.devteria.hello_spring_boot.dto;

import com.devteria.hello_spring_boot.Entity.Category;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {
    private Long id;
    private String nameProduct;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
    private List<ImageDto>imageDtos;
}
