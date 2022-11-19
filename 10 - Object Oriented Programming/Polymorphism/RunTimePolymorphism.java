
public class RunTimePolymorphism {
    public static void eat() {
        System.out.println("yasha eat...");
    }

    public static void main(String[] args) {
        Dear dr = new Dear();
        dr.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eat...");
    }
}

class Dear extends Animal {
    void eat() {
        System.out.println("eat grass...");
    }
}
