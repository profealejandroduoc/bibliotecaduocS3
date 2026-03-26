package com.example.bibliotecaduoc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bibliotecaduoc.model.Libro;

@Repository
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    public Libro agregar(Libro libro) {
        listaLibros.add(libro);
        return libro;

    }

    public void seed() {
        agregar(new Libro(1, "978-84-376-0494-7", "Cien años de soledad", "Editorial Sudamericana", 1967,
                "Gabriel García Márquez"));
        agregar(new Libro(2, "978-01-411-8776-1", "1984", "Secker & Warburg", 1949, "George Orwell"));
        agregar(new Libro(3, "978-84-206-5940-4", "El Aleph", "Losada", 1949, "Jorge Luis Borges"));
        agregar(new Libro(4, "978-06-186-4015-7", "El Hobbit", "George Allen & Unwin", 1937, "J.R.R. Tolkien"));
        agregar(new Libro(5, "978-0140449136", "La Odisea", "Penguin Classics", -800, "Homero"));
        agregar(new Libro(6, "978-8424116286", "Don Quijote de la Mancha", "Francisco de Robles", 1605,
                "Miguel de Cervantes"));
        agregar(new Libro(7, "978-0141439518", "Orgullo y Prejuicio", "T. Egerton", 1813, "Jane Austen"));
        agregar(new Libro(8, "978-0451524935", "Moby Dick", "Richard Bentley", 1851, "Herman Melville"));
        agregar(new Libro(9, "978-0141439556", "Grandes Esperanzas", "Chapman & Hall", 1861, "Charles Dickens"));
        agregar(new Libro(10, "978-0691166162", "Crimen y Castigo", "The Russian Messenger", 1866,
                "Fyodor Dostoevsky"));
        agregar(new Libro(11, "978-0140447934", "Anna Karenina", "The Russian Messenger", 1877, "Leo Tolstoy"));
        agregar(new Libro(12, "978-0141439600", "Drácula", "Archibald Constable and Company", 1897, "Bram Stoker"));
        agregar(new Libro(13, "978-0486415864", "El retrato de Dorian Gray", "Lippincott's Monthly Magazine", 1890,
                "Oscar Wilde"));
        agregar(new Libro(14, "978-0345339706", "El Silmarillion", "George Allen & Unwin", 1977, "J.R.R. Tolkien"));
        agregar(new Libro(15, "978-0743273565", "El Gran Gatsby", "Charles Scribner's Sons", 1925,
                "F. Scott Fitzgerald"));
        agregar(new Libro(16, "978-0684801223", "Adiós a las armas", "Charles Scribner's Sons", 1929,
                "Ernest Hemingway"));
        agregar(new Libro(17, "978-0061120084", "Matar a un ruiseñor", "J.B. Lippincott & Co.", 1960, "Harper Lee"));
        agregar(new Libro(18, "978-0547928227", "El Hobbit", "George Allen & Unwin", 1937, "J.R.R. Tolkien"));
        agregar(new Libro(19, "978-0141182704", "La metamorfosis", "Kurt Wolff Verlag", 1915, "Franz Kafka"));
        agregar(new Libro(20, "978-0141187761", "Rebelión en la granja", "Secker & Warburg", 1945, "George Orwell"));
        agregar(new Libro(21, "978-0307474728", "Crónica de una muerte anunciada", "La Oveja Negra", 1981,
                "Gabriel García Márquez"));
        agregar(new Libro(22, "978-8420633138", "Rayuela", "Editorial Sudamericana", 1963, "Julio Cortázar"));
        agregar(new Libro(23, "978-8437601885", "Pedro Páramo", "Fondo de Cultura Económica", 1955, "Juan Rulfo"));
        agregar(new Libro(24, "978-0143105428", "Fahrenheit 451", "Ballantine Books", 1953, "Ray Bradbury"));
        agregar(new Libro(25, "978-0316769174", "El guardián entre el centeno", "Little, Brown and Company", 1951,
                "J.D. Salinger"));
        agregar(new Libro(26, "978-0451524935", "La letra escarlata", "Ticknor, Reed & Fields", 1850,
                "Nathaniel Hawthorne"));
        agregar(new Libro(27, "978-0140444308", "Así habló Zaratustra", "Ernst Schmeitzner", 1883,
                "Friedrich Nietzsche"));
        agregar(new Libro(28, "978-0141439471", "Frankenstein", "Lackington, Hughes, Harding, Mavor & Jones", 1818,
                "Mary Shelley"));
        agregar(new Libro(29, "978-0143039433", "En el camino", "Viking Press", 1957, "Jack Kerouac"));
        agregar(new Libro(30, "978-0060850524", "Un mundo feliz", "Chatto & Windus", 1932, "Aldous Huxley"));
        agregar(new Libro(31, "978-0345339683", "El retorno del Rey", "George Allen & Unwin", 1955, "J.R.R. Tolkien"));
        agregar(new Libro(32, "978-8423351602", "Nada", "Ediciones Destino", 1945, "Carmen Laforet"));
        agregar(new Libro(33, "978-0141185064", "El extranjero", "Gallimard", 1942, "Albert Camus"));
        agregar(new Libro(34, "978-0451526342", "Los miserables", "A. Lacroix, Verboeckhoven & Ce.", 1862,
                "Victor Hugo"));
    }



    public Libro libroporId(int id) {
        for (Libro libro : listaLibros) {
            if(id==libro.getId()){
                return libro;
            }
        }
        return null;
    }

    public Libro libroporIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if(libro.getIsbn().equals(isbn)){
                return libro;
            }
        }

        return null;
    }

    public Libro modificarLibro(int id, Libro libro) {
        Libro buscado=libroporId(id);
        if (buscado!=null){
            buscado.setAutor(libro.getAutor());
            buscado.setEditorial(libro.getEditorial());
            buscado.setFechaPublicacion(libro.getFechaPublicacion());
            buscado.setIsbn(libro.getIsbn());
            buscado.setTitulo(libro.getTitulo());
            return buscado;
        }
        return null;
        
    }

}
