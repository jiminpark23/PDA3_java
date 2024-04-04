package day02_0404;

public class EX02_2 {
    public static void main(String[] args) {
        Coffee1 americano = new Coffee1(4500);
        Barista chunsik = new Barista("춘식");

        chunsik.getCoffeeInfo(americano);
        chunsik.makeCoffee();
    }
}


// 커피 클래스
class Coffee1 {
    private int price;

    Coffee1(int price) {
        this.price = price;
    }

    int getPrice() {  // return 이 있으니까 반환 타입을 지정해줄 수 있게 됨

        return price;
    }
}

// 바리스타 클래스
class Barista {
    String name;

    Barista(String name) {
        this.name = name;
    }

    void getCoffeeInfo(Coffee1 coffee) {
        System.out.println("이 커피는 가격이 " + coffee.getPrice() + "입니다.");
    }

    void makeCoffee() {
        System.out.println("커피 여기 있습니다~");
    }
}