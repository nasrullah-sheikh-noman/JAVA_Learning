class Pen {
  String color;
  String type;

  public void Write() {
    System.out.println("Writing something.");
  }
}

public class Classes {
  public static void main(String args[]) {
    System.out.println("Hello java developer!");
    Pen pen1 = new Pen();
    pen1.color = "Black";
    pen1.type = "Ballpoint";
    pen1.Write();
  }
}

