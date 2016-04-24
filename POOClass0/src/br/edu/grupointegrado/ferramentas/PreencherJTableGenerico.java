/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.ferramentas;

/**
 *
 * @author CrasyFox
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreencherJTableGenerico {

    public void preencherJtableGenerico(JTable tabela, ResultSet resultado) {
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

    public void alinharJTable(JTable tabela, int[] valores) {
        for (int cont = 0; cont < valores.length; cont++) {
            tabela.getColumnModel().getColumn(cont).setPreferredWidth(valores[cont]);
        }
    }

    public void preencherCombo(ResultSet resultSet, JComboBox combo, String coluna) {
        combo.removeAllItems();
        try {
            while (resultSet.next()) {
                combo.addItem(resultSet.getString(coluna));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não ha registros cadastrados");
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
    public void preencherTwoJTfild(String coluna, JTextField field, ResultSet result){
        try {
            result.first();
            field.setText(result.getString(coluna));
        } catch (SQLException sqlex) {
            System.out.println(sqlex);
        }
    }
}
