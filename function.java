public class function {
  static void fnc(int a, int b) {
    try {
      int sum = a+b;
      if(sum == 10) return ;
    } catch (Exception e) {
      System.out.println("Error!");
    } finally {
      System.out.println("Funciton end");
    }
    System.out.println("Function end 2");
  }
  public static void main(String[] args) {
    fnc(5, 5);
  }
}
