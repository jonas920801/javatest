
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gx_jo
 */
public class multiple {
    
    public static void main (String[]args){
    
    Scanner entrada = new Scanner (System.in);
    System.out.println ("Ingrese un dia del 1 al 7: ");
    
    int dia = entrada.nextInt();
    
    switch (dia) {
        
        case 1 :{
            
           System.out.println ("Lunes");
           break;
        }
        case 2 :{
            
           System.out.println ("Martes");
           break;
        }
        
        case 3 :{
            
           System.out.println ("Miercoles");
           break;
        }
        
        case 4 :{
            
           System.out.println ("Jueves");
           break;
        }
        
        case 5 :{
            
           System.out.println ("Viernes");
           break;
        }
        
        case 6 :{
            
           System.out.println ("Sabado");
           break;
        }
        
        case 7 :{
            
           System.out.println ("Domingo");
           break;
        }
        
        default:{
            System.out.println ("No ingresaste un numero del 1 al 7");
            break;
        }
        
    }
    
    
    
}
