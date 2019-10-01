public class TestPerson {
  public static void main(String[]args) {
    Person p1 = new Person("Göran", 64);
    System.out.println(p1.firstName);


    p1.setFirstName("Vincent");

    System.out.println(p1.getFirstName());
  }
}
