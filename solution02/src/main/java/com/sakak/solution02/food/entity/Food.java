package com.sakak.solution02.food.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "food2")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    @Id
    @GeneratedValue
    private String id;

    @Column(columnDefinition = "TEXT")
    private String SAMPLE_ID;
    @Column(columnDefinition = "TEXT")
    private String food_cd;
    @Column(columnDefinition = "TEXT")
    private String DB군;
    @Column(columnDefinition = "TEXT")
    private String 상용제품;
    @Column(columnDefinition = "TEXT")
    private String food_name;
    @Column(columnDefinition = "TEXT")
    private String research_year;
    @Column(columnDefinition = "TEXT")
    private String maker_name;
    @Column(columnDefinition = "TEXT")
    private String 채취시기;
    @Column(columnDefinition = "TEXT")
    private String 식품대분류;
    @Column(columnDefinition = "TEXT")
    private String group_name;
    @Column(columnDefinition = "TEXT")
    private String serving_size;
    @Column(columnDefinition = "TEXT")
    private String 내용량_단위;

    //@Column(name = "총 내용량g")
    private String 총_내용량g;
    //@Column(name = "총 내용량mL")
    private String 총_내용량mL;
    private String calorie;
    private String 수분;
    @Column(columnDefinition = "TEXT")
    private String protein;
    @Column(columnDefinition = "TEXT")
    private String province;
    @Column(columnDefinition = "TEXT")
    private String carbohydrate;
    @Column(columnDefinition = "TEXT")
    private String sugars;
    @Column(columnDefinition = "TEXT")
    private String 자당;
    @Column(columnDefinition = "TEXT")
    private String 포도당;
    @Column(columnDefinition = "TEXT")
    private String 과당;
    @Column(columnDefinition = "TEXT")
    private String 유당;
    @Column(columnDefinition = "TEXT")
    private String 맥아당;

    //@Column(name = "총 식이섬유")
    private String 총식이섬유;
    private String 칼슘;
    private String 철mg;
    private String 철;
    private String 마그네슘;
    private String 인;
    private String 칼륨;
    private String salt;
    private String 아연;
    private String 구리;
    private String 망간;
    private String 셀레늄;
    private String 레티놀;
    private String 베타카로틴;

    //@Column(name = "비타민 D3")
    private String 비타민D3;
    private String 토코페롤;
    private String 토코트리에놀;

    //@Column(name = "비타민 B1")
    private String 비타민B1;
    //@Column(name = "비타민 B2")
    private String 비타민B2;
    private String 나이아신;
    private String 엽산DFE;

    //@Column(name = "비타민 B12")
    private String 비타민B12;

    //@Column(name = "비타민 C")
    private String 비타민C;

    //@Column(name = "총 아미노산")
    private String 총아미노산;
    private String 이소류신;
    private String 류신;
    private String 라이신;
    private String 메티오닌;
    private String 페닐알라닌;
    private String 트레오닌;
    private String 발린;
    private String 히스티딘;
    private String 아르기닌;
    private String 티로신;
    private String 시스테인;
    private String 알라닌;
    private String 아스파르트산;
    private String 글루탐산;
    private String 글리신;
    private String 프롤린;
    private String 세린;
    private String cholesterol;

    private String saturated_fatty_acids;
    private String 부티르산;
    private String 카프로산;
    private String 카프릴산;
    private String 카프르산;
    private String 라우르산;
    private String 미리스트산;
    private String 팔미트산;
    private String 스테아르산;
    private String 아라키드산;
    private String 미리스톨레산;
    private String 팔미톨레산;
    private String 올레산;
    private String 박센산;
    private String 가돌레산;
    private String 리놀레산;

    //@Column(name = "알파 리놀렌산")
    private String 알파_리놀렌산;

    //@Column(name = "감마 리놀렌산")
    private String 감마_리놀렌산;

    private String 에이코사디에노산;
    private String 아라키돈산;
    private String 에이코사트리에노산;
    private String 에이코사펜타에노산;
    private String 도코사펜타에노산;
    private String 도코사헥사에노산;
    private String trans_fat;

    //@Column(name = "트랜스 올레산")
    private String 트랜스_올레산;

    //@Column(name = "트랜스 리놀레산")
    private String 트랜스_리놀레산;

    //@Column(name = "트랜스 리놀렌산")
    private String 트랜스_리놀렌산;

    //@Column(name = "회분(g)")
    private String 회분; //회분(g)

    //@Column(name = "카페인(㎎)")
    private String 카페인;//카페인(㎎)
    private String ref_name;
    private String 발행기관;
}

