package EnemyClasses;

import EnemyProperties.Enemy;
import Enums.Potion;

public class EnemyHerbalist extends Enemy {

    private Potion potion;

    public EnemyHerbalist(Potion potion){
        this.potion = potion;

    }

    public Potion getPotion() {
        return potion;
    }


    public int healsCharacter(){
        return potion.getHeal();
    }






}
