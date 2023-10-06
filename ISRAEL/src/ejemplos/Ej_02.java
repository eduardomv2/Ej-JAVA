package ejemplos;
import java.util.Scanner;
public class Ej_02 {

	public static void main(String[] args) {
		final int MaxSize = 5; // Tamaño máximo de la pila
        int[] stack = new int[MaxSize];
        int top = -1; // Inicialmente, la pila está vacía

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Push (Insertar elemento)");
            System.out.println("2. Pop (Eliminar elemento)");
            System.out.println("3. Mostrar la pila");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (top < MaxSize - 1) {
                        System.out.print("Ingresa un valor para agregar a la pila: ");
                        int value = scanner.nextInt();
                        top++;
                        stack[top] = value;
                        System.out.println("Elemento " + value + " agregado a la pila.");
                    } else {
                        System.out.println("La pila está llena. No se puede agregar más elementos.");
                    }
                    break;

                case 2:
                    if (top >= 0) {
                        int removedItem = stack[top];
                        top--;
                        System.out.println("Elemento " + removedItem + " eliminado de la pila.");
                    } else {
                        System.out.println("La pila está vacía. No se puede eliminar ningún elemento.");
                    }
                    break;

                case 3:
                    System.out.println("Elementos en la pila:");
                    for (int i = top; i >= 0; i--) {
                        System.out.println(stack[i]);
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        }
    }
	
}
