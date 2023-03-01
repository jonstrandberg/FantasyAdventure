package Enemies;

import EnemyClasses.EnemyMagic;
import Enums.Dragon;
import Enums.Spell;

public class Sourcerer extends EnemyMagic {

    public Sourcerer(Spell spell, Dragon dragon){
        super(spell, dragon);
    }


    public int necromancerSpellDamage(){
        return  getSpellDamage() + 5;
    }

    public int dragonSpellDamage(){
        return getDragonDamage() + 2;
    }


}
