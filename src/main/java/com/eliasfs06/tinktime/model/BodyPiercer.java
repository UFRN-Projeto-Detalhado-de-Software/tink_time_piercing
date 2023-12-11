package com.eliasfs06.tinktime.model;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class BodyPiercer extends Funcionario {

    String estudio;

    List<AreasAplicacao> areasAplicacao;

    List<MaterialJoia> materiaisJoia;

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public List<AreasAplicacao> getAreasAplicacao() {
        return areasAplicacao;
    }

    public void setAreasAplicacao(List<AreasAplicacao> areasAplicacao) {
        this.areasAplicacao = areasAplicacao;
    }

    public List<MaterialJoia> getMateriaisJoia() {
        return materiaisJoia;
    }

    public void setMateriaisJoia(List<MaterialJoia> materiaisJoia) {
        this.materiaisJoia = materiaisJoia;
    }
}
