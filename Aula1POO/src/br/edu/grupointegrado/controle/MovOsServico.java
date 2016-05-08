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
public class MovOsServico extends ConexaoOracle{
    
    Servico servico = new Servico();
    OS os = new OS();
    double vlServico;
    String qtHoras;

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public double getVlServico() {
        return vlServico;
    }

    public void setVlServico(double vlServico) {
        this.vlServico = vlServico;
    }

    public String getQtHoras() {
        return qtHoras;
    }

    public void setQtHoras(String qtHoras) {
        this.qtHoras = qtHoras;
    }
    
    
    
}
