import java.util.Scanner;

public class take_input {

  public static void main(String[] args) {
    // How to take input?
    Scanner sc = new Scanner(System.in);
    System.out.print("Input your age: ");
    int age = sc.nextInt();
    System.out.print("Your are ");
    System.out.print(age);
    System.out.println(" years old.");

    System.out.print("Input your weight: ");
    float w8 = sc.nextFloat();
    System.out.print("Your weight is ");
    System.out.print(w8);
    System.out.println(" kg.");

    System.out.print("Input your name: ");
    String name = sc.next();
    System.out.print("Your name is ");
    System.out.print(name);
    System.out.print(".");
  }
}