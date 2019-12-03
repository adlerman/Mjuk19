import java.util.Random;

public class RepMain {
  public static void main(String[]args) {
    Pig p1 = new Pig("Johan");
    Chicken ch1 = new Chicken("Jeff");
    Cow c1 = new Cow("Klara");
    FarmAnimal f1 = new Chicken("Frej");
    Random rand = new Random();
    //checkName(ch1);
    int randomNr = rand.nextInt(300);
    //System.out.println(randomNr);

    String str = new String("Hejsan Svejsan!");
    /*
    System.out.println(str.length());
    System.out.println(str.charAt(2));
    System.out.println(str.equals("Hejsan Svejsan!"));
    System.out.println(str.substring(7,15));
    System.out.println(str.replace('j','d'));
    */
    String str2 = str;
    str2 = "Yo!";
    System.out.println(str);

    p1.number = 4;
    ch1.number =7;
    System.out.println(c1.number);


  }

  public static void checkName(FarmAnimal animal) {
    System.out.println("The animals name is " + animal.name + ".");
    Chicken c = (Chicken)animal;

    c.layEgg();
  }
}
