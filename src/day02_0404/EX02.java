package day02_0404;

public class EX02 {
    public static void main(String[] args) {
        Coffee americano = new Coffee(4500, "ice", "tall");
        // 생성자 없이 정보 넣는 방법 (이렇게 밖에서 접근하면 값 수정이 됨 -> 방지하기 위해 접근제어자 private 사용)
//        americano.price = 4500;
//        americano.temp = "ice";
//        americano.size = "tall";
        americano.setPrice(-3000);
        americano.getInfo();
    }
}

// 커피 클래스
class Coffee {
    // 필드
    private int price;
    private String temp;
    private String size;

    // 생성자
    Coffee (int price, String temp, String size) {
        this.price = price;
        this.temp = temp;
        this.size = size;
    }

    // 접근제어자 private 때문에 가격 변동을 반영하지 못함 => 가격을 바꾸는 메소드 생성
    void setPrice(int price) {
        // 필드 값 설정 "set"
        // setter는 변경할 값을 검증하는 용도로도 사용된다!!
        if (price >= this.price)    // 기존 가격보다 커져야 가격 변경 가능하도록 조건 걸기
            this.price = price;
    }

    // 메소드
    void getInfo() {
        System.out.println(
            "이 커피는 가격이 " + price + "원이고, "
            + temp + "이고, "
            + "사이즈는 " + size + "입니다.");
    }
}
