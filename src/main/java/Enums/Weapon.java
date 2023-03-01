package Enums;

public enum Weapon {

    SWORD(30),
    AXE(15),
    SPEAR(10),
    STONE(1),
    BOW_AND_ARROW(20),
    SHIELD(0);

    private final int damage;

    Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
