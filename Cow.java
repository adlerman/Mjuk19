public class Cow extends FarmAnimal {
  public Cow(String name) {
    super(name);
    nrOfLegs = 4;
    produce = "Milk";
  }

  @Override
  public void call() {
    System.out.println("Muuuh!");
  }
}
