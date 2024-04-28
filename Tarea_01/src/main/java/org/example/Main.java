package org.example;

public class Main {
    /**
     * Simulacion casos comprador y expendedora
     * @throws Exception En caso de excepciones
     * @author Sebastian Ignacio Vega Varela
     */
    public static void main(String[] args) throws Exception {
        Expendedora exp = new Expendedora(1); // Se crea la expendedora
        Moneda1000 m = new Moneda1000();      // Se crea una moneda de 1000
        Moneda100 mon = new Moneda100();      // Se crea una moneda de 100
        System.out.println("------------[PERSONA C]------------\nTiene una Moneda de 1000 y quiere comprar un snicker(1000$)\n"); //Simulacion caso No hay Excepciones
        try {
            Comprador c = new Comprador(m, Productos.SNICKERS, exp);
            System.out.println("Comio = " + c.queProducto());
            System.out.println("Vuelto = " + c.cuantoVuelto());
        } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
            System.out.println(e.getMessage() + "\n");
        }
        System.out.println("------------[PERSONA E]------------\nTiene una Moneda de 1000, pero ya no quedan snickers\n"); //Simulacion caso no hay producto
        try {
            Comprador e = new Comprador(m, Productos.SNICKERS, exp);
            System.out.println("Comio = " + e.queProducto());
            System.out.println("Vuelto = " + e.cuantoVuelto() + "\n");
        } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
            System.out.println(e.getMessage() + "\n");
        }
        System.out.println("------------[PERSONA T]------------\nTiene una moneda de 100 y quiere comprar una CocaCola(900$)\n"); //Simulacion caso no alcanza el dinero
        try {
            Comprador t = new Comprador(mon, Productos.COCACOLA, exp);
            System.out.println("Comio = " + t.queProducto());
            System.out.println("Vuelto = " + t.cuantoVuelto() + "\n");
        } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
            System.out.println(e.getMessage() + "\n");
        }
        System.out.println("------------[PERSONA S]------------\nNo tiene monedas pero intenta seleccionar Super8 para probar suerte\n"); //Simulca
        try {
            Comprador s = new Comprador(null, Productos.SUPER8, exp);
            System.out.println("Comio = " + s.queProducto());
            System.out.println("Vuelto = " + s.cuantoVuelto() + "\n");
        } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e) {
            System.out.println(e.getMessage() + "\n");
        }
    }
}