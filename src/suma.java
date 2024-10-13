import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        // Pedir el primer número
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        
        // Pedir el segundo número
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();
        
        // Sumar los dos números
        int suma = numero1 + numero2;
        
        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    

	}

}
