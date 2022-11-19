public class Abstract {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
    }
}

abstract class Animal {

    String color;

    Animal() {
        color = "BROWN";
        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println("animals eat");
    };

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        color = "red";
        System.out.println("Horse constructor");
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Hen extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}