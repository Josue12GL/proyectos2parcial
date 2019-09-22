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
public class clsInicio {
    public void inicio(){
        clsProceso c = new clsProceso();
        String matrizI[][]= new String [8][8];
        for (int i = 0;i < matrizI.length;i++){
           for (int j = 0;j < matrizI.length;j++){
           matrizI[j][i] = "0";
           }
       }
        matrizI[0][0] = "@";
        matrizI[6][6] = "X";
        c.recorrido(matrizI);
    }
    
    
}
