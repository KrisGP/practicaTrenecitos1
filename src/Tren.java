import java.util.Arrays;

public class Tren {
	private Vagon vagones[];
	private int numeroTren;
	private char direccion;
	private int longitudTren;
	private int x;
	private int y;
	
	public Tren(int i, char letra, int longitud, int xDireccion, int yDireccion) {
		longitudTren = longitud;
		numeroTren = i;
		direccion = letra;
		x = xDireccion;
		y = yDireccion;
		vagones = new Vagon[longitud];
		this.vagones();
	}
	
	public Vagon getVagon(int j) {
		return vagones[j];
	}
	
	
	public Vagon[] getVagones() {
		return vagones;
	}


	public void setVagones(Vagon[] vagones) {
		this.vagones = vagones;
	}


	public int getNumeroTren() {
		return numeroTren;
	}


	public void setNumeroTren(int numeroTren) {
		this.numeroTren = numeroTren;
	}


	public char getDireccion() {
		return direccion;
	}


	public void setDireccion(char direccion) {
		this.direccion = direccion;
	}


	public int getLongitudTren() {
		return longitudTren;
	}


	public void setLongitudTren(int longitudTren) {
		this.longitudTren = longitudTren;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	public void vagones() {//asigno la posicion a cada vagon
		switch (direccion) {
		case 'A'://arriba
			for (int i = 0; i < longitudTren; i++) {
				vagones[i] = new Vagon(direccion, x, y-i);
			}
		case 'B'://abajo
			for (int j = 0; j < longitudTren; j++) {
				vagones[j] = new Vagon(direccion, x, y+j);
			}
		case 'I'://izquierda
			for (int k = 0; k < longitudTren; k++) {
				vagones[k] = new Vagon(direccion, x+k, y);
			}
		case 'D'://derecha
			for (int t = 0; t < longitudTren; t++) {
				vagones[t] = new Vagon(direccion, x-t, y);
			}
		}
	}
	
	

	public void prioridad() {//hace que el tren se mueva segun su direccion
		switch(direccion) {
			case 'A':
				for(int i = 0; i < longitudTren; i++) {
					 this.vagones[i].direccion(x, y+1);
				}
			case 'B':
				for(int j = 0; j < longitudTren; j++) {
					this.vagones[j].direccion(x, y-1);
				}
			case 'I':
				for(int k = 0; k < longitudTren; k++) {
					this.vagones[k].direccion(x+1, y);
				}
			case 'D':
				for(int t = 0; t < longitudTren; t++) {
					this.vagones[t].direccion(x-1, y);
				}
		}
	}

	
	
	/*public void movimiento() {
		for(int i = 0; i < 30; i++) {
			tren.prioridad();
		}
	}*/
	
	

}
