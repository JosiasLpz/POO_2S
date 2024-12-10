public class MatrizNiñoNiña{
    public static void main(String[] args) {
       
        String [] generos ={"Niños", "Niñas"};
        String nombres [][]={
            {"josias","nehemias","jesus","sebastian","axel",
                "alejandro","isaias","rogelio","david","pedro"},
           {"olivia","ana","mariana","arisbet","ruby","kitzia","erisnet","nayanzi","ximena","zoe"}
        };
        int i =0;
        
        for (i = 0; i < 2;i++){
            System.out.println();
            System.out.print("Nombre de: " + generos [i] + ":");
            System.out.print("\n");
                   
        for (int j = 0; j< 10; j++){
            System.out.println("" + nombres [i][j]);
        }
        }
        
    }
}