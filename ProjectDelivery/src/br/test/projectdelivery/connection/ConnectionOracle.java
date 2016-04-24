package br.test.projectdelivery.connection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Order to test a connection to the Oracle database
 *
 * @author CrasyFox.
 */
public class ConnectionOracle {

    public static Connection connect;
    public static Statement statement;
    public static ResultSet resultSet;
    public static ResultSetMetaData metaData;

    public static ConnectionOracle conexao = new ConnectionOracle();

    public ConnectionOracle() {
        conect();
    }

    public static void main(String[] args) {
        
    }
    
    public static Connection conect() {
        if (connect != null) {
            return connect;
        } else {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                connect = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "projectDelivery", "b2331997");
                System.out.println("Connected!");
                return connect;
            } catch (ClassNotFoundException ex) {
                System.out.println("Drive not found");
                ex.printStackTrace();
                return null;
            } catch (SQLException ex) {
                System.out.println("Error connecting to the data source");
                ex.printStackTrace();
                return null;
            }
        }
    }
    
    

    public void runSQL(String comSQL) {
        try {
            statement = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(comSQL);

        } catch (SQLException sqlEx) {
            JOptionPane.showMessageDialog(null, "error to find the record" + sqlEx);
            System.out.println(comSQL);
        }
        try {
            metaData = resultSet.getMetaData();
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();

        }
    }

    public void includeSQL(String comSQL) {
        try {
            statement = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(comSQL);

        } catch (SQLException sqlEx) {
            if (sqlEx.getErrorCode() == 00001) {
                JOptionPane.showMessageDialog(null, "this record is already included");
            } else {
                JOptionPane.showMessageDialog(null, "error include " + sqlEx);
            }
            System.out.println(comSQL);
        }
    }

    public void deleteSQL(String comSQL) {
        try {
            statement = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(comSQL);
        } catch (SQLException sqlEx) {
            JOptionPane.showMessageDialog(null, "it was not possible deleteing" + sqlEx);
            System.out.println(comSQL);
        }
    }

    public void updateSQL(String comSQL) {
        try {
            statement = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(comSQL);
        } catch (Exception sqlEx) {
            JOptionPane.showMessageDialog(null, "It was not possible to perform the update" + sqlEx);
            System.out.println(comSQL);
        }
    }

    public void quitBank(String comSQL) {
        try {
            connect.close();
            JOptionPane.showMessageDialog(null, "bank closed");
        } catch (Exception sqlEx) {
            JOptionPane.showMessageDialog(null, "bank can not be closed" + sqlEx);
        }
    }

    public String autoIncrement(String field, String table) {
        try {
            statement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery("SELECT COALESCE (MAX (" + field + "), 0) + 1 AS LAST FROM " + table);
            resultSet.first();
            return resultSet.getString("LAST");
        } catch (SQLException exSQL) {
            System.out.println("could not execute the following command" + exSQL);
            return null;
        }
    }
}
