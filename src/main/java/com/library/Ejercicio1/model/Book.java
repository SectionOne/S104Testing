package com.library.Ejercicio1.model;

public class Book {
    private String title;

    public Book (String title){

        this.title = title;
    }

    public String getTitle(){

        return title;
    }

    @Override
    public String toString() {

        return "Libro: " + title;
    }
}
