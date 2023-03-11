package controlstatements;

public class leapyear {

  public static void main(String args[]) {
    int year = 2011;
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) { // divisible by 4 and 400. But, not by 100.
      System.out.println("Leap year");
    } else {
      System.out.println("Not a leap year");
    }
  }
}

// The years ending in '00 are known as century years, examples are 1300, 1500, 1400, and so on. 
// Only when a century year is equally divisible by 400 is it recognized as a leap year. 
// For instance, since 1200, 1600, and 2000 all precisely divide by 400, they are all century leap years.
