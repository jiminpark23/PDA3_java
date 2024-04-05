package day03_0405;

public class EX05 {
    public static void main(String[] args) {
//        OTT : Netflex, Tving
//        printOpeningLogo() : sout “넷플”, “티빙”
//        netflex.play() → 이 안에서 printOpeningLogo가 먼저 호출됨
//                          “영상 시작”
//        netflex.finish() : sout “다 봤다~”
        Netflex netflex = new Netflex();
        netflex.play();
        netflex.finish();

        System.out.println(" ");

        Tving tving = new Tving();
        tving.play();
        tving.finish();

    }
}

// 어차피 OTT 객체를 만들지 않으므로 abstract (추상 클래스)로 만들어도 됨
abstract class OTT {

    abstract void printOpeningLogo();

    void play() {
        printOpeningLogo();
        System.out.println("영상 시작");
    }

    void finish() {
        System.out.println("다 봤다~");
    }
}

class Netflex extends OTT {
    String logo = "Netflex";

    @Override
    void printOpeningLogo() {
        System.out.println(logo);
    }
}

class Tving extends OTT {
    String logo = "Tving";

    @Override
    void printOpeningLogo() {
        System.out.println(logo);
    }
}