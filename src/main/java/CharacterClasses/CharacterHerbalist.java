package CharacterClasses;

import CharacterProperties.Character;
import Enums.Potion;
import Interfaces.IHealth;

public class CharacterHerbalist extends Character {

    private Potion potion;
    private String name;

    public CharacterHerbalist(Potion potion, String name, String player){
        super(player);
        this.potion = potion;
        this.name = name;

    }

    public Potion getPotion() {
        return potion;
    }

    public String getName() {
        return name;
    }

    public int healsCharacter(){
        return potion.getHeal();
    }


}
