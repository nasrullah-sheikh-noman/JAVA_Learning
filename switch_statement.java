public class switch_statement {
  public static void main(String[] args) {
    // Fall-through in Java Switch Statement
    int day = 0;
    switch (day) {
      case 1:
        System.out.println("First day");
        // break;
      case 2:
        System.out.println("Secnod day");
        // break;
      default:
        System.out.println("others day");
    } 
  }  
}
