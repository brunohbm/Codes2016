/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.prova.grupointegrado.controlhe;

import br.prova.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;

/**
 *
 * @author CrasyFox
 */
public class ClassVeiculo  extends ConexaoOracle{
    
    public ResultSet consultaVeiculo(){
        executeSQL("SELECT * FROM CAD_VEICULO");
        return resultSet;
    }
    
}
