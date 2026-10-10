import java.lang.reflect.Array;
import java.util.Arrays;

public class basic{
  public static void main(String[] args) {
    // System.out.println("Hello java developer.");
    // System.out.print("hello future engineer");
    // System.out.println("hello future engineer");
    // System.out.println("Hello developers.");
    String s2 = new String("Noman");

    // String s = "Noman";
    // System.out.println(s);
    int age = 18;
    // System.out.println(age);
    // String s2 = s;
    // System.out.println(s2);
    byte a = 88;
    int n = 1234567890;
    long val = 1234567891234567891L;
    float f = 1234567891.80000F;
    char c = 'c';
    // boolean ok = true;
    // System.out.println(a);
    // System.out.println(n);
    // System.out.println(val);
    // System.out.println(f);
    // System.out.println(c);
    // System.out.println(ok);

    String s = "Nasrullah";
    // System.out.println(s);
    // System.out.println(s.length());
    // System.out.println(s2.length());
    String fi = s;
    String se = "Noman";
    String full = fi + " Sheikh " + se;
    // System.out.println(full);
    // System.out.println(s.charAt(2));
    String rep = s.replace("as", "hary");
    // System.out.println(rep);
    // System.out.println(s.substring(0, 4));
    
    int arr[] = new int[3];
    arr[0] = 87;
    arr[1] = 97;
    arr[2] = 74;
    // System.out.println(arr[0]);
    int x = 32;
    x = 88;
    // System.err.println(x);
    boolean arr2[] = new boolean[4];
    // System.err.println(arr2[0]);
    // boolean ok2 = true;
    // System.out.println(ok2);
    // System.out.println(arr2.length);
    // Arrays.sort(arr);
    // System.out.println(arr[0]);

    int[] marks = { 90, 87, 97, 89 };
    // System.out.println(marks[0]);

    int[][] finalMarks = { { 90, 98, 87 }, { 89, 79, 93 } };
    // System.out.println(finalMarks[0][2]);

    double price = 100.00;
    double finalPrice = price + 25;
    // System.out.println(finalPrice);

    int p = 100;
    int fp = p + (int)25.00;
    // System.out.println(fp);

    age = 18;
    age = 19;
    // System.out.println(age);

    final float PI = 3.1416F;
    System.out.println(PI);
  } 
}