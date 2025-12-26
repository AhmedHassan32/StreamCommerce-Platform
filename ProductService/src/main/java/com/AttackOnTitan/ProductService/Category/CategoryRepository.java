package com.AttackOnTitan.ProductService.Category;

import com.AttackOnTitan.ProductService.Category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
