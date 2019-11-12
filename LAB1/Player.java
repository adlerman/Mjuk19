import java.util.*;

public class Player{
  private String name;
  private int score = 0;
  ArrayList<Die> playerDice = new ArrayList<Die>();

  public Player(String n) {
    name = n;
  }

  public Player(String n, ArrayList<Die> d) {
    name = n;
    playerDice.addAll(d);
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public void rollDice() {
    for(int i = 0; i < playerDice.size(); i++) {
      playerDice.get(i).roll();
    }
  }

  public int getDiceValue() {
    int totalDieValue = 0;
    for(int i = 0; i < playerDice.size(); i++) {
      totalDieValue= totalDieValue + playerDice.get(i).getValue();
    }
    return totalDieValue;
  }

  public void printDice() {
    for(int i = 0; i < playerDice.size(); i++) {
      System.out.println(playerDice.get(i).getValue());
    }
  }

  public void increaseScore() {
    score++;
  }

  public void addDie(int sides) {
    Die d = new Die(sides);
    playerDice.add(d);
  }
}
