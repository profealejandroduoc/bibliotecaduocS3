package com.example.bibliotecaduoc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.services.LibroService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> getLibros()
    {
        return libroService.readAll();
    }

    @PostMapping
    public Libro postLibro(@RequestBody Libro libro) {
        return libroService.create(libro);
    }

    @GetMapping("{id}")
    public Libro getLibroById(@PathVariable int id) {
        return libroService.readById(id);
    }

    @GetMapping("buscar_isbn/{isbn}")
    public Libro getLibroByIsbn(@PathVariable String isbn) {
        return libroService.readByIsbn(isbn);
    }
    
    @PutMapping("{id}")
    public Libro putLibro(@PathVariable int id, @RequestBody Libro libro) {
        return libroService.updateLibro(id, libro);
    }

    @DeleteMapping("{id}")
    public String deleteLibro(@PathVariable int id){
        return "Implementar en la casita";
    }

    
















    @GetMapping("inicializar")
    public String inicializar() {
        libroService.seed();
        return "Libros creados";
    }
    
    
}
