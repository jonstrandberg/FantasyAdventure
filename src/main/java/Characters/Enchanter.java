package Characters;

import CharacterClasses.CharacterMagic;
import Enums.Dragon;
import Enums.Spell;

public class Enchanter extends CharacterMagic {


    public Enchanter(String name, Spell spell, Dragon dragon, String player){
        super(name, spell, dragon, player);

    }

    public int enchanterSpellDamage(){
        return  getSpellDamage() + 5;
    }


    public int dragonSpellDamage(){
        return getDragonDamage();
    }




}
