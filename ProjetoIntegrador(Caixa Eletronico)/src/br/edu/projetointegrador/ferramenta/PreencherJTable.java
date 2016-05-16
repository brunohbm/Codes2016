/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetointegrador.ferramenta;

/**
 *
 * @author CrasyFox
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreencherJTable {

    public String getTextColumn(ResultSet resultSet, String column) {
        try {
            resultSet.first();
            return resultSet.getString(column);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error to get column" + column);
            return "";
        }
    }

    public void preencherJtable(JTable tabela, ResultSet resultado) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        try {
            int colunas = resultado.getMetaData().getColumnCount();

            while (resultado.next()) {
                Object[] row = new Object[colunas];
                for (int i = 0; i != colunas; i++) {
                    row[i] = resultado.getString(i + 1);
                }
                modelo.addRow(row);
            }

            if (!resultado.first()) {
                JOptionPane.showMessageDialog(null, "Registros não localizados!");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }

    public int[] preencherComboRetorno(ResultSet resultSet, String colunaVisao, String primaria, JComboBox combo) {
        combo.removeAllItems();
        int[] vetor = null;
        try {
            resultSet.last();
            vetor = new int[resultSet.getRow()];
            int cont = 0;
            resultSet.first();
            do {
                vetor[cont] = resultSet.getInt(primaria);
                combo.addItem(resultSet.getString(colunaVisao));
                cont++;
            } while (resultSet.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não ha registros nessa tabela");
        }
        return vetor;
    }
}
