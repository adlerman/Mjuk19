public class House {
  String address;
  int levels;
  int postCode;
  boolean isCool;
  char addressCharacter;

  public void changeAddress(String newAddress) {
    address = newAddress;
  }

  public String showAddress() {
    return address;
  }

}
