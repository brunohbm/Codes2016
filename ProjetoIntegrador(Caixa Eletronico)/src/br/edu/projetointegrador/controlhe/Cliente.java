/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetointegrador.controlhe;

import br.edu.projetointegrador.conexao.ConexaoOracle;
import java.sql.ResultSet;

/**
 *
 * @author CrasyFox
 */
public class Cliente extends ConexaoOracle{
    
    private int cdCliente;
    private String nmCliente;
    private int nrEndereco;
    private String nmRua;
    private String dsComplemento;
    private String nmBairro;
    private int nrFoneRes;
    private int nrFoneCelu;
    private int nrCPFCNPJ;
    private int nrRGIE;
    private String dsCidade;
    private String dsUF;
    
    public ResultSet consultaGeral(){
        executeSQL("SELECT * FROM CLIENTE WHERE CD_CLIENTE = " + getCdCliente());
        return resultSet;
    }

    public int getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(int cdCliente) {
        this.cdCliente = cdCliente;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public int getNrEndereco() {
        return nrEndereco;
    }

    public void setNrEndereco(int nrEndereco) {
        this.nrEndereco = nrEndereco;
    }

    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public String getNmBairro() {
        return nmBairro;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
    }

    public int getNrFoneRes() {
        return nrFoneRes;
    }

    public void setNrFoneRes(int nrFoneRes) {
        this.nrFoneRes = nrFoneRes;
    }

    public int getNrFoneCelu() {
        return nrFoneCelu;
    }

    public void setNrFoneCelu(int nrFoneCelu) {
        this.nrFoneCelu = nrFoneCelu;
    }

    public int getNrCPFCNPJ() {
        return nrCPFCNPJ;
    }

    public void setNrCPFCNPJ(int nrCPFCNPJ) {
        this.nrCPFCNPJ = nrCPFCNPJ;
    }

    public int getNrRGIE() {
        return nrRGIE;
    }

    public void setNrRGIE(int nrRGIE) {
        this.nrRGIE = nrRGIE;
    }

    public String getDsCidade() {
        return dsCidade;
    }

    public void setDsCidade(String dsCidade) {
        this.dsCidade = dsCidade;
    }

    public String getDsUF() {
        return dsUF;
    }

    public void setDsUF(String dsUF) {
        this.dsUF = dsUF;
    }
    
    
    
}
