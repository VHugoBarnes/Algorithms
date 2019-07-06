import algorithm_introduction.Queue;
import algorithm_introduction.UserDefinedDataType;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //UserDefinedDataType victor;
        //victor = new UserDefinedDataType("Victor Hugo".toCharArray(),
        //        "000000001".toCharArray(), 2000, "Pinos Sur".toCharArray());

        Queue cola = new Queue();
        int menu = 0;
        int nCliente;
        int operacion = 0;

        while (operacion != 2) {

            System.out.println("Bienvenido al programa del restaurante.");
            System.out.println("Elige una opción:");
            System.out.println("1.- Atender cliente."); // deQueue().
            System.out.println("2.- Registrar cliente."); // enQueue().
            System.out.println("3.- Salir.");

            Scanner scanner = new Scanner(System.in);

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    cola.deQueue();
                    break;
                case 2:
                    System.out.println("Ingresa el número de cliente:");
                    nCliente = scanner.nextInt();
                    cola.enQueue(nCliente);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("¿Desea hacer otra operación?");
            System.out.println("1.- Sí");
            System.out.println("2.- No");
            operacion = scanner.nextInt();
        }
        System.out.println("Programa finalizado.");

    }
}
