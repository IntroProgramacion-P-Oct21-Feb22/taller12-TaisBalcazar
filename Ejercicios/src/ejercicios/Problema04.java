/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author TaisBalcazar
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];

        for (int i = 0; i < bases.length; i++) {
            resultado[i] = obtenerPotencia(bases[i], potencias[i]);
        }
        System.out.printf("%s\n", obtenerSuma(resultado, resultado.length));

    }

    public static double obtenerPotencia(double base, double potencia) {
        if (potencia == 1) {
            return base;
        } else {
            return base * obtenerPotencia(base, potencia - 1);
        }
    }

    public static double obtenerSuma(double[] arreglo, int longitud) {
        if (longitud == 1) {
            return arreglo[0];
        } else {
            return arreglo[longitud - 1] + obtenerSuma(arreglo, longitud - 1);
        }

    }
}
