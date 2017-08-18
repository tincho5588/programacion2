import java.util.Scanner;

public class Guia1 {

	private static Scanner scan = new Scanner(System.in);

	private static void ejercicio1() {
		int n;

		System.out.println("Ingrese un numero: ");
		n = scan.nextInt();
		if (n > 10)
			System.out.println(n);
		else
			System.out.println("El numero ingresado es menor o igual a 10.");
	}

	private static void ejercicio2() {
		int n1, n2;

		System.out.println("Ingrese el primer numero: ");
		n1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		n2 = scan.nextInt();
		if (n1 > n2) {
			System.out.println(n1 + " es mayor que " + n2);
			System.out.println(n1 + "^2 / " + n2 + "^2 = " + (Math.pow(n1, 2) / Math.pow(n2, 2)));
		} else {
			if (n2 > n1) {
				System.out.println(n2 + " es mayor que " + n1);
				System.out.println(n2 + "^2 + " + n1 + "^2 = " + (Math.pow(n2, 2) / Math.pow(n1, 2)));
			} else
				System.out.println("Los numeros ingresados son iguales");

		}
	}

	private static void ejercicio3() {
		int gradosF;
		System.out.println("Ingrese la cantidad de grados F que quiere convertir a C");
		gradosF = scan.nextInt();
		System.out.println(gradosF + "°F = " + ((5.00 / 9.00) * (gradosF - 32)) + "°C");
	}

	private static void ejercicio4() {
		int n;
		System.out.println("Ingrese un numero: ");
		n = scan.nextInt();
		if (n > 0)
			System.out.println("El numero ingresado es mayor a cero.");
		else {
			if (n < 0)
				System.out.println("El numero ingresado es menor a cero");
			else
				System.out.println("El numero ingresado es cero");
		}
	}

	private static void ejercicio5() {
		int n1, n2, n3;
		System.out.println("Ingrese el primer numero: ");
		n1 = scan.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		n2 = scan.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		n3 = scan.nextInt();
		if ((n1 + n2) == n3)
			System.out.println("La suma del primero mas el segundo es efectivamente" + " igual al tercero");
		else
			System.out.println("La suma del primero mas el segundo NO es igual al " + "tercero.");
	}

	public static void menu() {
		int opcion;
		do {
			System.out.print(
					"Seleccione una opcion: \n" + "1 - Ejercicio 1: Lee un numero y verifica si es mayor a 10. \n"
							+ "2 - Ejercicio 2: Lee dos numeros y calcula el resultado de dividir el cuadrado del"
							+ " mayor de ellos y el cuadrado del menor de ellos. \n"
							+ "3 - Ejercicio 3: Ingresa °F y los convierte a °C. \n"
							+ "4 - Ejercicio 4: Determina si un numero ingresado es positivo, negativo, o cero. \n"
							+ "5 - Ejercicio 5: Ingresa 3 numeros, y determina si la suma del primero mas el segundo "
							+ "es igual al tercero. \n" + "0 - Salir\n");
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				ejercicio1();
				break;
			case 2:
				ejercicio2();
				break;
			case 3:
				ejercicio3();
				break;
			case 4:
				ejercicio4();
				break;
			case 5:
				ejercicio5();
				break;
			case 0:
				return;
			default:
				System.out.println("La opcion ingresada no es valida!!");
			}
		} while (true);
	}
}
