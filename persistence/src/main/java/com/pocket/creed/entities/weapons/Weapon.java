package com.pocket.creed.entities.weapons;

import com.pocket.creed.armour_penetration.ArmourPenetration;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weapon {

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    public static final int MELEE_RANGE = 0;

    private String name;
    private int strength;
    private ArmourPenetration armourPenetration;
    private int attacks;
    private int damage;
    private int range;
    private int pointCost;
}
