package day03_0405;

public class EX03 {
    public static void main(String[] args) {
//         class Garden
//         - getSound() : 매개변수로 전달받은 동물의 울음소리
//         class Dog, Cat extends Pet
//         - cry() : 울음소리 "멍멍", "야옹"
        Dog dog = new Dog();
        Cat cat = new Cat();

        Garden garden = new Garden();
        garden.getSound(dog);
        garden.getSound(cat);

    }
}


class Garden {

    void getSound(Pet pet) {    // 다형성!!
        pet.cry();

        // instanceof를 쓰는 경우! -> but 다형성만으로 해결할 수 있어서 잘 안 씀
//        if (pet instanceof Dog) {
//            System.out.println("멍멍");
//        } else {
//            System.out.println("야옹야옹");
//        }
    }
}

abstract class Pet {

    abstract void cry();
}


class Dog extends Pet {

    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

class Cat extends Pet {

    @Override
    void cry() {
        System.out.println("야옹야옹");
    }
}