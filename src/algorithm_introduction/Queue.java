package algorithm_introduction;

/**
 * <h1>Pasos para hacer un Queue.</h1>
 * 1.- Crear un pointer para saber que hay un front y rear.
 * 2.- Colocar éstos valores en -1 al inicializarlos.
 * 3.- Incrementar en 1 el valor de rear cuando agreguemos un elemento.
 * 4.- Retornar el valor de front al quitar un elemento e incrementar en 1 el valor de
 *     front al usar deQueue.
 * 5.- Antes de agregar un elemento, revisar si hay espacio.
 * 6.- Antes de remover un elemento, revisamos que existan elementos.
 * 7.- Asegurarnos de que al remover todos los elementos resetear nuestro front y
 *     rear a -1 y agregar el valor de 0 a front al hacer el enQueue.
 *
 * @autor Víctor Vázquez
 * */

public class Queue {

    public final int SIZE = 5;
    private int front = -1;
    private int rear = -1;
    private int[] values = new int[SIZE];

    /**
     * Añade un elemento de la cola si y sólo si hay espacio en el array.
     * */
    public void enQueue(int value) {
        if (rear == SIZE-1) {
            System.out.println("Nuesto Queue está lleno.");
        } else {
            if (front == -1) front = 0;

            rear++;
            values[rear] = value;
            System.out.println("Se insertó el valor: " + value + " correctamente");
        }
    }

    /**
     * Elimina un elemento de la cola si y sólo si hay un elemento en el array.
     * */
    public void deQueue() {
        if (front == -1) {
            System.out.println("Nuestro Queue está vacío.");
        } else {
            System.out.println("Se eliminó el valor " + values[front]);
            front++;
            if (front > rear)
                front = rear = -1;
        }
    }

}
