/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FazerNoNetbeans;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class App {

    /**
     * @param args the command line arguments
     */
    
     public static void funcao_teste (){
        //Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in);

        //variável local 
        String v2;
        int v1;

        System.out.println("Comando de Saida de Dados");
        
        System.out.printf("Informe uma palavra: ");
        v2 = ler.next();

        System.out.printf("Informe um número: ");
        v1 = ler.nextInt();

        System.out.println(v2+" "+v1);
    }
    public static void main(String[] args) {
        Corpo_Humano c1 = new Corpo_Humano(75, 5, 1.80f);
        System.out.println(c1.getDensidade());
       
        System.out.println(c1.getDensidade());
        
        c1.calcIMC();
    }
    
}
