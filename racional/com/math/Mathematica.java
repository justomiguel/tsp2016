package com.math;

public class Mathematica {

	public static int obtenerMCM(int n1, int n2){
                // >,<,!=,==
                // if (condicionLogica o variable logica) {
                //      cuerpo
                // }
                if (n1 == n2){
                        return n1;
                }

                int mayor = obtenerMayor(n1, n2);
                int menor = obtenerMenor(n1, n2);

                if (mayor%menor == 0){
                        return mayor;
                }

                return mayor*menor;
        }

	public static int obtenerMayor(int n1, int n2){
                if (n1 > n2){
                        return n1;
                }
                return n2;
        }

        public static int obtenerMenor(int n1, int n2){
                if (n1 < n2){
                        return n1;
                }
                return n2;
        }


}
