package Rooms;
import java.util.ArrayList;
import java.util.Random;

public class Room {
    private boolean hasTreasure;
    private boolean hasEnemy;
    private String enemyType;
    private ArrayList<Object> enemy;
    private int treasureAmount;

    public Room() {
        Random rand = new Random();
        this.hasTreasure = rand.nextBoolean();
        this.hasEnemy = rand.nextBoolean();

        if (this.hasEnemy) {
            enemies = ArrayList<Object> enemy;
            int index = rand.nextInt(enemies.length);
            this.enemyType = enemies[index];
        }

        if (this.hasTreasure) {
            this.treasureAmount = rand.nextInt(1000) + 1;
        }
    }

    public boolean hasTreasure() {
        return this.hasTreasure;
    }

    public boolean hasEnemy() {
        return this.hasEnemy;
    }

    public String getEnemyType() {
        return this.enemyType;
    }

    public int getTreasureAmount() {
        return this.treasureAmount;
    }
}