package CrossFit;
public class CostosHielitos
{
    private int hielitoOreo,hielitoPayLimon,hielitoGrosella,hielitoCacahuate,hielitoMangoChamoy,hielitoMango;

    public CostosHielitos(int hielitoOreo,int hielitoPayLimon,int hielitoGrosella,int hielitoCacahuate,int hielitoMangoChamoy,int hielitoMango) 
    {
        
        this.hielitoOreo = hielitoOreo;
        this.hielitoPayLimon = hielitoPayLimon;
        this.hielitoGrosella = hielitoGrosella;
        this.hielitoCacahuate = hielitoCacahuate;
        this.hielitoMangoChamoy = hielitoMangoChamoy;
        this.hielitoMango = hielitoMango;
    }

    public int getHielitoOreo() 
    {
        return hielitoOreo;
    }
    public  void setHielitoOreo(int hielitoOreo) 
    {
        this.hielitoOreo = hielitoOreo;
    }

    public int getHielitoPayLimon() 
    {
        return hielitoPayLimon;
    }
    public  void setHielitoPayLimon(int hielitoPayLimon) 
    {
        this.hielitoPayLimon = hielitoPayLimon;
    }
    
    public  int getHielitoGrosella() 
    {
        return hielitoGrosella;
    }
    public void setHielitoGrosella(int hielitoGrosella) 
    {
        this.hielitoGrosella = hielitoGrosella;
    }

    public int getHielitoCacahuate() 
    {
        return hielitoCacahuate;
    }
    public void setHielitoCacahuate(int hielitoCacahuate) 
    {
        this.hielitoCacahuate = hielitoCacahuate;
    }

    public int getHielitoMangoChamoy() 
    {
        return hielitoMangoChamoy;
    }
    public void setHielitoMangoChamoy(int hielitoMangoChamoy) 
    {
        this.hielitoMangoChamoy = hielitoMangoChamoy;
    }

    public int getHielitoMango()
    {
        return hielitoMango;
    }
    public void setHielitoMango(int hielitoMango)
    {
        this.hielitoMango = hielitoMango;
    }

    @Override
    public String toString() 
    {
        return  "\nhielito Oreo "+hielitoOreo 
                +"\nhielito PayLimon "+hielitoPayLimon 
                +"\nhielito Grosella "+hielitoGrosella 
                +"\nhielito Cacahuate "+hielitoCacahuate 
                +"\nhielito MangoChamoy "+hielitoMangoChamoy 
                +"\nhielito Mango "+hielitoMango;
    }          
}