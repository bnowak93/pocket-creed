package com.pocket.creed.entities.units.impl;

import com.pocket.creed.entities.units.ArmyUnit;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MultipleEntityUnit implements ArmyUnit {

    private List<ArmyModel> models;

    @Override
    public int calculateUnitPointsCost() {
        return 0;
    }

    @Override
    public int getSize() {
        return models.size();
    }
}
