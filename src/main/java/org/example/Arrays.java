package org.example;

public class Arrays {
    public <T> boolean compareArrays(T[] arrOne, T[] arrTwo){
        boolean checkLength = arrOne.length == arrTwo.length;
        boolean checkClassName = arrOne.getClass().getName().equals(arrTwo.getClass().getName());
        return checkLength && checkClassName;
    }

}
