package Bosina;
public class Main
{
    public static void main(String[] args)
    {
        
        Bosina jbl = new Bosina();
        
        jbl.encender();
        
        jbl.setMarca("JBL");
        jbl.setModelo(5);
        jbl.setColor("rojo");
        jbl.setDuracionBateria("2 horas");
        jbl.setPotencia("5 kwat"); 
       
        System.out.println("marca "+jbl.getMarca());
        System.out.println("modelo "+jbl.getModelo());
        System.out.println("color "+jbl.getColor());
        System.out.println("duracion de la bateria "+jbl.getDuracionBateria());
        System.out.println("potencia "+jbl.getPotencia());
       
        System.out.println(jbl.toString());       
        jbl.apagar();
    } 
}