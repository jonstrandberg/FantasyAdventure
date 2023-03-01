package Characters;

import CharacterClasses.CharacterMagic;
import Enums.Dragon;
import Enums.Spell;

public class Enchanter extends CharacterMagic {


    public Enchanter(String name, String player, Spell spell, Dragon dragon){
        super(name, player, spell, dragon);

    }

    public int enchanterSpellDamage(){
        return  getSpellDamage() + 5;
    }


    public int dragonSpellDamage(){
        return getDragonDamage();
    }




}
