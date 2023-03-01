package Characters;

import CharacterClasses.CharacterHerbalist;
import Enums.Potion;

public class Healer extends CharacterHerbalist {

    public Healer(Potion potion, String name, String player){
        super(potion, name, player);
    }

    public int healerIncreaseHealth(){
        return healsCharacter() + 5;
    }


}
