public class Advances {
    public static void main(String[] args) {
        // print_floyds(4);
        // print_inverted_half_paramid_no(4);
        // Print_Zero_One_pattern(4);
        // Butterfly_pattern(4);
        // Solid_rombus(4);
        // Print_hollow_rombus(4);
        Diamond_pattern(4);
        // print_Hollow_rectangle(4, 5);
        // print_Reverse_rectangle(4);
    }

    public static void Diamond_pattern(int no_of_row) {
        for (int i = 1; i <=no_of_row; i++) {
            for (int j = 1; j <= (no_of_row-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = no_of_row; i >=1; i--) {
            for (int j = 1; j <= (no_of_row-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Butterfly_pattern(int no_of_row) {
        for (int i = 1; i <= no_of_row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                // System.out.print("*");
            }
            for (int k = 1; k <= 2 * (no_of_row - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                // System.out.print("*");
            }
            System.out.println();
        }

        for (int i = no_of_row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                // System.out.print("*");
            }
            for (int k = 1; k <= 2 * (no_of_row - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                // System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Print_Zero_One_pattern(int no_of_row) {
        for (int i = 1; i <= no_of_row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void Solid_rombus(int no_of_row) {
        for (int i = 1; i <= no_of_row; i++) {
            for (int j = 1; j <= (no_of_row - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= no_of_row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Print_hollow_rombus(int no_of_row) {
        for (int i = 1; i <= no_of_row; i++) {
            for (int j = 1; j <= (no_of_row - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= no_of_row; j++) {
                if (i == 1 || i == no_of_row || j == 1 || j == no_of_row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void print_Reverse_rectangle(int no_of_row) {
        for (int i = 1; i <= no_of_row; i++) {
            for (int j = 1; j <= no_of_row; j++) {
                if (j <= no_of_row - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void print_Hollow_rectangle(int no_of_row, int no_of_col) {
        for (int i = 1; i <= no_of_row; i++) {
            for (int j = 1; j <= no_of_col; j++) {

                if (i == 1 || i == no_of_row || j == 1 || j == no_of_col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void print_inverted_half_paramid_no(int no_of_row) {
        for (int i = 1; i <= no_of_row; i++) {
            for (int j = 1; j <= no_of_row - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void print_floyds(int no_of_row) {
        int count = 1;
        for (int i = 1; i <= no_of_row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
