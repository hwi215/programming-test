package com.sakak.solution02.foods;

import com.sakak.solution02.common.BaseControllerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class GetFoodTest extends BaseControllerTest {

    @Test
    @DisplayName("음식 정보 조회 Get Method Test")
    public void 음식_정보_조회_GET() throws Exception {
        // api 요청

        mockMvc
                .perform(
                        get("/foods") // url
                                .param("food_name", "닭갈비") // parameter 1
                                .param("research_year", "2019") // parameter 2
                                .param("maker_name", "전국(대표)") // parameter 3
                                .param("food_code", "D000007") // parameter 4
                )
                .andDo(print()) // api 수행내역 로그 출력
                .andExpect(status().isOk()) // response status 200 검증
                .andExpect(jsonPath("code").value("200")) // response code 데이터 검증
                .andExpect(jsonPath("message").value("success")); // response message 데이터 검증

    }


    @Test
    @DisplayName("음식 정보 조회 실패 Get Method Test")
    public void 음식_정보_조회_실패_GET() throws Exception {
        // api 요청
        mockMvc
                .perform(
                        get("/foods") // url
                                .param("food_name", "닭갈비2") // parameter 1
                                .param("research_year", "2019") // parameter 2
                                .param("maker_name", "전국(대표)") // parameter 3
                                .param("food_code", "D000007") // parameter 4
                )
                .andDo(print()) // api 수행내역 로그 출력
                .andExpect(status().is4xxClientError()); // 404 not found error 발생하는 지 검증
    }
}
