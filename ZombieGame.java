import java.util.*;

public class ZombieGame {

  static final Scanner input = new Scanner(System.in);

  public static void main(String[] args){

    intro();
    firstLevel();
  }

  //This method will display the players health in every mission.
  public static void displayHealth(int health) {

    System.out.println("\nHealth: " + health + "%");

  }

  //This method will add a pause to strings.
  public static void enterToCont() {
    System.out.println("\nPress Enter to Continue");
    input.nextLine();
  }
  public static void intro() {

    System.out.println("=============================================");
    System.out.println("\nZombie text based game by: Steven Partida, Evelyn "+
                        "Martinez, & Yamilena Hernandez");
    System.out.println("\n=============================================");

  }

  public static void firstLevel() {

    System.out.println("\nMission 1: It is 4:35 pm the sun is starting " +
    "to set. You and the group you were assigned to are heading back to " +
    "the settlement from your daily loot runs in the nearby small town. " +
    "When suddenly there is a sound of gunfire nearby. " +
    "You and your group decide to check it out. ");

    enterToCont();

    int health = 100;
    displayHealth(health);

    System.out.println("\nSarah: Did you hear that?");
    System.out.println("Josh: That came from the trailer park!");
    System.out.println("Luke: Joel's group was assigned there. " +
                        "We should go help!");

    enterToCont();

    System.out.println("\n4:49 pm: You and the group arrive at the trailer " +
                        "park and notice a horde of zombies surrounding a " +
                        "near by trailer.");

    enterToCont();

    System.out.println("\nLuke: They got to be in there. That's Joel's truck.");
    System.out.println("Sarah: There is too many zombies. " +
                        "We need to find a way to distract them.");
    System.out.println("Josh: Any ideas?");

    System.out.println("\nFind a way to distract the horde. Enter: ");
    System.out.println(" 1 - Throw a brick at a near by trailer window");
    System.out.println(" 2 - Place something on top of the horn of Joel's " +
                        "truck");
    int userChoice;
    userChoice = input.nextInt();

    if(userChoice < 1 || userChoice > 2) {
      System.out.println("Please enter a valid option");
      userChoice = input.nextInt();
    }

    if (userChoice == 1) {
      System.out.println("\nThe horde look distracted but only for a " +
      "momment and went back to banging there way into the trailer.");
      System.out.println("Josh: That wasn't loud enough. Try something else.");

    } else {
      System.out.println("\nThe horde seems distracted from the noise " +
                          "and are walking towards the truck.");
      System.out.println("Josh: Nice! That should keep them distracted.");
    }



  }
}
