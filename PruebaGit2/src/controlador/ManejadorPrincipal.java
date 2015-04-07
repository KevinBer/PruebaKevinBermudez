/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GUIBuscar;

/**
 *
 * @author Bryan
 */
public class ManejadorPrincipal implements ActionListener {
    
    private GUIBuscar guiBuscar;

    public ManejadorPrincipal() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("Buscar Libro")) {
            guiBuscar = new GUIBuscar();
            
        }
        
        if (e.getActionCommand().equals("Información General")) {
            
        }
    }
    
}
