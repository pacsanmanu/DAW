package lib;

import javax.xml.transform.Source;

public class Ejercicios {
	
	/** [1 PUNTO]
	 * Recibe una lista de regalos y los devuelve envueltos
	 *
	 * @return lista de regalos envueltos
	 */
	public static String[] envolverRegalos(String[] regalos){
		// Algoritmo para envolver los regalos
		
		for(int i = 0; i < regalos.length; i++){

			String regalo = "";

			regalo += "*";
			for(int j = 0; j < regalos[i].length(); j++){
				regalo += "*";
			}
			regalo += "*";
			regalo += "\n";
			
			regalo += "*";
			regalo += regalos[i];
			regalo += "*";
			regalo += "\n";

			regalo += "*";
			for(int j = 0; j < regalos[i].length(); j++){
				regalo += "*";
			}
			regalo += "*";
			regalo += "";

			regalos[i] = regalo;
			regalo = "";
		}
		
		return regalos;
	}

	/** [2 PUNTO]
	 * Recibe un número y crea un cubo de la dimensión dada
	 *
	 * @return Cadena de texto que forma el cubo al ser impreso
	 */
	public static String crearCubo(int n){
		// Algoritmo para crear cubo de dimension n

		String cubo = "";
		int cont = n - 1;

		for(int i = 1; i <= n; i++){
			for(int j = 0; j < cont; j++){
				cubo += " ";
			}
			cont--;

			for(int j = 0; j < i; j++){
				cubo += "/";
				cubo +="\\";
			}

			for(int j = 0; j < n; j++){
				cubo += "_\\";
			}
			cubo += "\n";
		}

		cont = 0;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < cont; j++){
				cubo += " ";
			}
			cont++;

			for(int j = n; j > i; j--){
				cubo += "\\";
				cubo +="/";
			}

			for(int j = 0; j < n; j++){
				cubo += "_/";
			}
			cubo += "\n";
		}

		return cubo;
	}

	/** [2 PUNTO]
	 * Recibe una cadena de texto y comprueba si es palíndroma
	 * Si la cadena de texto es palíndroma al retirar un carácter tambien es válida
	 *
	 * @return Valor booleano que indica si es o no palíndroma
	 */
	public static boolean comprobarPalabraEsPalindroma(String palabra){
		// Comprobar palíndromo con carácter extra
		String sub1 = "";
		String sub2 = "";
		String aux = "";
		char c = 'a';
		int letras = 0;
		boolean palindrome = false;

		for(int j = 0; j < palabra.length(); j++){
			aux = palabra;
			palabra = "";
			for(int i = 0; i < aux.length(); i++){
				if(i != j){
					c = aux.charAt(i);
					palabra += c;
				}
			}

			letras = palabra.length() / 2;
			
			for(int i = 0; i < letras; i++){
				c = palabra.charAt(i);
				sub1 += c;
			}
			
			for(int i = 0; i < letras; i++){
				c = palabra.charAt(palabra.length() - 1 - i);
				sub2 += c;
			}
			
			for(int i = 0; i < sub2.length(); i++){
				if(sub1.charAt(i) == sub2.charAt(i)){
					palindrome = true;
				}
			}
			if(palindrome){
				break;
			}
			palabra = aux;
		}

		return palindrome;
	}

	/** [1 PUNTO]
	 * Recibe un array de booleanos cuyas posiciones indican si han pasado los tests.
	 * Posición 0 => Test ejercicio 1
	 * Posición 1 => Test ejercicio 2
	 * Posición 2 => Test ejercicio 3
	 * 
	 * @return Valor entero que indica la probabilidad si tus sueños se han cumplido
	 */
	public static int calcularProbabilidad(boolean[] tests)
	{
		int probabilidad = 25;

		for(int i = 0; i < tests.length; i++){
			if(tests[i]){
				probabilidad += 25;
			}
		}

		return probabilidad;
	}
}
