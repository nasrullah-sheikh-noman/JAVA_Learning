interface Flyer {
  public void fly();
}

class Duck implements Flyer {
  public void fly() {
    System.out.println("Duck flying.");
  }
}

public class Interfaces {
  public static void main(String args[]) {
    Duck d1 = new Duck();
    d1.fly();
  }
}
