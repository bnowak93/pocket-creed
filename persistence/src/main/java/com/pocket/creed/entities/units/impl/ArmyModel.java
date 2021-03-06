package com.pocket.creed.entities.units.impl;

import com.pocket.creed.entities.weapons.Weapon;
import com.pocket.creed.keywords.KeyWord;
import com.pocket.creed.keywords.faction.Faction;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
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
    private List<Weapon> weapons;

    public ArmyModel(int movement, int weaponSkill, int ballisticSkill, int strength, int toughness, int wounds,
                     int attacks, int leadership, int saveCharacteristics, int pointsCost, Set<KeyWord> keyWords,
                     Set<Faction> factionKeyWords, List<Weapon> weapons) {
        this.movement = movement;
        this.weaponSkill = weaponSkill;
        this.ballisticSkill = ballisticSkill;
        this.strength = strength;
        this.toughness = toughness;
        this.wounds = wounds;
        this.attacks = attacks;
        this.leadership = leadership;
        this.saveCharacteristics = saveCharacteristics;
        this.pointsCost = pointsCost;
        this.keyWords = keyWords;
        this.factionKeyWords = factionKeyWords;
        this.weapons = weapons;
    }
}
