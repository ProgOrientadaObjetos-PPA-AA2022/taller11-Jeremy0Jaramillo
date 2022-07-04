/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;
import paquete02.Menu;
/**
 *
 * @author SALA I
 */
public class MenuEconomico extends Menu{
    double pDescuento;

    public MenuEconomico(String np,  double vim, double pd) {
        super(np, vim);
        pDescuento = pd;
    }
    
    
    public void establecerPorcentajeDescuento(double n) {
        pDescuento = n;
    }

    public double obtenerPorcentajeDescuento() {
        return pDescuento;
    }
    
    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu - (pDescuento * valorInicialMenu)/100;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Económico\n%s", super.toString());
        cadena = String.format("%s"
                + "Porcentaje Descuento: %.2f\n"
                + "Valor del Menu:%.2f\n", cadena,
                obtenerPorcentajeDescuento(),
                obtenerValorMenu());
        return cadena;
    }
}
