/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author javier.traseira
 */
public class javaapplication2 {
    
    static Asalariado trabajador;
    static final String moneda = "€";
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        agregar_trabajador();
        mostrar_trabajador();
    }

    private static void agregar_trabajador() {
        trabajador = new Asalariado("71212323", "Luis Alberto", 2700, 2, 21);
    }

    private static void mostrar_trabajador() {
        System.out.println (trabajador);
    }
    
}
