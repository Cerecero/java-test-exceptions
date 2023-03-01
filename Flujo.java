/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.pila.ejecuccion;

/**
 *
 * @author alejandro
 */
public class Flujo {

        public static void main(String[] args) {
            System.out.println("Inicio del main");
            metodo1();
            System.out.println("Fin del main");
        }

        private static void metodo1() {
            System.out.println("Inicio del metodo1");
            metodo2();
            System.out.println("Fin del metodo1");
        }

        private static void metodo2() {
            System.out.println("Inicio del metodo2");
            for(int i = 1; i <= 5; i++) {
                System.out.println(i);

                try {//Intenta esto
                    int num = 0;
                    int resultado = i/num;
                    System.out.println(resultado);

                } catch (ArithmeticException exception) { //Atrapa el error
                    System.out.println(exception.getMessage());
                    exception.printStackTrace();

                }

            }
            System.out.println("Fin del metodo2");
        }

}