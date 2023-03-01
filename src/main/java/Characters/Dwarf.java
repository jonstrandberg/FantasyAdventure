package Characters;

import CharacterClasses.CharacterWarrior;
import Enums.Weapon;

public class Dwarf extends CharacterWarrior {


    public Dwarf(String player, String name, Weapon weapon){
        super(player, name, weapon);
    }

    public int dwarfWeaponDamage(){
        return getWeaponDamage();
    }


}
