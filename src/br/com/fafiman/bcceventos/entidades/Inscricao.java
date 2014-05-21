/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fafiman.bcceventos.entidades;

import br.fafiman.bcceventos.ExcecaoDeValidacao;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author munifgebarajunior Responsável: Leonardo
 */
@Entity
public class Inscricao {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inscricao other = (Inscricao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    

    private Date dataRealizacao;
    private String meio;

    @ManyToOne
    private Evento evento;
    @ManyToOne
    private Participante participante;
    
    @ManyToMany
    private List<Minicurso> minicursos;

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public List<Minicurso> getMinicursos() {
        return minicursos;
    }

    public void setMinicursos(List<Minicurso> minicursos) {
        this.minicursos = minicursos;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }
//validar para que a data da realização não deja menor que a atual

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getMeio() {
        return meio;
    }
//validar para o tema não ser nulo**************************************

    public void setMeio(String meio) {
        if (getMeio() != null) {
            this.meio = meio;
        } else {
            throw new ExcecaoDeValidacao("O meio de realização da inscrição não pode ser nulo.");
        }
    }
}
