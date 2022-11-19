public class shortestPath {
    public static float findShrotestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'E':
                    x = x + 1;
                    break;
                case 'W':
                    x = x - 1;
                    break;
                case 'N':
                    y = y + 1;
                    break;
                case 'S':
                    y = y - 1;
                    break;
                default:
                    break;
            }  
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(findShrotestPath(str));
    }
}
