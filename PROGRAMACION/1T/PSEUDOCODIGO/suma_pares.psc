Algoritmo suma_pares
	
	Definir num como entero;
	Definir limite como entero;
	Definir contador como entero;
	Definir suma como entero;
	
	Escribir "Introduzca el numero"
	Leer num
	
	Escribir "Introduzca el limite"
	Leer limite
	
	num <- num + 1
	
	Mientras contador < limite Hacer
		
		Si num MOD 2 = 0 Entonces
			
			suma <- suma + num
			
			Escribir "La suma es: " suma;
			
			contador <- contador + 1;
			
		FinSi
		
		num <- num + 1
		
	FinMientras
	
FinAlgoritmo
