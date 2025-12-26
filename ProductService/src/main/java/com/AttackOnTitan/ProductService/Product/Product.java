package com.AttackOnTitan.ProductService.Product;

import com.AttackOnTitan.ProductService.Category.Category;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    private Integer quantity;

    private Integer price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
