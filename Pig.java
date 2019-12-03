public class Pig extends FarmAnimal{

  public Pig(String name) {
    super(name);
    nrOfLegs = 4;
    produce = "Ham";
  }

  @Override
  public void call() {
    System.out.println("Oink!");
  }
}
