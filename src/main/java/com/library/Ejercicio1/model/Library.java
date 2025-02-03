package com.library.Ejercicio1.model;

import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    //Añadir libros
    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    //Recuperar la lista completa
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    //Obtener el titulo de una posición
    public Book getBookAt(int index) {
        return (index >= 0 && index < books.size() ? books.get(index) : null);
    }

    //Añadir un libro en una posición específica
    public void addBookAt(int index, Book book) {
        if (!books.contains(book) && index >= 0 && index <= books.size()) {
            books.add(index, book);
        }
    }

    //Eliminar un libro por título
    public void removeBookTitle(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }
}
