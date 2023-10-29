package com.sakak.solution02.foods;

import com.sakak.solution02.common.BaseControllerTest;
import com.sakak.solution02.food.dto.RequestFoodDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PostFoodTest extends BaseControllerTest {


    @Test
    @DisplayName("음식 정보 조회 실패 Post Method Test")
    public void 음식_정보_조회_실패_POST() throws Exception {

        String content = objectMapper.writeValueAsString(new RequestFoodDto("닭갈비2", "2019", "전국(대표)", "D000007"));

        mockMvc.perform(post("/foods")
                        .content(content)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print()) // api 수행내역 로그 출력
                .andExpect(status().is4xxClientError()); // response status 404 검증
    }
}
