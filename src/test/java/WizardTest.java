import Characters.Wizard;
import Enums.Dragon;
import Enums.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void setUp(){
        wizard = new Wizard("Gandalf","Jonathan", Spell.FIREBALL, Dragon.FIRESTORM);
    }

    @Test
    public void canGetName(){
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void canGetPlayer(){
        assertEquals("Jonathan", wizard.getPlayer());
    }

    @Test
    public void canGetSpell(){
        assertEquals(Spell.FIREBALL, wizard.getSpell());
    }

    @Test
    public void canGetDragon(){
        assertEquals(Dragon.FIRESTORM, wizard.getDragon());
    }

    @Test
    public void canGetWizardDamage(){
      assertEquals(35, wizard.wizardSpellDamage());
    }

    @Test
    public void canGetDragonDamage(){
        assertEquals(35, wizard.dragonSpellDamage());
    }

}
