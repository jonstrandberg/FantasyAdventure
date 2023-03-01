package Enemies;
import EnemyClasses.EnemyWarrior;
import Enums.Weapon;

public class Ork extends EnemyWarrior {

        public Ork(Weapon weapon){
            super(weapon);
        }

        public int orkWeaponDamage(){
            return getWeaponDamage() + 10;
        }


    }
