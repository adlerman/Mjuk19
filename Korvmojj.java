public class Korvmojj {
  public int amountOfSausagesLeft = 1;

  public void feedSausageToPerson(Person p) {
    if((p.hungry) && (amountOfSausagesLeft > 0)) {
      amountOfSausagesLeft--;
      p.hungry = false;
    }else {
      System.out.println("Sorry");
    }
  }
}
