package com.eliasfs06.tinktime.model.dto;

import com.eliasfs06.tinktime.model.PropostaIdeia;
import com.eliasfs06.tinktime.model.enums.Joia;
import com.eliasfs06.tinktime.model.enums.LocalPiercing;
import org.springframework.cglib.core.Local;

import java.text.ParseException;

public class PropostaIdeiaDTO {

    private Long id;

    private UserDTO cliente;

    private UserDTO tatuador;

    private String descricao;

    private LocalPiercing localPiercing;

    private Joia joia;

    public PropostaIdeiaDTO() {
    }

    public PropostaIdeiaDTO(PropostaIdeia propostaIdeia) {
        this.id = propostaIdeia.getId();
        this.cliente = new UserDTO(propostaIdeia.getCliente());
        this.tatuador = new UserDTO(propostaIdeia.getTatuador());
        this.descricao = propostaIdeia.getDescricao();
    }

    public PropostaIdeiaDTO(UserDTO cliente, UserDTO tatuador, String descricao, LocalPiercing localPiercing, Joia joia) {
        this.cliente = cliente;
        this.tatuador = tatuador;
        this.descricao = descricao;
        this.localPiercing = localPiercing;
        this.joia = joia;
    }

    public PropostaIdeia toPropostaIdeia() throws ParseException {
        PropostaIdeia propostaIdeia = new PropostaIdeia();
        propostaIdeia.setCliente(this.cliente.toUser());
        propostaIdeia.setTatuador(this.tatuador.toUser());
        propostaIdeia.setDescricao(this.descricao);
        propostaIdeia.setLocalPiercing(this.localPiercing);
        propostaIdeia.setJoia(this.joia);
        return propostaIdeia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO getCliente() {
        return cliente;
    }

    public void setCliente(UserDTO cliente) {
        this.cliente = cliente;
    }

    public UserDTO getTatuador() {
        return tatuador;
    }

    public void setTatuador(UserDTO tatuador) {
        this.tatuador = tatuador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalPiercing getLocalPiercing() {
        return localPiercing;
    }

    public void setLocalPiercing(LocalPiercing localPiercing) {
        this.localPiercing = localPiercing;
    }

    public Joia getJoia() {
        return joia;
    }

    public void setJoia(Joia joia) {
        this.joia = joia;
    }
}
