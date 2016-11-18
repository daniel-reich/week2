package game.players;

import game.util.RandomInt;

public class Ninja extends PlayerTypes {

    private int bladeMaxDamage = 5;
    private int bladeRangeProtection = 2;
    private int starMaxDamage = 3;
    private int starRangeProtection = 4;
    private int maxHitsPerRole = 4;
    private int accuracy = 4;
    private int homeCourt = 10;
    boolean bitten = false;

    public int ninjaDamageGivenCalculator() {
        int damage = 0;
        if (getPlayerWeapon().equalsIgnoreCase("blade")) {
            damage = getRandomBladeDamage(bladeMaxDamage) * getRandomMaxHits(maxHitsPerRole) * getRandomAccuracy(accuracy);
        } else {
            damage = getRandomStarDamage(starMaxDamage) * getRandomMaxHits(maxHitsPerRole) * getRandomAccuracy(accuracy);
        }
        if (getPlayerSpecial().equalsIgnoreCase("speed")) {
            damage = getSpeedAttack(damage);
        } else if (getPlayerSpecial().equalsIgnoreCase("power")) {
            damage = getPowerAttack(damage);
        }
        if (getPlayerLocation().equalsIgnoreCase("forest")) {
            damage = damage+getHomeCourt(homeCourt);
        }
        return damage;
    }

    public int ninjaDamageReceivedCalculator(int rawDamageDealt) {
        int damage = 0;
        if (getPlayerWeapon().equalsIgnoreCase("blade")) {
            damage = rawDamageDealt - (getRandomBladeRange(bladeRangeProtection) * getRandomAccuracy(accuracy));
        } else {
            damage = rawDamageDealt - (getRandomStarRange(starRangeProtection) * getRandomAccuracy(accuracy));
        }

        if ((getPainPowerActivated() == false) && (getPlayerSpecial().equalsIgnoreCase("pain"))){
            damage = getPainAttack(damage);
        } else if ((getPainPowerActivated() == true) && (getPlayerSpecial().equalsIgnoreCase("pain"))){
            double temp = ((int) damage * .9);
            damage = (int) temp;
        }

        if (damage < 0) damage = 0;


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
            System.out.println("The ninja was attacked by a shark! -100 points");
        }
        return damage;
    }

    private int getRandomBladeDamage(int a) {
        int damage = RandomInt.randomInteger(a);
        return damage;
    }

    private int getRandomStarDamage(int a) {
        int damage = RandomInt.randomInteger(a);
        return damage;
    }

    private int getRandomBladeRange(int a) {
        int protection = RandomInt.randomInteger(a);
        return protection;
    }

    private int getRandomStarRange(int a) {
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
        int totalDamage = a;
        int prob = RandomInt.randomInteger(10);
        if (prob > 2)
        {
            double temp = ((int) a) * 1.2;
            totalDamage = (int) temp;
        }
        return totalDamage;
    }

    private int getPowerAttack(int a) {
        int totalDamage = a;
        int prob = RandomInt.randomInteger(10);
        if (prob > 5)
        {
            double temp = ((int) a) * 1.5;
            totalDamage = (int) temp;
        }
        return totalDamage;

    }

    private int getPainAttack(int a) {
        int totalDamage = a;
        int prob = RandomInt.randomInteger(10);
        if (prob > 8)
        {
            double temp = ((int) a) * .9;
            totalDamage = (int) temp;
            setPainPowerActivated(true);
        }
        return totalDamage;

    }





}

