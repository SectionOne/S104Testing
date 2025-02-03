package com.library.Ejercicio3.model;

public class ArrayOperations {

    public int getElementAtIndex(int[] array, int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= array.length){
            throw new ArrayIndexOutOfBoundsException("Índice fuera de los límites del array");
        }
        return array[index];
    }
}
