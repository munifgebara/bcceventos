/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fafiman.bcceventos.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Esta classe é utilizada para registrar as entradas e saidas dos participantes
 * nos itens do evento.
 *
 * @author munifgebarajunior Responsável: Guilherme
 */
@Entity
public class Movimento {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Date momentoDeEntrada;
    private Date momentoDeSaida;

    @ManyToOne
    private ItemDoEvento itemDoEvento;
    @ManyToOne
    private Participante participante;

    public ItemDoEvento getItemDoEvento() {
        return itemDoEvento;
    }

    public void setItemDoEvento(ItemDoEvento itemDoEvento) {
        this.itemDoEvento = itemDoEvento;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Date getMomentoDeEntrada() {
        return momentoDeEntrada;
    }

    public void setMomentoDeEntrada(Date momentoDeEntrada) {
        this.momentoDeEntrada = momentoDeEntrada;
    }

    public Date getMomentoDeSaida() {
        return momentoDeSaida;
    }

    public void setMomentoDeSaida(Date momentoDeSaida) {
        if (momentoDeSaida.after(momentoDeEntrada)) {
            this.momentoDeSaida = momentoDeSaida;
        }
    }

}
