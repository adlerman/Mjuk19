public class CarWash {
  public int timesUsed = 0;
  public void wash(Car c) {
    if(!c.insured) {
      System.out.println("This car is not insured, we won't touch it!");
    } else if(c.washed && c.insured) {
      System.out.println("What a clean car! No need to wash.");
    } else {
      c.washed = true;
      System.out.println("Your car has now been successfully washed. Congratulations.");
    }
    incrementTimesUsed();

  }

  private void incrementTimesUsed() {
    timesUsed++;
  }
}
