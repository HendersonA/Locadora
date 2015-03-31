/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public abstract class Locadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FitaLancamento fl = new FitaLancamento();
        FitaInfantil fi = new FitaInfantil();
        Scanner sc = new Scanner(System.in);
        
        double valor, taxa;
        
        valor = sc.nextDouble();
        fl.setValor(valor);
        fi.setValor(valor);
        
        fl.alugue(); 
        fi.alugue(); 
    }
    
}
