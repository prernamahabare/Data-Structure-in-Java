import java.util.function.BinaryOperator;

public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operator
        // Binary Operator + - * / %
        // Unary Operator ++ --

        // In unary oprators prefix and postfix are there.
        // a++ postfix In this 1st value is assign and then value change means
        // increment by 1.

        // int a = 4;
        // int b = ++a;
        // System.out.println(b);
        // System.out.println(a);
        //  In above a and b both value are changed 

        // 2. Relational Operator
        // == != > < >= <=

        // 3. Logical Operator
        // logical AND = &&
        // logical OR = ||
        // logical NOT = !

        // Assignment	
        // 	= += -= *= /= %= &= ^= |= <<= >>= >>>=

        //  a = a + 1;
        // same as above
        //  a += 1;

        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        System.out.println(exp);

    }
}