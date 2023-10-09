package org.lewickiy;

public class Main {
    public static void main(String[] args) {
        int[] damagesPlayer = {2,3,4,5,6,7};
        Player player = new Player(500);

        int[] damagesMonster = {2,3,4,5,6,7};
        Monster monster = new Monster(500);

        player.setAttack(6);
        player.setProtection(4);
        player.setDamage(damagesPlayer);

        monster.setAttack(6);
        monster.setProtection(4);
        monster.setDamage(damagesMonster);

        BattleSteps battleSteps = new BattleSteps();

        while (true) {
            battleSteps.strike(player, monster);
            if (monster.checkVitality()) {
                battleSteps.strike(monster, player);
            }
            if (!player.checkVitality()) {
                System.out.println("Monster win");
                break;
            }
            if (!monster.checkVitality()) {
                System.out.println("Player win");
                break;
            }

        }
    }
}