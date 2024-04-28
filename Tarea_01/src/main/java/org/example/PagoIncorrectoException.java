package org.example;

public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(){
        super("[NO SE A INSERTADO MONEDA]");
    }
}
