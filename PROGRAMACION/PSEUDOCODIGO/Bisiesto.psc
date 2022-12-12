Algoritmo bisiesto
	
	Definir año como entero;
	Definir resutado como Logico;
	
	Escribir "Introduzca el año"
	Leer año;
	
	Si (año MOD 4 = 0 Y año MOD 100 <> 0) O año MOD 400 = 0 Entonces
		Escribir "El año " año " es bisiesto"
		
	SiNo
		
		Escribir "El año " año " no es bisiesto"
	FinSi
	
FinAlgoritmo
