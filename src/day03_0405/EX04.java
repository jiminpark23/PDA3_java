package day03_0405;

public class EX04 {
    public static void main(String[] args) {
//        레시피 - super(부모) : getInfo() - 이 레시피는 ㅇㅇ의 레시피
//        파스타레시피 - 자식 : makeSauce()
//        스테이크레시피 - 자식 : grill()

        Recipe recipe = new Recipe("나셰프");


        recipe.getInfo();
    }
}

// abstract를 붙여서 추상 클래스로 만들어도 되지만, 추상클래스는 객체를 만들지 못함
class Recipe {
    String name;

    Recipe(String name) {
        this.name = name;
    }

    void getInfo() {    // 내용이 있기 때문에 추상메소드가 아니라 그냥 일반 메소드임
        System.out.println("이 레시피는"
            + name + "쉐프님의 레시피입니다.");
    }
}

class Pasta extends Recipe {

    Pasta(String name) {
        super(name);
    }

    void makeSauce() {
        System.out.println("파스타 소스는 이렇게 만들어요");
    }
}

class Steak extends Recipe {

    Steak(String name) {
        super(name);
    }

    void grill() {
        System.out.println("스테이크는 이렇게 구워요");
    }
}