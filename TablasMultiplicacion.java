public class TablasMultiplicacion{  
    public static void main(String[]args){
        
        int resultado;
        
        for (int num = 1; num <= 10; num ++){
        System.out.println("Tabla de multiplicar del " + num);
        for (int i = 0; i <= 10; i++){
            resultado = num * i;
            System.out.println( num + " x " + i + " = " + resultado);
         
        }
        System.out.println(); 
         
        }
    }
} 