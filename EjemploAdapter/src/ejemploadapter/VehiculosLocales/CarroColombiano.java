/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploadapter.VehiculosLocales;

/**
 *
 * @author carandy
 */
public class CarroColombiano implements vehiculoAbs {

    @Override
    public String PilotoAutomatico() {
        return "El piloto automatico esta encendido, ahora el carro esta conduciendo por ti";
    }     
}
