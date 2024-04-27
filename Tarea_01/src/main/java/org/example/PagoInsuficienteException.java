package org.example;

public class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(){
        super("[MONEDA INSUFICIENTE PARA REALIZAR PAGO]");
    }
}
