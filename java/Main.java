import com.transportes.impl.*;
import com.transportes.Auto;

public class Main {

	public static void main(String[] args){

		Auto autito = new AutoAcuatico();
		Auto auto2 = new AutoAVapor();
		
		autito.encenderse();
		auto2.encenderse();

		AutoAcuatico nuevoAuto = (AutoAcuatico) autito;

		System.out.println("Estado de autito: "+autito.getEstado());
		
		autito = null;		

		System.out.println("Estado de autito: "+autito.getEstado());
		

	}

}
