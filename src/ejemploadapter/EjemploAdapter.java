/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploadapter;

import ejemploadapter.VehiculosLocales.AdaptadorF_F_Estadounidense;
import ejemploadapter.VehiculosLocales.CarroColombiano;
import ejemploadapter.VehiculosLocales.vehiculoAbs;
import ejemploadapter.VehiculosLocales.bicicletaColombiana;

/**
 *
 * @author carandy
 */
public class EjemploAdapter {
    public static void main(String[] args) {
        //Ejemplo de partron de diseño adapter, este programa se trata sobre el auto pilot de un vehiculo
        //creamos un vehiculo de tipo vehiculoAbs;
        vehiculoAbs miCoche;
        System.out.println("Suponemos que encendemos el auto pilot de una bicicleta,de la cual tenemes el codigo fuente");
        miCoche = new bicicletaColombiana();
        System.out.println(miCoche.PilotoAutomatico());
        
        System.out.println("\nSuponemos que encendemos el auto pilot de un Carro colombiano,de la cual tenemes el codigo fuente");
        miCoche = new CarroColombiano();
        System.out.println(miCoche.PilotoAutomatico());
        
        System.out.println("\nSuponemos que encendemos el auto pilot de un Ford Fiesta,de la cual NO tenemes el codigo fuente, por lo tanto lo hacemos mediante el adaptador");
        miCoche = new AdaptadorF_F_Estadounidense();
        System.out.println(miCoche.PilotoAutomatico());    
        //asdas
    }
}
