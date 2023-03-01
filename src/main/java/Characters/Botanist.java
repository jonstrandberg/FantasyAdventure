package Characters;

import CharacterClasses.CharacterHerbalist;
import Enums.Potion;

public class Botanist extends CharacterHerbalist {

    public Botanist(Potion potion, String name, String player){
        super(potion, name, player);
    }

    public int healerIncreaseHealth(){
        return healsCharacter();
    }

}
