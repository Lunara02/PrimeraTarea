package org.example;

public class NoHayProductoException extends Exception{
    public NoHayProductoException(){
        super("[NO HAY PRODUCTOS]");
    }
}
