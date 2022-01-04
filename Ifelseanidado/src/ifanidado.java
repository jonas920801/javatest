
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gx_jo
 */
public class ifanidado {
    public static void main (String[]args){
        
        
        double gravedadtierra=9.8;
        double gravedadluna=1.6;
        double gravedadmarte= 3.7;
        
        
        Scanner entrada = new Scanner (System.in);
        System.out.println ("ingrese una gravedad: ");
        
        double gravedad = entrada.nextDouble();
        
        
        if (gravedad==gravedadtierra){
            System.out.println ("Estamos en la tierra");
        }
        else{
            if (gravedad==gravedadluna){
            System.out.println("Estamos en la luna"); 
            }
            else {
                  if  (gravedad==gravedadmarte){
                  System.out.println("Estamos en marte"); 
                 }
                
            else{
            System.out.println("No estamos ni en la tierra ni en la luna ni en marte");
            }
        }
        
    }
}
