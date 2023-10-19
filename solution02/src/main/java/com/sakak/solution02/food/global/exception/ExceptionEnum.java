package com.sakak.solution02.food.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ExceptionEnum {
    FOOD_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "F0001", "해당 정보가 존재하지 않습니다.");

    //FOOD_NAME_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "F0002", "해당 음식 이름을 가진 정보가 존재하지 않습니다."),
    //FOOD_RESEARCH_YEAR_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "F0003", "연도를 가진 정보가 존재하지 않습니다."),
    //FOOD_MAKER_NAME_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "F0004", "해당 지역/제조사에 해당하 정보가 존재하지 않습니다."),

    //FOOD_CODE_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, "F0005", "해당 식품코드를 가진 정보가 존재하지 않습니다.");

    private final HttpStatus status;
    private final String code;
    private final String message;
}
