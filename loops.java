import java.util.Scanner;

public class loops {
  static int x;
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      // System.out.println(i);
    }
    x = 3;
    System.out.println(x);
    int i = 10;
    while (i > 0) {
      // System.out.println(i);
      i--;
    }
    i = 10;
    do{
      // System.out.println(i);
      i--;
    } while (i > 0);

    Scanner sc = new Scanner(System.in);
    int num;
    do {
      System.out.print("Input a number: ");
      num = sc.nextInt();
      System.out.print("Hare is your number: ");
      System.out.println(num);
    } while (num > 0);
    System.out.println("End.");
  }
}
