import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cantidadDeTablas = sc.nextInt();
		
		for(int i = 0; i < cantidadDeTablas; i++) {
			int tablaAMostrar = sc.nextInt();
			mostrarTabla(tablaAMostrar);
			if (i < cantidadDeTablas - 1) {
				System.out.println("");	
			}
			
		}
	}

	public static void mostrarTabla(int cual) {
		for(int i = 1; i < 11;i++) {
			System.out.println(cual + "x" + i + "=" + i * cual);
		
		}
		
	}	

}
