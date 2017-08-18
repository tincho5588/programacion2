import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int opcionGuia;
		String siNo;
		do {
			System.out.println("Ingrese la guia de ejercicios que desea consultar: ");
			System.out.println("1 - Guia 1");
			System.out.println("2 - Guia 2");
			System.out.println("0 - Salir");
			opcionGuia = scan.nextInt();
			switch (opcionGuia) {
			case 1:
				Guia1.menu();
				break;
			case 2:
				Guia2.menu();
				break;
			case 0:
				return;
			default:
				System.out.println("La opcion ingresada no es valida!!");
			}
			System.out.println("Desea ejecutar otra guia de ejercicios? (Si/No)");
			siNo = scan.next();
			while (!(siNo.equalsIgnoreCase("si") || siNo.equalsIgnoreCase("no"))) {
				System.out.println("El valor ingresado no es valido. Ingrese Si o No");
				siNo = scan.next();
			}
			if (siNo.equalsIgnoreCase("no"))
				return;
		} while (true);
	}
}
