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
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];

        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                resultado[fila][col] = obtenerFactorial(datos[fila][col]);

                System.out.println(resultado[fila][col]);
            }
        }
    }

    public static double obtenerFactorial(double valor) {
        if (valor <= 1) {
            return 1;
        } else {
            return valor * obtenerFactorial(valor - 1);
        }
    }

}
