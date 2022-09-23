# Práctica 1.1 Introducción a la POO
## Parte 1
Crea una clase llamada *Asalariado* con los siguientes **atributos privados**:
 - DNI
 - Nombre    
 - Sueldo base
 - Horas extra realizadas 
 - IRPF (%)

Los objetos *Asalariado* se podrán crear con un constructor por defecto o con un constructor con un solo parámetro correspondiente al DNI.

Además de los métodos *getter/setter* la clase Asalariado tendrá estos métodos:
- Un método para calcular el importe correspondiente a las horas extra realizadas del mes.
- Un método para calcular el importe del sueldo bruto (sueldo base + complemento por horas extras) del mes.
- Un método para calcular la retención al aplicar el IRPF. El porcentaje de IRPF se aplicará sobre el sueldo bruto.

A continuación crea un solo trabajador, guardando sus datos y mostrando la información anterior por pantalla, así como el sueldo bruto y el resultante de aplicar el IRPF del mes.

## Parte 2
Sincroniza el contenido de tu proyecto en Netbeans con el de la tarea de Github Classroom. Haz los ajustes necesarios en Netbeans (también puedes utilizar otras herramientas como la línea de comandos de git o github desktop).

## Parte 3 (mejora)
Mejora el proyecto anterior para que en la clase principal ahora se creen 5 empleados requiriendo al usuario dicha información por pantalla.
- A continuación, ordenar los resultados mostrando los empleados ordenados por salario de menor a mayor.
