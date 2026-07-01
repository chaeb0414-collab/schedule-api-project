# Schedule API Project

## 1. 프로젝트 소개
> Spring Boot와 JPA를 활용하여 일정 관리 API를 구현하는 프로젝트 입니다.
### 주요기능
- 일정 생성 (Create)
- 전체 일정 조회 (Read)
- 선택 일정 조회 (Read)
- 일정 수정 (Update)
- 일정 삭제 (Delete)
## 2. 개발 환경
- JAVA
- Spring Boot
- MySQL
- JPA
- Gradle
- Postman
## 3. ERD
![ERD](.imges/erd.png)

## 4. API 명세
### 일정 생성
- Method - POST
- 파라미터 - title, content, writer, password
- 반환 값 - id, title, content, writer, createdAt, updatedAt 
- 인증 방식 - 비밀번호
### 전체 일정 조회
- Method - GET
- 파라미터 - 없음
- 반환 값 - id, title, content, writer, createdAt, updatedAt
- 인증 방식 - 없음
### 선택 일정 조회
- Method - GET
- 파라미터 - 없음
- 반환 값 - id, title, content, writer, createdAt, updatedAt
- 인증 방식 - 없음
### 일정 수정
- Method - PUT
- 파라미터 - id, title, content, writer, password
- 반환 값 - id, title, content, writer, createdAt, updatedAt
- 인증 방식 - 비밀번호
### 일정 삭제
- Method - DELETE
- 파라미터 - id, password
- 반환 값 - 삭제 성공 메세지
- 인증 방식 - 비밀번호