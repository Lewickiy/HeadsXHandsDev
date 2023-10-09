package org.lewickiy;

public class Creature {
    private int recoveryCount;
    private int attack;
    private int protection;
    private final int startHealth;
    private int health;
    private int[] damage;

    public Creature(int health) {
        this.startHealth = health;
        this.recoveryCount = 4;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack > 15) {
            this.attack = 15;
        } else if (attack < 1) {
            this.attack = 1;
        } else {
            this.attack = attack;
        }
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        if (protection > 15) {
            this.protection = 15;
        } else if (protection < 1) {
            this.protection = 1;
        } else {
            this.protection = attack;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int[] getDamage() {
        return damage;
    }

    public void setDamage(int[] damage) {
        this.damage = damage;
    }

    public boolean checkVitality() {
        return health > 0;
    }
    public int recovery() {
        if (recoveryCount > 0) {
            recoveryCount--;
            return startHealth * 30 / 100;
        } else {
            return 0;
        }
    }
}
