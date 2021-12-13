package com.pocket.creed.entities.units.impl;

import com.pocket.creed.entities.units.ArmyUnit;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleEntityUnit implements ArmyUnit {

    private ArmyModel model;

    @Override
    public int calculateUnitPointsCost() {
        return model.getPointsCost();
    }

    @Override
    public int getSize() {
        return 1;
    }
}
