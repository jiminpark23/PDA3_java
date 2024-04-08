package day03_0405;

public class EX06 {
    public static void main(String[] args) {
//        ApplePhone : 배터리용량(정수) 100, isOn = False
//        charge() : 배터리 충전 +10
//        use() : 배터리 사용 -5
//        useKakaotalk() : -5
//        useYoutube() : -10
//        배터리 용량 확인
//        turnOn
//        turnOff
        Person son = new Person();
        ApplePhone iphone16 = new ApplePhone();
        son.buyPhone(iphone16);

        SamsungPhone galaxy24 = new SamsungPhone();
        son.buyPhone(galaxy24);
    }
}

// Person => ApplePhone 모든 기능 사용하도록
class Person {
    Phone phone;
    SamsungPhone phone2;


    // buyPhone()
    void buyPhone(Phone phone) {
        this.phone = phone;
    }

    // charge()
    void chargePhone() {

    }

    // useKakaotalk()
    void useKakaotalk() {
        if (phone.getIsOn())
            phone.operateKakaotalk();
    }
}


interface Phone {
    // 1. 구현체가 어떤 게 오든 받아줄 수 있게 타입 형태로 제시하기 위함
    //    => implements Phone
    //    * 추상 클래스는 extends 공통 기능 상속, 규약 구현
    //    * 인터페이스는 implements 공통 규약, 구현
    // 2. 구현체(객체)를 필요로 한다 = 구현체를 사용한다 = 메소드를 호출한다
    //    => 메소드 선언(명, 매개변수) 통일
    Boolean getIsOn();

    void charge();

    void operateKakaotalk();

    void useYoutube();

    void checkBatteryStatus();

    void turnOn();

    void turnOff();
}


class ApplePhone implements Phone {
    private final int BATTERY_MAX_CAPA = 100;  // 배터리 최대용량 - 값이 고정이므로 상수 -> final, 대문자 스네이크 표기법
    private int batteryStatus = 70; // 현재 배터리 용량
    private Boolean isOn = false;   // 핸드폰 on off 상태 (변수명은 가능하면 긍정으로)

    public Boolean getIsOn() {
        return isOn;
    }

    public void charge() {
        if (batteryStatus == BATTERY_MAX_CAPA) {
            System.out.println("100%입니다");
            return;
        } else if (batteryStatus == 95) {
            batteryStatus = 100;
        } else {
            batteryStatus += 10;
        }
        System.out.println(batteryStatus + "%가 되었습니다");
    }

    public void operateKakaotalk() {
        if (isOn) {
            batteryStatus -= 5;
            if (batteryStatus == 0) {
                turnOff();
            }
        }
    }

    public void useYoutube() {
        // -10
    }

    public void checkBatteryStatus() {
        System.out.println(batteryStatus + "%");
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}


class SamsungPhone implements Phone {
    private final int BATTERY_MAX_CAPA = 100;  // 배터리 최대용량 - 값이 고정이므로 상수 -> final, 대문자 스네이크 표기법
    private int batteryStatus = 80; // 현재 배터리 용량
    private Boolean isOn = false;   // 핸드폰 on off 상태 (변수명은 가능하면 긍정으로)

    public Boolean getIsOn() {
        return isOn;
    }

    public void charge() {
        if (batteryStatus == BATTERY_MAX_CAPA) {
            System.out.println("100%입니다");
            return;
        } else if (batteryStatus == 95) {
            batteryStatus = 100;
        } else {
            batteryStatus += 10;
        }
        System.out.println(batteryStatus + "%가 되었습니다");
    }

    public void operateKakaotalk() {
        if (isOn) {
            batteryStatus -= 5;
            if (batteryStatus == 0) {
                turnOff();
            }
        }
    }

    public void useYoutube() {
        // -10
    }

    public void checkBatteryStatus() {
        System.out.println(batteryStatus + "%");
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}