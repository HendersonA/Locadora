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
public class FitaLancamento {
    
    protected double valor;
  
    public double getValor(){
        return this.valor;
    }
    public double setValor(double valor){
        this.valor = valor;
        return valor;
    }
    
    public void alugue(){
        double taxa=0.20f;
        this.valor = this.valor*taxa;
        System.out.printf("%.2f\n", this.valor);
    }
}
