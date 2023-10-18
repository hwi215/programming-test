package com.sakak.solution02.food.repository;

import com.sakak.solution02.food.entity.Food;
import org.springframework.data.jpa.domain.Specification;

public class FoodSpecification{
    public static Specification<Food> equalFoodName(String foodName) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("food_name"), foodName);
    }

    public static Specification<Food> equalResearchYear(String researchYear) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("research_year"), researchYear);
    }

    public static Specification<Food> equalMakerName(String makerName) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("maker_name"), makerName);
    }

    public static Specification<Food> equalFoodCode(String foodCode) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("food_cd"), foodCode);
    }
}
