import java.util.Scanner;
public class DescuentoPorcentaje {   
    public static void main(String [] args){    
        double monto, descuento, montoDesc;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite el monto de su compra: "); monto = leer.nextDouble(); 
        
        if(monto < 500){
            System.out.println("El monto de su compra sin el descuento es: " + monto);
        } else if(monto >= 500 && monto <= 1000){
            descuento = (monto*5)/100;
            montoDesc = monto - descuento;
            System.out.println("El monto de su compra con descuento de 5% es: " + montoDesc); 
        } else if(monto > 1000 && monto <= 7000){
            descuento = (monto*11)/100; 
            montoDesc = monto - descuento;
            System.out.println("El monto de su compra con descuento de 11% es: " + montoDesc);
        } else if(monto > 7000 && monto <= 15000){
            descuento = (monto*18)/100;
            montoDesc = monto - descuento;
            System.out.println("El monto de su compra con descuento de 18% es: " + montoDesc); 
        } else if(monto > 15000){
            descuento = (monto*25)/100;
            montoDesc = monto - descuento;
            System.out.println("El monto de su compra con descuento de 25% es: " + montoDesc);
        }
      
  }   
}