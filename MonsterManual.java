public class MonsterManual {
  public static void main(String[]args) {
    Human firstHuman = new Human();
    firstHuman.name = "Olaf Förgöraren";
    firstHuman.age = 27;
    firstHuman.gender = 's';
    firstHuman.weapon = "Longsword +2";

    Human secondHuman = new Human();
    secondHuman.name = "Hobbs the Hermit";

    System.out.println(firstHuman.name);
    System.out.println(firstHuman.weapon);

    System.out.println(secondHuman.name);
    System.out.println(secondHuman.weapon);

    firstHuman.sayHello();
    //secondHuman.sayHello();
  }
}
