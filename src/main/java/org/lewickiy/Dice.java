package org.lewickiy;

public class Dice {
    public boolean rollTheDice(int strikeModifier) {
        boolean successfulThrow = false;
        while (strikeModifier > 0) {
            int min = 1;
            int max = 7;
            int b = (int) ((Math.random() * (max - min)) + min);
            if (b >= 5) {
                successfulThrow = true;
            }
            strikeModifier--;
        }
        return successfulThrow;
    }
}
