package com.pocket.creed.weapon_characteristics;

import lombok.Getter;

public enum RangedWeaponType {
    ASSAULT("Assault"),
    HEAVY("Heavy"),
    RAPID_FIRE("Rapid Fire"),
    GRENADE("Grenade"),
    PISTOL("Pistol");

    @Getter
    public String name;

    RangedWeaponType(String name) {
        this.name = name;
    }
}
