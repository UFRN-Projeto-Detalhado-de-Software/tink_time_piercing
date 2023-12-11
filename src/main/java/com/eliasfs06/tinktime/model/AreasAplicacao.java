package com.eliasfs06.tinktime.model;

import java.util.Arrays;
import java.util.List;

public enum AreasAplicacao {

    ORELHA("Orelha"),
    NARIZ("Nariz"),
    LINGUA("Língua"),
    SOBRANCELHA("Sobrancelha"),
    LABIO("Lábio"),
    UMBIGO("Umbigo"),
    MAMILO("Mamilo"),
    GENITAL("Genital"),
    SUPERFICIAL("Piercing Superficial"),
    DERMAL("Piercing Dermal"),
    INDUSTRIAL("Industrial"),
    CARTILAGEM("Piercing na Cartilagem");

    private final String description;

    AreasAplicacao(String descricao) {
        this.description = descricao;
    }

    public String getDescription() {
        return description;
    }

    public static List<AreasAplicacao> getAllAreas() {
        return Arrays.asList(AreasAplicacao.values());
    }
}
