import com.math.Racional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el primer racional");
		int num1 = sc.nextInt();

		Racional numero = new Racional(num1,sc.nextInt());

                System.out.println("Ingresa el segundo racional");

		Racional otroNumero = new Racional(sc.nextInt(),
						sc.nextInt());
		
		numero.add(otroNumero);
		
                System.out.println("Resultado de la suma: "+numero);

		

	}

}
