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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CrasyFox
 */
public class ValidatesFields extends ConnectionOracle{
 
    private boolean returnTest;

    public void validatesRequiredFields(Container container, String table){
        
        runSQL("SELECT * FROM " + table + " WHERE ROWNUM = 1");
        Component components[] = container.getComponents();
        setReturnTest(true);
        
        for(Component component : components){
            if (component instanceof JTextField){
                JTextField field = ((JTextField) component);
                String name = field.getName();
                String content = field.getText();
                String text  = field.getToolTipText();
                int key = field.getColumns();
                try {
                    for(int cont = 1; cont <= metaData.getColumnCount(); cont++){
                        String columnName = metaData.getCatalogName(cont);
                        int testIsNull = metaData.isNullable(cont);
                        if(columnName.equals(name) && testIsNull == 0 && content.equals("") && key != 1){
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
    
    public boolean isReturnTest() {
        return returnTest;
    }

    public void setReturnTest(boolean returnTest) {
        this.returnTest = returnTest;
    }
}
