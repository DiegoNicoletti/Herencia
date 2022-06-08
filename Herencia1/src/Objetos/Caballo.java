/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author SHIRO
 */
public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Caballo() {
    }
    
    public void CaballoAlimentacion(){
        System.out.println("El Caballo se alimenta de: "+ alimento);
    }
}
