/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafiman.bcceventos.negocios;


import br.com.fafiman.bcceventos.BCCEventos;
import br.fafiman.bcceventos.entidades.Evento;
import br.fafiman.bcceventos.entidades.Inscricao;
import br.fafiman.bcceventos.entidades.Participante;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author munifgebarajunior
 */
public class OperacoesBanco {

    public static List<Participante> listaTodosParticipantes() {
        EntityManager em = BCCEventos.emf.createEntityManager();
        Query q = em.createQuery("from Participante p order by p.nome"); //HQL
        return q.getResultList();
    }

    public static List<Evento> listaTodosEventos() {
        EntityManager em = BCCEventos.emf.createEntityManager();
        Query q = em.createQuery("from Evento e order by e.titulo"); //HQL
        return q.getResultList();
    }

    public static List<Inscricao> listaTodasInscricoes() {
        EntityManager em = BCCEventos.emf.createEntityManager();
        Query q = em.createQuery("from Inscricao i order by i.dataRealizacao"); //HQL
        return q.getResultList();
    }

}
