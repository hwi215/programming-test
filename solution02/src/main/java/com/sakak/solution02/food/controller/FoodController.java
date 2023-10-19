package com.sakak.solution02.food.controller;

import com.sakak.solution02.food.dto.RequestFoodDto;
import com.sakak.solution02.food.dto.ResponseFoodDto;
import com.sakak.solution02.food.global.comm.BaseResponseDto;
import com.sakak.solution02.food.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<BaseResponseDto<List<ResponseFoodDto>>> getFoodInfo(@RequestBody RequestFoodDto dto){

        List<ResponseFoodDto> foodDtoList = foodService.getFoodList(dto);

        return ResponseEntity.status(HttpStatus.OK)
                .body(new BaseResponseDto<>(200, "success", foodDtoList));
    }


}
