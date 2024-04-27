package org.example;

public class Expendedora {
    private Deposito<Bebida> coca = new Deposito<>(), sprite = new Deposito<>(), fanta = new Deposito<>();
    private Deposito<Dulces> snicker = new Deposito<>(), super8 = new Deposito<>();
    private Deposito<Moneda> monVu = new Deposito<>();
    public Expendedora(int numProductos) {
        for (int i = 0; i < numProductos; i++) {
            coca.addProducto(new CocaCola(i + 100));
            sprite.addProducto(new Sprite(i + 200));
            fanta.addProducto(new Fanta(i + 300));
            snicker.addProducto(new Snickers(i + 400));
            super8.addProducto(new Super8(i + 500));
        }
    }
    public Producto ComprarProducto(){
    }
    public Moneda getVuelto(){
    }
    public int getmonVuSize(){
    }
}
