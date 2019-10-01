public class Car {
  String model;
  int year;
  boolean washed;
  boolean insured;

  public Car(String m, int y, boolean w, boolean i) {
    model = m;
    year = y;
    washed = w;
    insured = i;
    System.out.println("A new car! It has that new car smell.");
  }

}
