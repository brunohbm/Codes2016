/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.test.projectdelivery.tools;

import br.test.projectdelivery.connection.ConnectionOracle;
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
public class ValidatesFields extends ConnectionOracle {

    private boolean returnTest;

    public void validateRequiredFields(Container container, String table) {

        runSQL("SELECT * FROM " + table + " WHERE ROWNUM = 1");
        Component components[] = container.getComponents();
        setReturnTest(true);

        for (Component component : components) {
            if (component instanceof JTextField) {
                JTextField field = ((JTextField) component);
                String name = field.getName();
                String content = field.getText();
                String text = field.getToolTipText();
                int key = field.getColumns();
                try {
                    for (int cont = 1; cont <= metaData.getColumnCount(); cont++) {
                        String columnName = metaData.getCatalogName(cont);
                        int testIsNull = metaData.isNullable(cont);
                        if (columnName.equals(name) && testIsNull == 0 && content.equals("") && key != 1) {
                            JOptionPane.showMessageDialog(null, "O campo " + text + " é obrigatório");
                            field.grabFocus();
                            setReturnTest(false);
                            return;
                        }
                    }
                } catch (SQLException exSQL) {
                    JOptionPane.showMessageDialog(null, exSQL);
                }
            }
        }

    }

    public void validateIntegerFields(JFormattedTextField field) {
        if (!(field.getText().equals(""))) {
            if (field.getText().indexOf("-") == 0) {
                JOptionPane.showMessageDialog(null, "this field only accept values positives", "Report", JOptionPane.INFORMATION_MESSAGE);
                field.setText("");
                field.grabFocus();                
            } else {
                try {
                    long valueTest = Long.parseLong(field.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "this field only accept numbers", "Report", JOptionPane.INFORMATION_MESSAGE);
                    field.setText("");
                    field.grabFocus();                    
                }
            }
        }
    }

    public boolean isReturnTest() {
        return returnTest;
    }

    public void setReturnTest(boolean returnTest) {
        this.returnTest = returnTest;
    }
}
