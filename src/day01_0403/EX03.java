package day01_0403;

// If문과 Switch문
public class EX03 {
    public static void main(String[] args) {
        int age = 24;

        // 10으로 나눴을 때의 나머지 이용
        switch (age/10) {
            case 3:
                System.out.println("30대입니다");
                break;
            case 2:
                System.out.println("20대입니다");
                break;
            case 1:
                System.out.println("10대입니다");
                break;
            default:
                System.out.println("어린이입니다");
                break;
        }
//        if (age >= 30) {
//            System.out.println("30대입니다");
//        } else if (age >= 20) {
//            System.out.println("20대입니다");
//        } else if (age >= 10) {
//            System.out.println("10대입니다");
//        } else {
//            System.out.println("어린이입니다");
//        }
    }
}
