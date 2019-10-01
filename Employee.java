public class Employee {
  public String name;
  public int age;

  public Employee() {
    System.out.println("New employee! Who knows who?");
  }

  public Employee(String n) {
    name = n;
    System.out.println("New employee! Hurray for " +name+ "!");
  }

  public Employee(int a) {
    age = a;
    System.out.println("New employee, this person is " + age + " years old!");
  }

  public Employee(String n, int a) {
    name = n;
    age = a;
    System.out.println("New employee, " + name + " is " + age + " years old!" );
  }

  public void sayHello() {
    System.out.println("Hello there!");
  }

}
