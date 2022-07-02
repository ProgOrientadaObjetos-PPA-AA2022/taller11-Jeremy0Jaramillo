/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public abstract class Menu {
    protected String nombrePlato;
    protected double valorInicialMenu;
    
    public Menu(String n, double m){
        nombrePlato = n;
        valorInicialMenu = m;
    }
    
    public void establecerNombrePlato (String n){
        nombrePlato = n;
    }
    
    public void establecerValorInicialMenu(double x){
        valorInicialMenu = x;
    }
    
    public abstract void establecerValorMenu();
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    
    public double obtenerValorInicialMenu(){
        return valorInicialMenu;
    }
    
}
