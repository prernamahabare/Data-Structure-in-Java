public class SingelLevelInheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eats();
    }
}

class Animal {
    void eats() {
        System.out.println("eats....");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims....");
    }
}