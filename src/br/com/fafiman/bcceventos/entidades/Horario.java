/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fafiman.bcceventos.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author munifgebarajunior
 * Responsável:Munif
 */

@Entity
public class Horario implements Serializable {
    @Id
    private Long ID;    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date horarioIncio;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date horarioFim;

    public Date getHorarioIncio() {
        return horarioIncio;
    }

    public void setHorarioIncio(Date horarioIncio) {
        this.horarioIncio = horarioIncio;
    }

    public Date getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(Date horarioFim) {
        this.horarioFim = horarioFim;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

}
