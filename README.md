# Práctica 2.1 Repaso de POO, GitHub, debugging y documentación

El objetivo de esta práctica es repasar conceptos fundamentales de **Programación Orientada a Objetos (POO) en Java**, trabajar con **ramas e Issues en GitHub**, utilizar el **debugger de Apache NetBeans** para localizar errores y documentar un pequeño proyecto.

Crea dentro de la carpeta **SOL** de tu repositorio local un nuevo proyecto de Apache NetBeans llamado `practica2-1`.

## Parte 1. Modelado con POO

Crea una clase llamada `Asalariado` con los siguientes **atributos privados**:

- DNI
- Nombre
- Sueldo base
- Horas extra realizadas
- IRPF (%)

Los objetos `Asalariado` se podrán crear mediante:

- un constructor por defecto;
- un constructor que reciba únicamente el DNI.

Añade los métodos *getter* y *setter* necesarios.

La clase deberá incluir también métodos que permitan:

- calcular el importe correspondiente a las **horas extra** realizadas;
- calcular el **sueldo bruto**: sueldo base + importe de horas extra;
- calcular la **retención de IRPF** aplicada sobre el sueldo bruto;
- calcular el **sueldo neto**: sueldo bruto - retención de IRPF.

Para realizar los cálculos considera inicialmente que cada hora extra tiene un valor de **20 €**.

En la clase principal:

1. Crea un trabajador.
2. Asigna valores a sus atributos.
3. Muestra por pantalla sus datos, sueldo bruto, retención de IRPF y sueldo neto.

Realiza un **commit** cuando esta primera parte funcione correctamente.

---

## Parte 2. Mejora del código e Issues

Antes de modificar el programa, crea en GitHub una nueva rama llamada:

`parte-2`

Ahora crea varios **Issues** para registrar las mejoras que vas a realizar. Como mínimo:

- sustituir el precio de la hora extra por una **constante**;
- añadir un constructor que permita inicializar todos los atributos;
- implementar `toString()`;
- validar que el sueldo base y las horas extra no puedan ser negativos;
- permitir trabajar con varios empleados.

A continuación, modifica el programa para resolverlos.

La aplicación deberá pedir al usuario los datos de **3 empleados** y:

1. mostrar la información de cada empleado;
2. mostrar su sueldo bruto y sueldo neto;
3. ordenar los empleados por **sueldo neto de menor a mayor**.

Realiza commits descriptivos durante el desarrollo. Cuando corresponda, puedes relacionarlos con los Issues utilizando, por ejemplo:

`Closes #3`

Cuando todos los cambios estén comprobados, integra la rama `parte-2` en `main`.

---

## Parte 3. Localización de errores con el debugger

Vamos a utilizar el debugger para observar cómo se ejecuta el programa y cómo cambian sus datos.

Realiza las siguientes pruebas:

1. Coloca un **breakpoint** antes de calcular el sueldo de un empleado e inicia el debugger.
2. Observa los valores de sus atributos.
3. Utiliza **Step Into** para entrar dentro de uno de los métodos de cálculo.
4. Utiliza **Step Over** para ejecutar instrucciones sin entrar en otros métodos.
5. Utiliza **Step Out** para regresar al método que realizó la llamada.
6. Consulta durante la depuración expresiones como:

```java
empleado.getNombre()
empleado.getHorasExtra()
empleado.getSueldoNeto()
```

7. Coloca otro breakpoint más adelante y utiliza **Continue** para continuar directamente hasta él.
8. Crea un **breakpoint condicional** que solo se active cuando las horas extra sean superiores a 5.

### Investiga un error

Modifica temporalmente el cálculo del sueldo neto para introducir este error:

```java
return calcularSueldoBruto() + calcularRetencionIRPF();
```

Crea un Issue indicando que:

> El sueldo neto obtenido es superior al sueldo bruto.

Utiliza el debugger para localizar la causa del problema, corrige el código y cierra el Issue correspondiente mediante un commit.

---

## Parte 4. Documentación

Añade documentación básica al proyecto.

### Documentación del código

Utiliza **Javadoc** para documentar:

- la clase `Asalariado`;
- sus constructores;
- al menos dos métodos de cálculo.

### Documentación online

Crea una carpeta `docs` en el repositorio y dentro un archivo `index.md`.

Incluye como mínimo:

- nombre del proyecto;
- breve descripción;
- características principales;
- instrucciones básicas de uso;
- una imagen;
- un enlace al repositorio.

Realiza un commit y sube los cambios a GitHub.

Después configura **GitHub Pages** desde:

`Settings → Pages`

Selecciona como origen la rama `main` y la carpeta `/docs`.

Comprueba que la página funciona correctamente y añade al `README.md` un enlace denominado **Documentación online**.

---

## Comprobación final (pre-testing)

Antes de dar por terminada la práctica verifica:

- [ ] El proyecto compila y funciona correctamente.
- [ ] Los atributos tienen la visibilidad adecuada.
- [ ] Los nombres de atributos y métodos son descriptivos.
- [ ] Se utilizan constantes cuando corresponde.
- [ ] Los datos incorrectos son validados.
- [ ] Se han utilizado Issues para registrar tareas o errores.
- [ ] Los Issues resueltos están cerrados.
- [ ] Se han utilizado correctamente breakpoints y las principales herramientas del debugger.
- [ ] El código contiene documentación Javadoc.
- [ ] La rama `parte-2` se ha integrado correctamente en `main`.
- [ ] La documentación de GitHub Pages se publica correctamente.