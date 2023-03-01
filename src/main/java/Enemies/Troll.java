package Enemies;

import EnemyClasses.EnemyWarrior;
import Enums.Weapon;

    public class Troll extends EnemyWarrior {

        public Troll(Weapon weapon){
            super(weapon);
        }

        public int trollWeaponDamage(){
            return getWeaponDamage() + 5;
        }


    }
