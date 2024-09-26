/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author javier.traseira
 */
public class Asalariado {
    
    private String dni;
    private String nombre;
    private double sueldoBase;
    private int horasExtra;
    private double IRPF;
    private static double pagoPorHorasExtra = 60.0;

    public Asalariado() {
    }

   
    public Asalariado(String dni, String nombre, double sueldoBase, int horasExtra, double IRPF) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
        this.IRPF = IRPF;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public double getIRPF() {
        return IRPF;
    }

    public static double getPagoPorHorasExtra() {
        return pagoPorHorasExtra;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void setIRPF(double IRPF) {
        this.IRPF = IRPF;
    }

    public static void setPagoPorHorasExtra(double pagoPorHorasExtra) {
        Asalariado.pagoPorHorasExtra = pagoPorHorasExtra;
    }
    
    
    public double calcularImporteHorasExtras() {
        return horasExtra * pagoPorHorasExtra;
    }
    
    public double calcularSueldoBruto() {
        return sueldoBase + calcularImporteHorasExtras();        
    }
    
    public double calcularRetencionIrpf() {
        return calcularSueldoBruto() * IRPF / 100;
    }
    
    public double calcularSueldoNeto() {
        return calcularSueldoBruto() - calcularRetencionIrpf();
    }

    @Override
    public String toString() {
        String infoBasica =  "Asalariado " + "DNI=" + dni + ", Nombre=" + nombre + ", Sueldo base=" + sueldoBase + ", Horas realizadas=" + horasExtra + ", IRPF=" + IRPF ; 
        String infoNomina =  "Sueldo Bruto "+ calcularSueldoBruto() + ", Sueldo Neto=" + calcularSueldoNeto() + "";
        return infoBasica + "\n" + infoNomina; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
