public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}

class Animal {
    String color =  "red";
    Animal() {
        System.out.println("animal constructor");
    }
}

class Horse {
    Horse() {
        super();
        System.out.println("horse constructor");
    }
}
