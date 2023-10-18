# 2. API 구현 문제

## 프로젝트 실행 방법
 
1. solution01 폴더로 이동
```
cd solution02 
```


2. build 및 실행
```
./gradlew build
cd ./build/libs
java -jar solution02-0.0.1-SNAPSHOT.jar
``` 

## 기능 요구사항

### 프로그램 기능 조건

- 식품영양성분 DB 조회
  - 요청 인자에 해당하는 데이터 조회하기

### RequestDto 구현 사항
- [X] 요청 인자를 Json 형식으로 전달받아 처리하는 RequestFoodDto 
- [ ] RequestDto 유효성 체크

### ResponseDto 구현 사항
- [X] 요청 인자에 해당하는 데이터를 출력하기 위한 ResponseFoodDto
- [ ] ResponseDto 유효성 체크

### API 구현 사항 
- [X] 요청 인자(Json 형식)를 Request Dto로 변환 
- [X] 조건에 해당하는 음식 정보 조회 기능 구현
- [X] 조회한 음식 정보를 ResponseDto 형식으로 변환
- [X] ResponseDto를 Json으로 변환 
 

### Exception 구현 사항
- [ ] 요청 인자를 제대로 전달받지 못한 경우

### 테스트 구현 사항
- [X] DB 조회 기능 검증
- [ ] ResponseDto 유효성 검증
- [ ] ResponseDto 유효성 검증

### 문서 작성
- [X] API 문서 작성
- [ ] SQL 파일 또는 실행 파일 작성

## API 테스트
<img width="930" alt="food_api_test" src="https://github.com/hwi215/programming-test/assets/56347876/6202badc-78eb-4a35-8e7e-95fb6a3425a0">
