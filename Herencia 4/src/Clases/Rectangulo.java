/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.calcularFormas;

/**
 *
 * @author SHIRO
 */
public final class Rectangulo implements calcularFormas{
    
    private Integer base;
    private Integer altura;

    public Rectangulo() {
    }

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        
        double area;
        
        area = base * altura;
        
        System.out.println("AREA RECTANGULO: "+area);
        
        return area;
        
    }

    @Override
    public Double calcularPerimetro() {
        
        double perimetro = (base + altura)*2;
        
        System.out.println("PERIMETRO RECTANGULO: "+perimetro);
        
        return perimetro;
        
    }
    
    
}
