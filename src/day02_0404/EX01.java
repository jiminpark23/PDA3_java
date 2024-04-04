package day02_0404;

public class EX01 {
    public static void main(String[] args) {
        Animal dog = new Animal("강아지", "멍멍");
        Animal cow = new Animal("소", "음메");
        System.out.println(dog.name);

        dog.cry(); // 객체가 가지고 있는 메소드여야 객체.메소드명(); 으로 호출 가능
        cow.cry();
    }
}

// 동물 클래스
class Animal {
    // 필드 - 이름
    String name;
    String sound;

    // 생성자
    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // 메소드 (접근제어자 public 또는 default 하셈)
    void cry() {
        System.out.println(sound);
    }
//    void cry() {
//        switch(this.name) {
//            case ("강아지"):
//                System.out.println("멍멍");
//                break;
//            case ("소"):
//                System.out.println("음메");
//                break;
//            default:
//                System.out.println("엉엉");
//        }
//    }

}