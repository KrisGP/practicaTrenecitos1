
public class Vagon {
	private char direccion;
	private int ejeX;
	private int ejeY;
	
	public Vagon(char letra, int x, int y) {
		direccion = letra; 
		ejeX = x;
		ejeY = y;
	}
	
	public int getEjeX() {
		return ejeX;
	}

	public void setEjeX(int ejeX) {
		this.ejeX = ejeX;
	}

	public int getEjeY() {
		return ejeY;
	}

	public void setEjeY(int ejeY) {
		this.ejeY = ejeY;
	}

	public Vagon direccion(int x, int y) {
		return this.direccion(x,y);
	}
}
