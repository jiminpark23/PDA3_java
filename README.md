## 👉 MINI_0404
- 부모(Phone) 상속 / 오버라이드 (덮어쓰기)
- 객체
  - Person
  - Phone
    - SamsungPhone
    - ApplePhone
- 설명:
  - Person 객체: 필드(name, lines), 메소드(핸드폰을 구매하는 행동 buyPhone)
  - Phone 객체: 메소드(핸드폰이 울리는 ring)
<br>


## 👉 0408 회원 서비스 프로젝트
- 모든 입력은 스캐너(콘솔 입력) 클래스를 이용합니다.
- 필수 회원 정보는 id, pw, 이름 입니다. (여유가 있다면 유효성 검사 추가)
- DB를 대체할 클래스 DAO (스프링에서 Repository)는 별도로 구현합니다.
  - class DAO는 필드로 Map을 선언하여, DB 대체로 활용합니다. <br>
    (=DB의 기능은 Map의 메소드가 대체) <br>

<br>

 #### [작동 예시]
  유저 플로우(사용자 서비스 사용 흐름)를 정리
  1. 메뉴를 사용자에게 입력 받습니다. <br>
      (1: 회원가입 / 2: 로그인 / 3: 회원정보 수정 / 4: 탈퇴 / 0: 종료)
  2. 가입하실 아이디와 비밀번호를 (띄어쓰기로 구분하여) 입력하세요. <br>
      (입력: jimin 123)
  3. jimin님 가입을 환영합니다. <br>
      1: 회원가입 / 2: 로그인 / 3: 회원정보 수정 / 4: 탈퇴 / 0: 종료 <br>
      입력: 3
  4. 로그인 상태가 아닙니다. <br>
  …

  #### 클래스 다이어그램
  ![image](https://github.com/jiminpark23/PDA3_java/assets/122578483/dda5876b-7d63-4b5a-9bfc-8a5d8095a483)
