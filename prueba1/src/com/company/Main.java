package com.company;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        long numero, aux, digito, decimal;
        int exponente;
        boolean esBinario;
        String a ="100";

        Scanner teclado = new Scanner(System.in);

        System.out.print(escribirBinario(a));
        System.out.print("*******************************************\n" +
                "*          MENÚ          *\n"+"* [b] Mostrar representación binaria (de 8 bits) *\n"+
                "* [d] Mostrar representación decimal (base 10) *\n"+"*      [s]  Salir        *\n"+"*******************************************\n");
        String opcion = teclado.nextLine();
        switch(opcion){
            case b:



            case d:


            case s:


        }




    }



    public static int escribirBinario(String digitoBinario){

        int decimal =  Integer.parseInt(digitoBinario,2);
        return decimal;
    }

    public static int leerNumero( ) {//permite capturar el número ingresado por usuario
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        return num;
    }



    public static boolean validarNumero(int numero ) {

        if(256<numero || numero<-1){
            System.out.println("Error!");
            return false;
        }else{return true;
        }



    } // valida que el número entero ingresado esté en el rango permitido

    public static boolean validarBinario8Bits(int numero ) {
        long , aux, digito, decimal;
        int exponente;
        boolean esBinario;
        esBinario = true;
        aux = numero;
        while (aux != 0) {
            digito = aux % 10; //última cifra del números
            if (digito != 0 && digito != 1) {
                esBinario = false; //
            }
            aux = aux / 10; //quitamos la última cifra para repetir el proceso
        }
    } while (!esBinario);
      return numero
}//se vuelve a pedir si no es binario  valida que el número entero ingresado esté en el rango permitido

    public static int convertirEntero(String binario ) {


        return Long.parseLong(binario, 2);


    } // convierte el binario ingresado a su representación de número entero (base 10)

    public static int [] convetirBinario8Bits(int num) {...} // convierte el entero (base 10) ingresado a su representación binaria de 8 bits

    public static public static void imprimirNumBinario8Bits(int [] numBin) {} // imprime un mensaje como String, en el cual se muestra el número en su representación binaria

    public static void imprimirNumDecimal(int numero) {} // imprime un mensaje como String, en el cual se muestra el número en su representación decimal

}
