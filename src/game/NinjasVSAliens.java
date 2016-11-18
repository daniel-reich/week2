package game;

import game.players.Alien;
import game.players.Ninja;
import game.util.Statistics;

/**
 * Created by Daniel on 11/11/16.
 */
public class NinjasVSAliens {
    public Ninja getNinja() {
        return ninja;
    }

    public void setNinja(Ninja ninja) {
        this.ninja = ninja;
    }

    private Ninja ninja = new Ninja();

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
    }

    private Alien alien = new Alien();

    public void startBattle() {
        PlayNinjasVSAliens playNVA = new PlayNinjasVSAliens();
        Statistics stats = new Statistics();



        /*
            int turnsTaken = 0;
            int alienDamageDealt = 0;
            int ninjaDamageDealt = 0;
            int ninjaTurnsWon = 0;
            int alienTurnsWon = 0;
            int turnTies = 0;
*/
        while(alien.getHealth() > 0 && ninja.getHealth() > 0) {
            int alienDamageReceived = alien.alienDamageReceivedCalculator(ninja.ninjaDamageGivenCalculator());
            System.out.println(ninja.getPlayerName()+" attacks with the "+ninja.getPlayerWeapon()+" and deals "+alienDamageReceived+" points of damage.");
            int ninjaDamageReceived = ninja.ninjaDamageReceivedCalculator(alien.alienDamageGivenCalculator());
            System.out.println(alien.getPlayerName()+" attacks with the "+alien.getPlayerWeapon()+" and deals "+ninjaDamageReceived+" points of damage.");

            if (ninja.getPlayerLocation().equalsIgnoreCase("ocean")) {
                ninja.sharkAttack();
                alien.sharkAttack();
            }
            stats.recordAttack(alienDamageReceived, ninjaDamageReceived);
/*
            turnsTaken++;
            alienDamageDealt += ninjaDamageReceived;
            ninjaDamageDealt += alienDamageReceived;
            if (ninjaDamageReceived > alienDamageReceived) {
                alienTurnsWon++;
            } else if (ninjaDamageReceived < alienDamageReceived){
                ninjaTurnsWon++;
            } else {
                turnTies++;
            }
*/
            System.out.println(ninja.getPlayerName()+" Heath: "+ninja.getHealth()+"  vs  "+alien.getPlayerName()+" Health: "+alien.getHealth());
            System.out.println(" ");
            System.out.println("Press [enter] to take another turn.");
            String turn = playNVA.scanner.nextLine();
            System.out.println(" ");
        }

        System.out.println("**********************************************");
        if(ninja.getHealth() > 0) {
            System.out.println(ninja.getPlayerName()+" Wins!!!");
            System.out.println("Health Remaining: "+ninja.getHealth());
        } else if(alien.getHealth() > 0) {
            System.out.println(alien.getPlayerName()+" Wins!!!");
            System.out.println("Health Remaining: "+alien.getHealth());
        } else {
            System.out.println("Everyone Died!!!");
            System.out.println(ninja.getPlayerName()+" and "+alien.getPlayerName()+" both lose.");
        }
        System.out.println("* * * * * * * * * GAME STATS * * * * * * * * *");
        System.out.println("Total number of turns: "+stats.getTotalAttacks());
        System.out.println("Alien dealt an average of "+stats.getAlienAverageDamageDealt()+" damage per turn and won "+stats.getAlienWins()+" turns.");
        System.out.println("Ninja dealt an average of "+stats.getNinjaAverageDamageDealt()+" damage  per turn and won "+stats.getNinjaWins()+" turns.");
        System.out.println("There were "+stats.getTies()+" ties.");
        System.out.println("**********************************************");
    }


}
