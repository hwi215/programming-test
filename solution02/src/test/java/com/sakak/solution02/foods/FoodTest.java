package com.sakak.solution02.foods;
import com.sakak.solution02.common.BaseControllerTest;
import com.sakak.solution02.food.dto.RequestFoodDto;
import com.sakak.solution02.food.dto.ResponseFoodDto;
import com.sakak.solution02.food.service.FoodService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class FoodTest extends BaseControllerTest{


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

}
