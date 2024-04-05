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
        Person person = new Person();

    }
}

// Person => ApplePhone 모든 기능 사용하도록
class Person {
    ApplePhone phone;


    // buyPhone()
    void buyPhone(ApplePhone phone) {
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


class ApplePhone {
    private final int BATTERY_MAX_CAPA = 100;  // 배터리 최대용량 - 값이 고정이므로 상수 -> final, 대문자 스네이크 표기법
    private int batteryStatus = 70; // 현재 배터리 용량
    private Boolean isOn = false;   // 핸드폰 on off 상태 (변수명은 가능하면 긍정으로)

    Boolean getIsOn() {
        return isOn;
    }

    void charge() {
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

    void operateKakaotalk() {
        if (isOn) {
            batteryStatus -= 5;
            if (batteryStatus == 0) {
                turnOff();
            }
        }
    }

    void useYoutube() {
        // -10
    }

    void checkBatteryStatus() {
        System.out.println(batteryStatus + "%");
    }

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }
}