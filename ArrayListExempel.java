import java.util.*;

public class ArrayListExempel {
  public static void main(String[]args) {
    ArrayList<Integer> listan = new ArrayList<Integer>();
    listan.add(0,7);
    listan.add(0,4);
    listan.add(0,6);
    listan.add(0,9);
    printArrayList(listan);
    System.out.println("Gamla värdet på plats 2: " + listan.get(2));
    listan.set(2,200);
    System.out.println("Nya värdet på plats 2: " + listan.get(2));
    System.out.println("Längden på min ArrayList: " + listan.size());
    printArrayList(listan);
  }

  public static void printArrayList(ArrayList<Integer> listan) {
    for(int i=0;i<4;i++) {
      System.out.println(listan.get(i));
    }
  }
}
