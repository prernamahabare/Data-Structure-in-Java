public class CompileTimePolymorphism {
    public static void main(String[] args) {

        calculate cal = new calculate();
        System.out.println(cal.sum(12, 30));
        System.out.println(cal.sum(1, 2, 3));
        System.out.println(cal.sum((float) 2, (float) 5));

    }
}

class calculate {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
