package com.devteria.hello_spring_boot.Service.Products;

import com.devteria.hello_spring_boot.Entity.Products;
import com.devteria.hello_spring_boot.Request.AddProductRequest;
import com.devteria.hello_spring_boot.Request.UpdateProductRequest;
import com.devteria.hello_spring_boot.dto.ProductDto;

import java.util.List;

public interface IProductService {
    Products getProductById(Long id);
    List<Products> getProductByAll();
    List<Products> getProductByCategory(String category);
    List<Products> getProductByBrand(String brand);
    List<Products> getProductByNameProduct(String nameProduct);
    List<Products>getProductByCategoryAndBrand(String nameCategory,String brand);
    List<Products>getProductByNameProductAndBrand(String nameProduct,String brand);
    Long countByBrandAndNameProduct(String brand,String nameProduct);
    Products addProduct(AddProductRequest productRequest);
    Products updateProduct(UpdateProductRequest productRequest,Long id);
    void deleteProduct(Long id);
    List<ProductDto> getConvertedProducts(List<Products>products);
    ProductDto convertToDto(Products products);



}
