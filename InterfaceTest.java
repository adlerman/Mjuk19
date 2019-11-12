public class InterfaceTest {
  public static void main(String[]args) {
    Goblin g1 = new Goblin();
    Monster g2 = new Goblin();
    Ghost gh1 = new Ghost();
    Monster m = g1;
    Mortal mo = g1;
    Mortal mo2 = g2;
    g2.getHealth();
    // Mortal mo2 = gh1;
    g1.attack();
    m.attack();
    mo.damage(10);
    System.out.println(g1.getHealth());
    //mo.attack();
    /*
    g1.attack();
    System.out.println(g1.getHealth());
    g1.damage(35);
    System.out.println(g1.getHealth());

    Rat r1 = new Rat();
    System.out.println(r1.getHealth());
    r1.damage(35);
    System.out.println(r1.getHealth());

    Ghost gh1 = new Ghost();
    gh1.attack();
    */
  }
}
