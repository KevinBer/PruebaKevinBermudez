/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.RegistroLibros;
import vista.GUILibro;
import vista.PanelBotonesAccion;
import vista.PanelDatosLibro;
/**
 *
 * @author usuario
 */
public class ManejadorLibro implements ActionListener{
    
    private GUILibro guiLibro;
    private RegistroLibros registro;
    private PanelDatosLibro panelDatosLibro;
    
    public ManejadorLibro(GUILibro guiLibro, RegistroLibros registro, PanelDatosLibro panelDatosLibro) {
        this.guiLibro=guiLibro;    
        this.registro=registro;
        this.panelDatosLibro=panelDatosLibro;
    }
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals(PanelBotonesAccion.BOTON_ACEPTAR)){
            if(panelDatosLibro.getStateOfJTF()==true){
                if(registro.buscarLibro(panelDatosLibro.getLibro().getISBN())==null){
                    registro.setLibro(panelDatosLibro.getLibro());
                    panelDatosLibro.refresh();
                    JOptionPane.showMessageDialog(guiLibro, "Libro registrado exitosamente");
                }else
                    JOptionPane.showMessageDialog(guiLibro, "Existe un libro registrado con el ISBN: "+panelDatosLibro.getLibro().getISBN(),"Advertencia",JOptionPane.ERROR_MESSAGE);
            }else
                JOptionPane.showMessageDialog(guiLibro, "Existen campos vacíos, debe digitar toda la información","Advertencia",JOptionPane.ERROR_MESSAGE);
        }
        if(ae.getActionCommand().equals("Cancelar")){
            guiLibro.dispose();
        }
      
    }//fin del metodo actionPerformed
}
