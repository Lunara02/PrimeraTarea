package org.example;

abstract class Moneda implements Comparable<Moneda> {
    public Moneda(){
    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor();
    @Override
    public int compareTo(Moneda other) {
        return this.getValor() - other.getValor();
    }
}
