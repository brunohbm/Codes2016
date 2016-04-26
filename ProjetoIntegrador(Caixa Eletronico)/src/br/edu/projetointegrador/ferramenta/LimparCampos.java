/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetointegrador.ferramenta;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author CrasyFox
 */
public class LimparCampos {

    public void limparCampos (Container container){
        Component componentes[] = container.getComponents();
        
        for(Component component: componentes){
            if(component instanceof JTextField){
                ((JTextField) component).setText("");
            }else if(component instanceof JFormattedTextField){
                ((JFormattedTextField) component).setText("");
            }else if(component instanceof JPasswordField){
                ((JPasswordField) component).setText("");
            }
        }        
    }    
}
