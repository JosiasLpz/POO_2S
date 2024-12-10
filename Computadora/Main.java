package Computadora;
public class Main{
    public static void main(String[] args){
     
       Computadora hp = new Computadora("hp","intel core i7 vpro 8th Gen","1600x720");
        
        hp.entrada();
        hp.marca();
        hp.procesador();
        hp.pantalla();
        
        Laptop lap = new Laptop();
        
      
        lap.estado();
    }  
}