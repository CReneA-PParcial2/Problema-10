/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg10;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calculadora de la serie de Fibonancci
        int numero, r;
        numero = solicitarNumero();
        calcularSerie(numero);
    }
    
    /*ESCANEO DEL LIMITE DE NUMEROS QUE EL USUARIO DESEA QUE
    SE DESPLIEGEN EN LA CONSOLA
    */
    public static int solicitarNumero(){
        int numero;
        System.out.println("Ingresa el limite de numeros de la serie de Fibonancci:");
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextInt();
        return numero;
    }
    
    /*CALCULO E IMPRESION DE LA SERIE DE FIBONACCI CON EL LIMITE QUE
    ESTABLECIO EL USUARIO AL INICIO DEL PROGRAMA
    */
    public static void calcularSerie(int numero){
        int x = 1;
        int y = 1;
        System.out.println("*** 0 ***");
        for (int i=1; i<(numero-2); i++){
            System.out.println("*** " + x + " ***");
            x=x+y;
            System.out.println("*** " + y + " ***");
            y=x+y;
        }
    }
}
