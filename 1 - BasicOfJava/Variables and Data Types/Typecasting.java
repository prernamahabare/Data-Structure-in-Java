public class Typecasting {
    public static void main(String[] args) {
        // Conversion happens when
        // 1. type compatibe
        // 2.destination type >source type

        // Byte short int float long double

        // Type Conversion

        // In type casting data type of result is depend on the largest data type in values.

        // Byte short char are convert in int in result

        long ab = 344;
        double bc = 1234;
        float cd = 123f;

        int bt2 = (byte)(ab+bc+cd);
        System.out.println(bt2);


        // short a = 5;
        // byte b = 2;
        // char c = 'c';
        // byte bt = (byte)(a+b+c);
        // System.out.println(bt);
    }
}
