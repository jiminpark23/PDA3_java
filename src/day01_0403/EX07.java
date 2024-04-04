package day01_0403;

public class EX07 {
    public static void main(String[] args) {
        // 객체 생성 (2개 : 삼성, LG)
        Computer samsung = new Computer("삼성");
        Computer lg = new Computer("LG");

        // 객체의 변수 (브랜드) 출력
        System.out.println(samsung.brand);
        System.out.println(lg.brand);
    }
}

// 노트북 클래스, 브랜드
class Computer {
    String brand;
    // 생성자
    Computer(String brand) {
        this.brand = brand;
    }
}