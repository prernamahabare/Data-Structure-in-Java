public class HierarchialInheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eats();
        shark.swim();

        Bird peapock = new Bird();
        peapock.eats();
        peapock.fly();
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

class Bird extends Animal  {
    void fly() {
        System.out.println("fly....");
    }
}

class Dog extends Animal  {
    void walk() {
        System.out.println("walk....");
    }
}

