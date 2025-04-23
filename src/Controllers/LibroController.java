package Controllers;
import Models.Book;

public class LibroController {
    
    
    
    public void sortByName(Book[] libros) {
        int tam =libros.length;
        for(int i = 0; i < tam-1;++i){
            int min=i;
            for(int j =i+1; j<tam;j++){
                if (libros[j].getName().compareToIgnoreCase(libros)>0){
                    int aux = libros[j];
                    libros[j] =libros[min];
                    libros[min]= aux;


                }
            }

        }
        // Implementación pendiente
    }

    public Book searchByName(Book[] libros, String name) {
        int bajo=0;
        int alto=libros.length-1;


        // Implementación pendiente
        return null;
    }
 
    
}

