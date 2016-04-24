package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author CrasyFox
 */
public class ClassModel extends ConexaoOracle {

    private int cdModelo;
    private static ClassMarca marca = new ClassMarca();
    private String dsModelo;
    private String inSituacao;
    private String dtCadastro;

    StringBuffer sql = new StringBuffer();

    public void cadastrar() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO CAD_MODELO (CD_MODELO, CD_MARCA, DS_MODELO, IN_SITUACAO, DT_CADASTRO) VALUES (");
        sql.append(autoIncrem("CAD_MODELO", "CD_MODELO")).append(", ");
        sql.append(getMarca().getCdMarca()).append(", '");
        sql.append(getDsModelo()).append("', '");
        sql.append(getInSituacao()).append("', '");
        sql.append(getDtCadastro()).append("') ");
        incluirSQL(sql.toString());
        
        
    }


    
    public void alterar() {
        sql.delete(0, sql.length());
        sql.append("UPDATE CAD_MODELO SET DS_MODELO = '");
        sql.append(getDsModelo()).append("', ");
        sql.append("CD_MARCA = ");
        sql.append(getMarca().getCdMarca()).append(", ");
        sql.append("IN_SITUACAO = '");
        sql.append(getInSituacao()).append("', ");
        sql.append("DT_CADASTRO = '");
        sql.append(getDtCadastro()).append("' ");
        sql.append("WHERE CD_MODELO = ");
        sql.append(getCdModelo());
        atualizarSQL(sql.toString());
        
    }

    public void deletar() {
        sql.delete(0, sql.length());
        sql.append("DELETE FROM CAD_MODELO WHERE CD_MODELO = ");
        sql.append(getCdModelo());
        deleteSQL(sql.toString());
    }

    public ResultSet consultaGeral() {
        sql.delete(0, sql.length());
        sql.append("SELECT M.CD_MODELO, MA.DS_MARCA, M.DS_MODELO, TO_CHAR(M.DT_CADASTRO,'DD/MM/YYYY') AS DT_CADASTRO FROM CAD_MODELO M ");
        sql.append("INNER JOIN CAD_MARCA MA ON MA.CD_MARCA = M.CD_MARCA");
        executeSQL(sql.toString());
        return resultSet;
    }

    public ResultSet cansultaModelo() {
        sql.delete(0, sql.length());
        sql.append("SELECT M.CD_MODELO, MA.DS_MARCA, M.DS_MODELO, TO_CHAR(M.DT_CADASTRO,'DD/MM/YYYY') AS DT_CADASTRO FROM CAD_MODELO M ");
        sql.append("INNER JOIN CAD_MARCA MA ON MA.CD_MARCA = M.CD_MARCA ");
        sql.append("WHERE M.DS_MODELO LIKE '%");
        sql.append(getDsModelo()).append("%'");
        executeSQL(sql.toString());
        return resultSet;
    }

    public ResultSet cansultaMarca() {
        sql.delete(0, sql.length());
        sql.append("SELECT M.CD_MODELO, MA.DS_MARCA, M.DS_MODELO, TO_CHAR(M.DT_CADASTRO,'DD/MM/YYYY') AS DT_CADASTRO FROM CAD_MODELO M ");
        sql.append("INNER JOIN CAD_MARCA MA ON MA.CD_MARCA = M.CD_MARCA ");
        sql.append("WHERE MA.DS_MARCA LIKE '%");
        sql.append(getMarca().getDsMarca()).append("%'");
        executeSQL(sql.toString());
        return resultSet;
    }
    
    public ResultSet consultaCod(){
        sql.delete(0, sql.length());
        sql.append("SELECT M.CD_MARCA, MA.DS_MARCA, M.DS_MODELO, TO_CHAR(M.DT_CADASTRO,'DD/MM/YYYY') AS DT_CADASTRO, M.IN_SITUACAO FROM CAD_MODELO M ");
        sql.append("INNER JOIN CAD_MARCA MA ON MA.CD_MARCA = M.CD_MARCA ");
        sql.append("WHERE M.CD_MODELO = ");
        sql.append(getCdModelo());
        executeSQL(sql.toString());
        return resultSet;
    }

    public void retornaModelo(){
        consultaCod();
        try {
            resultSet.first();
            setCdMarca(resultSet.getInt("CD_MARCA"));
            setDsMarca(resultSet.getString("DS_MARCA"));
            setDsModelo(resultSet.getString("DS_MODELO"));
            setDtCadastro(resultSet.getString("DT_CADASTRO"));
            setInSituacao(resultSet.getString("IN_SITUACAO"));
        } catch (SQLException sqlex) {
            System.out.println(sqlex);
        }
    }
    
    public int getCdModelo() {
        return cdModelo;
    }

    public void setCdModelo(int cdModelo) {
        this.cdModelo = cdModelo;
    }

    public ClassMarca getMarca() {
        return marca;
    }

    public void setDsMarca(String dsMarca){
        this.marca.setDsMarca(dsMarca);
    }
    
    public void setCdMarca(int cdmarca) {
        this.marca.setCdMarca(cdmarca);
    }

    public String getDsModelo() {
        return dsModelo;
    }

    public void setDsModelo(String dsModelo) {
        this.dsModelo = dsModelo;
    }

    public String getInSituacao() {
        return inSituacao;
    }

    public void setInSituacao(String inSituacao) {
        this.inSituacao = inSituacao;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

}
