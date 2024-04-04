package day01_0403;// switch 실습
// num 변수의 값이 9면 "A"
// 8이면 "B"
// 7이면 "C"
// 6이하면 "F"

public class EX02 {
    public static void main(String[] args) {
        int num = 9;

        switch(num) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
        }
    }
}