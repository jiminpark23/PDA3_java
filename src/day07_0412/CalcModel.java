package day07_0412;

// Model : DB, 로직 - 데이터 처리
public class CalcModel {
    private int num1;
    private int num2;

    // 매개변수로 정수 2개 받아 합 return
    public int plus(int num1, int num2) {
       return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }
}
