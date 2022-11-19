public class FriendsParing {
    public static int friendsParing(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // single = freindsPairing(n - 1)
        // pair = freindsPairing(n - 2) * (n - 1)

        // return single + pair
        return friendsParing(n - 1) + friendsParing(n - 2) * (n - 1);
    }

    public static void main(String[] args) {
        System.out.println(friendsParing(3));
    }
}
