/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author Asus
 */
public class FitaInfantil extends FitaLancamento{
    
     public void alugue(){
        double taxa=0.40f;
        this.valor = this.valor*taxa;
        System.out.printf("%.2f\n", this.valor);
    }
    
}
