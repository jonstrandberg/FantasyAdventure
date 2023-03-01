package Characters;

import CharacterClasses.CharacterWarrior;
import Enums.Weapon;

public class Elf extends CharacterWarrior{

        public Elf(String player, String name, Weapon weapon){
            super(player, name, weapon);
        }

        public int elfWeaponDamage(){
            return getWeaponDamage() + 5;
        }


    }
