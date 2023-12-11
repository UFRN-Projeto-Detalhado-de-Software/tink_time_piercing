package com.eliasfs06.tinktime.model.enums;

import java.util.Arrays;
import java.util.List;

public enum Joia {
    ACO("Aço"),
    OURO("Ouro"),
    TITANIO("Titânio"),
    ;

    private final String joia;

    Joia(String joia) {
        this.joia = joia;
    }

    public String getJoia() {
        return joia;
    }

    public static List<Joia> getAllJoia() {
        return Arrays.asList(Joia.values());
    }
}
