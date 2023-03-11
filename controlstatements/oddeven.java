package controlstatements;

public class oddeven {

  public static void main(String args[]) {
    int number = 2;

    String output = (number % 2 == 0) ? "Even" : "Odd";
    System.out.println(output);
  }
}
