/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fafiman.bcceventos.entidades;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author munifgebarajunior Responsável:Guilherme
 */
@Entity
public class Evento {

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
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    

    private String titulo;
    @Embedded
    private Date dataInicial;
    @Embedded
    private Date dataFinal;
    private String descricao;
    private String nomeDoResponsavel;
    private String emailDoResponsavel;

    @OneToMany
    private List<ItemDoEvento> itens;
    

    public List<ItemDoEvento> getItens() {
        return itens;
    }

    public void setItens(List<ItemDoEvento> itens) {
        this.itens = itens;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {

        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        if (dataFinal.after(dataInicial)) {
            this.dataFinal = dataFinal;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeDoResponsavel() {
        return nomeDoResponsavel;
    }

    public void setNomeDoResponsavel(String nomeDoResponsavel) {
        this.nomeDoResponsavel = nomeDoResponsavel;
    }

    public String getEmailDoResponsavel() {
        return emailDoResponsavel;
    }

    public void setEmailDoResponsavel(String emailDoResponsavel) {
        this.emailDoResponsavel = emailDoResponsavel;
    }

}
