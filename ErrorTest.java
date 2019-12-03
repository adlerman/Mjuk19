import java.util.*;

public class ErrorTest {
  public static void main(String[]args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Skriv nämnare:");
    int nominator = sc1.nextInt();
    try{
      int dividend = 100/nominator;
      System.out.println(dividend);
    } catch(Exception e) {
      System.out.println("Fel inträffade: " + e.getMessage());
    } catch(ArithmeticException c) {
      System.out.println("Mattefel! " + c.getMessage());
    }
    }
}
