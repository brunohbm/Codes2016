package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;

/**
 *
 * @author CrasyFox
 */
public class ClassMarca extends ConexaoOracle {

    private int cdMarca;
    private String dsMarca;
    private String dtCadastro;
    private String inSituacao;

    StringBuffer sql = new StringBuffer();

    public void consultaPreenche() {
        consultaCod();
        try {
            resultSet.first();
            cdMarca = resultSet.getInt("CD_MARCA");
            dsMarca = resultSet.getString("DS_MARCA");
            dtCadastro = resultSet.getString("DT_CADASTRO");
            inSituacao = resultSet.getString("IN_SITUACAO");
        } catch (Exception e) {
        }

    }

    public ResultSet consultaCod() {
        sql.delete(0, sql.length());
        sql.append("SELECT CD_MARCA, DS_MARCA, TO_CHAR(DT_CADASTRO, 'DD/MM/YYYY') AS DT_CADASTRO, IN_SITUACAO FROM CAD_MARCA WHERE CD_MARCA = ");
        sql.append(getCdMarca());
        executeSQL(sql.toString());
        return resultSet;
    }

    public ResultSet consultaGeral() {
        sql.delete(0, sql.length());
        sql.append("SELECT CD_MARCA, DS_MARCA, TO_CHAR(DT_CADASTRO, 'DD/MM/YYYY') AS DT_CADASTRO, IN_SITUACAO FROM CAD_MARCA");
        executeSQL(sql.toString());
        return resultSet;
    }

    public ResultSet consultaDescricao() {
        sql.delete(0, sql.length());
        sql.append("SELECT CD_MARCA, DS_MARCA, TO_CHAR(DT_CADASTRO, 'DD/MM/YYYY') AS DT_CADASTRO, IN_SITUACAO FROM CAD_MARCA WHERE DS_MARCA LIKE '%");
        sql.append(getDsMarca()).append("%'");
        executeSQL(sql.toString());
        return resultSet;
    }

    public void inserir() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO CAD_MARCA (CD_MARCA, DS_MARCA, DT_CADASTRO, IN_SITUACAO) VALUES (");
        sql.append(getCdMarca()).append(", '");
        sql.append(getDsMarca()).append("', '");
        sql.append(getDtCadastro()).append("', '");
        sql.append(getInSituacao()).append("')");
        incluirSQL(sql.toString());
    }

    public void excluir() {
        sql.delete(0, sql.length());
        sql.append("DELETE FROM CAD_MARCA WHERE CD_MARCA = ");
        sql.append(getCdMarca());
    }

    public void alterar() {
        sql.delete(0, sql.length());
        sql.append("UPDATE CAD_MARCA SET DS_MARCA = '");
        sql.append(getDsMarca()).append("', ");
        sql.append("DT_CADASTRO = '");
        sql.append(getDtCadastro()).append("', ");
        sql.append("IN_SITUACAO = '");
        sql.append(getInSituacao()).append("' ");
        sql.append("WHERE CD_MARCA = ");
        sql.append(getCdMarca());
        atualizarSQL(sql.toString());
    }

    public int getCdMarca() {
        return cdMarca;
    }

    public void setCdMarca(int cdMarca) {
        this.cdMarca = cdMarca;
    }

    public String getDsMarca() {
        return dsMarca;
    }

    public void setDsMarca(String dsMarca) {
        this.dsMarca = dsMarca;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getInSituacao() {
        return inSituacao;
    }

    public void setInSituacao(String inSituacao) {
        this.inSituacao = inSituacao;
    }

}
