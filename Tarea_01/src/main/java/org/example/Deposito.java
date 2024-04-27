package org.example;
import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<T> arr;
    public Deposito(){
        arr = new ArrayList<>();
    }
    public void addProducto(T producto){
        arr.add(producto);
    }
    public T getProducto(){
    }
    public int getSize(){
    }
}
