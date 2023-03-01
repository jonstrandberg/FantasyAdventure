package EnemyClasses;

import Enums.Dragon;
import Enums.Spell;

public class EnemyMagic {

    private Spell spell;
    private Dragon dragon;

    public EnemyMagic(Spell spell, Dragon dragon) {
        this.spell = spell;
        this.dragon = dragon;
    }

    public int getSpellDamage() {
        return spell.getDamage();
    }

    public int getDragonDamage() {
        return dragon.getDamage();
    }

    public Spell getSpell() {
        return spell;
    }

    public Dragon getDragon() {
        return dragon;
    }

}
