/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Cuenta {
    protected String nombreCliente;
    protected double subtotal;
    protected double iva;
    protected ArrayList<Menu> listaCartas;
    
    public Cuenta(String n, ArrayList<Menu> listam, double m){
        nombreCliente = n;
        listaCartas = listam;
        iva = m;
    }
    
    public void establecerListaCartas (ArrayList<Menu> n){
        listaCartas = n;
    }
    
    public void establecerNombreCliente(String x){
        nombreCliente = x;
    }
    
    public void establecerIva(double n){
        iva = n;
    }
        
    public ArrayList<Menu> obtenerListaCartas(){
        return listaCartas;
    }
    
    public String obtenerNombreCliente(){
        return nombreCliente;
    }
    
    public double obtenerIva(){
        return iva;
    }
}
