/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetointegrador.ferramenta;

import br.edu.projetointegrador.conexao.ConexaoOracle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author CrasyFox
 */
public class Statement extends ConexaoOracle {

    StringBuffer sql = new StringBuffer();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm:ss");

    public void excluir(String tabela, String colunaChave, int chave) {
        sql.delete(0, sql.length());
        sql.append("DELETE FROM ");
        sql.append(tabela);
        sql.append(" WHERE ");
        sql.append(colunaChave);
        sql.append(" = ");
        sql.append(chave);
        try {
            super.deleteSQL(sql.toString());
        } catch (Exception e) {
        }
    }

    public void alterar(String tabela, Object valores[], String colunaChave, int chave) {
        try {
            sql.delete(0, sql.length());
            sql.append("SELECT * FROM ").append(tabela);
            super.executeSQL(sql.toString());
            sql.delete(0, sql.length());
            sql.append("UPDATE ");
            sql.append(tabela).append(" ");
            sql.append("SET ");
            for (int cont = 1; cont <= super.metaData.getColumnCount(); cont++) {
                if (!super.metaData.getColumnName(cont).equalsIgnoreCase(colunaChave)) {
                    sql.append(super.metaData.getColumnName(cont)).append(" = ?,");
                }
            }
            sql.delete((sql.length() - 1), sql.length());
            sql.append(" WHERE ");
            sql.append(colunaChave);
            sql.append(" = ").append(chave);
            PreparedStatement stmt = ConexaoOracle.prepareStatement(sql.toString());
            for (int cont = 0; cont < valores.length; cont++) {
                if (valores[cont] instanceof String) {
                    stmt.setString((cont + 1), valores[cont].toString());
                } else if (valores[cont] instanceof Integer) {
                    stmt.setInt((cont + 1), Integer.parseInt(valores[cont].toString()));
                } else if (valores[cont] instanceof Date) {
                    stmt.setString((cont + 1), dateFormat.format(valores[cont]));
                } else if (valores[cont] instanceof Time) {
                    stmt.setString((cont + 1), horaFormat.format(valores[cont]));
                }
            }
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        }

    }

    public void registrar(String tabela, Object valores[]) {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO ");
        sql.append(tabela).append(" ");
        sql.append("VALUES (");
        for (int cont = 1; cont <= valores.length; cont++) {
            sql.append("?,");
        }
        sql.delete((sql.length() - 1), sql.length());
        sql.append(")");
        try {
            PreparedStatement stmt = ConexaoOracle.prepareStatement(sql.toString());
            for (int cont = 0; cont < valores.length; cont++) {
                if (valores[cont] instanceof String) {
                    stmt.setString((cont + 1), valores[cont].toString());
                } else if (valores[cont] instanceof Integer) {
                    stmt.setInt((cont + 1), Integer.parseInt(valores[cont].toString()));
                } else if (valores[cont] instanceof Date) {
                    stmt.setString((cont + 1), dateFormat.format(valores[cont]));
                } else if (valores[cont] instanceof Time) {
                    stmt.setString((cont + 1), horaFormat.format(valores[cont]));
                }
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException SQLex) {
            JOptionPane.showMessageDialog(null, SQLex);
        }
    }
}
