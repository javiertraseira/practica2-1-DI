# Práctica 2.1 Introducción a la POO

Crea dentro de la carpeta **SOL** del repositorio local de Github clonado un nuevo proyecto en Apache Netbeans llamado *practica2.1* que tenga las siguientes características:

## Parte 1 (versión 1.0)
Crea una clase llamada *Asalariado* con los siguientes **atributos privados**:
 - DNI
 - Nombre    
 - Sueldo base
 - Horas extra realizadas 
 - IRPF (%)

Los objetos *Asalariado* se podrán crear con un constructor por defecto o con un constructor con un solo parámetro correspondiente al DNI.

Además de los métodos *getter/setter* correspondientes, la clase *Asalariado* tendrá al menos los siguientes métodos:
- Un método para calcular el importe correspondiente a las **horas extra** realizadas del mes.
- Un método para calcular el importe del **"sueldo bruto"** del mes; se calcula haciendo *sueldo base + complemento por horas extras*.
- Un método para calcular la retención al **aplicar el IRPF**. El porcentaje de IRPF se aplicará sobre el sueldo bruto.
- Un método para calcular el importe del **"sueldo neto"** del mes. Se calcula haciendo *sueldo bruto - retención IRPF*.

Una vez creada la clase Asalariado, crea en una **clase principal** un método *main* y asígnale un solo trabajador, guardando sus datos y mostrando la información anterior por pantalla, así como el sueldo bruto y el resultante de aplicar el IRPF del mes.

## Parte 2
Haz un **debugeo** pormenorizado del contenido para ver como va cambiando el valor de los atributos del objeto creado de la clase trabajador:
- Crea un **breakpoint** e inicia el debugger.
- Asegúrate que el debugger entra dentro del método en la llamada al debugger.
- Visualiza el valor de las distintas variables en la llamada.
- Una vez dentro de un método usa el botón adecuado para volver a la instrucción que lo llamó.
- Haz un análisis de los valores de la llamada a otro método usando el botón apropiado.
- Prueba a cambiar en tiempo real los valores de una llamada a un método.
- Crea otro brekpoint más adelante dentro del código y salta directamente a este.


## Parte 3 (opcional)  (versión 1.1)
Mejora el proyecto anterior para que en la clase principal ahora se creen 3 empleados requiriendo al usuario dicha información por pantalla:
- Mostrar la información de los empleados recopilada así como su sueldo bruto y sueldo neto.
- A continuación, muestra los empleados ordenados por *salario neto* de menor a mayor.
