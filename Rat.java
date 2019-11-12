public class Rat implements Mortal {
  private int health = 10;

  public int getHealth() {
    return health;
  }

  public void damage(int dmg){
    health -= dmg;
  }
}
