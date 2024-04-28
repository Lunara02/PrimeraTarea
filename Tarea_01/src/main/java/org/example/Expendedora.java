package org.example;

/**
 * La clase Expendedora representa una máquina expendedora que vende productos como bebidas o dulces.
 * Esta vende los productos al comprador dependiendo de los parametros otorgados.
 * Crea magicamente Productos que seran puestos en los depositos correspondientes.
 * Finalmente retorna el vuelto y el producto seleccionado.
 * @author Sebastian Vega Ignacio Varela
 */
public class Expendedora {
    private Deposito<Bebida> coca = new Deposito<>(), sprite = new Deposito<>(), fanta = new Deposito<>();
    private Deposito<Dulces> snicker = new Deposito<>(), super8 = new Deposito<>();
    private Deposito<Moneda> monVu = new Deposito<>(); // Depósito para almacenar monedas

    /**
     * Constructor de la clase Expendedora.
     * @param numProductos El número de productos que se agregarán a la expendedora.
     */
    public Expendedora(int numProductos) {
        for (int i = 0; i < numProductos; i++) {
            coca.addProducto(new CocaCola(i + 100));
            sprite.addProducto(new Sprite(i + 200));
            fanta.addProducto(new Fanta(i + 300));
            snicker.addProducto(new Snickers(i + 400));
            super8.addProducto(new Super8(i + 500));
        }
    }

    /**
     * Método para comprar un producto de la expendedora.
     * @param m La moneda utilizada para la compra.
     * @param cual El tipo de producto que se desea comprar.
     * @return El producto comprado.
     * @throws PagoIncorrectoException Si la moneda es nula.
     * @throws PagoInsuficienteException Si el valor de la moneda no es suficiente para comprar el producto.
     * @throws NoHayProductoException Si no hay existencias del producto seleccionado.
     */
    public Producto ComprarProducto(Moneda m, Productos cual) throws Exception {
        if(m != null){
            if (m.getValor() >= cual.RetValor()) {
                Deposito<? extends Producto> b = null;
                switch (cual) {
                    case COCACOLA:
                        b = coca;
                        break;
                    case SPRITE:
                        b = sprite;
                        break;
                    case FANTA:
                        b = fanta;
                        break;
                    case SNICKERS:
                        b = snicker;
                        break;
                    case SUPER8:
                        b = super8;
                        break;
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

    /**
     * Método para obtener el vuelto acumulado en la máquina expendedora.
     * @return La moneda que representa el vuelto.
     */
    public Moneda getVuelto(){
        return monVu.getProducto();
    }

    /**
     * Método para obtener el tamaño del depósito de monedas en la expendedora.
     * @return El tamaño del depósito de monedas.
     */
    public int getmonVuSize(){
        return monVu.getSize();
    }
}