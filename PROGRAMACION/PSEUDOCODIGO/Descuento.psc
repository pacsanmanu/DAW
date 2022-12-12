
//Manuel Pacheco Sánchez, 1º DAW//

Algoritmo Descuento
	
	Definir x como Real;
	Definir precio como Real;
	Definir descontado como Real;
	Definir preciototal como Real;
	
	Escribir "Introduzca el precio sin descuento"
	Leer precio;
	
	Escribir "Escriba el porcentaje de descuento que se le aplica a su compra"
	Leer x;
	
	descontado <- precio * x / 100;
	
	preciototal <- precio - descontado;
	
	Escribir "El precio que debe pagar aplicando el descuento es de " preciototal;
	
FinAlgoritmo