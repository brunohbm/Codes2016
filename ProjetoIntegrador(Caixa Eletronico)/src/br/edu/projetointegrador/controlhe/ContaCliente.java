/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetointegrador.controlhe;

/**
 *
 * @author CrasyFox
 */
public class ContaCliente {
    
    private int cdConta;
    private Cliente cliente;
    private Agencia agencia;
    private Double vlLimite;
    private Double vlSaldo;
    private String DsTipoConta;
    private int nrSenha;

    public int getNrSenha() {
        return nrSenha;
    }

    public void setNrSenha(int nrSenha) {
        this.nrSenha = nrSenha;
    }

    public int getCdConta() {
        return cdConta;
    }

    public void setCdConta(int cdConta) {
        this.cdConta = cdConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Double getVlLimite() {
        return vlLimite;
    }

    public void setVlLimite(Double vlLimite) {
        this.vlLimite = vlLimite;
    }

    public Double getVlSaldo() {
        return vlSaldo;
    }

    public void setVlSaldo(Double vlSaldo) {
        this.vlSaldo = vlSaldo;
    }

    public String getDsTipoConta() {
        return DsTipoConta;
    }

    public void setDsTipoConta(String DsTipoConta) {
        this.DsTipoConta = DsTipoConta;
    }
    
    
}
