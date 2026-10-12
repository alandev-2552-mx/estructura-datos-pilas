# AED-1026 Estructura de Datos - Unidad 3
# Práctica: Pilas Estáticas y Dinámicas en Java

# Alumno: Pale Mendoza Alan Cristopher  
# Docente: Víctor Hugo Vásquez Herrera  
# Instituto Tecnológico Superior de Xalapa 
# Ingeniería en Sistemas Computacionales

---

# Descripción

Implementación en Java de dos estructuras lineales tipo Pila (Stack):

Pila Estática: basada en un arreglo de tamaño fijo.
Pila Dinámica: basada en nodos enlazados por referencias.

Ambas respetan el principio LIFO (Last In, First Out): el último en entrar es el primero en salir.

---

# Diferencias entre almacenamiento estático y dinámico

Estático (arreglo): la memoria se reserva de forma contigua al crear la pila. El tamaño es fijo, por lo que se debe controlar el desbordamiento con `isFull()`.

Dinámico (nodos enlazados): la memoria se reserva nodo por nodo conforme se insertan elementos. El tamaño crece según se necesite, limitado solo por la memoria RAM. No requiere `isFull()`.

---

# Estructura del proyecto

```
java_quick/
└── estructuras_lineales/
    ├── Nodo.java
    ├── pilaSimples.java
    ├── pilaDinamica.java
    └── lanzador.java
```

---

# Métodos implementados

pilaSimples.java (Estática):
- `push(int x)` - inserta controlando desbordamiento
- `pop()` - extrae controlando subdesbordamiento
- `mostrar()` - imprime el contenido
- `isEmpty()` - verifica si está vacía
- `isFull()` - verifica si está llena
- `peek()` - consulta el tope sin eliminarlo

pilaDinamica.java (Dinámica):
- `push(int x)` - inserta un nodo en la cima
- `pop()` - extrae el nodo de la cima
- `mostrar()` - recorre e imprime los elementos
- `isEmpty()` - verifica si la cima es null
- `peek()` - consulta la cima sin desvincular el nodo

---

# Compilar y ejecutar

Desde la terminal, en la raíz del proyecto:

```bash
javac estructuras_lineales/*.java
java estructuras_lineales.lanzador
```

Desde VSCode: abrir `lanzador.java` y presionar Run.

---

# Ejemplo de ejecución

```text
=== Pila Estática ===
Metiste: 10
Metiste: 20
Metiste: 30
¡Pila llena! No se pudo meter: 40
--- Pila Estática ---
[30]
[20]
[10]
Tope (peek): 30
Sacaste: 30
--- Pila Estática ---
[20]
[10]

# Conclusión.

La pila estática es más rápida y sencilla, pero su tamaño fijo puede desperdiciar memoria o
quedarse corta. La pila dinámica es más flexible y usa solo la memoria necesaria, a costa de
un pequeño overhead por cada nodo.
# Conclusión

La pila estática es más rápida y sencilla, pero su tamaño fijo puede desperdiciar memoria o quedarse corta. La pila dinámica es más flexible y usa solo la memoria necesaria, a costa de un pequeño overhead por cada nodo.
