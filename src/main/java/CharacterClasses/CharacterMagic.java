package CharacterClasses;

import CharacterProperties.Character;
import Enums.Dragon;
import Enums.Spell;

public class CharacterMagic extends Character {

    private Spell spell;
    private Dragon dragon;
    private String name;

    public CharacterMagic(String name, String type, Spell spell, Dragon dragon){
        super(type);
        this.spell = spell;
        this.dragon = dragon;
        this.name = name;
    }

    public int getSpellDamage() {
        return spell.getDamage();
    }

    public int getDragonDamage() {
        return dragon.getDamage();
    }

    public String getName() {
        return name;
    }

    public Spell getSpell() {
        return spell;
    }

    public Dragon getDragon() {
        return dragon;
    }
}
