package com.sakak.solution02.food.repository;

import com.sakak.solution02.food.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FoodRepository extends JpaRepository<Food, Long>, JpaSpecificationExecutor<Food> {
}
