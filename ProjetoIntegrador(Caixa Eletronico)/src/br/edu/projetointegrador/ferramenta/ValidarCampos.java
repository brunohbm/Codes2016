/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetointegrador.ferramenta;

import br.edu.projetointegrador.conexao.ConexaoOracle;
import java.awt.Component;
import java.awt.Container;

/**
 *
 * @author CrasyFox
 */
public class ValidarCampos extends ConexaoOracle{

    boolean retorno;

    public void validarCamposObrigatorios(Container container, String table){
        executeSQL("SELECT * FROM " + table + " WHERE ROWNUM = 1");
        Component components[] = container.getComponents();
        setRetorno(true);
        
        
    }

    public boolean isRetorno() {
        return retorno;
    }

    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }    
}

