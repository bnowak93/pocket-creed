package com.pocket.creed.keywords.faction;

import lombok.Getter;

public enum FactionKeyWord implements Faction {
    IMPERIUM("IMPERIUM"),
    CHAOS("CHAOS"),
    XENOS("XENOS"),
    AELDARI("AELDARI"),
    UNALIGNED("UNALIGNED");

    @Getter
    private final String value;

    FactionKeyWord(String value) {
        this.value = value;
    }
}
