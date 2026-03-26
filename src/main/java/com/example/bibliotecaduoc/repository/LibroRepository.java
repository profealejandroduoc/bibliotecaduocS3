package com.example.bibliotecaduoc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bibliotecaduoc.model.Libro;

@Repository
public class LibroRepository {
    private List<Libro> listaLibros=new ArrayList<>();


    public List<Libro> obtenerLibros(){
        return listaLibros;
    }


    public Libro agregar(Libro libro) {
        listaLibros.add(libro);
        return libro;
       
    }


    public void seed()
    {
        agregar(new Libro(1, "978-84-376-0494-7", "Cien años de soledad", "Editorial Sudamericana", 1967, "Gabriel García Márquez"));
        agregar(new Libro(2, "978-01-411-8776-1", "1984", "Secker & Warburg", 1949, "George Orwell"));
        agregar(new Libro(3, "978-84-206-5940-4", "El Aleph", "Losada", 1949, "Jorge Luis Borges"));
        agregar(new Libro(4, "978-06-186-4015-7", "El Hobbit", "George Allen & Unwin", 1937, "J.R.R. Tolkien"));
    }
    
}
