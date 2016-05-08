/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;

/**
 *
 * @author CrasyFox
 */
public class Operacao extends ConexaoOracle{

    int cdOperacao;
    String dsOperacao;
    Double vlOperacao;

    public int getCdOperacao() {
        return cdOperacao;
    }

    public void setCdOperacao(int cdOperacao) {
        this.cdOperacao = cdOperacao;
    }

    public String getDsOperacao() {
        return dsOperacao;
    }

    public void setDsOperacao(String dsOperacao) {
        this.dsOperacao = dsOperacao;
    }

    public Double getVlOperacao() {
        return vlOperacao;
    }

    public void setVlOperacao(Double vlOperacao) {
        this.vlOperacao = vlOperacao;
    }
    
    
}
