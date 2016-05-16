/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.ferramentas;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 06/05/2016 retorna um campo de acordo com o código
 *
 * @author CrasyFox
 */
public class RetornaCampo extends ConexaoOracle {
    
    public String retornaCampo(String tabela, String colunaRetorno, JTextField campo) {
        if (!(campo.getText().equals(""))) {
            executeSQL("SELECT " + colunaRetorno + " FROM " + tabela + " WHERE " + campo.getName() + " = " + campo.getText());
            try {
                resultSet.first();
                return resultSet.getString(colunaRetorno);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não existe valores na pesquisa de " + campo.getToolTipText());
                campo.grabFocus();
                campo.setText("");
            }
        }
        return "";
    }

}
