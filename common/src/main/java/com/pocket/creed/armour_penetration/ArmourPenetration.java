package com.pocket.creed.armour_penetration;

import lombok.Getter;

public enum ArmourPenetration {
    AP_O(0),
    AP_1(1),
    AP_2(2),
    AP_3(3),
    AP_4(4),
    AP_5(5);

    @Getter
    private final int modifier;

    ArmourPenetration(int modifier) {
        this.modifier = modifier;
    }
}
