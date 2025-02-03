package com.library.Ejercicio1;

import com.library.Ejercicio1.model.Book;
import com.library.Ejercicio1.model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp(){
        library = new Library();
        library.addBook(new Book("La hermandad de la sábana santa"));
        library.addBook(new Book("La Biblia"));
    }
    @Test
    void testLibraryNotNull(){

        assertNotNull(library.getBooks());
    }

    @Test
    void testAddBook(){
        library.addBook(new Book("La colmena"));
        assertEquals(3 , library.getBooks().size());
    }

    @Test
    void testGetBookAt(){
        assertTrue(library.getBookAt(1).getTitle().equalsIgnoreCase("La biblia"));
    }

    @Test
    void testAddBookAt(){
        library.addBookAt(1, new Book("Moby Dick"));
        assertEquals("Moby Dick", library.getBookAt(1).getTitle());
    }

    @Test
    void testRemoveBookTitle(){
        library.removeBookTitle("La Biblia");
         assertEquals(1, library.getBooks().size());
    }
}
