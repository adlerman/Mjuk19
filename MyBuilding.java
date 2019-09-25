public class MyBuilding {
  public static void main(String[]args) {
    int [] myArray = createArray(7);
    // printArray(myArray);

    int[] newArray = {1,3,3,7};
    int[] newestArray = doubleUpArray(newArray);
    printArray(newestArray);
  }

  public static int[] createArray(int x) {
    int[] array = new int[x];

    for(int i = 0; i < array.length; i++) {
      array[i] = i+1;
    }

    return array;
  }

  public static void printArray(int[] array) {
    for(int i = 0; i < array.length; i++) {
      System.out.print("Index " + i + ": ");
      System.out.println(array[i]);
    }
  }

  public static int doubleUpArray(int[] array) {
    int [] longArray = new int[array.length*2];
    for(int i = 0; i < array.length; i++) {
      longArray[i] = array[i];
    }
    return longArray;
  }

}
