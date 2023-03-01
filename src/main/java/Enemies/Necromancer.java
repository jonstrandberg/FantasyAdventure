package Enemies;

import CharacterClasses.CharacterMagic;
import EnemyClasses.EnemyMagic;
import Enums.Dragon;
import Enums.Spell;

public class Necromancer extends EnemyMagic {

    public Necromancer(Spell spell, Dragon dragon){
        super(spell, dragon);
    }


    public int necromancerSpellDamage(){
        return  getSpellDamage() + 10;
    }

    public int dragonSpellDamage(){
        return getDragonDamage() + 5;
    }


}
