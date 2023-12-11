package com.eliasfs06.tinktime.model.enums;

import java.util.Arrays;
import java.util.List;

public enum LocalPiercing {

    ORELHA("Orelha"),
    NARIZ("Nariz"),
    SEPTO("Septo"),
    LINGUA("Língua"),
    UMBIGO("Umbigo"),
    SOBRANCELHA("Sobrancelha"),
    LABIO("Lábio"),
    MAMILO("Mamilo");

    private final String local;

    LocalPiercing(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public static List<LocalPiercing> getAllLocal() {
        return Arrays.asList(LocalPiercing.values());
    }
}
