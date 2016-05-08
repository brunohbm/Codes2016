/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

/**
 *
 * @author CrasyFox
 */
public class OS {

    int cdOS;
    String dtOS;
    Cliente cliente = new Cliente();
    Operacao operacao = new Operacao();

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
