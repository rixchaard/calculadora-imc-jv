/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FazerNoNetbeans;

/**
 *
 * @author alunos
 */

public class Calculadora {

public static void main (String [] args){
Operadores op = new Operadores( );
//EXEMPLO DE ADIÇÃO
System.out.println("0 Resultado é: "+ op.adicao(10,5));
//EXEMPLO DE SUBTRAÇÃO
System.out.println("0 Resultado é: "+ op.subtracao(10,5));
//EXEMPLO DE MULTIPLICAÇÃO
System.out.println("0 Resultado é: "+ op.multiplicacao(10,5));
//EXEMPLO DE DIVISÃO
System.out.println("0 Resultado é: "+ op.divisao(10,5));
}
}