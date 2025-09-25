# Práctica 2.1 Introducción a la POO, ramas y debugger

El objetivo de esta práctica es repasar los fundamentos de la Programación Orientada a Objetos (POO) en Java, practicar la creación de ramas en Github y el uso del debugger de Apache Netbeans.

Crea dentro de la carpeta **SOL** del repositorio local de Github clonado un nuevo proyecto en Apache Netbeans llamado *practica2-1* que tenga las siguientes características:

## Parte 1  
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

Una vez creada la clase *Asalariado*, en la **clase principal** asignar en el método *main* un solo trabajador, guardando sus datos y mostrando la información anterior por pantalla, así como el sueldo bruto y el resultante de aplicar el IRPF del mes.

## Parte 2 
Antes de empezar esta parte, crea una nueva **rama** o **branch** nuevo en GitHub llamada **parte-2**.

Revisa si has seguido las siguientes **buenas prácticas** en el desarrollo anterior y si no es el caso impleméntalas:

- **Constantes**: Define el precio de la hora extra como una constante (static final) para reforzar buenas prácticas.
- **Sobrecarga** de constructores: Además del constructor con DNI, podrías añadir otro con todos los parámetros para practicar la sobrecarga.
- *toString()*: Implementar un toString() para mostrar fácilmente la información del trabajador sin tener que concatenar cadenas en main.
- **Validaciones**: Añadir pequeñas validaciones (ej. sueldo base no negativo, horas extra ≥ 0) para practicar condicionales dentro de setters.

Mejora el código del proyecto anterior para que en la clase principal ahora se creen 3 empleados requiriendo al usuario dicha información por pantalla (opcional):

- Mostrar la información de los empleados recopilada así como su sueldo bruto y sueldo neto.
- A continuación, muestra los empleados ordenados por *salario neto* de menor a mayor.

Si has cumplido con todo lo anterior prueba hacer un *merge* con *main* después de verificar que todo funcione bien.

## Parte 3 
Haz un **debugeo** pormenorizado del contenido para ver como va cambiando el valor de los atributos del objeto creado de la clase *trabajador*:

1. Crea un **breakpoint** e inicia el debugger.
2. Asegúrate que el debugger entra dentro del método en la llamada al debugger.
- Visualiza el valor de las distintas **variables** en la llamada.
- Una vez dentro de un método usa el botón adecuado para volver a la instrucción que lo llamó.
3. Asegúrate de que una de las clases se le ha introducido valores y luego utiliza el debugger para recuperarlos con una clase getNombre();
4. Haz un análisis de los valores de la llamada a otro método usando el botón apropiado.
- Prueba a cambiar en tiempo real los valores de una llamada a un método.
5. Crea otro brekpoint más adelante dentro del código y salta directamente a este.
6. Crea un **breakpoint condicional** que solo se active si, por ejemplo, las horas extra son mayores de 5.



