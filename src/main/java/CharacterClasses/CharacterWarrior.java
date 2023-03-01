package CharacterClasses;

import CharacterProperties.Character;
import Enums.Dragon;
import Enums.Spell;
import Enums.Weapon;

public class CharacterWarrior extends Character {


    private String name;
    private Weapon weapon;

    public CharacterWarrior(String player, String name, Weapon weapon){
        super(player);
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getWeaponDamage(){
        return weapon.getDamage();
    }

}
