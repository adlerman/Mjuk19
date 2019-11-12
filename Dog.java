import java.util.*;

public class Dog {
  Random rand = new Random();
  public String name;
  public int age;
  public static boolean cute = true;
  public final int DOG_ID = rand.nextInt(999);

  public Dog(String name, int age, boolean cute) {
    this.name = name;
    this.age = age;
    this.cute = cute;
  }

  public Dog(String name) {
    this(name,0,true);
  }

  public Dog(String name, int age) {
    this(name,age,true);
  }

  public void isItFluffy(boolean f) {
    if(f) {
    System.out.println("The dog is very fluffy. Wow.");
  } else{
    System.out.println("The dog is not fluffy. Ew.");
  }
  }

  public void isItFluffy() {
    isItFluffy(true);
  }

  public String toString() {
    return name + " " + age + " " + cute;
  }

}
