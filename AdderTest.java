import org.junit.Test;
import static org.junit.Assert.*;

public class AdderTest {
  @Test

  public void testAdder() {
    Adder a1 = new Adder();
    assertEquals(8,a1.add(3,4)); // 3 + 4 = 7?
    assertEquals(700,a1.add(300,400)); // 300 + 400 = 700?
    assertEquals(0,a1.add(0,0)); // 0 + 0 = 0?
  }
  @Test
  public void testAdder2() {
    Adder a1 = new Adder();
    assertEquals(3,a1.add(-7,10)); // -7 + 10 = 3?
  }
}
