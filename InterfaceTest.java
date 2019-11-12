public class InterfaceTest {
  public static void main(String[]args) {
    /*
    TestClass t1 = new TestClass();
    int a = t1.testMethod();
    t1.anotherTest();

    */
    Goblin g1 = new Goblin(100);
    Monster g2 = new Goblin(100);

    Monster m = g1;
    Mortal mo = g1;

    Rat r1 = new Rat(10);
    r1.screamForHelp();
    g1.screamForHelp();

    Ghost gh1 = new Ghost();
    gh1.attack();
  }
}
