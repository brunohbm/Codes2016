/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.test.projectdelivery.tools;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CrasyFox
 */
public class FillJTable {

    public void fillJTableColumn(JTable tableModel, ResultSet resultSet, String[] columns) {
        DefaultTableModel table = (DefaultTableModel) tableModel.getModel();
        table.setNumRows(0);

        try {
            int column = columns.length;
            while (resultSet.next()) {
                Object row[] = new Object[column];
                for (int cont = 0; cont != column; cont++) {
                    row[cont] = resultSet.getString(columns[cont]);
                }
                table.addRow(row);
            }
        } catch (SQLException exSQL) {
            JOptionPane.showMessageDialog(null, "Register not found");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error list JTable");
        }
    }
    
    public void fillJTable(JTable tableModel, ResultSet resultSet) {
        DefaultTableModel table = (DefaultTableModel) tableModel.getModel();
        table.setNumRows(0);

        try {
            int column = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()) {
                Object row[] = new Object[column];
                for (int cont = 0; cont != column; cont++) {
                    row[cont] = resultSet.getString(cont + 1);
                }
                table.addRow(row);
            }
        } catch (SQLException exSQL) {
            JOptionPane.showMessageDialog(null, "Register not found");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error list JTable");
        }
    }

    public void alignTable(JTable table, int sizes[]) {
        for (int cont = 0; cont < sizes.length; cont++) {
            table.getColumnModel().getColumn(cont).setPreferredWidth(sizes[cont]);
        }
    }

    public void fillJcombo(ResultSet resultSet, JComboBox jCombo, String column) {
        jCombo.removeAllItems();
        try {
            while (resultSet.next()) {
                jCombo.addItem(resultSet.getString(column));
            }
        } catch (SQLException exSQL) {
            JOptionPane.showMessageDialog(null, "not registered records");
        }
    }

    public int[] fillJComboReturn(ResultSet resultSet, JComboBox jCombo, String primaryColumn, String visionColumn) {
        jCombo.removeAllItems();
        int vector[] = null;
        try {
            resultSet.last();
            vector = new int[resultSet.getRow()];
            int cont = 0;
            resultSet.first();
            do {
                vector[cont] = Integer.parseInt(resultSet.getString(primaryColumn));
                jCombo.addItem(resultSet.getString(visionColumn));
                cont++;
            } while (resultSet.next());
        } catch (SQLException exSQL) {
            JOptionPane.showMessageDialog(null, "Has no records in the table");
        }
        return vector;
    }

    public String[] fillJComboReturnString(ResultSet resultSet, JComboBox jCombo, String primaryColumn, String visionColumn) {
        jCombo.removeAllItems();
        String vector[] = null;
        try {
            resultSet.last();
            vector = new String[resultSet.getRow()];
            int cont = 0;
            resultSet.first();
            do {
                vector[cont] = (resultSet.getString(primaryColumn));
                jCombo.addItem(resultSet.getString(visionColumn));
                cont++;
            } while (resultSet.next());
        } catch (SQLException exSQL) {
            JOptionPane.showMessageDialog(null, "Has no records in the table");
        }
        return vector;
    }
    
    public String getTextColumn(ResultSet resultSet, String column){
        String getColumn = null;
        try {
            resultSet.first();
            getColumn = resultSet.getString(column);
        } catch (SQLException ex) {
            System.out.println("Has no records in the table");
        }
        return getColumn;
    }
}
