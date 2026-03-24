package com.devteria.hello_spring_boot.Request;

import com.devteria.hello_spring_boot.Entity.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdateProductRequest {
    private Long id;
    private String nameProduct;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
