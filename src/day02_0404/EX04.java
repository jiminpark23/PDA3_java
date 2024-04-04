package day02_0404;

// 상속 - 부모 자식 관계
public class EX04 {
    public static void main(String[] args) {
        // 개발자는 중복을 최대한 없애려고 함
        // 필드, 메소드 다 똑같음 -> 부모 클래스를 만들자
        Bus bus = new Bus();
        bus.ride();
        bus.getWheelNum();

        Taxi taxi = new Taxi();
        taxi.ride();
        taxi.getWheelNum();

    }
}

// 버스 클래스
class Bus extends Car {
    // 필드 - 바퀴 4개
//    int wheel = 4;
//
//    void getWheelNum() {
//        System.out.println("바퀴 수는 " + wheel + "개 입니다.");
//    }
//
//    // 메소드 '달린다' - 버스: ,
    void ride() {
        System.out.println("부릉부릉");
    }

    void ring() {
        System.out.println("삐-");
    }
    
}

// 택시 클래스
class Taxi extends Car {
    // 필드 - 바퀴 4개
//    int wheel = 4;
//
//    void getWheelNum() {
//        System.out.println("바퀴 수는 " + wheel + "개 입니다.");
//    }
    
    // 메소드 '달린다' - 택시: 빵빵
    void ride() {
        System.out.println("빵빵");
    }
}

// 부모 클래스는 자식 클래스의 공통된 특징!
// 자식부터 설계하고, 부모 설계하는 것이 쉽다!
class Car {
    int wheel = 4;

    void getWheelNum() {
        System.out.println("바퀴 수는 " + wheel + "개 입니다.");
    }

    void ride() {
        System.out.println("부아앙");
    }
}