package com.eliasfs06.tinktime.model;

import java.util.Arrays;
import java.util.List;

public enum MaterialJoia {

    ACO_INOXIDAVEL("Aço Inoxidável"),
    TITANIO("Titânio"),
    OURO_14K("Ouro 14K"),
    OURO_BRANCO_14K("Ouro Branco 14K"),
    PRATA_DE_LEI("Prata de Lei"),
    ACRILICO("Acrílico"),
    PEDRA_NATURAL("Pedra Natural"),
    MADEIRA("Madeira"),
    BIOPLASTICO("Bioplástico"),
    NIOBIO("Nióbio");

    private final String description;

    MaterialJoia(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static List<MaterialJoia> getAllMateriais() {
        return Arrays.asList(MaterialJoia.values());
    }
}
