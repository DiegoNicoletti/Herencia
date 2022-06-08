/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.calcularFormas;
import static java.lang.Math.pow;

/**
 *
 * @author SHIRO
 */
public final class Circulo implements calcularFormas{
    
    private Integer radio;

    public Circulo() {
    }

    public Circulo(Integer radio) {
        this.radio = radio;
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    public static Double getPI() {
        return PI;
    }

    @Override
    public Double calcularArea() {
        
        double area = PI*(pow(radio,2));
        
        System.out.println("AREA CIRCULO: "+area);
        
        return area;
        
    }

    @Override
    public Double calcularPerimetro() {
        
        double perimetro = PI*(radio*2);
        
        System.out.println("PERIMETRO CIRCULO: "+perimetro);
        
        return perimetro;
        
    }
    
    
    
}
