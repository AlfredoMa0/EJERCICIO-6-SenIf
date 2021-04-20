/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6.senif;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class EJERCICIO6SenIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Cifras;
        Scanner Valor = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO: ");
        Cifras = Valor.nextInt();
        
        
        if (Cifras <10) {
            System.out.println("DISTINTO DE DOS CIFRAS");
        }else if (Cifras < 100) {
            System.out.println("TIENE DOS CIFRAS");
        
        }
    }
    
}
