/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;

/**
 *
 * @author CrasyFox
 */
public class ClassUF  extends ConexaoOracle{
    
    private String dsUF;
    private String nmUF;
    StringBuffer sql = new StringBuffer();

    public ResultSet consultaGeral(){
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM UF");
        executeSQL(sql.toString());
        return resultSet;
    }
    
    public ResultSet consultaDsUF(){
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM UF ");
        sql.append("WHERE DS_UF LIKE '%");
        sql.append(getDsUF()).append("%'");
        System.out.println(sql.toString());
        executeSQL(sql.toString());
        return resultSet;
    }
    
    public ResultSet consultaNmUf(){
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM UF ");
        sql.append("WHERE NM_UF LIKE '%");
        sql.append(getNmUF()).append("%'");
        executeSQL(sql.toString());
        return resultSet;
    }
    
    public String getDsUF() {
        return dsUF;
    }

    public void setDsUF(String dsUF) {
        this.dsUF = dsUF;
    }

    public String getNmUF() {
        return nmUF;
    }

    public void setNmUF(String nmUF) {
        this.nmUF = nmUF;
    }
    
    
    
}
