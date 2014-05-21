/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fafiman.bcceventos.entidades;

import br.fafiman.bcceventos.ExcecaoDeValidacao;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author munifgebarajunior
 * Responsável: Cleyton
 */
@Entity
public class Minicurso extends ItemDoEvento{
    
    private String tema;
    
    private String ministrantes;
    
    
    
    @OneToMany
    private List<Horario> horarios;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        if (tema.length() > 3 ) {
        this.tema = tema;
        } else {
           throw new ExcecaoDeValidacao ("O nome do tema está curto demais");
       }
    }
    

    public String getMinistrantes() {
        return ministrantes;
    }
    
    public void setMinistrantes(String ministrantes) {
        if (!ministrantes.isEmpty()) {
            this.ministrantes = ministrantes;
          
        } else {
            throw new ExcecaoDeValidacao("O campo ministrante na pode ser nulo");                
        }
            
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {        
            this.horarios = horarios;           
        }
        
    }
    
    
    
    

