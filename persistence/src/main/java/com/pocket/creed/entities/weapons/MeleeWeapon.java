package com.pocket.creed.entities.weapons;

import com.pocket.creed.weapon_characteristics.ArmourPenetration;

public class MeleeWeapon extends Weapon {

    public MeleeWeapon(String name, int strength, ArmourPenetration armourPenetration, int attacks, int damage, int pointCost) {
        this.name = name;
        this.strength = strength;
        this.armourPenetration = armourPenetration;
        this.attacks = attacks;
        this.damage = damage;
        this.pointCost = pointCost;
    }

    public MeleeWeapon createCloseCombatWeapon(int strength, int attacks) {
        return new MeleeWeapon("Close combat weapon", strength, ArmourPenetration.AP_O, attacks, 1, 0);
    }
}
