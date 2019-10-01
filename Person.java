public class Person {
  public String firstName;
  private String lastName;
  private int age;
  private boolean hungry;

  public Person() {

  }

  public Person(String fName) {
    firstName = fName;
  }

  public Person(int a) {
    age = a;
  }

  public Person(String fName, int a) {
    firstName = fName;
    age = a;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String n) {
    if(n != "Vincent") {
    firstName = n;
  }else {
    System.out.println("Not allowed first name.");
  }
  }
}
