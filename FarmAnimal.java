public class FarmAnimal {
  public String name;
  public int nrOfLegs;
  public String produce;
  public static int number = 0;

  public FarmAnimal(String name) {
    this.name = name;
  }

  public void call() {
    System.out.println("Hello!");
  }
}
