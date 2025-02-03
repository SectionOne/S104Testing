package com.library.Ejercicio1.controller;

import com.library.Ejercicio1.model.Book;
import com.library.Ejercicio1.model.Library;

public class LibraryManager {
    public static void  run(){
        Library library = new Library();

        library.addBook(new Book("El médico"));
        library.addBook(new Book("La gangrena"));
        library.addBook(new Book("La catedral del mar"));

        System.out.println("Libros en la biblioteca: "+ library.getBooks());

        System.out.println("Libro en la posición 1: "+ library.getBookAt(0));

        System.out.println("Añadimos El Quijote de la Mancha en la posición 1(que es el index 0)");
        library.addBookAt(0, new Book("Don Quijote de la Mancha"));
        System.out.println("Libro en la posición 1: "+ library.getBookAt(0));

        System.out.println("Eliminamos La catedral del mar");
        library.removeBookTitle("La catedral del mar");
        System.out.println("Nueva lista de libros en biblioteca: " + library.getBooks());

    }
}
