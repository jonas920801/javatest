/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gx_jo
 */
public class Animal {
    public static void main (String[]args){
        
        Animal perro = new Animal(); //instanciar una clase u objeto
        Animal gato = new Animal(); //instanciar una clase u objeto
        Animal vaca = new Animal(); //instanciar una clase u objeto
        
        perro.YoSoyPerro();
        perro.Emitirperro();
        //gato.YoSoyGato();
    }
    
    public void YoSoyPerro () {
        System.out.println ("soy perro");
    }
    
    public void Emitirperro () {
         System.out.println ("gua gua guaauuuuu");
    
    }
  
      public void YoSoyGato () {
        System.out.println ("soy gato");
}
