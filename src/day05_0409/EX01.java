package day05_0409;

public class EX01 {
//    블루투스(스피커)마이크)
//
//    인터페이스 or 추상클래스 선택 (목적이 더 강하다고 생각하는 걸 선택해라) → 타입으로 쓰기
//    ⇒ 블루투스 스피커 : BGM (음악)
//    ⇒ 마이크 : 노래를 부를 수 있음
//
//    class BluetoothMic
//    ⇒ 음악도 나오고
//    ⇒ 노래도 부를 수 있고
    public static void main(String[] args) {
        BluetoothMic bluetoothMic = new BluetoothMic("집에 가자");
        bluetoothMic.bgm();
        bluetoothMic.sing();
    }
}

// 인터페이스 사용 -> 다중 상속을 위함
interface Speaker {
    void bgm();
}

interface Mic {
    void sing();
}

class BluetoothMic implements Speaker, Mic {
    String bgm;

    BluetoothMic(String bgm) {
        this.bgm = bgm;
    }
    public void bgm() {
        System.out.println("BGM: " + bgm);
    }

    public void sing() {
        System.out.println("노래부르기");
    }
}