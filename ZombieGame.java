import java.util.*;

public class ZombieGame {

  static final Scanner input = new Scanner(System.in);

  public static void main(String[] args){

    intro();
    firstLevel();
    secondLevel();
    thirdLevel();
    
  } // end of main

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

  } // end of firstLevel 
  
  public static void secondLevel() {
    System.out.println("=============================================");
    System.out.println("================NEW MISSION================");
    System.out.println("=============================================");

    System.out.println("\nMission 2:  Uh oh! you are our of medical supplies." +
    " You, Lance, Gabriel, and Tory are have been assigned to gather " +
    " gather some supplies at a near by hospital. ");

    enterToCont();

    int health = 100;
    displayHealth(health);

    enterToCont();

    System.out.println("\nLance: We have to be careful here, There" +
                        " could be some roaming around the halls." +
                        " We have to come up with a plan.");
    System.out.println("\nGabriel: I know theres gauze and first aid kits" +
                        " on the second floor. Medicines are on the first.");
    System.out.println("\n: BANG!");
    System.out.println("\nTory: What was that?!.");
    System.out.println("\nYou: Sorry!");
    System.out.println("\nLance: Be careful any noise can trigger them" +
                        " to head our way. Best option we have right" +
                        " now is to split up, Tory you are with me,"+
                        " you and gabriel head to the second floor.");
    System.out.println("\nGabriel: Got it let's move.");

    enterToCont();

    System.out.println("\n: You and Gabriel reach the Second floor "+
                        "to the room with Medical supplies.");

    System.out.println("\nGabriel: Alright we have to get first aid kits"+
                        " and gauze.");
    System.out.println("\n: CRASH! ");
    System.out.println("\nGabriel: Was that you again?");
    System.out.println("You: um no.");
    System.out.println("Gabriel: Oh no there coming! Hurry no time to grab" +
                        "everything choose something quick!");

    enterToCont();

    int supplyChoice;
    do {

      System.out.println("\nHurry grab and Item. Enter: ");
      System.out.println(" 1 - Gauze");
      System.out.println(" 2 - First aid kit");
      supplyChoice = input.nextInt();

      if(supplyChoice< 1 || supplyChoice >2) {
        System.out.println("Please enter a valid option");
        supplyChoice = input.nextInt();
      }
      if(supplyChoice == 2) {
        System.out.println("\nHmmm maybe not that essential");
        System.out.println("\nTry something else.");

      }

    } while (supplyChoice != 1);
        System.out.println("\nGabriel: Alright let's move."
        System.out.println("\n: First aid collected");


    enterToCont();

    System.out.println("\n: You meet up with the rest of the team, when suddenly "
                        " you start hearing noises.");
    System.out.println("\Lance: It's getting risky we should go now!");
    System.out.println("\n Zombies are by the entrance and have now spot you"
                        "and started heading your way"):
    System.out.println("\nTory: Right behind you, but looks like where we came from"+
                        " is now blocked. Let's head this way.");
    System.out.println("\nYou and the group run down the hall and you are led to two"+
                        " different hallways.");
    System.out.println:("\nTory: Which way do we go?")

    enterToCont();


    int hallwayChoice;
    do {
      System.out.println("\nChoose which hallway to continue Enter: ");
      System.out.println(" 1 - Left");
      System.out.println(" 2 - Right");
      hallwayChoice = input.nextInt();

      if(hallwayChoice < 1 || hallwayChoice > 2) {
        System.out.println("Please enter a valid option");
        hallwayChoice = input.nextInt();
      }

      if(hallwayChoice == 1) {
        System.out.println("\nYou and the team head Left.");
        System.out.println("\nLance: Its a dead end!");
        System.out.println("\nTory: Oh no! I hear them coming!" +
                            "Your trapped and the zombies are coming."+
                            "You died...Try something else.");
      }

    } while (hallwayChoice != 2);

    System.out.println("\n You and the team head right.");
    System.out.println("\nTory: Look over there I see exits ");
    System.out.println("\nGabriel: Nice! Keep running! ");

    enterToCont();
    
    System.out.println("\nYou reach the end of the hallway and you " +
                       " are now havig to choose between 3 exits");
    System.out.println("Gabriel: Now which way do we go?");
    int exitSelected;
    do {
      System.out.println("\nChoose an exit: ");
      System.out.println(" 1 - Right exit ");
      System.out.println(" 2 - Left exit ");
      System.out.println(" 3 - Middle exit");
      exitSelected = input.nextInt();

      if(exitSelected < 1 || exitSelected> 3){
        System.out.println("Please enter a valid option");
        exitSelected = input.nextInt();
      }
      if(exitSelected == 1) {
        System.out.println("\nLance: Can't go this way, It's locked.");
      } else if (exitSelected == 2) {
        System.out.println("\nTory: It's locked We can't exit here.");
      }
    } while (exitSelected!= 3);
    System.out.println("\nLook we can pull it open from this side.");
    System.out.println("\nTory: It won't stay open!");
    System.out.println("Lance: One of us had to keep it open enough for"+
                        " the rest of us to exit");
    System.out.println("Tory: That's crazy who would do that!")
    System.out.println("Gabriel: Lance is right. I can hold the door while "+
                        "the rest of you exist.");
    System.out println("Tory: What! no! I won't let you do that brother!");
    System.out.println("Gabriel: No time GO!!");

    enterToCont();
    System.out.println("\nGabriel is holding the door open while the rest of " +
    "the group is exiting through the door. You and Lance are " +
    "the only ones left before Gabriel can let the door go.");

    System.out.println("\nLance exits after and it's only you and Gabriel left.");
    System.out.println("\nGabriel: You go first. I'll be behind you.");

    enterToCont();
    System.out.println("\nAs you are exiting the dorr Gabriel gets grab by" +
                        " zombies. Do you save him or leave him to the horde?");
    System.out.println("1 - Save Gabriel");
    System.out.println("2 - Leave Gabriel");

    int saveOrKillGabriel = input.nextInt();
    if(saveOrKillGabriel < 1 || saveOrKillGabriel > 2) {
      System.out.println("Please enter a valid option");
      saveOrKillGabriel = input.nextInt();
    }
    if(saveOrKillGabriel == 1) {
      System.out.println("\nYou go back and save Gabriel but you took a hit from" +
                          " a zombie.");
      health = 100 - 25;
      displayHealth(health);
    } else {
      System.out.println("\nYou decide to leave Gabriel to the horde.");
      unalive[1] = "Gabriel";
    }
    System.out.println("\nYou exit the hospital and run to the rest of the group");
    System.out.println("Tory: Where's Gabriel? Where's my brother?!");
    System.out.println("\nYou look at Tory and Lance and say nothing." +
    " Lance just sighs and Tory starts crying.");
    System.out.println("Tory: NOOO!!! Gabriel!!");
    System.out.println("Lance: C'mon we gotta leave now");
    System.out.println("\nYou and Lance hold on to Tory as you guys start heading"+
    "back to base completing your mission.");
    enterToCont();

    System.out.println("\nMission recap: You managed to collect medical supplies " +
                        "and escape the horde. These are the group members who died: ");
    charDead(unalive);

    enterToCont();

  }// end of secondLevel
  
  public static void thirdLevel() {
    System.out.println("=============================================");
    System.out.println("================NEW MISSION================");
    System.out.println("=============================================");

    System.out.println("\nMission 3: Bad news! The solar panels in your " +
    "settlement broke and needs a new part, Good news is there's a tech " +
    "wearhouse nearby. You, Rick, Stacy, and Xavier have been assigned " +
    "to get the new part.");

    enterToCont();

    System.out.println("\nYou guys arrive at the wearhouse.");

    int health = 100;
    displayHealth(health);

    System.out.println("\nYou: Looks like the wearhouse is untouched, the " +
    "doors aren't barricaded.");
    System.out.println("Rick: Yea, lets do a parameter check, know our " +
    "exits in case.");
    System.out.println("You: Alright, Xavier your with me lets go.");
    System.out.println("Rick: We'll take west and you guys east. Meet you " +
    "guys on the other side.");

    enterToCont();

    System.out.println("\nYou and Xavier are walking around and run into a bus"+
    " full of zombies, there's so many!");

    enterToCont();

    int riskIt;
    int helpHim;

    System.out.println("\nShould you guys:");
    System.out.println(" 1 - Risk it and close the bus doors to prevent" +
    " them from coming out later.");
    System.out.println(" 2 - Keep going but risk running into them on " +
    "your way out.");
    riskIt = input.nextInt();

    if(riskIt < 1 || riskIt > 2) {
      System.out.println("Please enter a valid option");
      riskIt = input.nextInt();
    }

    if(riskIt == 1) {
      System.out.println("\nYou: Alright we should close the door in case.");
      System.out.println("Xavier: You go around and bang the back to " +
      "distract them while I go in to close it");
      System.out.println("\nTHUMP! THUMP! THUMP You bang on the back window," +
      " Xavier tries pulling the lever but it won't budge. You: \"Hurry!\" ");
      System.out.println("Should you go help Xavier? Press 1 to Help -- " +
      "Press 2 If you think he's got it.");
      helpHim = input.nextInt();

      if(helpHim == 1){
        System.out.println("You go help him pull and it closes!");
      }
      else {
        System.out.println("Your right he manages to close the doors");
        System.out.println("That was a close one. Come on let's go. ");
      }

    }
    else {
      System.out.println("Let's just keep going, we can't risk it, there's " +
      "too many of them and 2 of us.");
    }

    System.out.println("\nYou and Xavier check the parameter, kill any " +
    "roaming zombies. You finally meet with Rick and Stacy.");

    enterToCont();

    System.out.println("\nRick: All clear");
    System.out.println("Xavier: All clear");

    enterToCont();

    int killThem;

    System.out.println("The front doors opens! 7 Zombies come out " +
    "looks like one them is a soldier.");
    System.out.println(" 1 - Shoot the zombies ");
    System.out.println(" 2 - Save your bullets and stab the zombies");
    killThem = input.nextInt();

    if(killThem < 1 || killThem > 2){
      System.out.println("Please enter a valid option");
      killThem = input.nextInt();
    }

    if(killThem == 1) {

      System.out.println("\nYou pull out your gun and aim right for the" +
      " soldier");
      System.out.println("Xavier yells NOOO! but you still shoot anyways");
      System.out.println("BOOOOM!!!");
      System.out.println("\nThe soldier had a grenade on his chest and you " +
      "hit it.");

      health -= 25;
      displayHealth(health);

      System.out.println("\nYour thrown on the floor, arm is bleeding" +
      "Shock, but you see a blurry vision of a herd of zombies coming");
      System.out.println("Rick: NO! Stacy, she's gone.");
      System.out.println("Xavier: We Gotta Go!!");
      System.out.println("Shock you get up, \"I saw another door this way!\" ");

    }
    else {
      System.out.println("\nThe zombie soldier makes it's way over to you, " +
      "the rest of the group starts killing the others");
      System.out.println("You: I got this one, \'You stab it\' ");
    }

    enterToCont();

    System.out.println("\nRick: We need to get this part and leave!");
    System.out.println("You guys enter the building.");
    System.out.println("You: Me & Rick will cover you Xavier, start looking.");
    System.out.println("You guys start fighting the zombies that made their " +
    "way over. It's chaos, Xavier starts ripping boxes apart frantically.");
    System.out.println("Xavier: I got it! Let's go.");

    enterToCont();

    System.out.println("You guys return home and practicality saved everyone " +
    "from a hard winter without heat, your polar panels are soon " +
    "to start working again.");

    if(killThem == 1){
      System.out.println("Although Stacy didn't make it, we will never forget " +
      "her");
    }

  } // end of thirdLevel
  
} // end of class
