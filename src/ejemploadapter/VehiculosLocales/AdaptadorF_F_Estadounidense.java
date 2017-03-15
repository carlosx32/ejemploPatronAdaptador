/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploadapter.VehiculosLocales;

import VehiculosEstadoUnidenses.FordFiesta;

/**
 *
 * @author carandy
 */
public class AdaptadorF_F_Estadounidense implements vehiculoAbs{
    VehiculosEstadoUnidenses.FordFiesta carroAdaptador;    

    public AdaptadorF_F_Estadounidense() {
        this.carroAdaptador = new FordFiesta();
    }    
    @Override
    public String PilotoAutomatico() {
       return carroAdaptador.autoPilot();
    }
}
