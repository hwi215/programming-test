package com.sakak.solution02.food.dto;

import com.sakak.solution02.food.entity.Food;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseFoodDto {

    private String id;
    private String food_cd;

    private String group_name;
    private String food_name;

    private String research_year;
    private String maker_name;

    private String ref_name;
    private String serving_size;
    private String calorie;
    private String carbohydrate;
    private String protein;
    private String province;
    private String sugars;

    private String salt;
    private String cholesterol;
    private String saturated_fatty_acids;
    private String trans_fat;

    public static ResponseFoodDto toDto(Food food){
        return ResponseFoodDto.builder()
                .id(food.getId())
                .food_cd(food.getFood_cd())
                .group_name(food.getGroup_name())
                .food_name(food.getFood_name())
                .research_year(food.getResearch_year())
                .maker_name(food.getMaker_name())
                .ref_name(food.getRef_name())
                .serving_size(food.getServing_size())
                .calorie(food.getCalorie())
                .carbohydrate(food.getCarbohydrate())
                .protein(food.getProtein())
                .province(food.getProvince())
                .sugars(food.getSugars())
                .salt(food.getSalt())
                .cholesterol(food.getCholesterol())
                .saturated_fatty_acids(food.getSaturated_fatty_acids())
                .trans_fat(food.getTrans_fat())
                .build();
    }

}
