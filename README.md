# Proyecto de Prácticas – POO y Git/GitHub

Este repositorio contiene las evidencias de prácticas desarrolladas en el curso, combinando **Programación Orientada a Objetos en Java** y el uso de **Git/GitHub** para el control de versiones.

---

## Parte 1: Guía de primeros pasos con Git/GitHub

### Configuración inicial
```bash
git config --global user.name "Shamir_Chavez"
git config --global user.email "shaje.gg@gmail.com"

Crear repositorio local

mkdir PracticaCampo1
cd PracticaCampo1
git init

Clonar repositorio de GitHub
git clone https://github.com/Shajedev/PracticaCampo1.git

Comandos básicos

Agregar cambios:

git add archivo.java


Crear commit:

git commit -m "mensaje descriptivo"


Subir cambios:

git push origin main

Manejo de ramas
git branch nueva-rama
git checkout nueva-rama
git merge main

Visualizar historial
git log

- Parte 2: Casos de POO en Java

Los casos iniciales se organizaron en la carpeta POO-Git-Casos/:

Caso 1 – UsuarioSimple

Lectura de datos simples con Scanner.

Caso 2 – EstudianteInteractivo

Clase con atributos privados, constructor y métodos get/set.

Caso 3 – CuentaBancariaApp

Operaciones de depositar y retirar con validación de saldo.

Parte 3: PC3 – Sobrecarga, Manejo de Errores y Colecciones

Ubicados en la carpeta:

src/PC3_Sobrecarga_ManejoErrores_Colecciones/


Contiene los siguientes programas:

Pregunta 1 – Calculadora con Sobrecarga

Clase Calculadora con métodos sumar(int,int), sumar(int,int,int), sumar(double,double).

Demostración en main.

Pregunta 2 – División con Manejo de Errores

Solicita dividendo y divisor por teclado.

Controla ArithmeticException en caso de división entre cero.

Pregunta 3 – ArrayList de Estudiantes

Uso de ArrayList para registrar nombres de estudiantes.

Lectura por teclado y visualización en consola.

Pregunta 4 – Inventario con HashMap

Gestión de productos y cantidades con HashMap.

Permite registrar y mostrar inventario.

Pregunta 5 – Manejo de Excepciones Generales

Uso de try-catch-finally.

Conversión de cadena a entero con control de NumberFormatException.

Evidencia de Práctica de Campo

Repositorio compartido en GitHub.

Casos de POO desarrollados y ejecutados en Eclipse.

Práctica PC3 implementada con 5 ejercicios en Java.

Control de versiones con commits explicativos y estructura organizada.

Autor: Grupo 8
