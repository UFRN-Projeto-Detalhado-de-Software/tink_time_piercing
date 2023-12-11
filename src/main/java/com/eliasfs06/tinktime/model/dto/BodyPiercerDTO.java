package com.eliasfs06.tinktime.model.dto;

import com.eliasfs06.tinktime.model.AreasAplicacao;
import com.eliasfs06.tinktime.model.BodyPiercer;
import com.eliasfs06.tinktime.model.MaterialJoia;

import java.util.List;

public class BodyPiercerDTO extends FuncionarioDTO {

    String estudio;

    List<AreasAplicacao> areasAplicacao;

    List<MaterialJoia> materiaisJoia;

    BodyPiercerDTO() {
        super();
    }

    public BodyPiercerDTO(BodyPiercer bodyPiercer) {
        super(bodyPiercer);
        this.estudio = bodyPiercer.getEstudio();
        this.areasAplicacao = bodyPiercer.getAreasAplicacao();
        this.materiaisJoia = bodyPiercer.getMateriaisJoia();
    }

    public BodyPiercer toBodyPiercer() {
        BodyPiercer bodyPiercer = (BodyPiercer) super.toFuncionario();
        bodyPiercer.setEstudio(this.estudio);
        bodyPiercer.setAreasAplicacao(this.areasAplicacao);
        bodyPiercer.setMateriaisJoia(this.materiaisJoia);
        return bodyPiercer;
    }

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
