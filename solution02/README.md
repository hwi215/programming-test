# 2. API 구현 문제

## 프로젝트 실행 전 DB 설정하기
1. src/main/resource 폴더 안에 application-info.yml 파일 생성

```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/[DB이름]?serverTimezone=UTC&characterEncoding=UTF-8
    username: [DB계정명]
    password: [DB계정 비밀번호]
    driver-class-name: com.mysql.cj.jdbc.Driver

```
2. [SQL 파일](https://github.com/hwi215/programming-test/tree/main/data)




## 프로젝트 실행 방법
 
1. solution02 폴더로 이동
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

### ResponseDto 구현 사항
- [X] 요청 인자에 해당하는 데이터를 출력하기 위한 ResponseFoodDto 

### API 구현 사항 
- [X] 요청 인자(Json 형식)를 Request Dto로 변환 
- [X] 조건에 해당하는 음식 정보 조회 기능 구현
- [X] 조회한 음식 정보를 ResponseDto 형식으로 변환
- [X] ResponseDto를 Json으로 변환 
 

### Exception 구현 사항
- [X] 조회 결과가 없을 경우 Not found(404) 


### 테스트 구현 사항
- [X] DB 조회 기능 검증

### 문서 작성
- [X] API 문서 작성
- [X] SQL 파일 또는 실행 파일 작성

## API 문서

- [API문서](https://documenter.getpostman.com/view/19111266/2s9YR9aDPY)


## Reference

- [REST API 관련](https://meetup.nhncloud.com/posts/92)
- [HTTP Status Code 관련](https://atoz-developer.tistory.com/121)


