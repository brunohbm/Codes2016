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
public class Servico extends ConexaoOracle{
    
    int cdServico;
    String dsServico;
    double vlServico;

    public int getCdServico() {
        return cdServico;
    }

    public void setCdServico(int cdServico) {
        this.cdServico = cdServico;
    }

    public String getDsServico() {
        return dsServico;
    }

    public void setDsServico(String dsServico) {
        this.dsServico = dsServico;
    }

    public double getVlServico() {
        return vlServico;
    }

    public void setVlServico(double vlServico) {
        this.vlServico = vlServico;
    }
    
    
}
