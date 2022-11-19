public class PrintDesecrsingOrder {
   public static void printDesecrsingOrder(int n) {
      System.out.println(n);
      if (n == 1) {
         return;
      }
      printDesecrsingOrder(n-1);
   }

   public static void main(String[] args) {
      int n = 10;
      printDesecrsingOrder(n);
   }

}