import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        // Pedir el primer n�mero
        System.out.print("Introduce el primer n�mero: ");
        int numero1 = scanner.nextInt();
        
        // Pedir el segundo n�mero
        System.out.print("Introduce el segundo n�mero: ");
        int numero2 = scanner.nextInt();
        
        // Sumar los dos n�meros
        int suma = numero1 + numero2;
        
        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    

	}

}
