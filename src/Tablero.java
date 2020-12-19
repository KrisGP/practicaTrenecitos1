import java.util.ArrayList;

import java.lang.Math;

public class Tablero {
	private String tablero[][];
	private int numTablero;
	private ArrayList<Tren> conjuntoTrenes = new ArrayList<Tren>();
	private String matrizColisiones[][];
	public Tablero() {
		tablero = new String[30][30];
		matrizColisiones = new String[30][30];
		for(int i = 0; i < 30; i++) {
			for(int j = 0; j < 30; j++) {
				tablero[i][j] = ".";
			}
		}
	}
	
	//ordeno el arrayList segun la prioridad del tren
	public void ordenarPorPrioridad() {
		
	}
	
	public void creandoTrenes(int i, char letra, int longitud, int xCoord, int yCoord) {
		yCoord = Math.abs(yCoord - 29);
		conjuntoTrenes.add(new Tren(i, letra, longitud, xCoord, yCoord));
	}
	
	
	
	public void changeToX(int x, int y) {
		tablero[x][y] = "X";
	}
	
	public void colisiones() {
		
		for (int i = 0; i < conjuntoTrenes.size(); i++) {
			for (int j = 0; j < conjuntoTrenes.get(i).getLongitudTren(); j++) {
				if (tablero[conjuntoTrenes.get(i).getVagon(j).getEjeX()][conjuntoTrenes.get(i).getVagon(j)
						.getEjeY()] == ".") {
					
					tablero[conjuntoTrenes.get(i).getVagon(j).getEjeX()][conjuntoTrenes.get(i).getVagon(j)
							.getEjeY()] = String.valueOf(conjuntoTrenes.get(i).getNumeroTren());

				}
				
				else {
					changeToX(conjuntoTrenes.get(i).getVagon(j).getEjeX(), conjuntoTrenes.get(i).getVagon(j)
						.getEjeY());
					matrizColisiones[conjuntoTrenes.get(i).getVagon(j).getEjeX()][conjuntoTrenes.get(i).getVagon(j)
					                                      						.getEjeY()] = "X";
				}
			}
		}
	}
	
	public void comoEsLaColision() {
		
	}
	
	/*public void movimientoTrenes(){
		if(conjuntoTrenes != null) {
			for(int i = 0; i < conjuntoTrenes.size(); i++) {//hacemos que se muevan los trenes
				conjuntoTrenes.get(i).prioridad();
				if(i-1 > 0) {
					if(hayColision(conjuntoTrenes.get(i), conjuntoTrenes.get(i-1))) {
						changeToX(conjuntoTrenes.get(i).getX(), conjuntoTrenes.get(i).getY());
					}
				}
			}
			movimientoTrenes();
		}
	}*/
	

	public void imprimirTablero() {
		numTablero = 29;
		System.out.print("   0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 2 2\n");
		System.out.print("   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9\n");
		for(int i = 0; i < 30; i++) {
			if(numTablero < 10) {
				System.out.print("0" +numTablero +" ");
				numTablero--;
			}
			else {
				System.out.print(numTablero +" ");
				numTablero--;
			}
			for(int j = 0; j < 30; j++) {
				System.out.print(tablero[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
