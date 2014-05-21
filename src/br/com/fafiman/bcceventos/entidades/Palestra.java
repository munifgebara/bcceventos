/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fafiman.bcceventos.entidades;

import br.fafiman.bcceventos.ExcecaoDeValidacao;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author munifgebarajunior
 * Responsável: Leonardo
 */
@Entity
public class Palestra extends ItemDoEvento {

    private String tema;

    private String ministrantes;

    @OneToOne
    private Horario horario;

    public String getTema() {
        return tema;
    }
//validar para o tema não ser nulo*****************************************
    public void setTema(String tema) {
        if (getTema() != null){
            this.tema = tema;
        } else {
            throw new ExcecaoDeValidacao("O tema da Palestra não pode ser nulo.");
        }         
    }

    public String getMinistrantes() {
        return ministrantes;
    }
//validar para o ministrante não ser nulo****************************************
    public void setMinistrantes(String ministrantes) {
        if (getMinistrantes() != null){
            this.ministrantes = ministrantes;
        } else {
            throw new ExcecaoDeValidacao("O nome do ministrante não pode ser nulo.");
        }
    }
    
    public Horario getHorario() {
        return horario;
    }
//validar para que o horário não seja menor que o horário atual******************
    public void setHorario(Horario horario) {
        if (horario.getHorarioIncio().after(new Date())){
            this.horario = horario;
        } else {
            throw new ExcecaoDeValidacao("O horário da palestra, não pode ser inferior ao atual.");
        }
    }
        
}
