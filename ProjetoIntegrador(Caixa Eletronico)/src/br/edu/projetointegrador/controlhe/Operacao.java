/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetointegrador.controlhe;

import br.edu.projetointegrador.ferramenta.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CrasyFox
 */
public class Operacao extends Statement {

    private int cdOpercao;
    private ContaCliente contaFavorecida;
    private ContaCliente conta;
    private TipoOperacao tipoOperacao;
    private Agencia agencia;
    private String dtOperacao;
    private String hrOperacao;
    private String vlOperacao;
    private String dsObservacao;

    public void cadastrar() {
        Date data = new Date();
        super.registrar(dtOperacao, new Object[]{
            super.autoIncrem("OPERACAO", "CD_OPERACAO"),
            getContaFavorecida().getCdConta(),
            getConta().getCdConta(),
            tipoOperacao.getCdTipoOperacao(),
            agencia.getBanco().getCdBanco(),
            agencia.getCdAgencia(),
            data,
            data.getTime(),
            getVlOperacao(),
            getDsObservacao()
        }
        );
    }

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

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
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

}
