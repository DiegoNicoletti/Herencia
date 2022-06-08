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
public class Gato extends Animal{

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public Gato() {
    }
    
    public void GatoAlimentacion(){
        System.out.println("El Gato se alimenta de: "+ alimento);
    }
    
}
