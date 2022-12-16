/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String mensaje = "";
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", 
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        for(int i = 0 ; i < promediosCualitativos.length; i++){
            if(promedios[i] >= 0 && promedios[i] <=5.9) {
            mensaje = String.format("%s %s Promedio: %s promedio Regular \n",
                    mensaje,estudiantes[i],promedios[i]);
        }else{
            if(promedios[i] >= 6 && promedios[i] <=8.9) {
            mensaje = String.format("%s %s Promedio: %s promedio Bueno \n",mensaje,
                    estudiantes[i],promedios[i]);
            }else{
            if(promedios[i] >= 9 && promedios[i] <=10) {
            mensaje = String.format("%s%s Promedio: %s promedio Sobresaliente \n",
                    mensaje,estudiantes[i],promedios[i]);
            }
        }
    }

}
        System.out.println(mensaje);
    }
}
