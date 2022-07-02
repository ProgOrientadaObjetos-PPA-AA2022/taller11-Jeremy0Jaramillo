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
    
    protected Propietario arrendatario;
    protected double arriendoMensual;
    protected double cuotaBase;
    
    public Arriendo(Propietario n, double cuotaB){
        arrendatario = n;
        cuotaBase = cuotaB;
    }
    
    public void establecerArrendatario (Propietario n){
        arrendatario = n;
    }
    
    public void establecerCuotaBase(double x){
        cuotaBase = x;
    }
    
    public abstract void establecerArriendoMensual();
    
    public Propietario obtenerArrendatario(){
        return arrendatario;
    }
    
    
    public double obtenerCuotaBase(){
        return cuotaBase;
    }
    
    public double obtenerArriendoMensual(){
        return arriendoMensual;
    }
    
    public Propietario obtenerPropietario(){
        return arrendatario;
    }
}
