package Enemies;

import EnemyClasses.EnemyHerbalist;
import Enums.Potion;

public class Healer extends EnemyHerbalist {

    public Healer(Potion potion){
        super(potion);
    }

    public int healerIncreaseHealth(){
        return healsCharacter() + 5;
    }


}
