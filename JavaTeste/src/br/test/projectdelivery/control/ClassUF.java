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
public class ClassUF extends ConnectionOracle{
    private String uf;
    
    public ResultSet queryGeneral(){
        runSQL("SELECT * FROM UF");
        return resultSet;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
}
