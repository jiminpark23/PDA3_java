package mini_task;

/*
 * [미니 과제]
 * Q. 사람은 상점에서 핸드폰을 구매합니다.
 * 쏘니가 핸드폰을 샀습니다.
 * 베컴도 핸드폰을 샀습니다.
 *
 * 쏘니가 핸드폰을 켰습니다.
 * "야 내 핸드폰 켜볼게"
 * "삐비빅" (핸드폰이 내는 소리)
 *
 * 베컴도 핸드폰을 켰습니다.
 * "turn on"
 * "bbeep" (핸드폰이 내는 소리)
 * */

public class MINI_0404 {
    public static void main(String[] args) {
        Person son = new Person("쏘니");
        Person beckham = new Person("베컴");
        SamsungPhone samsung = new SamsungPhone();
        ApplePhone apple = new ApplePhone();

        son.buyPhone();
        beckham.buyPhone();

        son.turnOn("야 내 팬드폰 켜볼게", samsung);
        beckham.turnOn("turn on", apple);
    }
}

// 사람 클래스
class Person {
    // 필드
    String name;
    String lines;

    // 생성자
    Person(String name) {
        this.name = name;
    }

    // 메소드
    // 핸드폰 구매 메소드
    void buyPhone() {
        System.out.println(name + "가 핸드폰을 샀습니다.");
    }

    // 핸드폰 켜는 메소드
    void turnOn(String lines, Phone phone) {
        System.out.println(name + "(이)가 핸드폰을 켰습니다.");
        System.out.println(lines);
        phone.ring();
    }
}


// 핸드폰 클래스 (부모)
class Phone {
    // 필드

    // 생성자
    Phone() {

    }

    // 메소드
    // 핸드폰 벨소리
    void ring() {
        System.out.println("띵");
    }
}

// 삼성폰 클래스 (자식)
class SamsungPhone extends Phone {

    void ring(){
        System.out.println("삐비빅");
    }
}

// 애플폰 클래스 (자식)
class ApplePhone extends Phone {
    void ring() {
        System.out.println("bbeep");
    }
}