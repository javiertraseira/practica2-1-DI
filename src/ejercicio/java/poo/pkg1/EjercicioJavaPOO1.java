/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.java.poo.pkg1;

/**
 *
 * @author Javi
 */
public class EjercicioJavaPOO1 {

    static Asalariado trabajador;
    static final String moneda = "€";
    
    public static void main(String[] args) {
                
        agregar_trabajador();
        mostrar_trabajador();
        
    }

    private static void agregar_trabajador() {
        trabajador = new Asalariado();
        
        trabajador.setNombre("Perico Palotes");
        trabajador.setNif("72971197V");
        trabajador.setCargo("programador junior");        
        trabajador.setSueldoBase(2100);
        trabajador.setIRPF(19);
        trabajador.setHorasExtras(2);
        
    }
    
    private static void mostrar_trabajador() {
          
        System.out.println ("Nombre empleado: " + trabajador.getNombre());
        System.out.println ("DNI: " + trabajador.getDni());
        System.out.println ("Cargo: " + trabajador.getCargo());        
        System.out.println ("Sueldo base: " + trabajador.getSueldoBase()+ moneda);
        System.out.println ("IRPF aplicable: " + trabajador.getIRPF());        
        System.out.println ("Horas extras: " + trabajador.getHorasExtras());    
        
        System.out.println ("Sueldo bruto mes: " + trabajador.calcularSueldoBruto() + moneda);     
        System.out.println ("Sueldo neto: " + trabajador.calcularSueldoNeto() + moneda);          
    }
    
}

    

