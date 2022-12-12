Algoritmo fibonacci
	
	Definir limite Como Entero
	Definir numero1 como Entero
	Definir numero2 Como Entero
	Definir acumulador Como Entero
	Definir contador Como Entero
	
	numero1 <- 0;
	numero2 <- 1;
	acumulador <- 0;
	
	Escribir "Introduzca el limite"
	Leer limite
	
	Para contador <- 1 Hasta limite Con Paso 1 Hacer
		
		Escribir acumulador
		
		acumulador <- numero1 + numero2
		numero2 <- numero1
		numero1 <- acumulador
		
	Fin Para
	

FinAlgoritmo
