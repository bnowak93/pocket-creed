package com.pocket.creed.entities.units.impl;

import com.pocket.creed.entities.units.ArmyUnit;

import java.util.List;

public  class MultipleEntityUnit implements ArmyUnit {

    protected List models;

    @Override
    public int calculateUnitPointsCost() {
        return 0;
    }
}
