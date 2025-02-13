package com.library.Ejercicio3;

import com.library.Ejercicio3.model.ArrayOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationTest {

    @Test
    public void testGetElementAtIndex_ThrowsArrayIndexOutOfBoundsException() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] array = {1, 2, 3, 4, 5};

        ArrayIndexOutOfBoundsException exception = assertThrows(ArrayIndexOutOfBoundsException
                .class, () -> {
            arrayOperations.getElementAtIndex(array, 10);
        });

        System.out.println("Mensaje de la 'exception': " +  exception.getMessage());

        assertEquals("Índice fuera de los límites del array", exception.getMessage());

        assertDoesNotThrow(() -> {
            int value = arrayOperations.getElementAtIndex(array, 2);
            assertEquals(3, value);
        });
    }
}
