package org.example;

/**
 * Enumeración que representa diferentes productos y sus precios.
 * Se asignan los precios que se van a utilizar (se puede cambiar).
 * @author Sebastian Ignacio Vega Varela
 */
public enum Productos {
    COCACOLA(900),  // Precio de CocaCola
    SPRITE(800),    // Precio de Sprite
    FANTA(600),     // Precio de Fanta
    SNICKERS(1000), // Precio de Snickers
    SUPER8(300);    // Precio de Super8
    private int precio; // Precio del producto
    /**
     * Constructor privado de enum Productos.
     * @param precio El precio del producto.
     */
    private Productos(int precio) {
        this.precio = precio;
    }
    /**
     * Método getter para retornar el precio del producto.
     * @return El precio del producto.
     */
    public int RetValor() {
        return precio;
    }
}
