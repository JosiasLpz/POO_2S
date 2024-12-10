package Libro;
public class Libro
{
    private int ISBN;
    private int NumePagi ;
    private String Autor;
    private String Titulo;
    
   public Libro(String Autor,String Titulo,int NumePagi,int ISBN)
    {
        this.Autor=Autor;
        this.ISBN=ISBN;
        this.NumePagi=NumePagi;
        this.Titulo=Titulo;
    } 
   
    public int getIsbn()
    {        
        return ISBN;
    }
    
    public void setIsbn(int ISBN)
    {
        this.ISBN = ISBN;
    }
    
    public int getNumePagi()
    {        
        return NumePagi;
    }
    
    public void setNumePagi(int NumePagi)
    {
        this.NumePagi = NumePagi;
    }
    
    public String getAutor()
    {        
        return Autor;
    }
    
    public void setAutor(String Autor)
    {
        this.Autor = Autor;
    }
    
    public String getTitulo()
    {        
        return Titulo;
    }
    
    public void setTitulo(String Titulo)
    {
        this.Titulo = Titulo;
    }
    
    @Override
    public String toString()
    {
        return
            "\nEl libro "+Titulo
                +" con ISBN "+ISBN
                +" creado por el autor "+Autor
                + " tiene "+NumePagi+" paginas";
    }
}