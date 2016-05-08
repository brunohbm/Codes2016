/*colunsDisplaySize
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.ferramentas;

import br.edu.grupointegrado.conexao.ConexaoOracle;
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
public class ValidaCampos extends ConexaoOracle {

    private boolean retorno;

    public void validaCamposObrigatorios(Container container, String tabela) {

        executeSQL("SELECT * FROM " + tabela + " WHERE ROWNUM = 1");
        setRetorno(true);

        Component components[] = container.getComponents();

        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                String nome = field.getName();
                String conteudo = field.getText();
                String tipText = field.getToolTipText();
                int chave = field.getColumns();
                try {
                    int numColumns = metaData.getColumnCount();
                    for (int cont = 1; cont <= numColumns; cont++) {
                        String columnName = metaData.getColumnName(cont);
                        int obrigatorio = metaData.isNullable(cont);
                        if (nome.equals(columnName) && conteudo.equals("") && obrigatorio == 0 && chave != 1) {
                            JOptionPane.showMessageDialog(null, "Campo " + tipText + " é obrigatório");
                            field.grabFocus();
                            setRetorno(false);
                            return;
                        }
                    }
                } catch (SQLException SQLex) {
                    JOptionPane.showMessageDialog(null, SQLex);
                }
            }
        }
    }

    public void validaInteiro(JFormattedTextField campo) {
        long valor;
        boolean valida;

        if (!(campo.getText().equals(""))) {
            String text = campo.getText();

            if (text.indexOf('-') == 0) {
                JOptionPane.showMessageDialog(null, "Esse campo só aceita números inteiros positivos ! ", "Informação", JOptionPane.INFORMATION_MESSAGE);
                campo.setText("");
                campo.grabFocus();
                valida = false;
                return;
            } else {
                valida = true;
            }

            if (valida) {
                try {
                    valor = Long.parseLong(campo.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Esse campo só aceita numeros !", "Informação ", JOptionPane.INFORMATION_MESSAGE);
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
