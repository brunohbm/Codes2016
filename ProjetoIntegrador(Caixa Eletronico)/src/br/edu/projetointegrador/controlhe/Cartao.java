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
public class Cartao {
    
    private int cdCartao;
    private ContaCliente contaCliente = new ContaCliente();
    private Bandeira bandeira = new Bandeira();
    private String dsTipo;

    public int getCdCartao() {
        return cdCartao;
    }

    public void setCdCartao(int cdCartao) {
        this.cdCartao = cdCartao;
    }

    public ContaCliente getContaCliente() {
        return contaCliente;
    }

    public void setContaCliente(ContaCliente contaCliente) {
        this.contaCliente = contaCliente;
    }

    public Bandeira getBandeira() {
        return bandeira;
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    public String getDsTipo() {
        return dsTipo;
    }

    public void setDsTipo(String dsTipo) {
        this.dsTipo = dsTipo;
    }
    
    
    
}
