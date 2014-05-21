/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fafiman.bcceventos.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author munifgebarajunior
 * 
 * Responsável:Cleyton
 */
@Entity
public class AtividadeCultural extends ItemDoEvento implements Serializable{

    @OneToOne
    private Horario horario;
    
    private String regulamento;

    public String getRegulamento() {
        return regulamento;
    }

    public void setRegulamento(String regulamento) {
         this.regulamento = regulamento;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
    
    


}
