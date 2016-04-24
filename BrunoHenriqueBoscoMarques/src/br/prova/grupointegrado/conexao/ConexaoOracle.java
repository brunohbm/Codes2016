package br.prova.grupointegrado.conexao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author Bruno Henrique Bosco Marques 
 */
public class ConexaoOracle {

    public static Connection ConexaoOracle;
    public static Statement statement;
    public static ResultSet resultSet;
    public static ResultSetMetaData metaData;
    public int retorno = 0;

    public static ConexaoOracle conexao = new ConexaoOracle();

    public static void main(String[] args) {
        ConexaoOracle c = new ConexaoOracle();
    }

    public ConexaoOracle() {
        conecta();
    }

    public static Connection conecta() {
        if (ConexaoOracle != null) {
            return ConexaoOracle;
        } else {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                ConexaoOracle = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "system", "system");
                System.out.println("Conectado !");
                return ConexaoOracle;
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Driver não encontrado !" + ex);
                ex.printStackTrace();
                return null;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conexão com a fonte de dados!");
                ex.printStackTrace();
                return null;
            }
        }
    }

    public void executeSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar o registro" + sqlex);
        }
        try {
            metaData = resultSet.getMetaData();
        } catch (SQLException erro) {
            System.out.println("erro ao pegar o metada" + erro);
            erro.printStackTrace();
        }

    }

    public void incluirSQL(String sql) {

        try {
            statement = ConexaoOracle.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            if (sqlex.getErrorCode() == 00001) {
                JOptionPane.showMessageDialog(null, "O registro não pode ser incluido pois ja está cadastrado");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel executar o comando sql = " + sql + "erro");
                System.out.println(sql);
            }
        }
    }

    public void deleteSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar o registro" + sqlex);
        }
    }

    public void atualizarSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar o registro" + sqlex);
            System.err.println(sql);
        }
    }

    public void desconecta() {
        try {
            ConexaoOracle.close();
            System.out.println("banco fechado");
        } catch (SQLException exClose) {
            JOptionPane.showMessageDialog(null, "não foi possivel conectar no banco de dados" + "\n" + exClose);
        }
    }

    public String autoIncrem(String tabela, String atributo) {
        try {
            statement = ConexaoOracle.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery("SELECT COALESCE (MAX(" + atributo + "),0) + 1 AS ULTIMO FROM " + tabela);
            resultSet.first();
            return resultSet.getString("ULTIMO");

        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel executar comando de sequencia" + sqlex);
            return null;
        }
    }
}
