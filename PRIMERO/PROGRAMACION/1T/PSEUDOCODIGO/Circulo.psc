Algoritmo Circulo
	
	Definir radio Como Real;
	Definir area Como Real;
	Definir perimetro Como Real;
	
	Escribir "Introduzca el radio del círculo";
	Leer radio;
	
	area <- redon(PI * radio ^ 2);
	perimetro <- redon(2 * PI * radio);
	
	Escribir "El perímetro es " perimetro;
	Escribir "El área es " area;
	
FinAlgoritmo