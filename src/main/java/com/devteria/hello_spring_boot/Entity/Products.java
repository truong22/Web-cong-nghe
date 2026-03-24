package com.devteria.hello_spring_boot.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Products {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameProduct;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id")
    public Category category;
    @OneToMany(mappedBy = "products",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<image>images;


    public Products(String nameProduct, String brand, BigDecimal price, int inventory, String description, Category category) {
        this.nameProduct = nameProduct;
        this.brand = brand;
        this.price = price;
        this.inventory = inventory;
        this.description = description;
        this.category = category;
    }

}
