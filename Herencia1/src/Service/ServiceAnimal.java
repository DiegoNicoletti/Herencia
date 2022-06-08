/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Objetos.Animal;
import Objetos.Caballo;
import Objetos.Gato;
import Objetos.Perro;

/**
 *
 * @author SHIRO
 */
public class ServiceAnimal {
    
    public void CrearPerro(){
        Animal perro = new Perro("Mancha", "Pienzo", 11, "Callejero");
        System.out.println("El perro se alimenta de: "+ perro.getAlimento());
    }
    
    public void CrearGato(){
        Animal gato = new Gato("Luz", "Piedritas", 24, "Raza negra");
        System.out.println("El Gato se alimenta de: "+ gato.getAlimento());
    }
    
    public void CrearCaballo(){
        Animal caballo = new Caballo("Horse Antonio", "Pastito", 70, "Marroncito");
        System.out.println("El caballo de alimenta de: "+ caballo.getAlimento());
    }
    
}
