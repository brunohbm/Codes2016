/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.test.projectdelivery.tools;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author CrasyFox
 */
public class CleanField {
 
    public void cleanField(Container container){
     Component components[] = container.getComponents();
     for (Component component : components){
         if (component instanceof JTextField){
             ((JTextField) component).setText("");
         }else if (component instanceof JPasswordField){
             ((JPasswordField) component).setText("");
         }
     }
    }
    
}
