class Pen {
  String color;
  String type;

  public void write() {
    System.out.println("Writing something.");
  }

  public void printColor() {
    System.out.println(this.color);
  }

  public void printType() {
    System.out.println(this.type);
  }
}

class Student {
  String name;
  String dept;

  Student(Student s) {
    this.name = s.name;
    this.dept = s.dept;
    // System.out.println("Constructor called.");
    // System.out.println(this.name);
    // System.out.println(this.dept);
  }

  Student() {
    
  }

  public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.dept);
  }
}

public class Classes {
  public static void main(String args[]) {
    System.out.println("Hello java developer!");
    Pen pen1 = new Pen();
    pen1.color = "Black";
    pen1.type = "Ballpoint";
    pen1.write();
    pen1.printColor();
    pen1.printType();
    Pen pen2 = new Pen();
    pen2.color = "White";
    pen2.type = "Jel";
    pen2.printColor();
    pen2.printType();
    Student student1 = new Student();
    student1.name = "Noman";
    student1.dept = "CSE";
    Student student2 = new Student(student1);
    student1.printInfo();
    student2.printInfo();
  }
}

