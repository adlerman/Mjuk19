public class Person {
  private String firstName;
  private String lastName;
  private int age;
  private boolean hungry;

  public Person(String firstName) {
    this.firstName = firstName;
  }

  public Person(int a) {
    age = a;
  }

  public Person(String fName,String lName, int a, boolean h) {
    firstName = fName;
    lastName = lName;
    age = a;
    hungry = h;

  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String n) {
    if(n != "Vincent") {
    firstName = n;
  }else {
    System.out.println("Not allowed first name.");
  }
  }

  public String toString() {
    return firstName +" "+ lastName +" "+ age +" "+ hungry;
  }
}
