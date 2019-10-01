public class Car {
  public String model;
  public int year;
  public boolean washed;
  public boolean insured;

  public Car(String m, int y, boolean w, boolean i) {
    model = m;
    year = y;
    washed = w;
    insured = i;
    System.out.println("A new car! It has that new car smell.");
  }

}
