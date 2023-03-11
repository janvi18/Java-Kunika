package controlstatements;

public class fibonacci {

  public static void main(String args[]) {
    int n1 = 0;
    int n2 = 1;
    int n3, i, count = 5;
    System.out.println(n1 + " " + n2); // printing 0 and 1

    for (i = 2; i < count; i++) {
      n3 = n1 + n2;
      System.out.println(" " + n3);
      n1 = n2;
      n2 = n3;
    }
  }
}
// 0 and 1
// 0+1=1
// 1+1=2
// 2+1=3
// 2+3=5
// 3+5=8
// 5+8=13
