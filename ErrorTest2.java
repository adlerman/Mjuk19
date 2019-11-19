import java.util.*;

public class ErrorTest2 {
  public static void main(String[]args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Välj nämnare:");
    int nominator = sc1.nextInt();
    int amountOfErrors = 0;
    try {
      int dividend = 100/nominator;
      System.out.println(dividend);
    }catch(Exception e) {
      System.out.println("Fel inträffade: " + e.getMessage());
      amountOfErrors++;
      System.out.println(amountOfErrors);
    }

    System.out.println("Koden fortsätter");

  }
}
