public class Teacher extends Person {
  public int salary = 1;
  private String areaOfExpertise;

  public Teacher(String firstName) {
    super(firstName);
    //setFirstName(firstName);
  }

  public void printName() {
    System.out.println(getFirstName());
  }

}
