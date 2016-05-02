/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.test.projectdelivery.tools;

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
public class Report {
    
    public Report(ResultSet resultSet, String route){
        try {
            JRResultSetDataSource jasperResultSet = new JRResultSetDataSource(resultSet);
            JasperPrint jPrint = new JasperFillManager().fillReport(route, new HashMap(), jasperResultSet);
            JasperViewer jViewer = new JasperViewer(jPrint, false);
            jViewer.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error on report " + ex);
        }
    }
    
}
