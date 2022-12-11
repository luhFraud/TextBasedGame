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

  public static void charDead(String dead[]) {
    for (int i = 0; i < dead.length; i++){

      if (dead[i] == null) {
        System.out.println(" ");
      } else {
        System.out.println(dead[i]);
      }
    }
  }
  public static void intro() {

    System.out.println("=============================================");
    System.out.println("\nZombie text based game by: Steven Partida, Evelyn "+
                        "Martinez, & Yamilena Hernandez");
    System.out.println("\n=============================================");

  }

  public static void firstLevel() {

    String selectedDoorItem;
    String[] dead = new String[2];


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
    System.out.println("The horde seems distracted from the noise " +
                        "and are walking towards the truck.");
    System.out.println("\nJosh: Nice! That should keep them distracted.");


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
      System.out.println(" 2 - TV Stand");
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
    System.out.println("\nAlvin: The TV stand should do.");
    selectedDoorItem = "tv stand";

    enterToCont();

    System.out.println("\nSarah: The horde of zombies is all around the " +
    "trailer. We need to find a way out!");
    System.out.println("James: We already looked around. Maybe you can find " +
                        "a way out.");

    int roomSelected;
    do {
      System.out.println("\nLook around for a way out the trailer: ");
      System.out.println(" 1 - Check Kitchen ");
      System.out.println(" 2 - Check Bathroom");
      System.out.println(" 3 - Check Bedroom");
      roomSelected = input.nextInt();

      if(roomSelected < 1 || roomSelected > 3){
        System.out.println("Please enter a valid option");
        roomSelected = input.nextInt();
      }

      if(roomSelected == 1) {
        System.out.println("\nCan't go out through here.");

      } else if (roomSelected == 2) {
        System.out.println("\nOnly way out is through that small window but " +
                            "I doubt anyone can fit through there.");
      }

    } while (roomSelected != 3);
    System.out.println("\nWe can probably get out through that skylight window "+
                        "but we need a way to get up there.");
    System.out.println("Joel: We can probably use that " +
                        selectedDoorItem + " that is holding the door shut.");

    System.out.println("\nSarah: What!? You'll let the zombies in!");
    System.out.println("Joel: The " +selectedDoorItem+ " is the only thing " +
    "in the trailer that can get us up there.");
    System.out.println("Alvin: Joel is right. I can hold the door while "+
                        "the rest of you climb out.");

    enterToCont();

    System.out.println("\nAlvin is holding the door shut while the rest of " +
    "the group is exiting through the skylight window. You and Christa are " +
    "the only ones left before Alvin can let the door go. Christa is stuck " +
    "frozen from fear. You need to convince her before you go. ");

    enterToCont();

    System.out.println("Convince Christa to move: ");
    System.out.println("1 - Leave Her");
    System.out.println("2 - Hey! Christa we need to leave.");
    System.out.println("3 - Snap out of it Christa and let's go!");
    System.out.println("4 - Christa the group is left. They are waiting for " +
                        "you.");
    int christaTalk = input.nextInt();

    if(christaTalk < 1 || christaTalk > 4 ) {
      System.out.println("Please enter a valid option");
      christaTalk = input.nextInt();
    }

    if(christaTalk == 1){
      System.out.println("\nYou decide to leave Christa to the horde.");
      dead[0] = "Christa";
      System.out.println("Alvin: Fine we'll go with out her!");
    } else if(christaTalk == 2 ){
      System.out.println("\nChrista gets up and climbs up to the skylight");
    } else if(christaTalk == 3 ){
      System.out.println("\nChrista gets up in a panic and leaves with the " +
                          "group");
    } else {
      System.out.println("\nChrista gets up and leaves with the group.");
    }

    System.out.println("\nAlvin: You go first. I'll be behind you.");

    enterToCont();

    System.out.println("\nAs you are climbing the skylight Alvin gets grab by" +
                        " zombies. Do you save him or leave him to the horde?");
    System.out.println("1 - Save Alvin");
    System.out.println("2 - Leave Alvin");
    int saveOrKillAlvin = input.nextInt();

    if(saveOrKillAlvin < 1 || saveOrKillAlvin > 2) {
      System.out.println("Please enter a valid option");
      saveOrKillAlvin = input.nextInt();
    }

    if(saveOrKillAlvin == 1) {
      System.out.println("\nYou go back and save Alvin but you took a hit from" +
                          " a zombie.");
      health = 100 - 25;
      displayHealth(health);
    } else {
      System.out.println("\nYou decide to leave Alvin to the horde.");
      dead[1] = "Alvin";
    }

    System.out.println("\nYou get to the roof with the rest of the group and " +
    "jump over the fence that separated the trailer park with the rest of " +
    "the world.");

    System.out.println("\nMission recap: You managed to escape the trailer " +
                        "park. These are the group members who died: ");
    charDead(dead);






  }
}
