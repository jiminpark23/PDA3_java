package day07_0412;

// 프로그램 시작 컨트롤러
public class CalcController  {
    CalcModel calcModel;

    // 모델 객체의 메소드 호출
    CalcController(CalcModel calcModel) {
        this.calcModel = calcModel;
        new CalcView(this);
    }

    // 메소드 -> 모델.plus();
    public int plus(int num1, int num2) {
        return calcModel.plus(num1, num2);
    }

    public int minus(int num1, int  num2) {
        return calcModel.minus(num1, num2);
    }
}
