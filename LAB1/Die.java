import java.util.*;

public class Die {
  private int sides;
  private int value;
  public Die (int s) {
    sides = s;

  }
  public void roll() {
    Random rollrand = new Random();
    value = rollrand.nextInt(sides)+1;
  }

  public int getValue() {
    return value;
  }

}
