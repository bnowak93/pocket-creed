package com.pocket.creed.calculation;


public class DamageCalculator {
    //Storing 6 sided dice as value 7, since if result of 2 up is desired, it means that all but one side is acceptable, example: 2+ required, 7-2 = 5.
    private static final int D6_DICE = 7;
    private static final double D6_SIDES = 6.00;

    private DamageCalculator() {
    }

    private static int calculateSuccessfulHitRolls(int amountOfAttacks, int modelSkill) {
        double probabilityOfDesiredThrow = (D6_DICE - modelSkill) / D6_SIDES;
        return calculateApproxSuccessfulThrows(probabilityOfDesiredThrow, amountOfAttacks);
    }

    private static int calculateSuccessfulWoundRolls(int amountOfHits, int weaponStr, int targetToughness) {
        int desiredThrow = checkStrToToughRatio(weaponStr, targetToughness);
        double probabilityOfDesiredThrow = (D6_DICE - desiredThrow) / D6_SIDES;
        return calculateApproxSuccessfulThrows(probabilityOfDesiredThrow, amountOfHits);
    }

    private static int calculateSuccessfulHitRolls(int amountOfAttacks, int bS, int modifier) {

        return 0;
    }

    private static int checkStrToToughRatio(int str, int tough) {
        if (str > tough) {
            return str >= 2 * tough ? 2 : 3;
        } else if (str < tough) {
            return str <= tough / 2 ? 6 : 5;
        }
        return 4;
    }

    private static int calculateApproxSuccessfulThrows(double probabilityOfDesiredOutcome, int amountOfDice) {
        return Math.toIntExact(Math.round(amountOfDice * Math.pow(probabilityOfDesiredOutcome, amountOfDice)));
    }
}
