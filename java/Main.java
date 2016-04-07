import com.transportes.impl.*;
import com.transportes.Auto;

public class Main {

	public static void main(String[] args){
		Auto autito = new AutoAcuatico();
		Auto auto2 = new AutoAVapor();
		
		autito.encenderse();
		auto2.encenderse();

		AutoAcuatico r = (AutoAcuatico) autito;

		System.out.println(r.getCantOxigeno());

		System.out.println("Estado de autito: "+autito.getEstado());
		System.out.println("Estado de auto2: "+auto2.getEstado());


		r.frenar();

		System.out.println("Estado de autito: "+autito.getEstado());


	}

}
