import java.util.Scanner;

public class Repetition {
  public static void main(String[] args) {
    double number1 = getInteger(); // 7
    double number2 = getInteger(); // 6
    System.out.println(number1 + " " + number2);
    double average = averageValue(number1, number2);
    System.out.println("Medelvärdet är " + average);
  }

  public static double getInteger() {
    Scanner getNumber = new Scanner(System.in);
    System.out.println("Skriv ett nummer:");
    double number = getNumber.nextDouble();
    return number;
  }
  public static double averageValue(double n1, double n2) {
    double sum = n1 + n2;
    double average = sum/2;
    return average;
  }
}
