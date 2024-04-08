package day03_0405;

public class EX01 {
    public static void main(String[] args) {
        // Cow, Chicken : cry() 메소드 - "음메", "꼬끼오"
        // Farm : getSound() 메소드 - cow, chicken 각각의 cry() 호출
        // Animal : 상속 - 오버라이딩
        Cow cow = new Cow();
        Chicken chicken = new Chicken();

        Farm farm = new Farm(cow, chicken);
        farm.getSound();
    }
}

// 농장 클래스
class Farm {
    // 같은 객체에게 먹이를 주고 울게 하기 위해서는 필드에서 객체를 선언하는 게 가장 good
    Cow cow;
    Chicken chicken;


    Farm(Cow cow, Chicken chicken) {
        this.cow = cow;
        this.chicken = chicken;
    }

    void getSound() {
        cow.cry();
        chicken.cry();
    }
}

// 동물 클래스
class Animal {
    Animal() {

    }

    void cry() {

    }
}

// 소 클래스
class Cow extends Animal {

    @Override
    void cry() {
        System.out.println("음메");
    }
}

// 닭 클래스
class Chicken extends Animal {

    @Override
    void cry() {
        System.out.println("꼬끼오");
    }
}