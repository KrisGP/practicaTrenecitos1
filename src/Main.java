
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static int numTrenes;
	private static Tablero tablero;
	
    public static void main(String[] args) {
    	int longitud = 0, xCoord = 0, yCoord = 0;
    	char letra;
    	Scanner usuario = new Scanner(System.in);
    	int totalLongitud = 0;

		numTrenes = usuario.nextInt();

		if (numTrenes > 10 || numTrenes < 1) {
			System.out.println("Conjunto de trenes incorrecto.");
			System.exit(1);
		}

		for (int i = 0; i < numTrenes; i++) {// no olvidarse de vaciar el array cuando cambies de simulacion

			letra = usuario.next().charAt(0);

			longitud = usuario.nextInt();

			xCoord = usuario.nextInt();

			yCoord = usuario.nextInt();

			if (longitud < 1 || longitud > 30 || xCoord < 0 || xCoord > 29 || yCoord < 0
					|| yCoord > 29) {
				System.out.println("Conjunto de trenes incorrecto.");
				System.exit(1);
			}

			tablero = new Tablero();

			if (letra == 'A' || letra == 'B' || letra == 'I' || letra == 'D') {
				tablero.creandoTrenes(i, letra, longitud, xCoord, yCoord);
				totalLongitud += longitud;

			} else {
				System.out.println("Conjunto de trenes incorrecto.");
				System.exit(1);
			}

		}

		if (totalLongitud > 100) {
			System.out.println("Conjunto de trenes incorrecto.");
			System.exit(1);
		}

		tablero.imprimirTablero();

		usuario.close();
	}

}