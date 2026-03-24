package com.devteria.hello_spring_boot.Respository;

import com.devteria.hello_spring_boot.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface productRepository extends JpaRepository<Products,Long> {

    List<Products> findProductsByBrand(String brand);
    List<Products>findByCategory_NameCategory(String nameCategory);
    List<Products>findProductsByNameProduct(String nameProduct);
    List<Products> findByCategory_NameCategoryAndBrand(String nameCategory,String brand);
    List<Products>findProductsByNameProductAndBrand(String nameProduct,String brand);
    Long countByBrandAndNameProduct(String brand,String nameProduct);
}
