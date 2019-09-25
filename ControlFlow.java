import java.util.*;

public class ControlFlow {
  public static void main(String[]args) {
    Scanner userInput = new Scanner(System.in);
    // int input = userInput.nextInt();
    // System.out.println(input);
    int nummer1 = 3;
    int nummer2 = 5;
    int sum;
    sum = addTwoIntegers(nummer1,nummer2);
    System.out.println(sum);
  }

  public static int addTwoIntegers(int x, int y) {
    // System.out.println(x + " + " + y);
    int sum = x + y;
    // System.out.println(" = " + sum);
    return true;
  }

  public static void countEven() {
    for(int even = 2; even <= 12; even += 2) {
      System.out.println(even);
    }
  }

  public static void countDownFrom40() {
    int countDown = 40;
    while(countDown >= 30) {
      System.out.println(countDown);
      countDown--;
    }
  }
}
