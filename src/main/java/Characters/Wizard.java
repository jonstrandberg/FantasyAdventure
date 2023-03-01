package Characters;

import CharacterClasses.CharacterMagic;
import Enums.Dragon;
import Enums.Spell;

public class Wizard extends CharacterMagic {


    public Wizard(String name, String player, Spell spell, Dragon dragon){
        super(name, player, spell, dragon);

    }

    public int wizardSpellDamage(){
        return  getSpellDamage() + 10;
    }

    public int dragonSpellDamage(){
        return getDragonDamage() + 5;
    }




}
