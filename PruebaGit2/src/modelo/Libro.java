package modelo;

/**
 *
 * @author Bryan
 */
public class Libro {
    
    private String ISBN;
    private String titulo;
    private String autor;
    private static String etiquetas []={"ISBN", "Titulo", "Autor"};
    
    public Libro(String ISBN, String titulo, String autor) {
        setISBN(ISBN);
        setTitulo(titulo);
        setAutor(autor);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String toString() {
        return "ISBN: " + getISBN() + "\nTítulo: " + getTitulo() + "\nAutor: " + getAutor(); 
    }
    
    public String [] getEtiquetas()
    {
        return etiquetas;
    }//fin del metodo get etiquetas
   
    public static int getContaAtributos()
    {
        return etiquetas.length;
    }//fin del metodo contar etiquetas
    
    public String getAtributos(int numero)
    {
        if(numero==0)
        {   return titulo;
        }
        if(numero==1)
        {
            return ISBN;
        }
        if(numero==2)
        {
            return autor;
        }
        return null;
    }//fin del obtener atributos
      
    
}//Fin de la clase libro
