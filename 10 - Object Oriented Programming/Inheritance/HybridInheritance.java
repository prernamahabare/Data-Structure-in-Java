public class HybridInheritance {
    public static void main(String[] args) {
        
        Fish shark = new Fish();
        shark.eats();
        shark.swim();

        shark sh = new shark();
        sh.eats();
        sh.sharkSwims();

        Bird peacock = new Bird();
        peacock.eats();
        peacock.fly();

        cock co = new cock();
        co.cockFly();
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
class shark extends Fish  {
    void sharkSwims() {
        System.out.println("shark swims....");
    }
}

class Bird extends Animal  {
    void fly() {
        System.out.println("fly....");
    }
}

class peacock extends Bird  {
    void peacockFly() {
        System.out.println("peacock Fly....");
    }
}

class cock extends Bird  {
    void cockFly() {
        System.out.println("cock Fly....");
    }
}








