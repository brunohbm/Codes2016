/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.grupointegrado.ferramentas;

import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author CrasyFox
 */
public class Relatorio {
    
    public Relatorio(ResultSet resultSet){
        try {
            JRResultSetDataSource jrRs = new JRResultSetDataSource(resultSet);
            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    "C://Users//Bruno//Desktop//Codes//Relatorios//RelatorioTeste.jasper",
                    new HashMap(),
                    jrRs);
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setVisible(true);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro com relatório " + erro);
        }
    }
    
}
