public class Goblin implements Monster,Mortal {
  private int health = 100;
  public void attack() {
    System.out.println("Waaaaah!");
  }

  public int getHealth() {
    return health;
  }

  public void damage(int dmg){
    health -= dmg;
  }
}
