package com.library.Ejercicio3;

import com.library.Ejercicio3.model.ArrayOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationTest {

    @Test
    public void testGetElementAtIndex_ThrowsArrayIndexOutOfBoundsException(){
        ArrayOperations arrayOperations = new ArrayOperations();
        int [] array = {1, 2, 3, 4, 5};

        try {
            arrayOperations.getElementAtIndex(array, 10);
            fail("Se esperaba una ArrayIndexOutOfBoundsException, pero no se lanzó");
        }catch(ArrayIndexOutOfBoundsException e){
            assertEquals("Índice fuera de los límites del array", e.getMessage());
        }
        try {
            int value = arrayOperations.getElementAtIndex(array, 2);
            assertEquals(3, value);
        } catch (ArrayIndexOutOfBoundsException e) {
            fail("No se esperaba una ArrayIndexOutOfBoundsException, pero se lanzó ");
        }
    }

}
