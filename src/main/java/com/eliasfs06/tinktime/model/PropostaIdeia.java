package com.eliasfs06.tinktime.model;

import com.eliasfs06.tinktime.model.enums.Joia;
import com.eliasfs06.tinktime.model.enums.LocalPiercing;
import jakarta.persistence.*;

@Entity
public class PropostaIdeia extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private User cliente;

    @ManyToOne
    @JoinColumn(name = "tatuador_id")
    private User tatuador;

    private String descricao;

    @OneToOne
    private Agendamento agendamento;

    private Integer numeroSessoes;

    private LocalPiercing localPiercing;

    private Joia joia;


    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getCliente() {
        return cliente;
    }

    public void setCliente(User cliente) {
        this.cliente = cliente;
    }

    public User getTatuador() {
        return tatuador;
    }

    public void setTatuador(User tatuador) {
        this.tatuador = tatuador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Integer getNumeroSessoes() {
        return numeroSessoes;
    }

    public void setNumeroSessoes(Integer numeroSessoes) {
        this.numeroSessoes = numeroSessoes;
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
