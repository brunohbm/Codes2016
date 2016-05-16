/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import br.edu.grupointegrado.ferramentas.Statement;

/**
 *
 * @author CrasyFox
 */
public class MovOsServico extends ConexaoOracle{
    
    Servico servico = new Servico();
    OS os = new OS();
    double vlServico;
    double qtHoras;
    public Statement stmt = new Statement();
    StringBuffer buffer = new StringBuffer
    
    public void incluir (){
        stmt.registrar("MOV_OS_SERVICO", new Object[] {
        getServico().getCdServico(),
        getOs().getCdOS(),
        getVlServico(),
        getQtHoras()
        });
    }
    
    public void excluir (){
        stmt.excluir("MOV_OS_SERVICO", "", retorno);
    }
    
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

    public double getQtHoras() {
        return qtHoras;
    }

    public void setQtHoras(double qtHoras) {
        this.qtHoras = qtHoras;
    }
    
    
    
}
