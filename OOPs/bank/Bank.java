package bank;

class Account {
  public String name;
  protected String email;
  private int balance;

  public void getbalance() {
    System.out.println(this.balance);
  }

  public  void setbalance(int balance) {
    this.balance = balance;
  }
}


public class Bank {
  public static void main(String args[]) {
    Account u1 = new Account();
    u1.name = "Nasrullah";
    u1.email = "noman@gmail.com";
    u1.getbalance();
  }
}
