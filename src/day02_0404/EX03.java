package day02_0404;

// 생성자 오버로딩
public class EX03 {
    public static void main(String[] args) {
        Person1 dragon = new Person1(
                "용용이",
                20,
                "010-0000-0000"
        );
    }
}

class Person1 {
    // 필드
    String name;
    int age;
    String phone;

    // 생성자
    Person1(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}