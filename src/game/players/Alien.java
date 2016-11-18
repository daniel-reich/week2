package game.players;

import game.util.RandomInt;

public class Alien extends PlayerTypes {

    private int clawMaxDamage = 18;
    private int clawRangeProtection = 6;
    private int laserMaxDamage = 4;
    private int laserRangeProtection = 14;
    private int maxHitsPerRole = 4;
    private int accuracy = 3;
    private int homeCourt = 10;

    public int alienDamageGivenCalculator() {
        int damage = 0;
        if(getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = getRandomClawDamage(clawMaxDamage) * getRandomMaxHits(maxHitsPerRole) * getRandomAccuracy(accuracy);
        } else {
            damage = getRandomLaserDamage(laserMaxDamage) * getRandomMaxHits(maxHitsPerRole) * getRandomAccuracy(accuracy);
        }
        if(getPlayerSpecial().equalsIgnoreCase("speed")){
            damage = getSpeedAttack(damage);
        } else if (getPlayerSpecial().equalsIgnoreCase("power")){
            damage = getPowerAttack(damage);
        }
        if (getPlayerLocation().equalsIgnoreCase("space")) {
            damage = damage+getHomeCourt(homeCourt);
        }
        return damage;
    }

    public int alienDamageReceivedCalculator(int rawDamageDealt) {
        int damage = 0;
        if(getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = rawDamageDealt - (getRandomClawRange(clawRangeProtection) * getRandomAccuracy(accuracy));
        } else {
            damage = rawDamageDealt - (getRandomLaserRange(laserRangeProtection) * getRandomAccuracy(accuracy));
        }

        if ((getPainPowerActivated() == false) && (getPlayerSpecial().equalsIgnoreCase("pain"))){
            damage = getPainAttack(damage);
        } else if ((getPainPowerActivated() == true) && (getPlayerSpecial().equalsIgnoreCase("pain"))){
            double temp = ((int) damage * .9);
            damage = (int) temp;
        }
        if (damage<0) damage=0;
        this.removeHealth(damage);
        return damage;
    }

    public int sharkAttack() {
        int damage = 0;
        int prob = RandomInt.randomInteger(10);
        if (prob > 9)
        {
            damage = 100;
            this.removeHealth(damage);
            System.out.println("The alien was attacked by a shark! -100 points");
        }
        return damage;
    }

    private int getRandomClawDamage(int a) {
        int damage = RandomInt.randomInteger(a);
        return damage;
    }

    private int getRandomLaserDamage(int a) {
        int damage = RandomInt.randomInteger(a);
        return damage;
    }

    private int getRandomClawRange(int a) {
        int protection = RandomInt.randomInteger(a);
        return protection;
    }

    private int getRandomLaserRange(int a) {
        int protection = RandomInt.randomInteger(a);
        return protection;
    }

    private int getRandomMaxHits(int a) {
        int maxHits = RandomInt.randomInteger(a);
        return maxHits;
    }

    private int getRandomAccuracy(int a) {
        int accuracy = RandomInt.randomInteger(a);
        return accuracy;
    }

    private int getHomeCourt(int a) {
        int homeCourt = RandomInt.randomInteger(a);
        return homeCourt;
    }

    private int getSpeedAttack(int a) {
        int totalDamage=a;
        int prob = RandomInt.randomInteger(10);
        if (prob > 2) {
            double temp = ((int) a)*1.2;
            totalDamage = (int) temp;
        }
        return totalDamage;
    }

    private int getPowerAttack(int a) {
        int totalDamage=a;
        int prob = RandomInt.randomInteger(10);
        if (prob > 5) {
            double temp = ((int) a)*1.5;
            totalDamage = (int) temp;
        }
        return totalDamage;
    }

    private int getPainAttack(int a) {
        int totalDamage = a;
        int prob = RandomInt.randomInteger(10);
        if (prob > 8) {
            double temp = ((int) a) * .9;
            totalDamage = (int) temp;
            setPainPowerActivated(true);
        }
        return totalDamage;
    }

}

