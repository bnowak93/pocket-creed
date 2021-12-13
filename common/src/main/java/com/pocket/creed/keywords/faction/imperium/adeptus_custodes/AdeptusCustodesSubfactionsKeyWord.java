package com.pocket.creed.keywords.faction.imperium.adeptus_custodes;

import com.pocket.creed.keywords.faction.Faction;
import lombok.Getter;

public enum AdeptusCustodesSubfactionsKeyWord implements Faction {
    AQUILAN_SHIELD("AQUILAN SHIELD"),
    SOLAR_WATCH("SOLAR WATCH"),
    DREAD_HOST("DREAD HOST"),
    SHADOWKEEPERS("SHADOWKEEPERS"),
    EMISSARIES_IMPERATUS("EMISSARIES IMPERATUS");

    @Getter
    private final String value;

    AdeptusCustodesSubfactionsKeyWord(String value) {
        this.value = value;
    }
}
