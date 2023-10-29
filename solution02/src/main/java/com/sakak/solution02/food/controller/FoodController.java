package com.sakak.solution02.food.controller;

import com.sakak.solution02.food.dto.RequestFoodDto;
import com.sakak.solution02.food.dto.ResponseFoodDto;
import com.sakak.solution02.food.global.comm.BaseResponseDto;
import com.sakak.solution02.food.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;

    /**
     * 음식 정보 조회
     * POST: /v1/foods
     */
    @PostMapping("/v1/foods")
    @ResponseBody
    public ResponseEntity<BaseResponseDto<List<ResponseFoodDto>>> getFoodInfo(@RequestBody RequestFoodDto dto){

        List<ResponseFoodDto> foodDtoList = foodService.getFoodList(dto);

        return ResponseEntity.status(HttpStatus.OK)
                .body(new BaseResponseDto<>(200, "success", foodDtoList));
    }

    /**
     * 음식 정보 조회
     * Get: /v1/foods
     */
    @GetMapping("/v1/foods")
    @ResponseBody
    public ResponseEntity<BaseResponseDto<List<ResponseFoodDto>>> getFoodInfo(@RequestParam("food_name") String food_name,
                                                                              @RequestParam("research_year") String research_year,
                                                                              @RequestParam("maker_name") String maker_name,
                                                                              @RequestParam("food_code") String food_code){

        RequestFoodDto dto = new RequestFoodDto(food_name, research_year, maker_name, food_code);
        List<ResponseFoodDto> foodDtoList = foodService.getFoodList(dto);

        return ResponseEntity.status(HttpStatus.OK)
                .body(new BaseResponseDto<>(200, "success", foodDtoList));
    }


}
