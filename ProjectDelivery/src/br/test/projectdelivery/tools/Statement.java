/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.test.projectdelivery.tools;

import br.test.projectdelivery.connection.ConnectionOracle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * 07/05/2016 goal of creating a statement ( accepted only enter all values ​​)
 *
 * @author CrasyFox
 */
public class Statement extends ConnectionOracle {

    StringBuffer sql = new StringBuffer();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm:ss");

    public void delete(String table, String keyColumn, String keyValue) {
        sql.delete(0, sql.length());
        sql.append("DELETE FROM ");
        sql.append(table);
        sql.append(" WHERE ");
        sql.append(keyColumn);
        sql.append(" = ");
        sql.append(keyValue);
        try {
            deleteSQL(sql.toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void insert(String table, Object values[]) {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO ");
        sql.append(table);
        sql.append(" VALUES (");
        for (int cont = 1; cont <= values.length; cont++) {
        sql.append("?,");
        }
        sql.delete(sql.length() - 1, sql.length());
        sql.append(")");
        try {
            PreparedStatement statem =  connect.prepareStatement(sql.toString());
            for(int cont = 0; cont < values.length; cont++){
               if (values[cont] instanceof String) {
                    statem.setString((cont + 1), values[cont].toString());
                } else if (values[cont] instanceof Integer) {
                    statem.setInt((cont + 1), Integer.parseInt(values[cont].toString()));
                } else if (values[cont] instanceof Date) {
                    statem.setString((cont + 1), dateFormat.format(values[cont]));
                } else if (values[cont] instanceof Time) {
                    statem.setString((cont + 1), horaFormat.format(values[cont]));
                } 
            }
            statem.execute();
            statem.close();
        } catch (SQLException SQLex) {
            JOptionPane.showMessageDialog(null, SQLex);
        }
    }
    
    public void alter(String table, Object values[], String keyColumn, int keyValue) {
        try {            
            sql.delete(0, sql.length());
            sql.append("SELECT * FROM ").append(table);
            updateSQL(sql.toString());
            sql.delete(0, sql.length());            
            sql.append("UPDATE ");
            sql.append(table);
            sql.append(" SET ");
            for (int cont = 1; cont <= metaData.getColumnCount(); cont++) {
                if (!metaData.getColumnName(cont).equalsIgnoreCase(keyColumn)) {
                    sql.append(metaData.getColumnName(cont)).append(" = ?,");
                }
            }
            sql.delete((sql.length() - 1), sql.length());           
            sql.append(" WHERE ");
            sql.append(keyColumn);
            sql.append(" = ");
            sql.append(keyValue);
            
            PreparedStatement statem = connect.prepareStatement(sql.toString());
            for (int cont = 0; cont < values.length; cont++) {
                if (values[cont] instanceof String) {
                    statem.setString((cont + 1), values[cont].toString());
                } else if (values[cont] instanceof Integer) {
                    statem.setInt((cont + 1), Integer.parseInt(values[cont].toString()));
                } else if (values[cont] instanceof Date) {
                    statem.setString((cont + 1), dateFormat.format(values[cont]));
                } else if (values[cont] instanceof Time) {
                    statem.setString((cont + 1), horaFormat.format(values[cont]));
                }
            }
            statem.execute(); 
            statem.close();
        } catch (SQLException SQLex) {
            JOptionPane.showMessageDialog(null, SQLex);
        }

    }
}
