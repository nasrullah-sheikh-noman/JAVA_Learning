public class try_catch {
  public static void main(String[] args) {
    // TRY - CATCH in Exception Handling
    int[] marks = { 32, 89, 64, 51, 48 };
    // System.out.println(marks[8]);
    // System.out.println("Noman");

    try {
      // System.out.println(marks[8]);
    } catch (Exception error) {
      System.out.println(error);
    }
    // System.out.println("Nasrullah Sheikh Noman");


    int[] numbers = {10, 20, 30};

    try {
      // System.out.println(numbers[1]);
      // System.out.println(numbers[5]);
      // System.out.println("Hello");
    } catch (Exception e) {
      System.out.println("Error!");
    } finally {
      // System.out.println("Done");
    }


    try {
      System.out.println(marks[1]);
      
    } catch (Exception e) {
      System.out.println("Error!");
    } finally {
      System.out.println("Done");
    }
    System.out.println("Done");
  }  
}
