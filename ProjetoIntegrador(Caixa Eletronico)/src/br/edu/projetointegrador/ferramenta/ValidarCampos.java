/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetointegrador.ferramenta;

import br.edu.projetointegrador.conexao.ConexaoOracle;
import java.awt.Component;
import java.awt.Container;
import java.sql.SQLException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CrasyFox
 */
public class ValidarCampos extends ConexaoOracle {

    boolean retorno;

    public void validarCamposObrigatorios(Container container, String table) {
        executeSQL("SELECT * FROM " + table + " WHERE ROWNUM = 1");
        Component components[] = container.getComponents();
        setRetorno(true);

        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField campo = ((JTextField) component);
                String conteudo = campo.getText();
                String tipText = campo.getToolTipText();
                String name = campo.getName();
                int chave = campo.getColumns();

                try {
                    for (int cont = 1; cont <= metaData.getColumnCount(); cont++) {
                        String nameColumn = metaData.getCatalogName(cont);
                        int nullTest = metaData.isNullable(cont);
                        if (conteudo.equals("") && (name.equals(nameColumn)) && (chave != 1) && (nullTest == 0)) {
                            JOptionPane.showMessageDialog(null, "Este campo é obrigatório :" + tipText);
                            campo.grabFocus();
                            setRetorno(false);
                            return;
                        }
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

            }
        }
    }

    public void validaNumerico(JFormattedTextField campo) {
        long valor;

        if (!(campo.getText().equals(""))) {
            if (campo.getText().indexOf('-') == 0) { 
                campo.setText("");
                campo.grabFocus();
                JOptionPane.showMessageDialog(null, "Esse campo só aceita numeros positivos !");
            } else {
                try {
                    valor = Long.parseLong(campo.getText());
                } catch (NumberFormatException numEx) {
                    JOptionPane.showMessageDialog(null, "Esse campo só aceita numeros !");
                    campo.setText("");
                    campo.grabFocus();
                }
            }
        }
    }

    public boolean getRetorno() {
        return retorno;
    }

    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }
}
