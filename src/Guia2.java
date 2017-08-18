import java.util.Scanner;

public class Guia2 {
	private static Scanner scan = new Scanner(System.in);

	private static void ejercicio1() {
		int nota, notasAcum, alumnoAprobado;
		notasAcum = 0;
		alumnoAprobado = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese la nota del alumno " + (i + 1) + ": ");
			nota = scan.nextInt();
			while (nota > 10 || nota <= 0) {
				System.out.println("La nota debe estar comprendida entre 1 y 10.");
				System.out.println("Por favor ingrese una nota valida: ");
				nota = scan.nextInt();
			}
			notasAcum += nota;
			if (nota < 4) {
				System.err.println("El alumno esta desaprobado!");
			} else {
				System.out.println("El alumno esta aprobado!!");
				alumnoAprobado++;
			}
		}
		System.out.println("La nota promedio del curso es de: " + notasAcum / 10);
		System.out.println("El porcentaje de alumnos aprobados es de: " + alumnoAprobado * 10 + "%");
		System.out.println("El porcentaje de alumnos desaprobados es de: " + (10 - alumnoAprobado) * 10 + "%");
	}

	public static void ejercicio2() {
		int nota, notasAcumuladas = 0, alumnos = 0, alumnosAprobados = 0;

		do {
			System.out.println("Ingrese la nota del alumno " + (alumnos + 1) + ": ");
			System.out.println("Si desea salir, ingrese 0.");
			nota = scan.nextInt();
			while (nota < 0 || nota > 10) {
				System.out.println("El valor ingresado no es valido!!");
				System.out.println("Ingrese un numero comprendido entre 0 y 10:");
				nota = scan.nextInt();
			}
			notasAcumuladas += nota;
			if (nota < 4 && nota > 0) {
				System.out.println("El alumno esta desaprobado!");
				alumnos++;
			} else if (nota != 0){
				System.out.println("El alumno esta aprobado!");
				alumnosAprobados++;
				alumnos++;
			}
		} while (nota != 0);
		if (alumnos == 0) {
			System.out.println("No se ingreso ningun dato!");
			return;
		} else {
			System.out.println("Se ingreso la informacion de " + (alumnos) + " alumnos");
			System.out.println("La nota promedio del curso es de: " + notasAcumuladas / (alumnos));
			System.out.println("El porcentaje de alumnos aprobados es de: " + (alumnosAprobados * 100 / (alumnos)));
			System.out.println(
					"El porcentaje de alumnos desaprobados es de: " + ((alumnos - alumnosAprobados) * 100 / (alumnos)));
		}
	}

	private static void ejercicio3() {
		int nota, notasAcumuladas = 0, alumnos = 0, alumnosAprobados = 0;

		do {
			System.out.println("Ingrese la nota del alumno " + (alumnos + 1) + ": ");
			System.out.println("Si desea salir, ingrese 0.");
			nota = scan.nextInt();
			while (nota < 0 || nota > 10 || (nota == 0 && notasAcumuladas == 0)) {
				System.out.println("El valor ingresado no es valido!!");
				if (notasAcumuladas == 0)
					System.out.println("Debe ingresar al menos una nota para poder salir!!");
				System.out.println("Ingrese un numero comprendido entre 0 y 10:");
				nota = scan.nextInt();
			}
			notasAcumuladas += nota;
			if (nota < 4 && nota > 0) {
				System.out.println("El alumno esta desaprobado!");
				alumnos++;
			} else if (nota != 0) {
				System.out.println("El alumno esta aprobado!");
				alumnosAprobados++;
				alumnos++;
				;
			}
		} while (nota != 0);
		System.out.println("Se ingreso la informacion de " + (alumnos) + " alumnos");
		System.out.println("La nota promedio del curso es de: " + notasAcumuladas / (alumnos));
		System.out.println("El porcentaje de alumnos aprobados es de: " + (alumnosAprobados * 100 / (alumnos)));
		System.out.println(
				"El porcentaje de alumnos desaprobados es de: " + ((alumnos - alumnosAprobados) * 100 / (alumnos)));
	}

	public static void menu() {
		{
			int opcion;
			do {
				System.out.print("Seleccione una opcion: \n"
						+ "1 - Ejercicio 1: Ingresa la nota de 10 alumnos, calcula estadisticas. \n"
						+ "2 - Ejercicio 2: Ingresa la nota de n alumnos, calcula estadisticas.\n"
						+ "3 - Ejercicio 3: Ingresa la nota de n alumnos, calcula estadisticas. Debe ingresar al menos una nota\n"
						+ "0 - Salir\n");
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
				case 0:
					return;
				default:
					System.out.println("La opcion ingresada no es valida!!");
				}
			} while (true);
		}
	}
}
