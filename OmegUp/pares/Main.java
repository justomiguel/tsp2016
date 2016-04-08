import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int nro = sc.nextInt();
		if (nro%2==0){
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
	}

}
