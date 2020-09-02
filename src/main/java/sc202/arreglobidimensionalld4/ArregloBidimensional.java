/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc202.arreglobidimensionalld4;

import javax.swing.JOptionPane;

/**
 *
 * @author jpaniaguaq
 */
public class ArregloBidimensional {
   String matriz[][];

    public ArregloBidimensional(int f, int c) {
        matriz = new String[f][c];
    }
    
    public static String demeCadena(String titulo, String mensaje){
        return JOptionPane.showInputDialog(null, titulo, mensaje,-1);
    }
    
    public static boolean vocal(String palabra){
        palabra=palabra.toLowerCase();
        if( (palabra.charAt(0)=='a') ||
            (palabra.charAt(0)=='e') ||
            (palabra.charAt(0)=='i') ||
            (palabra.charAt(0)=='o') ||
            (palabra.charAt(0)=='u') ){
            return true;
        }else{
            return false;
        }
    }
    
   public void agregar(){
       String palabra;
       int c=0;
       for (int f = 0; f < matriz.length; f++) {
           do{
               if(f==0 && c==0){
                   palabra=demeCadena("Vocal","Dig. una palabra con vocal");
                   if(vocal(palabra)){
                       matriz[f][c]=palabra;
                       c++;
                   }
               }else if(f==0 && c==matriz[0].length){
                   palabra=demeCadena("Vocal","Dig. una palabra con vocal");
                   if(vocal(palabra)){
                       matriz[f][c]=palabra;
                       c++;
                   }
               }else if(f==matriz.length && c==0){
                   palabra=demeCadena("Vocal","Dig. una palabra con vocal");
                   if(vocal(palabra)){
                       matriz[f][c]=palabra;
                       c++;
                   }
               }else if(f==matriz.length && c==matriz[0].length){
                   palabra=demeCadena("Vocal","Dig. una palabra con vocal");
                   if(vocal(palabra)){
                       matriz[f][c]=palabra;
                       c++;
                   }
               }else{
                   palabra=demeCadena("Consonante","Dig. una palabra con consonante");
                   if(!vocal(palabra)){
                       
                   }
               }
           }while(c<matriz[0].length);
       }
   }
   
   public void buscar(String palabra){
       for (int f = 0; f < matriz.length; f++) {
           for (int c = 0; c < matriz[0].length; c++) {
               if(matriz[f][c]==palabra){
                   System.out.println("Se encontro la palabra: "+
                           matriz[f][c]+" en la posición Fila:"+f
                   +" columna: "+c);
           }
           
       }
   }
   }
   
   public void eliminar(){
       
   }
   
   public void mostrar(){
       for (int f = 0; f < matriz.length; f++) {
           for (int c = 0; c < matriz[0].length; c++) {
               System.out.print(matriz[f][c]);
           }
           System.out.println("");
       }
   }
   
}
