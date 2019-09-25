public class TestKorvmojj {
  public static void main(String[]args) {
    Person p1 = new Person("Hasse");
    p1.hungry = true;
    Person p2 = new Person();
    p2.hungry = true;
    Korvmojj korv = new Korvmojj();
    System.out.println(p1.hungry);

    korv.feedSausageToPerson(p1);
    System.out.println(p1.hungry);

    korv.feedSausageToPerson(p2);

    System.out.println(p1.firstName);
  }
}
