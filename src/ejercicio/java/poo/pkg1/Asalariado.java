/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.java.poo.pkg1;

/**
 *
 * @author Javi
 */
public class Asalariado {
    
    private String dni;
    private String nombre;
    private String cargo;    
    private double sueldoBase;
    private int horasExtras;
    private double IRPF;
    private static double pagoPorHoraExtra; //atributo de clase
   
    //Constructor por defecto
    public Asalariado() {
    }

    //Constructor con un parámetro
    public Asalariado(String dni) {
        this.dni = dni;
    }

    
    //Métodos get/set
    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getDni() {
        return dni;
    }

    public void setNif(String nif) {
        this.dni = nif;
    }
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getIRPF() {
        return IRPF;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setIRPF(double tipoIRPF) {
        this.IRPF = tipoIRPF;
    }

    //métodos get/set para el atributo static
    public static double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        Asalariado.pagoPorHoraExtra = pagoPorHoraExtra;
    }
   
   
    //calcular el importe de las horas extra
    public double calcularImporteHorasExtras(){
        return horasExtras * pagoPorHoraExtra;
    }
   
    //calcular el sueldo bruto
    public double calcularSueldoBruto(){
        return sueldoBase + calcularImporteHorasExtras();
    }
   
    //calcular el importe de las retencion por IRPF
    public double calcularRetencionIrpf(){
        double tipo = IRPF;
        return calcularSueldoBruto() * tipo / 100;
    }
   
    //calcular el importe liquido a cobrar
    public double calcularSueldoNeto(){
        return calcularSueldoBruto() - calcularRetencionIrpf();
    }

    
}
