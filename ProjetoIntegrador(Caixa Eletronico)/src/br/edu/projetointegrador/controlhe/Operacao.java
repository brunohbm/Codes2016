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
    private ContaCliente contaFavorecida = new ContaCliente();
    private ContaCliente conta = new ContaCliente();
    private TipoOperacao tipoOperacao = new TipoOperacao();
    private Agencia agencia = new Agencia();
    private String dtOperacao;
    private String hrOperacao;
    private double vlOperacao;
    StringBuffer str = new StringBuffer();

    public void cadastrarComContaFavorecida() {
        str.delete(0, str.length());
        str.append("INSERT INTO OPERACAO (CD_OPERACAO, CD_CONTA_FAVORECIDA, CD_CONTA, CD_TIPO_OPERACAO, CD_BANCO, CD_AGENCIA, DT_OPERACAO, HR_OPERACAO, VL_OPERACAO) ");    
        str.append("VALUES (");
        str.append(autoIncrem("OPERACAO", "CD_OPERACAO")).append(", ");
        str.append(getContaFavorecida().getCdConta()).append(", ");
        str.append(getConta().getCdConta()).append(", ");
        str.append(getTipoOperacao().getCdTipoOperacao()).append(", ");
        str.append(getAgencia().getBanco().getCdBanco()).append(", ");
        str.append(getAgencia().getCdAgencia()).append(", ");
        str.append("TO CHAR (SYSDATE, 'dd-MM-yyyy'), ");
        str.append();
        str.append(getVlOperacao()).append(") ");
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

    public double getVlOperacao() {
        return vlOperacao;
    }

    public void setVlOperacao(double vlOperacao) {
        this.vlOperacao = vlOperacao;
    }

    public void cadastrarSemContaFavorecida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
