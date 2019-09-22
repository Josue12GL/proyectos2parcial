/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import Clases.Entrada;
import Clases.clsInicio;


/**
 *
 * @author Josue Garcia
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clsInicio a = new clsInicio();
        Entrada v = new Entrada();
        System.out.println("Debes mover la '@' a la posicion de la 'X' en dos movimientos");
        a.inicio();
        v.menu();
        
        
    }
}
