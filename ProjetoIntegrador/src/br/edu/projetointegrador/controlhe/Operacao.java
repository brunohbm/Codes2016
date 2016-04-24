/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetointegrador.controlhe;

import br.edu.projetointegrador.ferramenta.Statement;

/**
 *
 * @author CrasyFox
 */
public class Operacao extends Statement{
    
    private int cdOpercao;
    private ContaCliente contaFavorecida;
    private ContaCliente conta;
    private Operacao operacao;
    private Banco banco;
    private Agencia agencia;

    public int getCdOpercao() {
        return cdOpercao;
    }

    public void setCdOpercao(int cdOpercao) {
        this.cdOpercao = cdOpercao;
    }

    public ContaCliente getContaFavorecida() {
        return contaFavorecida;
    }

    public void setContaFavorecida(ContaCliente contaFavorecida) {
        this.contaFavorecida = contaFavorecida;
    }

    public ContaCliente getConta() {
        return conta;
    }

    public void setConta(ContaCliente conta) {
        this.conta = conta;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public String getDtOperacao() {
        return dtOperacao;
    }

    public void setDtOperacao(String dtOperacao) {
        this.dtOperacao = dtOperacao;
    }

    public String getHrOperacao() {
        return hrOperacao;
    }

    public void setHrOperacao(String hrOperacao) {
        this.hrOperacao = hrOperacao;
    }

    public String getVlOperacao() {
        return vlOperacao;
    }

    public void setVlOperacao(String vlOperacao) {
        this.vlOperacao = vlOperacao;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }
    private String dtOperacao;
    private String hrOperacao;
    private String vlOperacao;
    private String dsObservacao;
    
    public void cadastrar(){
        super.registrar(dtOperacao, new Object[] {
            super.autoIncrem("OPERACAO", "CD_OPERACAO"),
            
    }
}
