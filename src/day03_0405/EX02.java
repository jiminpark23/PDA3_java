package day03_0405;

public class EX02 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        parent1.method();    // 부모 메소드가 호출됨

        Child child = new Child();
        child.method();      // 자식 메소드가 호출됨

        Parent parent2 = new Child();
        parent2.method();    // 자식 메소드가 호출됨

        Child child2 = (Child) parent2; // 강제로 child로 펴줘! (접었던 부분(child가 원래 가지고 있던 부분)을 다시 쓸 수 있게 됨)
        child2.metod();
    }
}


class Parent {
    void method() {
        System.out.println("부모 메소드");
    }
}

class Child extends Parent {

    void metod() {      // 이렇게 오타를 냈다면? 부모 클래스의 method와 자식 클래스의 metod를 자식이 모두 가지고 있는 것 -> 위에서 child.method() 호출하면 "부모 클래스"가 출력됨
        System.out.println("자식 메소드");
    }

    @Override   // 어노테이션을 달아놓고 metod()라고 오타를 낸다면? 부모 클래스에 있는지 없는지 확인해서 Override에서 오류를 냄
    void method() {
        System.out.println("자식 메소드");
    }
}