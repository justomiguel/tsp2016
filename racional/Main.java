import com.math.Racional;

public class Main {

	public static void main(String[] args){

		Racional numero = new Racional(3,4);
		Racional otroNumero = new Racional(1,2);
		
		System.out.println(numero);
		System.out.println(otroNumero);

		numero = numero.sumaFea(otroNumero);

		System.out.println(numero);
                System.out.println(otroNumero);

		

	}

}
