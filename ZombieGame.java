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

    String selectedDoorItem;

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

    int userChoice;
    do {

      System.out.println("\nFind a way to distract the horde. Enter: ");
      System.out.println(" 1 - Throw a brick at a near by trailer window");
      System.out.println(" 2 - Place something on top of the horn of Joel's " +
                          "truck");
      userChoice = input.nextInt();

      if(userChoice < 1 || userChoice > 2) {
        System.out.println("Please enter a valid option");
        userChoice = input.nextInt();
      }

      if(userChoice == 1) {
        System.out.println("\nThe horde look distracted but only for a " +
        "momment and went back to banging there way into the trailer.");
        System.out.println("\nJosh: That wasn't loud enough. " +
                            "Try something else.");

      }

    } while (userChoice != 2);

    System.out.println("\nYou pick up a dead corpse and sit him up in the " +
    "diver seat with his head on the horn.");
    System.out.println("\nThe horde seems distracted from the noise " +
                        "and are walking towards the truck.");
    System.out.println("\nJosh: Nice! That should keep them distracted.");

    enterToCont();

    System.out.println("\nBANG BANG BANG");
    System.out.println("Luke: Joel you in there! It's Luke!");
    System.out.println("Joel: Luke!? Alvin let them in!");


    System.out.println("\n5:05 pm: You and the group got into the trailer and " +
                        "found Joel's group.");

    enterToCont();

    System.out.println("\nJoel: Luke what are you doing here?");
    System.out.println("James: Josh!");
    System.out.println("Josh: James!");
    System.out.println("Sarah: Hey christa! How you doing?");
    System.out.println("Christa: I'm scared Sarah. I thought I was going to" +
                        " die!");
    System.out.println("Luke: We were heading back from the loot run when...");

    enterToCont();

    System.out.println("\nLuke's explanation was interrupted by the sudden " +
                        "silence. The dead corpse you placed in the truck " +
                        "slid off and now the horde is coming back.");

    enterToCont();

    System.out.println("\nThe horde is now banging at the trailer door.");
    System.out.println("Alvin: I can't hold them for much longer!" +
    " Someone find something to hold the door!");

    int doorItem;
    do {

      System.out.println("\nFind something to hold the door shut: ");
      System.out.println(" 1 - Wooden Chair");
      System.out.println(" 2 - Book Shelf");
      System.out.println(" 3 - Coat Rack");
      doorItem = input.nextInt();

      if(doorItem < 1 || doorItem > 3){
        System.out.println("Please enter a valid option");
        doorItem = input.nextInt();
      }

      if(doorItem == 1) {
        System.out.println("\nAlvin: The wooden chair won't work." +
                            " Find something else.");
      } else if(doorItem == 3) {
        System.out.println("\nAlvin: What is the coat rack going to do?" +
                            " Find something else.");
      }
    } while (doorItem != 2);
    System.out.println("\nAlvin: The book shelf should do.");
    selectedDoorItem = "book shelf";

    System.out.println("\nSarah: The horde of zombies is all around the " +
    "trailer. We need to find a way out!");
    System.out.println("James: We already looked around. Maybe you can find " +
                        "a way out.");


  }
}
