# Practica 2: Clases, Metodos y Ciclos
# Fecha de entrega: 21 de Marzo del 2025
# Materia: Introducción a Ciencias e la Computación


/* ============================
   DATOS ACADÉMICOS
   ============================ */
- **Institución:** Facultad de Ciencias UNAM
- **Profesores:** Pedro Ulises Cervantes González, Raúl Eduardo Martínez Damaso, Yessica Janeth Pablo Martínez
- **Carreras:** Ciencias de la Computación, Matemáticas
- **Semestre:** 2025-2


/* ============================
   INTEGRANTES DE LA PRACTICA
   ============================ */
| Nombre Completo | Número de Cuenta |
|----------------|--------------------------|
| Edson Jair Morales Hérnandez | 318076546 |
| Josué Omar Flores Yáñez      | 314117148 |


/* ============================
   DESCRIPCIÓN DE LA PRACTICA
   ============================ */
   - Este practica es una aplicación desarrollada en **Java**, cuyo objetivo es simular un reloj, un objeto para medir el paso del tiempo y recrear este proceso.

/* ===========================
   OBJETIVOS DE LA PRACTICA
   =========================== */
   
  - Implementar clases distintas para cada division del tiempo (limitado a horas, minutos y segundos)  
  - Gestionar los métodos de manera estructurada y organizada.
  - Desarrollar un sistema modular que permita la division del tiempo.


/* ==============================
   ESTRUCTURA DE LA PRACTICA
   ============================== */
   - La practica está organizado en la siguiente estructura de directorios y archivos:
   - \Practica_2 'Horas.java' 'Minutos.java' 'Segundos.java' 'Main.java'


/* ============================
   INCONVENIENTES ENCONTRADOS
   ============================ */
   + Durante el desarrollo de la practica se identificaron los siguientes problemas:

- **[Problema 1]**: En la clase main anhidé el metodo 'HoraCompleta()', es decir lo puse dentro de su llaves cuando deberia
- localizazrse fuera del metodo principal.
- **[Problema 2]**: Cuando cerre el scaner con 'scaner.close()' puse la primera letra con mayuscula y me senti aliviadoo cuando descubri
- que el error de compilacion era simplemente debido a una letra mayuscula en vez de minuscula. Me hizo recordar al Proyecto 2 (jaja).
- **[Mejoras Futuras]**: Imaginemos que el programa es utilizazdo por alguien de otro pais epecificamente unn pais con husos horarios
- distintos entonces podriamos utilizar el método 'Scanner(system.in)' para pedirle al usuario ingresar su hora especifica.


/* ==========================
   INSTRUCCIONES PARA EJECUTAR LA PRACTICA
   ========================== */

**REQUISITOS PREVIOS**
+ Para compilar y ejecutar la practica, asegúrate de contar con:
- **Java Development Kit (JDK)** (Versión recomendada: 11 o superior).

**COMPILACIÓN Y EJECUCIÓN**
1. **Abrir una terminal** en la carpeta raíz del proyecto.
2. **Compilar el código fuente** con el comando javac + '"NombresArchivos.java"'
3. **Ejecutar el programa** con el comando java + 'Main'
