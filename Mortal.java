public abstract class Mortal implements Screamer {
  private int health;

  public Mortal(int health) {
    this.health = health;
  }

  public abstract void screamForHelp();

  public int getHealth() {
    return health;
  }
  public void damage(int dmg) {
    health -= dmg;
  }
}
