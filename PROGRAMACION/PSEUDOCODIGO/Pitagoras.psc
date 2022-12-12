Algoritmo Pitagoras
	
	Definir lado1 como Entero;
	Definir lado2 como Entero;
	Definir lado3 como Entero;
	
	Escribir "Introduzca la medida del primer lado";
	Leer lado1;
	Escribir "Introduzca la medida del segundo lado";
	Leer lado2;
	Escribir "Introduzca la medida del tercer lado";
	Leer lado3;
	
	Si lado1 > lado2 entonces
		cateto1 <- lado2;
		Escribir "El lado2 es un cateto"
		Si lado1 > lado3 Entonces
			hipotenusa <- lado1;
			cateto2 <- lado3;
			Escribir "La hipotenusa es el lado1"
			Escribir "El lado3 es un cateto"
		SiNo
			hipotenusa <- lado3;
			cateto2 <- lado1;
			Escribir "La hipotenusa es el lado3"
			Escribir "El lado1 es un cateto"
		FinSi
	SiNo
		cateto1 <- lado1;
		Escribir "El lado1 es un cateto"
		Si lado2 > lado3 Entonces
			hipotenusa <- lado2;
			cateto1 <- lado3;
			Escribir "La hipotenusa es el lado2"
			Escribir "El lado3 es un cateto"
		Sino 
			hipotenusa <- lado3;
			cateto1 <- lado2;
			Escribir "La hipotenusa es el lado3"
			Escribir "El lado2 es un cateto"
		FinSi
	FinSi
	
	Si hipotenusa ^ 2 = cateto1 ^2 + cateto2 ^2 Entonces
		Escribir "El triángulo es rectángulo"
	SiNo
		Escribir "El triángulo no es rectángulo"
	FinSi
	
	
FinAlgoritmo
