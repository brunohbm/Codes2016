/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.test.projectdelivery.control;

import br.test.projectdelivery.connection.ConnectionOracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Project Delivery 03/04/2016
 *
 * @author CrasyFox
 */
public class ClassCity extends ConnectionOracle {

    private int cdCity;
    private String dsCity;
    private String dsUF;
    StringBuffer commSQL = new StringBuffer();

    public void includeCity() {
        commSQL.delete(0, commSQL.length());
        commSQL.append("INSERT INTO CITY (CD_CITY, DS_CITY, DS_UF) VALUES (");
        commSQL.append(autoIncrement("CD_CITY", "CITY")).append(", '");
        commSQL.append(getDsCity()).append("', '");
        commSQL.append(getDsUF()).append("') ");
        includeSQL(commSQL.toString());
    }

    public void alterCity() {
        commSQL.delete(0, commSQL.length());
        commSQL.append("UPDATE CITY SET DS_CITY = '");
        commSQL.append(getDsCity()).append("', ");
        commSQL.append("DS_UF = '");
        commSQL.append(getDsUF()).append("' ");
        commSQL.append("WHERE CD_CITY = ");
        commSQL.append(getCdCity());
        updateSQL(commSQL.toString());
    }

    public void deleteCity() {
        commSQL.delete(0, commSQL.length());
        commSQL.append("DELETE FROM CITY WHERE CD_CITY = ");
        commSQL.append(getCdCity());
        deleteSQL(commSQL.toString());
    }

    public ResultSet queryGeneral() {
        runSQL("SELECT * FROM CITY");
        return resultSet;
    }

    public ResultSet queryUF() {
        commSQL.delete(0, commSQL.length());
        commSQL.append("SELECT * FROM CITY WHERE DS_UF LIKE '%");
        commSQL.append(getDsUF()).append("%' ");
        runSQL(commSQL.toString());
        return resultSet;
    }

    public ResultSet queryCode() {
        commSQL.delete(0, commSQL.length());
        commSQL.append("SELECT * FROM CITY WHERE CD_CITY = ");
        commSQL.append(getCdCity());
        runSQL(commSQL.toString());
        return resultSet;
    }

    public int getCdCity() {
        return cdCity;
    }

    public void setCdCity(int cdCity) {
        this.cdCity = cdCity;
    }

    public String getDsCity() {
        return dsCity;
    }

    public void setDsCity(String dsCity) {
        this.dsCity = dsCity;
    }

    public String getDsUF() {
        return dsUF;
    }

    public void setDsUF(String dsUF) {
        this.dsUF = dsUF;
    }

}
