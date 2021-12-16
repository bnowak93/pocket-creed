package com.pocket.creed.calculation;


public class DamageCalculator {
    //Storing 6 sided dice as value 7, since if result of 2 up is desired, it means that all but one side is acceptable, example: 2+ required, 7-2 = 5.
    private static final int D6_DICE = 7;
    private static final double D6_SIDES = 6.00;

    private DamageCalculator() {
    }

    private static double calculateSuccessfulHitRolls(int amountOfAttacks, int bS) {
        double probabilityOfDesiredThrow = (D6_DICE - bS) / D6_SIDES;
        return amountOfAttacks * Math.pow(probabilityOfDesiredThrow, amountOfAttacks);
    }

    private static double calculateSuccessfulWoundRolls(double amountOfHits, int weaponStr, int targetToughness){
        return 0;
    }

    private static int calculateSuccessfulHitRolls(int amountOfAttacks, int bS, int modifier) {

        return 0;
    }
}
