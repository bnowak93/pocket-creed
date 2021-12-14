package com.pocket.creed.entities.weapons;

import com.pocket.creed.weapon_characteristics.ArmourPenetration;
import com.pocket.creed.weapon_characteristics.RangedWeaponType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RangedWeapon extends Weapon {
    private int range;
    private RangedWeaponType rangeWeaponType;
    private boolean isBlast;

    public RangedWeapon(String name, int strength, ArmourPenetration armourPenetration, int attacks, int damage,
                        int pointCost, int range, RangedWeaponType rangeWeaponType, boolean isBlast) {
        this.name = name;
        this.strength = strength;
        this.armourPenetration = armourPenetration;
        this.attacks = attacks;
        this.damage = damage;
        this.pointCost = pointCost;
        this.range = range;
        this.rangeWeaponType = rangeWeaponType;
        this.isBlast = isBlast;
    }
}
