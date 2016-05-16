/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.ferramentas.Statement;

/**
 *
 * @author CrasyFox
 */
public class OS {

    private int cdOS;
    private String dtOS;
    private Cliente cliente = new Cliente();
    private Operacao operacao = new Operacao();

    public Statement stmt = new Statement();
    
    public void incluir() {
        stmt.registrar("CAD_OS", new Object[]{
            getCdOS(),
            getDtOS(),
            getCliente().getCdCliente(),
            getOperacao().getCdOperacao()
        });
    }

    public void excluir() {
        stmt.excluir("CAD_OS", "CD_OS", getCdOS());
    }

    public void alterar() {
        stmt.alterar("CAD_OS", new Object[]{
            getDtOS(),
            getCliente().getCdCliente(),
            getOperacao().getCdOperacao()
        }, "CD_OS", getCdOS());
    }

    public int getCdOS() {
        return cdOS;
    }

    public void setCdOS(int cdOS) {
        this.cdOS = cdOS;
    }

    public String getDtOS() {
        return dtOS;
    }

    public void setDtOS(String dtOS) {
        this.dtOS = dtOS;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

}
