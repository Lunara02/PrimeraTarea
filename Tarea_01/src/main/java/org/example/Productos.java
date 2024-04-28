package org.example;

public enum Productos {
    COCACOLA(900),
    SPRITE(800),
    FANTA(600),
    SNICKERS(1000),
    SUPER8(300);
    private int precio;
    private Productos(int precio){
        this.precio = precio;
    }
}
