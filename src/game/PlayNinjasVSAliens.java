package game;

import java.util.Scanner;

/**
 * Created by Daniel on 11/11/16.
 */
public class PlayNinjasVSAliens {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){

        NinjasVSAliens nva = new NinjasVSAliens();

        System.out.println("Lets play a game.");
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome, "+name);

        String playerType = "";
        while (!(playerType.equalsIgnoreCase("ninja") || playerType.equalsIgnoreCase("alien"))) {
            System.out.println("Are you a Ninja or Alien? [ninja/alien]");
            playerType = scanner.nextLine();

            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Noble choice, the Ninja is stealthy and fast.");
            } else if (playerType.equalsIgnoreCase("alien")) {
                System.out.println("Powerful choice, the Alien is scary and strong.");
            } else {
                System.out.println("Invalid player type.");
            }
        }



        String weapon = "";
        while(!((playerType.equalsIgnoreCase("ninja") && ((weapon.equalsIgnoreCase("blade")) || (weapon.equalsIgnoreCase("star")))) ||
                ((playerType.equalsIgnoreCase("alien") && ((weapon.equalsIgnoreCase("claw")) || (weapon.equalsIgnoreCase("laser"))))))) {
            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Okay ninja, choose your weapon [blade/star]");
            } else {
                System.out.println("Okay alien, choose your weapon [claw/laser]");
            }
            weapon = scanner.nextLine();
            if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("blade")) {
                System.out.println("The ninja blade is close range, but deals more damage.");
            } else if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("star")) {
                System.out.println("The ninja star does less damage, but keeps you at a safer range.");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("claw")) {
                System.out.println("The alien claw is  close range, but deals more damage.");
            } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("laser")) {
                System.out.println("The alien laser does less damage, but keeps you at a safer range.");
            } else {
                System.out.println("Invalid weapon.");
            }
        }

        String location = "";
        while (!(location.equalsIgnoreCase("forest") || location.equalsIgnoreCase("space") || location.equalsIgnoreCase("ocean"))) {
            System.out.println("Choose your location? [forest/space]");
            location = scanner.nextLine();

            if (location.equalsIgnoreCase("forest")) {
                System.out.println("The forest gives the ninja a slight stealth advantage.");
            } else if (location.equalsIgnoreCase("space")) {
                System.out.println("Space gives the alien a slight strength advantage.");
            } else if (location.equalsIgnoreCase("ocean")) {
                System.out.println("The ocean puts everyone at risk to shark attacks!");
            } else {
                System.out.println("Invalid location.");
            }

        }

        String special = "";
        while (!(special.equalsIgnoreCase("speed") || special.equalsIgnoreCase("power") || special.equalsIgnoreCase("pain"))) {
            System.out.println("Choose your special attack? [speed/power/pain]");
            special = scanner.nextLine();

            if (special.equalsIgnoreCase("speed")) {
                System.out.println("Speed gives the the player a high chance of making a second hit at 20% damage of the first hit.");
            } else if (special.equalsIgnoreCase("power")) {
                System.out.println("Power gives the the player a medium chance of doing an additional 50% damage on a hit.");
            } else if (special.equalsIgnoreCase("pain")) {
                System.out.println("Pain has a small change of inflicting a permanent penalty on the opponent, decreasing their overall effectiveness by 10%.");
            } else {
                System.out.println("Invalid special attack.");
            }
        }

        if(playerType.equalsIgnoreCase("ninja")) {
            nva.getNinja().setPlayerName(name);
            nva.getNinja().setPlayerWeapon(weapon);
            nva.getNinja().setPlayerSpecial(special);
            nva.getAlien().setPlayerName("Twinkle Toes");
            nva.getAlien().setPlayerWeapon("laser");
            nva.getAlien().setPlayerSpecial("power");
        } else {
            nva.getAlien().setPlayerName(name);
            nva.getAlien().setPlayerWeapon(weapon);
            nva.getAlien().setPlayerSpecial(special);
            nva.getNinja().setPlayerName("Mr Fuzzy Jingles");
            nva.getNinja().setPlayerWeapon("star");
            nva.getNinja().setPlayerSpecial("speed");
        }
        nva.getNinja().setPlayerLocation(location);
        nva.getAlien().setPlayerLocation(location);

        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println("Time to play!");
        System.out.println(" ");

        nva.startBattle();


    }
}
