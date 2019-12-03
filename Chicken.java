public class Chicken extends FarmAnimal{
  public Chicken(String name) {
    super(name);
    nrOfLegs = 2;
    produce = "Eggs";
  }

  @Override
  public void call() {
    System.out.println("Cacaw!");
  }

  public void layEgg() {
    System.out.println(name + " has layed an egg!");
  }
}
