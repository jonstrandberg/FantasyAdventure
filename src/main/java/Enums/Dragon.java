package Enums;

public enum Dragon {

    FIREBLAST(20),
    IGNITE(15),
    EMBER(5),
    FIRESTORM(30);

    private final int damage;

    Dragon(int damage){
        this.damage = damage;
    };

    public int getDamage() {
        return damage;
    }

}
