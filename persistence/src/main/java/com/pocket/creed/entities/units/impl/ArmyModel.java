package com.pocket.creed.entities.units.impl;

import com.pocket.creed.entities.weapons.Weapon;
import com.pocket.creed.keywords.KeyWord;
import com.pocket.creed.keywords.faction.Faction;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class ArmyModel {

    private int movement;
    private int weaponSkill;
    private int ballisticSkill;
    private int strength;
    private int toughness;
    private int wounds;
    private int attacks;
    private int leadership;
    private int saveCharacteristics;
    private int pointsCost;
    private Set<KeyWord> keyWords;
    private Set<Faction> factionKeyWords;
    private Set<Weapon> weapons;
}
