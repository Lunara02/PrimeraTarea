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
    public Producto ComprarProducto(Moneda m, Productos cual)throws Exception{
        if(m != null){
            if (m.getValor() >= cual.RetValor()) {
                Deposito<? extends Producto> b = null;
                if (cual.ordinal() == 0) {
                    b = coca;
                }
                if (cual.ordinal() == 1) {
                    b = sprite;
                }
                if (cual.ordinal() == 2) {
                    b = fanta;
                }
                if (cual.ordinal() == 3) {
                    b = snicker;
                }
                if (cual.ordinal() == 4) {
                    b = super8;
                }
                if (b.getSize() != 0) {
                    for (int i = 0; i < (m.getValor() - cual.RetValor()) / 100; i++) {
                        monVu.addProducto(new Moneda100());
                    }
                    return b.getProducto();
                }
                monVu.addProducto(m);
                throw new NoHayProductoException();
            }
            monVu.addProducto(m);
            throw new PagoInsuficienteException();
        }
        throw new PagoIncorrectoException();
    }
    public Moneda getVuelto(){
        return monVu.getProducto();
    }
    public int getmonVuSize(){
    }
}
