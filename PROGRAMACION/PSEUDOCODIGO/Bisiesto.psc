Algoritmo bisiesto
	
	Definir a�o como entero;
	Definir resutado como Logico;
	
	Escribir "Introduzca el a�o"
	Leer a�o;
	
	Si (a�o MOD 4 = 0 Y a�o MOD 100 <> 0) O a�o MOD 400 = 0 Entonces
		Escribir "El a�o " a�o " es bisiesto"
		
	SiNo
		
		Escribir "El a�o " a�o " no es bisiesto"
	FinSi
	
FinAlgoritmo
