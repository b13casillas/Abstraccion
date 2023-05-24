/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraccion;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author mariana
 */
public class Abstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Leon l1=new Leon();
        Leon l2=new Leon("Betito", 2);
        
        String nombre=JOptionPane.showInputDialog("Nombre:");
        int edad=Integer.valueOf(JOptionPane.showInputDialog("Edad:"));
        l1.setNombre(nombre);
        l1.setEdad(edad);
        
        JOptionPane.showMessageDialog(null, l1.toString());
        JOptionPane.showMessageDialog(null, l2.toString());
        */
        Object[] capturas={"Automovil", "León"};
        Object op=JOptionPane.showInputDialog(null,
                "Elegir la ventana de captura",
                "Elegir",
                JOptionPane.QUESTION_MESSAGE,
                null, capturas, 
                capturas[0] );
        if(op.toString().equals("Automovil")){
            FAutomovil fautomovil= new FAutomovil();
            fautomovil.setVisible(true);
        }else{
            FLeon fleon= new FLeon();
            fleon.setVisible(true);
        }
        
        
    }
    
}
