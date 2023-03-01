package EnemyClasses;

import Enums.Weapon;

public class EnemyWarrior {

    Weapon weapon;

    public EnemyWarrior(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getWeaponDamage(){
        return weapon.getDamage();
    }


}
