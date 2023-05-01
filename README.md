# Study_ReactSpringBoot
 React와 SpringBoot 의 데이터 전달을 간단하게 공부한 공간입니다.
 
## CORS 에러에 대하여..
- CORS(Cross-Origin Resource Sharing) :  JavaScript 코드가 다른 출처(도메인, 프로토콜, 포트)의 자원을 요청하는 것을 제한하는 보안 방식
- 다른 도메인에서 요청을 보내는 경우, 서버 측에서 CORS를 설정하지 않은 경우에 발생. 이 경우에는 서버 측에서 CORS를 설정
- SpringBoot에서 @CrossOrigin(origins = "http://localhost:3000")

## 참고사이트
- [lombok설치](https://projectlombok.org/download)
    1. lombok.jar 파일을 SpringToolSuite4.exe 있는 폴더에 같이 넣는다.
    2. 명령 프롬프트 관리자 권한 실행.
        ```shell
        cd C:\Program Files\Java\jdk-17\bin
        java -jar {lombok.jar의 경로}
        ```
