package Marsano;

/**
 * <b> AreaTrapezio</b>
 * 
 * classe trapezio
 * 
 * @author Marsano Giulia
 *
 */
public class Trapezio {
	
	/**
	 * costruttore
	 */
	public Trapezio() {
		
	}
	
	/**
	 * metodo per calcolare l'area A
	 * 
	 * @param B base minore
	 * @param b base maggiore
	 * @param h altezza
	 * 
	 * @return valore area
	 */
	public int area(int B,int b,int h) {
		int area;
		area=(B+b)*h/2; //motivo errore: formula corretta=> (B+b)*h/2
		return area;
	}
	
	/**
	 * 
	 * @param args test di classe
	 */
	public static void main(String[] args) {
		Trapezio t=new Trapezio();
		System.out.println("Area "+t.area(4,2,3));
	}

}
