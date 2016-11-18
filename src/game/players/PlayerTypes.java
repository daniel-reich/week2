package game.players;

/**
 * Created by Daniel on 11/11/16.
 */
public abstract class PlayerTypes {


    private int health = 1000;
    private String playerName;
    private String playerWeapon;
    private String playerLocation;
    private String playerSpecial;
    private boolean painPowerActivated;

    public int getHealth() {
        return health;
    }

    public void removeHealth(int hit) {
        health -= hit;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerWeapon() {
        return playerWeapon;
    }

    public void setPlayerWeapon(String playerWeapon) {
        this.playerWeapon = playerWeapon;
    }

    public String getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(String playerLocation) {
        this.playerLocation = playerLocation;
    }

    public String getPlayerSpecial() {
        return playerSpecial;
    }

    public void setPlayerSpecial(String playerSpecial) {
        this.playerSpecial = playerSpecial;
    }

    public boolean getPainPowerActivated() {
        return painPowerActivated;
    }

    public void setPainPowerActivated(boolean painPowerActivated) {
        this.painPowerActivated = painPowerActivated;
    }
}

