public class MethodOverloading {
  public static void main(String[]args) {
    Dog d1 = new Dog("Doris",5);
    Dog d2 = new Dog("Boris",2);
    Dog d3 = new Dog("Jeff",4);

    System.out.println(d1.DOG_ID);
    System.out.println(d2.DOG_ID);
    System.out.println(d3.DOG_ID);
    // d1.isItFluffy();
  }
}
