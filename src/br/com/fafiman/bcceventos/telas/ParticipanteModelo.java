/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafiman.bcceventos.telas;

import br.com.fafiman.bcceventos.negocios.OperacoesBanco;
import br.fafiman.bcceventos.entidades.Participante;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author munifgebarajunior
 */
public class ParticipanteModelo implements TableModel {

    private List<Participante> lista;

    public ParticipanteModelo() {
        lista = OperacoesBanco.listaTodosParticipantes();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int coluna) {
        if (coluna == 0) {
            return "Nome";
        }
        if (coluna == 1) {
            return "Celular";
        }
        if (coluna == 2) {
            return "Email";
        }
        return "Erro";

    }

    @Override
    public Class<?> getColumnClass(int coluna) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
        return false;
    }

    @Override
    public Object getValueAt(int linha, int coluna) { //Retorna o valor em uma linha e coluna
        Participante p = lista.get(linha);
        if (coluna == 0) {
            return p.getNome();
        }
        if (coluna == 1) {
            return p.getTelefoneCelular();
        }
        if (coluna == 2) {
            return p.getEmail();
        }
        return "Erro";

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

}
