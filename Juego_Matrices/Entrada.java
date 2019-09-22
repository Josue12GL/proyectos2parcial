/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.util.Scanner;

/**
 *
 * @author Josue Garcia
 */
public class Entrada {
    Scanner s = new Scanner(System.in);
    int fila = 0, columna = 0;
    int filaArriba =0, columnaIzquierda= 0;
    String matriz[][]= new String [8][8];
    clsProceso a = new clsProceso();
    
    public void menu(){
    int opc = 0;
    
    do{
        for(int i = 1 ;i <= 2; i++){
    System.out.println("Hacia donde debe moverse");
    System.out.println("1 - Arriba \u2191 ");
    System.out.println("2 - Abajo \u2193 ");
    System.out.println("3 - Derecha \u2192");
    System.out.println("4 - Izquierda \u2190 ");
    System.out.print("Opcion: ");
    opc = s.nextInt();
      switch(opc){
        case 1: 
            if (fila == 0){ System.out.println("En Estos Momentos No Puede Subir"); menu(); }
            else{ obtenerValorA(); }
        break;
        case 2: obtenerValorB();
            break;
        case 3: obtenerValorD();
            break;
        case 4: 
            if(columna == 0){
            System.out.println("En Estos Momentos No Puede Ir A La Izquierda");
            menu();
            }else{ obtenerValorI(); }
            break;
        default:
            System.out.println("Solo Puedes Escoger Opciones Del 1-4");
            break;
      }
     }
    }while(opc >=5);
    
    if(matriz[6][6].equals("X")){ System.out.println("Haz FALLADO!!!"); }
    else{ System.out.println("Lo LOGRASTE!!!"); }
    }  
    
    
     public void obtenerValorA(){
        System.out.print("1 - Indica cuantos espacios tiene que moverse hacia arriba:");
        filaArriba = s.nextInt();
        for (int i = 0;i<matriz.length;i++){
           for (int j = 0;j<matriz.length;j++){
           matriz[j][i] = "0";
           }
        }
        matriz[6][6] = "X";
        matriz[fila-filaArriba][columna]= "@";   
        a.recorrido(matriz);
        
    }
    public void obtenerValorB(){
        System.out.print("2 - Indica cuantos espacios tiene que moverse hacia la abajo:");
        fila = s.nextInt();
        for (int i = 0;i<matriz.length;i++){
           for (int j = 0;j<matriz.length;j++){
           matriz[j][i] = "0";
           }
        }
         matriz[6][6] = "X";
        matriz[fila][columna]= "@";   
        a.recorrido(matriz);
    }
    public void obtenerValorD(){
        System.out.print("2 - Indica cuantos espacios tiene que moverse hacia la derecha:");
        columna = s.nextInt();
        for (int i = 0;i<matriz.length;i++){
           for (int j = 0;j<matriz.length;j++){
           matriz[j][i] = "0";
           }
        }
        matriz[6][6]= "X"; 
        matriz[fila][columna]= "@";
        a.recorrido(matriz);
    }
    public void obtenerValorI(){
        System.out.print("2 - Indica cuantos espacios tiene que moverse hacia la izquierda:");
        columnaIzquierda = s.nextInt();
        for (int i = 0;i<matriz.length;i++){
           for (int j = 0;j<matriz.length;j++){
           matriz[j][i] = "0";
           }
        }
        matriz[6][6]= "X"; 
        matriz[fila][columna-columnaIzquierda]= "@";
        a.recorrido(matriz);
    }
    
}
