import java.util.*;

public class ErrorTest2 {
  public static void main(String[]args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Välj nämnare:");
    int nominator = sc1.nextInt();
    try {
      int answer = getDividend(nominator);
    }catch(Exception e) {
      System.out.println("Fel inträffade: " + e.getMessage());
    }
    System.out.println("Koden fortsätter");

  }

  public static int getDividend(int nominator){
      if(nominator > 100) {
        throw new InputMismatchException("Error, larger than 100");
      } else if(nominator < 0) {
        throw new InputMismatchException("Error, negative number");
      }
      int dividend = 100/nominator;
      System.out.println(dividend);
      return dividend;

  }
}
