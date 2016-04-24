/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.prova.grupointegrado.controlhe;

import br.prova.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;

/**
 *
 * @author CrasyFox
 */
public class ClassAbastecimento extends ConexaoOracle {

    private Integer cdAbastecimento;
    private Integer cdVeiculo;
    private Integer cdAbastecedor;
    private Integer vlKM;
    private Integer qtAbastecido;
    private String dtAbastecimento;
    private String nmAbastecedor;
    private String nmVeiculo;

    StringBuffer sql = new StringBuffer();

    public void incluirAbastecimento() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO MOV_ABASTECIMENTO (CD_ABASTECIMENTO, CD_VEICULO, CD_ABASTECEDOR, VL_KM, QT_ABASTECIDO, DT_ABASTECIMENTO) VALUES(");
        sql.append(autoIncrem("MOV_ABASTECIMENTO", "CD_ABASTECIMENTO")).append(", ");
        sql.append(getCdVeiculo()).append(", ");
        sql.append(getCdAbastecedor()).append(", ");
        sql.append(getVlKM()).append(", ");
        sql.append(getQtAbastecido()).append(", '");
        sql.append(getDtAbastecimento()).append("')");
        incluirSQL(sql.toString());
    }

    public void excluirAbastecimento() {
        sql.delete(0, sql.length());
        sql.append("DELETE FROM MOV_ABASTECIMENTO WHERE CD_ABASTECIMENTO = ");
        sql.append(getCdAbastecimento());
        deleteSQL(sql.toString());
    }

    public ResultSet consultaGeral() {
        sql.delete(0, sql.length());
        sql.append("SELECT A.CD_ABASTECIMENTO, A.CD_VEICULO, AB.NM_ABASTECEDOR, A.VL_KM, A.QT_ABASTECIDO FROM MOV_ABASTECIMENTO A ");
        sql.append("INNER JOIN CAD_ABASTECEDOR AB ON AB.CD_ABASTECEDOR = A.CD_ABASTECEDOR ");
        executeSQL(sql.toString());
        return resultSet;
    }

    public ResultSet consultaAbastecedor() {
        sql.delete(0, sql.length());
        sql.append("SELECT A.CD_ABASTECIMENTO, A.CD_VEICULO, AB.NM_ABASTECEDOR, A.VL_KM, A.QT_ABASTECIDO FROM MOV_ABASTECIMENTO A ");
        sql.append("INNER JOIN CAD_ABASTECEDOR AB ON AB.CD_ABASTECEDOR = A.CD_ABASTECEDOR ");
        sql.append("WHERE AB.NM_ABASTECEDOR LIKE '%");
        sql.append(getNmAbastecedor()).append("%'");
        executeSQL(sql.toString());
        return resultSet;
    }

    public ResultSet consultaVeiculo() {
        sql.delete(0, sql.length());
        sql.append("SELECT A.CD_ABASTECIMENTO, A.CD_VEICULO, AB.NM_ABASTECEDOR, A.VL_KM, A.QT_ABASTECIDO FROM MOV_ABASTECIMENTO A ");
        sql.append("INNER JOIN CAD_ABASTECEDOR AB ON AB.CD_ABASTECEDOR = A.CD_ABASTECEDOR ");
        sql.append("INNER JOIN CAD_VEICULO C ON C.CD_VEICULO = A.CD_VEICULO ");
        sql.append("WHERE C.DS_VEICULO LIKE '%");
        sql.append(getNmVeiculo()).append("%'");
        executeSQL(sql.toString());
        return resultSet;
    }

    public Integer getCdAbastecimento() {
        return cdAbastecimento;
    }

    public void setCdAbastecimento(Integer cdAbastecimento) {
        this.cdAbastecimento = cdAbastecimento;
    }

    public Integer getCdVeiculo() {
        return cdVeiculo;
    }

    public void setCdVeiculo(Integer cdVeiculo) {
        this.cdVeiculo = cdVeiculo;
    }

    public Integer getCdAbastecedor() {
        return cdAbastecedor;
    }

    public void setCdAbastecedor(Integer cdAbastecedor) {
        this.cdAbastecedor = cdAbastecedor;
    }

    public Integer getVlKM() {
        return vlKM;
    }

    public void setVlKM(Integer vlKM) {
        this.vlKM = vlKM;
    }

    public Integer getQtAbastecido() {
        return qtAbastecido;
    }

    public void setQtAbastecido(Integer qtAbastecido) {
        this.qtAbastecido = qtAbastecido;
    }

    public String getDtAbastecimento() {
        return dtAbastecimento;
    }

    public void setDtAbastecimento(String dtAbastecimento) {
        this.dtAbastecimento = dtAbastecimento;
    }

    public String getNmAbastecedor() {
        return nmAbastecedor;
    }

    public void setNmAbastecedor(String nmAbastecedor) {
        this.nmAbastecedor = nmAbastecedor;
    }

    public String getNmVeiculo() {
        return nmVeiculo;
    }

    public void setNmVeiculo(String nmVeiculo) {
        this.nmVeiculo = nmVeiculo;
    }
}
