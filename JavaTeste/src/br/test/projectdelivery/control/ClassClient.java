/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.test.projectdelivery.control;

import br.test.projectdelivery.connection.ConnectionOracle;
import java.sql.ResultSet;

/**
 *
 * @author CrasyFox
 */
public class ClassClient extends ConnectionOracle {

    private int cdClient;
    private int cdCity;
    private String nmClient;
    private String dsAddress;
    private int nrAddress;
    private String dsComplement;
    private int nrPhone;
    private String uf;

    StringBuffer commSQL = new StringBuffer();

    public void includeClient() {
        commSQL.delete(0, commSQL.length());
        commSQL.append("INSERT INTO CLIENT (CD_CLIENT, CD_CITY, NM_CLIENT, DS_ADDRESS, NR_ADDRESS, DS_COMPLEMENT, NR_PHONE) VALUES (");
        commSQL.append(getCdClient()).append(", ");
        commSQL.append(getCdCity()).append(", '");
        commSQL.append(getNmClient()).append("', '");
        commSQL.append(getDsAddress()).append("', ");
        commSQL.append(getNrAddress()).append(", '");
        commSQL.append(getDsComplement()).append("', ");
        commSQL.append(getNrPhone()).append(")");
        includeSQL(commSQL.toString());
    }

    public void alterClient() {
        commSQL.delete(0, commSQL.length());
        commSQL.append("UPDATE CLIENT SET CD_CITY =");
        commSQL.append(getCdCity()).append(", ");
        commSQL.append("NM_CLIENT = '");
        commSQL.append(getNmClient()).append("', ");
        commSQL.append("DS_ADDRESS = '");
        commSQL.append(getDsAddress()).append("', ");
        commSQL.append("NR_ADDRESS = ");
        commSQL.append(getNrAddress()).append(", ");
        commSQL.append("DS_COMPLEMENT = '");
        commSQL.append(getDsComplement()).append("', ");
        commSQL.append("NR_PHONE = ");
        commSQL.append(getNrPhone());
        updateSQL(commSQL.toString());
    }

    public void deleteClient() {
        commSQL.delete(0, commSQL.length());
        commSQL.append("DELETE FROM CLIENT WHERE CD_CLIENT = ");
        commSQL.append(getCdClient());
        deleteSQL(commSQL.toString());
    }

    public ResultSet queryGeneral() {
        runSQL("SELECT * FROM CLIENT LEFT JOIN CITY ON CITY.CD_CITY = CLIENT.CD_CITY");
        return resultSet;
    }

    public ResultSet queryNameClient() {
        commSQL.delete(0, commSQL.length());
        commSQL.append("SELECT * FROM CLIENT ");
        commSQL.append("LEFT JOIN CITY ON CITY.CD_CITY = CLIENT.CD_CITY ");
        commSQL.append("WHERE CLIENT.NM_CLIENT LIKE '%");
        commSQL.append(getNmClient()).append("%'");
        runSQL(commSQL.toString());
        return resultSet;
    }
    
    public ResultSet queryCdClient(){
        commSQL.delete(0, commSQL.length());
        commSQL.append("SELECT * FROM CLIENT ");
        commSQL.append("LEFT JOIN CITY ON CITY.CD_CITY = CLIENT.CD_CITY ");
        commSQL.append("WHERE CLIENT.CD_CLIENT = ");
        commSQL.append(getCdClient());
        runSQL(commSQL.toString());
        return resultSet;
    }
    
    public ResultSet queryCdCity() {
        commSQL.delete(0, commSQL.length());
        commSQL.append("SELECT * FROM CLIENT ");
        commSQL.append("LEFT JOIN CITY ON CITY.CD_CITY = CLIENT.CD_CITY ");
        commSQL.append("WHERE CLIENT.CD_CITY = ");
        commSQL.append(getCdCity());
        runSQL(commSQL.toString());
        return resultSet;
    }

    public ResultSet queryDsUF(){
        commSQL.delete(0, commSQL.length());
        commSQL.append("SELECT * FROM CLIENT ");
        commSQL.append("LEFT JOIN CITY ON CITY.CD_CITY = CLIENT.CD_CITY ");
        commSQL.append("WHERE CITY.DS_UF LIKE '%");
        commSQL.append(getUf()).append("%'");
        runSQL(commSQL.toString());
        return resultSet;
    }
    
    public int getCdClient() {
        return cdClient;
    }

    public void setCdClient(int cdClient) {
        this.cdClient = cdClient;
    }

    public int getCdCity() {
        return cdCity;
    }

    public void setCdCity(int cdCity) {
        this.cdCity = cdCity;
    }

    public String getNmClient() {
        return nmClient;
    }

    public void setNmClient(String nmClient) {
        this.nmClient = nmClient;
    }

    public String getDsAddress() {
        return dsAddress;
    }

    public void setDsAddress(String dsAddress) {
        this.dsAddress = dsAddress;
    }

    public int getNrAddress() {
        return nrAddress;
    }

    public void setNrAddress(int nrAddress) {
        this.nrAddress = nrAddress;
    }

    public String getDsComplement() {
        return dsComplement;
    }

    public void setDsComplement(String dsComplement) {
        this.dsComplement = dsComplement;
    }

    public int getNrPhone() {
        return nrPhone;
    }

    public void setNrPhone(int nrPhone) {
        this.nrPhone = nrPhone;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
