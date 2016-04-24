/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;

/**
 *
 * @author CrasyFox
 */
public class ClassOperacao extends ConexaoOracle{
    
   private  int cdOperacao;
   private String dsOperacao;
   private String tpOperacao;
   private int inEstoque;
   private int inFinanceiro;
   
   public StringBuffer sql = new StringBuffer();
   
   public void incluirOperacao(){
       sql.delete(0, sql.length());
       sql.append("INSERT INTO OPERACAO (CD_OPERACAO, DS_OPERACAO, TP_OPERACAO, IN_ESTOQUE, IN_FINANCEIRO) VALUES (");
       sql.append(conexao.autoIncrem("OPERACAO", "CD_OPERACAO")).append(", '");
       sql.append(getDsOperacao()).append("', '");
       sql.append(getTpOperacao()).append("', ");
       sql.append(getInEstoque()).append(", ");
       sql.append(getInFinanceiro()).append(")");
       incluirSQL(sql.toString());
   }
   
  public void excluirOperacao(){
      sql.delete(0, sql.length());
      sql.append("DELETE FROM OPERACAO WHERE CD_OPERACAO = ");
      sql.append(getCdOperacao());
      deleteSQL(sql.toString());
  }
  
  public void alterarOperacao(){
      sql.delete(0, sql.length());
      sql.append("UPDATE OPERACAO SET  DS_OPERACAO = '");
      sql.append(getDsOperacao()).append("', ");
      sql.append("TP_OPERACAO = '");
      sql.append(getTpOperacao()).append("', ");
      sql.append("IN_ESTOQUE = ");
      sql.append(getInEstoque()).append(", ");
      sql.append("IN_FINANCEIRO = ");
      sql.append(getInFinanceiro()).append(" ");
      sql.append("WHERE CD_OPERACAO = ");
      sql.append(getCdOperacao());
      atualizarSQL(sql.toString());
  }
  
  public ResultSet consultaGeral(){
      sql.delete(0, sql.length());
      sql.append("SELECT * FROM OPERACAO");
      executeSQL(sql.toString());
      return resultSet;
  }
  
  public ResultSet consultaCodigo(){
      sql.delete(0, sql.length());
      sql.append("SELECT * FROM OPERACAO WHERE CD_OPERACAO = ");
      sql.append(getCdOperacao());
      executeSQL(sql.toString());
      return  resultSet;
  }
  
  public ResultSet consultaDescricao(){
      sql.delete(0, sql.length());
      sql.append("SELECT * FROM OPERACAO WHERE DS_OPERACAO LIKE '% ");
      sql.append(getDsOperacao()).append(" %' ");
      executeSQL(sql.toString());
      return resultSet;
  }

    public static void main(String[] args) {
        ClassOperacao c = new ClassOperacao();
        c.setDsOperacao("C");
        System.out.println(c.consultaDescricao());
    }
   
    public int getCdOperacao() {
        return cdOperacao;
    }

    public void setCdOperacao(int cdOperacao) {
        this.cdOperacao = cdOperacao;
    }

    public String getDsOperacao() {
        return dsOperacao;
    }

    public void setDsOperacao(String dsOperacao) {
        this.dsOperacao = dsOperacao;
    }

    public String getTpOperacao() {
        return tpOperacao;
    }

    public void setTpOperacao(String tpOperacao) {
        this.tpOperacao = tpOperacao;
    }

    public int getInEstoque() {
        return inEstoque;
    }

    public void setInEstoque(int inEstoque) {
        this.inEstoque = inEstoque;
    }

    public int getInFinanceiro() {
        return inFinanceiro;
    }

    public void setInFinanceiro(int inFinanceiro) {
        this.inFinanceiro = inFinanceiro;
    }
    
}
