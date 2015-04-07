package modelo;

import java.util.ArrayList;

/**
 *
 * @author Bryan
 */
public class RegistroLibros {
    
    private ArrayList <Libro> libros;

    public RegistroLibros() {
        libros = new ArrayList<>();
    }
    
    public void setLibro(Libro libro){
        libros.add(libro);
    }
    
    public String getInformacion(){
        String datos = "";
        for(Libro libro:libros)//for ish ciclo autonomo
            datos+=libro.toString()+"\n\n";
        return datos;
    }
    
    public Libro buscarLibro(String ISBN){
        for(Libro libro:libros){
            if(libro.getISBN().equals(ISBN))
                return libro;
        }//fin for
    return null;
    }
    
    public int getFilas()
    {
        return libros.size();
    }
    
    
    
}//Fin clase
