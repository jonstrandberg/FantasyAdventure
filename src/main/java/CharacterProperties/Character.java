package CharacterProperties;

import Interfaces.IAttack;
import Interfaces.IHealth;

public abstract class Character implements IAttack, IHealth {

    private int health;
    private String player;

    public Character(String player){
        this.health = 100;
        this.player = player;
    }

    public int getAttack(int damage){
        return health -= damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getPlayer() {
        return player;
    }



}
