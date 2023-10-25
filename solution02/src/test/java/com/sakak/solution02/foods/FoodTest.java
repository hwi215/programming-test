package com.sakak.solution02.foods;
import com.sakak.solution02.food.dto.RequestFoodDto;
import com.sakak.solution02.food.dto.ResponseFoodDto;
import com.sakak.solution02.food.service.FoodService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import javax.transaction.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class FoodTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Get Method Test")
    void getTest() throws Exception {
        // api 요청
        mockMvc
                .perform(
                        get("/foods") // url
                                .param("food_name", "김치국") // parameter 1
                                .param("research_year", "2019") // parameter 2
                                .param("maker_name", "전국(대표)") // parameter 3
                                .param("food_code", "D000032") // parameter 4
                )
                .andDo(print()) // api 수행내역 로그 출력
                .andExpect(status().isOk()) // response status 200 검증
                .andExpect(jsonPath("code").value("200")) // response code 데이터 검증
                .andExpect(jsonPath("message").value("success")) // response message 데이터 검증
                .andDo(print());
    }
    /*
    @Autowired
    FoodService ms;

    @Test
    @Transactional
    @Rollback
    @DisplayName("조회 테스트")
    public void foodListTest() {

        RequestFoodDto requestFoodDto = new RequestFoodDto("닭갈비", "2019","춘천","D000008");

        List<ResponseFoodDto> responseFoodDtoList = ms.getFoodList(requestFoodDto);

        // 3. List의 size()가 1인지 비교.
        // size()가 1이면 테스트 통과
        assertThat(responseFoodDtoList.size()).isEqualTo(1);

    }

 */
}
