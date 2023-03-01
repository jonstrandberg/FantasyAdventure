package EnemyProperties;

import Interfaces.IAttack;
import Interfaces.IHealth;

public class Enemy implements IAttack, IHealth {


    private int health;

    public Enemy(){
        this.health = 100;

    }

    public int getAttack(int damage){
        return health -= damage;
    }

    @Override
    public int getHealth(int health) {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
