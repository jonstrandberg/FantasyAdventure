package Characters;

import CharacterClasses.CharacterWarrior;
import Enums.Weapon;

public class Viking extends CharacterWarrior {

    public Viking(String player, String name, Weapon weapon){
        super(player, name, weapon);
    }

    public int vikingWeaponDamage(){
        return getWeaponDamage() + 10;
    }



}
