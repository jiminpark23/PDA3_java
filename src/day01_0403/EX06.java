package day01_0403;

public class EX06 {
    public static void main(String[] args) {
        Person songa = new Person("손가");
        Person kelly = new Person("켈리");
        Person jason = new Person("제이슨");

        System.out.println(kelly.name);
    }
}

// 사람 클래스
class Person {
    // 변수 (=부품)
    String name;

    // 생성자
    Person(String name) {
        this.name = name;        // 이름이 똑같으니까 식별을 위해 this를 써줌
        // 왼쪽 name이 day01_0403.Person 클래스 안의 name 변수이고, 오른쪽 name은 매개변수
    }
}