
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gx_jo
 */
public class SeleccionDoble {
    public static void main (String[]args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una gravedad: ");
        
        double gravedad = entrada.nextDouble();
        
        if (gravedad== 9.8){
            System.out.println ("Estamos en la tierra!!");
        }
        
        else {
            System.out.println ("No estamos en la tierra");
        }
    }
    
}
