package estructuras_lineales;

public class pilaSimples {
    private int[] datos;
    private int tope;

    // Constructor por defecto: capacidad de 5
    public pilaSimples() {
        this(5);
    }

    // Constructor con capacidad personalizada
    public pilaSimples(int capacidad) {
        this.datos = new int[capacidad];
        this.tope = -1; // -1 indica pila vacía
    }

    // Verifica si no hay elementos
    public boolean isEmpty() {
        return tope == -1;
    }

    // Verifica si el arreglo llegó a su límite
    public boolean isFull() {
        return tope == datos.length - 1;
    }

    // Inserta un elemento en el tope
    public void push(int x) {
        if (!isFull()) {
            tope++;
            datos[tope] = x;
            System.out.println("Metiste: " + x);
        } else {
            System.out.println("¡Pila llena! No se pudo meter: " + x);
        }
    }

    // Extrae el elemento del tope controlando subdesbordamiento
    public int pop() {
        if (!isEmpty()) {
            int valor = datos[tope];
            tope--;
            System.out.println("Sacaste: " + valor);
            return valor;
        } else {
            System.out.println("¡Pila vacía!");
            return -1;
        }
    }

    // Consulta el elemento del tope sin eliminarlo
    public int peek() {
        if (!isEmpty()) {
            return datos[tope];
        } else {
            System.out.println("¡Pila vacía!");
            return -1;
        }
    }

    // Muestra el contenido de la pila del tope hacia abajo
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Pila vacía.");
            return;
        }
        System.out.println("--- Pila Estática ---");
        for (int i = tope; i >= 0; i--) {
            System.out.println("[" + datos[i] + "]");
        }
    }
}