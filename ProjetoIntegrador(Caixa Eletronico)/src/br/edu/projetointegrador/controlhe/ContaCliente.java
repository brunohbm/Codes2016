/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetointegrador.controlhe;

import br.edu.projetointegrador.conexao.ConexaoOracle;
import java.sql.SQLException;

/**
 *
 * @author CrasyFox
 */
public class ContaCliente extends ConexaoOracle {

    public ContaCliente() {

    }

    private int cdConta;
    private Cliente cliente = new Cliente();
    private Agencia agencia = new Agencia();
    private Banco banco = new Banco();
    private Double vlLimite;
    private Double vlSaldo;
    private String DsTipoConta;
    private int nrSenha;
    StringBuffer strBuff = new StringBuffer();

    public void updateSaldo(double valoOperacao) {
        strBuff.delete(0, strBuff.length());
        strBuff.append("UPDATE CONTA_CLIENTE SET VL_SALDO = ");
        strBuff.append(getVlSaldo() + (valoOperacao));
        strBuff.append(" WHERE CD_CONTA = ");
        strBuff.append(getCdConta());
        atualizarSQL(strBuff.toString());
    }

    public void preecher() {
        strBuff.delete(0, strBuff.length());
        strBuff.append("SELECT * FROM CONTA_CLIENTE WHERE CD_CONTA = ");
        strBuff.append(getCdConta());
        strBuff.append(" AND NR_SENHA = ");
        strBuff.append(getNrSenha());
        System.out.println(strBuff.toString());
        executeSQL(strBuff.toString());
        try {
            resultSet.first();
            setCdConta(resultSet.getInt("CD_CONTA"));
            getCliente().setCdCliente(resultSet.getInt("CD_CLIENTE"));
            getBanco().setCdBanco(resultSet.getInt("CD_BANCO"));
            getAgencia().setCdAgencia(resultSet.getInt("CD_AGENCIA"));
            setVlLimite(resultSet.getDouble("VL_LIMITE"));
            setVlSaldo(resultSet.getDouble("VL_SALDO"));
            setDsTipoConta(resultSet.getString("DS_TIPO_CONTA"));
            setNrSenha(resultSet.getInt("NR_SENHA"));
        } catch (SQLException sqlEx) {
        }
    }

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

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

}
