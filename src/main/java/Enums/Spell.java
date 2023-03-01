package Enums;

public enum Spell {

    FIREBALL(25),
    LIGHTNING_STRIKE(20),
    HYPNOSIS(10),
    BLOCK(0),
    BARRAGE(15);

    private final int damage;

    Spell(int damage){
        this.damage = damage;
    };

    public int getDamage() {
        return damage;
    }
}
