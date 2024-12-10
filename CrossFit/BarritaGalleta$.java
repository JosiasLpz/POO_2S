package CrossFit;
public class BarritaGalleta$ extends CostoGalletasBarritas
{

    public BarritaGalleta$(int galletaChocolate,int galletaAvena,int galletaChocolateBlanco,int barritaNuez,int barritaPasas) 
    {
        super(galletaChocolate,galletaAvena,galletaChocolateBlanco,barritaNuez,barritaPasas);
    }
    
    public void CGB() 
    {
        System.out.print("\nbarritas de nuez $"+getBarritaNuez()+"\nbarritas de pasas $"+getBarritaPasas()+"\ngalletas de chocolate $"+getGalletaChocolate()+"\ngalleta de avena $"+getGalletaAvena()+"\ngalleta chocolate blanco $"+getGalletaChocolateBlanco());        
    }    
}