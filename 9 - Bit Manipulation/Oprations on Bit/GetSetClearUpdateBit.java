public class GetSetClearUpdateBit {
    public static int getIthBit(int n, int i) {
        int Bitmask = 1 << i;
        if ((n & Bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int Bitmask = 1 << i;
        return Bitmask | n;
    }

    public static int clearIthBit(int n, int i) {
        int Bitmask = ~(1 << i);
        return Bitmask & n;
    }

    public static int updateIthBit(int n, int i, int value) {
        // if (value == 0) {
        // System.out.println(clearIthBit(n, i));
        // } else {
        // System.out.println(setIthBit(n, i));
        // }

        n = clearIthBit(n, i);
        int Bitmask = value << i;
        return Bitmask | n;
    }

    public static int clearINoOFBits(int n, int i) {
        int Bitmask = (~0 << i);
        return Bitmask & n;
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0 << j + 1);
        int b = (1 << i) - 1;
        int Bitmask = a | b;
        return Bitmask & n;
    }

    public static void main(String[] args) {
        // System.out.println(getIthBit(5, 1));
        // System.out.println(setIthBit(5, 2));
        // System.out.println(clearIthBit(5, 2));
        // System.out.println(updateIthBit(5, 1, 1));
        // updateIthBit(5, 2, 1);
        // System.out.println(updateIthBit(5, 2, 1));
        // System.out.println(clearINoOFBits(13, 2));
        System.out.println(clearRangeOfBits(10, 2, 4));
    }
}
