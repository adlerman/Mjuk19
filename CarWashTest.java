public class CarWashTest {
  public static void main(String[]args) {
    Car c1 = new Car("Volvo",2015,false,false);
    Car c2 = new Car("Fiat",1995,false,true);
    CarWash cw1 = new CarWash();
    cw1.wash(c2);
    cw1.wash(c2);

    System.out.println(cw1.timesUsed);
    }

}
