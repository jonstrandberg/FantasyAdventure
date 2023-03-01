package Enums;

public enum Potion {


    HEAL(20),
    SUPER_HEAL(30);

    private final int heal;

    Potion(int heal){
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }
}