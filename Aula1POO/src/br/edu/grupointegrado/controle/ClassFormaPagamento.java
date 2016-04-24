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
public class ClassFormaPagamento extends ConexaoOracle {

    private int cdForma;
    private String dsForma;
    private int nrParcelas;
    private String inEntrada;
    private int nrIntervalo;

    StringBuffer sql = new StringBuffer();

    public void incluirFormaPag() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO FORMA_PAGAMENTO (CD_FORMA, DS_FORMA, NR_PARCELAS, IN_ENTRADA, NR_INTERVALO) VALUES (");
        sql.append(autoIncrem("FORMA_PAGAMENTO", "CD_FORMA")).append(", '");
        sql.append(getDsForma()).append("', ");
        sql.append(getNrParcelas()).append(", '");
        sql.append(getInEntrada()).append("', ");
        sql.append(getNrIntervalo()).append(") ");
        incluirSQL(sql.toString());
    }
    
    public void deleteFormaPag(){
        sql.delete(0, sql.length());
        sql.append("DELETE FROM FORMA_PAGAMENTO WHERE CD_FORMA = ");
        sql.append(getCdForma());
        deleteSQL(sql.toString());
    }
    
    public void alterarFormaPag(){
        sql.delete(0, sql.length());
        sql.append("UPDATE FORMA_PAGAMENTO SET DS_FORMA = '");
        sql.append(getDsForma()).append("', ");
        sql.append("NR_PARCELAS = ");
        sql.append(getNrParcelas()).append(", ");
        sql.append("IN_ENTRADA = '");
        sql.append(getInEntrada()).append("', ");
        sql.append("NR_INTERVALO = ");
        sql.append(getNrIntervalo());
        sql.append("WHERE CD_FORMA = ");
        sql.append(getCdForma());
        atualizarSQL(sql.toString());
    } 
    
    public ResultSet consultaGeral(){
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM FORMA_PAGAMENTO");
        executeSQL(sql.toString());
        return resultSet;
    }
    
    public ResultSet consultaCod(){
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM FORMA_PAGAMENTO WHERE CD_FORMA = ");
        sql.append(getCdForma());
        executeSQL(sql.toString());
        return resultSet;
    }
    
    public ResultSet consultaDescicao(){
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM FORMA_PAGAMENTO WHERE DS_FORMA LIKE '%");
        sql.append(getDsForma()).append("%'");
        executeSQL(sql.toString());
        return resultSet;
    }
    
    
    public int getCdForma() {
        return cdForma;
    }

    public void setCdForma(int cdForma) {
        this.cdForma = cdForma;
    }

    public String getDsForma() {
        return dsForma;
    }

    public void setDsForma(String dsForma) {
        this.dsForma = dsForma;
    }

    public int getNrParcelas() {
        return nrParcelas;
    }

    public void setNrParcelas(int nrParcelas) {
        this.nrParcelas = nrParcelas;
    }

    public String getInEntrada() {
        return inEntrada;
    }

    public void setInEntrada(String inEntrada) {
        this.inEntrada = inEntrada;
    }

    public int getNrIntervalo() {
        return nrIntervalo;
    }

    public void setNrIntervalo(int nrIntervalo) {
        this.nrIntervalo = nrIntervalo;
    }

}
