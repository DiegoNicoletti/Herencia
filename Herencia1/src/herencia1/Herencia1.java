/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

import Service.ServiceAnimal;

/**
 *
 * @author SHIRO
 */
public class Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServiceAnimal sa = new ServiceAnimal();
        
        sa.CrearPerro();
        sa.CrearGato();
        sa.CrearCaballo();
    }
}
