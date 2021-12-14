package com.pocket.creed.entities.weapons;

import com.pocket.creed.weapon_characteristics.ArmourPenetration;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Weapon {
    String name;
    int strength;
    ArmourPenetration armourPenetration;
    int attacks;
    int damage;
    int pointCost;
}
