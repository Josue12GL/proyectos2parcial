/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Josue Garcia
 */
public class clsProceso {
    public void recorrido(String matriz[][]){
        for (int x = 0; x < matriz.length;x++){
            for (int y = 0; y < matriz[x].length;y++){
                String currentCel = matriz[x][y];
                System.out.print(currentCel+" ");
                }
            System.out.println();
        }
    }
     
}
