package org.lewickiy;

public class BattleSteps {
    Dice dice = new Dice();
    public void strike(Creature attackingCreature, Creature attackedCreature) {
        int strikeModifier = strikeModifier(attackingCreature, attackedCreature);
        boolean successfulThrow = dice.rollTheDice(strikeModifier);
        healthResult(successfulThrow, attackingCreature, attackedCreature);
        attackedCreature.checkVitality();
        if (attackedCreature.getHealth()
                <= attackingCreature.getDamage()[attackingCreature.getDamage().length - 1]) {
            attackedCreature.setHealth(attackedCreature.getHealth() + attackedCreature.recovery());
        }
    }

    private int strikeModifier(Creature attackingCreature, Creature attackedCreature) {
        return (attackingCreature.getAttack() - attackedCreature.getProtection()) + 1;
    }

    public void healthResult(boolean successfulThrow
            , Creature attackingCreature
            , Creature attackedCreature) {
        int[] damages = attackingCreature.getDamage();
        int min = damages[0];
        int max = damages[damages.length - 1];
        int damage = (int) ((Math.random() * (max - min)) + min);
        if (successfulThrow) {
            if (attackedCreature.getHealth() - damage < 0) {
                attackedCreature.setHealth(0);
            } else {
                attackedCreature.setHealth(attackedCreature.getHealth() - damage);
            }
        }
    }
}
