/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entornos4;

/**
 *
 * @author Alejandro
 */
public class Main {

    public static void main(String[] args) {

        NuevoMetodo();

    }

    public static void NuevoMetodo() {
        eCesta cesta;
        
        cesta = new eCesta("Apellidos del alumno", 100, "dni del alumno", 10);
        
        try {

            cesta.comprar(50);

        } catch (Exception e) {

            System.out.println("No se puede pagar  ");

        }

        try {

            System.out.println("Solicitar actualización de bono");

            cesta.ActualizarBono(100);

        } catch (Exception e) {

            System.out.println("Error al recargar");

        }

        double bonoactual = cesta.bonificacion();

        System.out.println("Su bono actual es  " + bonoactual);
    }

}
