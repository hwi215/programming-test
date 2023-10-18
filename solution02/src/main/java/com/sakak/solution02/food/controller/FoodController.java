package com.sakak.solution02.food.controller;

import com.sakak.solution02.food.dto.RequestFoodDto;
import com.sakak.solution02.food.dto.ResponseFoodDto;
import com.sakak.solution02.food.entity.Food;
import com.sakak.solution02.food.repository.FoodRepository;
import com.sakak.solution02.food.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;

    /**
     * 음식 정보 조회
     * POST: /foods
     */
    @PostMapping("/foods")
    @ResponseBody
    public List<ResponseFoodDto> getInfo(@RequestBody RequestFoodDto dto){

        List<ResponseFoodDto> foodDtoList = foodService.getFoodList(dto);

        return foodDtoList;
    }


}
