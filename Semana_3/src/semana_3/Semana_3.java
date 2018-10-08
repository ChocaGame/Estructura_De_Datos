/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class Semana_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lis = new Lista ();
        int opcion=0, el;
        do {
            try{
              opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un elemento al Incio de lista \n"
              +"2. Mostrar los datos de la lista \n"
              +"3. Salir ", "Menu de opccion", 3));
              switch (opcion){
                    case 1:
                        try{
                            el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento: ",
                                    "Insertando al inicio",3));
                            // agregando al nodo
                            lis.agregaralinicio(el);
                        }catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                        }
                        break;
                    case 2:
                        lis.mostrarLista();
                        break;
                    case 3:
                        break;    
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                        
              }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }
        } while (opcion != 3);
        
    }
    
}
