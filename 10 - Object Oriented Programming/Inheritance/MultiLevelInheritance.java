public class MultiLevelInheritance {
    public static void main(String[] args) {
        shark s1 = new shark();
        s1.eats();
        s1.swim();
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
