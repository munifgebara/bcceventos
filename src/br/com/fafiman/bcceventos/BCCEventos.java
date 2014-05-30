/*
 TAREFAS:
-Pesquisar métodos das classe JOptionPane (Faz diálogos)
-Implementar a classe EventoModelo
-Implementar a lcasse EventoConsulta com o excluir funcionando




 */
package br.com.fafiman.bcceventos;

import br.fafiman.bcceventos.telas.TelaPrincipal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;

/**
 *
 * @author munifgebarajunior
 */
public class BCCEventos {

    public static EntityManagerFactory emf;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        System.out.println("Iniciando Sistemas BCC Eventos");
        emf = Persistence.createEntityManagerFactory("BCCEventosPU");

        TelaPrincipal tp = new TelaPrincipal();
        tp.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tp.setVisible(true);

    }

}
