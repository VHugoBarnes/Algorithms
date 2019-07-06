package algorithm_introduction;

/**
 * <h1>Pasos para hacer un Queue.</h1>
 * 1.- Crear un pointer para saber que hay un front y ultimo.
 * 2.- Colocar éstos valores en -1 al inicializarlos.
 * 3.- Incrementar en 1 el valor de ultimo cuando agreguemos un elemento.
 * 4.- Retornar el valor de front al quitar un elemento e incrementar en 1 el valor de
 *     front al usar deQueue.
 * 5.- Antes de agregar un elemento, revisar si hay espacio.
 * 6.- Antes de remover un elemento, revisamos que existan elementos.
 * 7.- Asegurarnos de que al remover todos los elementos resetear nuestro front y
 *     ultimo a -1 y agregar el valor de 0 a front al hacer el enQueue.
 *
 * @autor Víctor Vázquez
 * */

public class Queue {

    public final int SIZE = 5;
    private int ultimo = -1;
    private int[] values = new int[SIZE];

    /**
     * Añade un elemento de la cola si y sólo si hay espacio en el array.
     * */
    public void enQueue(int value) {
        if (ultimo == SIZE-1) {
            System.out.println("Nuesto Queue está lleno.");
        } else {
            ultimo++;
            values[ultimo] = value;
            System.out.println("Se insertó el valor: " + value + " correctamente");
        }
    }

    /**
     * Elimina un elemento de la cola si y sólo si hay un elemento en el array.
     *
     * En la primera condición se evalua si el front y ultimo no están vacios (-1).
     * Es importante que los dos se estén evaluando.
     *
     * Posteriormente, el 'else' quiere decir que sí hay elementos en el array.
     * Se elimina el primer elemento del array (FIFO) con un bucle 'for' que recorre el
     * array a la izquierda, haciendo que el primer elemento se pierda/elimine.
     *
     * */
    public void deQueue() {
        if (ultimo == -1) {
            System.out.println("Nuestro Queue está vacío.");
        }
        else {
            System.out.println("Se eliminó el valor " + values[0]);
            /*if (front > ultimo)
                front = ultimo = -1;  <--- Esto es innecesario.
            front++;*/
            for (int i = 0; i< ultimo; i++) {
                values[i] = values[i+1];
            }
            ultimo--;
        }
    }

}
