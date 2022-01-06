/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesYobjetos;

/**
 *
 * @author gx_jo
 */
public class Coche {
    String Color;
    String Marca;
    int km;
    int Year;
    
    public static void main (String [] args ){
        
        Coche coche1 = new Coche ();
 
        
        coche1.Color = "Azul";
        coche1.Marca = "Toyota";
        coche1.km = 0;
        coche1.Year = 2018;
       
        System.out.println ("El color del auto es "+coche1.Color);
        System.out.println ("La marca del auto es "+coche1.Marca);
        System.out.println ("Los km del coche son "+coche1.km);
        System.out.println ("El año del coche es "+coche1.Year);
        
        
        
    }
}
