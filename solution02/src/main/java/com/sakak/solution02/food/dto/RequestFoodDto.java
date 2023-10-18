package com.sakak.solution02.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestFoodDto {
    private String food_name;
    private String research_year;
    private String maker_name;
    private String food_code;
}
