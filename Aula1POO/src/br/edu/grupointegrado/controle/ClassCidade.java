package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author CrasyFox
 */
public class ClassCidade extends ConexaoOracle {

    private int codcidade;
    private String descidade;
    private String descuf;

    StringBuffer sql = new StringBuffer();

    public void incluirCidade() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO CIDADE (CD_CIDADE, DS_CIDADE, DS_UF) VALUES(");
        sql.append(autoIncrem("CIDADE", "CD_CIDADE")).append(",'");
        sql.append(getDescidade()).append("','");
        sql.append(getDescuf()).append("')");
        incluirSQL(sql.toString());
    }

    public void excluirCidade() {
        sql.delete(0, sql.length());
        sql.append("DELETE FROM CIDADE WHERE CD_CIDADE =");
        sql.append(getCodcidade());
        deleteSQL(sql.toString());
    }

    public void alterarCidade() {
        sql.delete(0, sql.length());
        sql.append("UPDATE CIDADE SET DS_CIDADE = '");
        sql.append(getDescidade()).append("', ");
        sql.append("DS_UF = '");
        sql.append(getDescuf()).append("' ");
        sql.append("WHERE CD_CIDADE = ");
        sql.append(getCodcidade());
        atualizarSQL(sql.toString());

    }

    public ResultSet consultaGeral() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CIDADE ORDER BY CD_CIDADE ASC");
        executeSQL(sql.toString());
        return resultSet;
    }

    public ResultSet consultaUF() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CIDADE WHERE DS_UF LIKE '%");
        sql.append(getDescuf().toUpperCase()).append("%'");
        executeSQL(sql.toString());
        return resultSet;
    }

    public ResultSet consultaCodigo() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CIDADE WHERE CD_CIDADE = ");
        sql.append(getCodcidade());
        executeSQL(sql.toString());
        return resultSet;
    }

    public ResultSet consultaDescricao() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CIDADE WHERE DS_CIDADE LIKE '%");
        sql.append(getDescidade()).append("%'");
        executeSQL(sql.toString());
        return resultSet;
    }
    
    public void retornaCidade(){
        this.consultaCodigo();
        try {
            resultSet.first();
            setCodcidade(resultSet.getInt("CD_CIDADE"));
            setDescidade(resultSet.getString("DS_CIDADE"));
            setDescuf(resultSet.getString("DS_UF"));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public int getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(int codcidade) {
        this.codcidade = codcidade;
    }

    public String getDescidade() {
        return descidade;
    }

    public void setDescidade(String descidade) {
        this.descidade = descidade;
    }

    public String getDescuf() {
        return descuf;
    }

    public void setDescuf(String descuf) {
        this.descuf = descuf;
    }

}
