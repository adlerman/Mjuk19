public class Goblin extends Mortal implements Monster {


  public Goblin(int health) {
    super(health);
  }

  public void attack() {
    System.out.println("Waaaaah!");
  }

  public void screamForHelp() {
    System.out.println("Ieeeeek!");
  }
}
