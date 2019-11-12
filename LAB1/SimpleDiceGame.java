import java.util.*;

public class SimpleDiceGame {
  public static void main(String[]args) {
    ArrayList<Player> playerList = initialize();
    System.out.println("Dags att börja spela!");
    for(int i=1;i<=5;i++){
      System.out.println("-----------------------------------------------------------------");
      System.out.println("Tur " + i);
      System.out.println("-----------------------------------------------------------------");
      takeTurn(playerList);
    }
    ArrayList<Player> winners = getWinners(playerList);
    if(winners.size() > 1) {
      System.out.println("Vinnarna är....");
      for(int i = 0; i < winners.size(); i++) {
        System.out.println(winners.get(i).getName());
      }
    }else{
      System.out.println("Vinnaren är.... " + winners.get(0).getName() + "!");
    }

  }

  private static ArrayList<Player> initialize() {
    Scanner input = new Scanner(System.in);
    System.out.println("Välkommen!");
    System.out.println("Hur många spelare önskas?");
    int numberOfPlayers = input.nextInt();
    System.out.println(numberOfPlayers);
    System.out.println("Hur många tärningar skall varje spelare ha?");
    int numberOfDice = input.nextInt();
    System.out.println(numberOfDice);
    System.out.println("Hur många sidor önskas på tärningarna?");
    int numberOfSides = input.nextInt();
    System.out.println(numberOfSides);
    input.nextLine();
    ArrayList<Player> playerList = new ArrayList<Player>();
    for(int i=0; i < numberOfPlayers; i++) {
      System.out.println("Vad heter spelare " +(i+1) + "?");
      Player p = new Player(input.nextLine());
      for(int j=0; j < numberOfDice; j++) {
        p.addDie(numberOfSides);
      }
      playerList.add(p);
    }
    return playerList;
  }

  private static void takeTurn(ArrayList<Player> players) {
    Scanner inputTurn = new Scanner(System.in);
    for(int i = 0; i<players.size(); i++) {
      System.out.println("Spelare " + (i+1) + ", gissa vad ditt totala slag blir:");
      int guess = inputTurn.nextInt();
      players.get(i).rollDice();
      if(players.get(i).getDiceValue() == guess) {
        System.out.println("Du gissade rätt! Ett poäng till spelare " +(i+1) + "!");
        players.get(i).increaseScore();
      }else {
        System.out.println("Du gissade fel, ditt slag blev " + players.get(i).getDiceValue() + ".");
      }

    }
  }

  private static ArrayList<Player> getWinners(ArrayList<Player> players) {
    ArrayList<Player> winners = new ArrayList<Player>();
    int highestScore = 0;
    for(int i = 0; i<players.size(); i++) {
      if(highestScore < players.get(i).getScore()) {
        winners.clear();
        winners.add(players.get(i));
        highestScore = players.get(i).getScore();
      }else if(highestScore == players.get(i).getScore()) {
        winners.add(players.get(i));
      }
    }
    return winners;
  }

}
