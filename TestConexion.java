package com.mycompany.java.pila.ejecuccion;

public class TestConexion {
    public static void main(String[] args) throws Exception {
        try (Conexion con = new Conexion()) {
            con.leerDatos();
        } catch (IllegalStateException ex)  {
            System.out.println("Ejecutando catch");
            ex.printStackTrace();
        }

        /*Conexion con = null;
        try {
            con = new Conexion();
            con.leerDatos();

        } catch (IllegalAccessError ex){

            ex.printStackTrace();
        } finally {
            System.out.println("Ejecutando finally");
            if (con != null) {
                con.cerrar();
            }
        }*/


    }
}
