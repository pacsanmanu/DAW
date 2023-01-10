import lib.Ejercicios;

public class Examen1T {

	/* Manuel Pacheco Sánchez
	 * 1º DAW
	 */

	public static void main(String[] args) {

		/* Inicialización de arrays */
		
		String[] regalos = {"gato", "juego", "calcetines"};
		String[] regalos2 = {"pepe", "mario", "brasileras"};
		String[] regalos3 = {"paco", "migue", "california"};
		String[] regalosEnvueltos = Ejercicios.envolverRegalos(regalos);
		String[] regalosEnvueltos2 = Ejercicios.envolverRegalos(regalos2);
		String[] regalosEnvueltos3 = Ejercicios.envolverRegalos(regalos3);
		boolean[] tests = new boolean[3];

		/* Strings para comprobar que la funcion de envolver regalos es correcta */

		String regalo11 = "******\n*gato*\n******";
		String regalo12 = "*******\n*juego*\n*******";
		String regalo13 = "************\n*calcetines*\n************";
		String regalo21 = "******\n*pepe*\n******";
		String regalo22 = "*******\n*mario*\n*******";
		String regalo23 = "************\n*brasileras*\n************";
		String regalo31 = "******\n*paco*\n******";
		String regalo32 = "*******\n*migue*\n*******";
		String regalo33 = "************\n*california*\n************";

		/* Bucle que imprime los regalos envueltos (no necesario para la entrega) */

		for(int i = 0; i < regalosEnvueltos.length; i++){
			System.out.println(regalosEnvueltos[i]);
			System.out.println("");
		}
		for(int i = 0; i < regalosEnvueltos.length; i++){
			System.out.println(regalosEnvueltos2[i]);
			System.out.println("");
		}
		for(int i = 0; i < regalosEnvueltos.length; i++){
			System.out.println(regalosEnvueltos3[i]);
			System.out.println("");
		}

		/* Strings necesarias para comprobar que los cubos son correctos */

		String cubo1 = "/\\_\\\n\\/_/\n";
		
		String cubo2 = " /\\_\\_\\\n/\\/\\_\\_\\\n\\/\\/_/_/\n \\/_/_/\n";
		
		String cubo3 = "  /\\_\\_\\_\\\n /\\/\\_\\_\\_\\\n/\\/\\/\\_\\_\\_\\\n\\/\\/\\/_/_/_/\n \\/\\/_/_/_/\n  \\/_/_/_/\n";
		
		String micubo1 = Ejercicios.crearCubo(1);
		
		String micubo2 = Ejercicios.crearCubo(2);
		
		String micubo3 = Ejercicios.crearCubo(3);

		/* Impresión de los cubos generados por la función crearCubo */

		System.out.println(Ejercicios.crearCubo(1));
		
		System.out.println(Ejercicios.crearCubo(2));
		
		System.out.println(Ejercicios.crearCubo(3));

		/* Testing (professional programmer UwU) */
		
		boolean res11 = regalo11.equals(regalosEnvueltos[0]) && regalo12.equals(regalosEnvueltos[1]) && regalo13.equals(regalosEnvueltos[2]);
		boolean res12 = regalo21.equals(regalosEnvueltos2[0]) && regalo22.equals(regalosEnvueltos2[1]) && regalo23.equals(regalosEnvueltos2[2]);
		boolean res13 = regalo31.equals(regalosEnvueltos3[0]) && regalo32.equals(regalosEnvueltos3[1]) && regalo33.equals(regalosEnvueltos3[2]);

		boolean res1 = res11 && res12 && res13;
		
		boolean res2 = micubo1.equals(cubo1) && micubo2.equals(cubo2) && micubo3.equals(cubo3);

		boolean res3 = Ejercicios.comprobarPalabraEsPalindroma("oso") && Ejercicios.comprobarPalabraEsPalindroma("alas") && !Ejercicios.comprobarPalabraEsPalindroma("feo");
		
		/* Imprimo el resultado de los tests */

		System.out.println(res1);

		System.out.println(res2);

		System.out.println(res3);

		/* Almaceno los resultados en el array tests[] */

		tests[0] = res1;
		tests[1] = res2;
		tests[2] = res3;

		/* Calculamos la probabilidad de que me entreguen los regalos */

		int heSidoBuenisimo = Ejercicios.calcularProbabilidad(tests);

		System.out.println("\n" + heSidoBuenisimo);

		/* ¡Feliz navidad! */
		
		System.out.println("\n¡Feliz navidad!");
	}
	
}
