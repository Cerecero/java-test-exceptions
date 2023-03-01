package com.mycompany.java.pila.ejecuccion;

public class TestConexion {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        try {
            con.leerDatos();
            con.cerrar();
        } catch (IllegalAccessError ex){
            System.out.println("Recibiendo exception");
            ex.printStackTrace();
        } finally {
            con.cerrar();
        }


    }
}
