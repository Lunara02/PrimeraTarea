package org.example;

public class Comprador {
    private String sonido=null;
    private int vuelto = 0
    public Comprador(Moneda m, Productos cualpro, Expendedora exp) throws Exception{
        Producto aux = exp.ComprarProducto(m, cualpro);
        if (aux != null) {
            sonido = aux.sabor();
        }
        int canVuelt = exp.getmonVuSize();
        for(int x = 0; x < canVuelt; x++){
            vuelto += (exp.getVuelto()).getValor();
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queProducto(){
        return sonido;
    }
}
