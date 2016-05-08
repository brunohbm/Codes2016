/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import br.edu.grupointegrado.ferramentas.Statement;

/**
 *
 * @author CrasyFox
 */
public class Cliente extends ConexaoOracle{
    
    Statement statement = new Statement();
    
    int cdCliente;
    String dsCliente;
    ClassCidade cidade = new ClassCidade();

    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.cadastrar();
    }
    
    public void cadastrar(){
        setDsCliente("Bruno");
        statement.registrar("CAD_CLIENTE", new Object[]{autoIncrem("CAD_CLIENTE", "CD_CLIENTE"), getDsCliente()});
    }
    
    public int getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(int cdCliente) {
        this.cdCliente = cdCliente;
    }

    public String getDsCliente() {
        return dsCliente;
    }

    public void setDsCliente(String dsCliente) {
        this.dsCliente = dsCliente;
    }

    public ClassCidade getCidade() {
        return cidade;
    }

    public void setCidade(ClassCidade cidade) {
        this.cidade = cidade;
    }
    
    
    
}
