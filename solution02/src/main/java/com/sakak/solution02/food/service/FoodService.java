package com.sakak.solution02.food.service;

import com.sakak.solution02.food.dto.RequestFoodDto;
import com.sakak.solution02.food.dto.ResponseFoodDto;
import com.sakak.solution02.food.entity.Food;
import com.sakak.solution02.food.exception.ExceptionEnum;
import com.sakak.solution02.food.exception.ApiException;
import com.sakak.solution02.food.repository.FoodRepository;
import com.sakak.solution02.food.repository.FoodSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    /**
     * food_name, research_year, maker_name, food_code에 해당하는
     * food 정보 조회
     */
    @Transactional
    public List<ResponseFoodDto> getFoodList(RequestFoodDto dto){


        // food_name
        Specification<Food> spec = Specification.where(FoodSpecification.equalFoodName(dto.getFood_name()));

        // research_year
        if(dto.getResearch_year() != null) {
            spec = spec.and(FoodSpecification.equalResearchYear(dto.getResearch_year()));
        }

        // maker_name
        if(dto.getMaker_name() != null) {
            spec = spec.and(FoodSpecification.equalMakerName(dto.getMaker_name()));
        }

        // food_code
        if(dto.getFood_code() != null) {
            spec = spec.and(FoodSpecification.equalFoodCode(dto.getFood_code()));
        }

        // 조건에 해당하는 음식 정보 조회
        List<Food> foodList = foodRepository.findAll(spec);

        // 예외 처리
        if(foodList.isEmpty()){
            throw new ApiException(ExceptionEnum.FOOD_NOT_EXIST_EXCEPTION);
        }

        // ResponseDto에 따라 데이터 가공
        List<ResponseFoodDto> dtoList = new ArrayList<>();
        for(Food food : foodList){
            dtoList.add(ResponseFoodDto.toDto(food));
        }

        return dtoList;
    }
}
