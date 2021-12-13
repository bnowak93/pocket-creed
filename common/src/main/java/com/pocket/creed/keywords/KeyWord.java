package com.pocket.creed.keywords;

import lombok.Getter;

public enum KeyWord {
    AIRCRAFT("AIRCRAFT"),
    BIKER("BIKER"),
    CHARACTER("CHARACTER"),
    CHARIOT("CHARIOT"),
    CORE("CORE"),
    DREADNOUGHT("DREADNOUGHT"),
    FLY("FLY"),
    INFANTRY("INFANTRY"),
    JUMP_PACK("JUMP_PACK"),
    LAND_RAIDER("LAND_RAIDER"),
    MONSTER("MONSTER"),
    PSYKER("PSYKER"),
    TERMINATOR("TERMINATOR"),
    TRANSPORT("TRANSPORT"),
    VEHICLE("VEHICLE");

    @Getter
    private final String value;

    KeyWord(String value) {
        this.value = value;
    }
}
