Algoritmo calculadora
	
	Definir numero1 como Real
	Definir numero2 como Real
	Definir resultado como Real
	Definir opciones como Entero
	
	Escribir "Indique la operaci�n que quiere realizar: "
	Escribir ""
	Escribir "1) Suma"
	Escribir ""
	Escribir "2) Resta"
	Escribir ""
	Escribir "3) Multiplicaci�n"
	Escribir ""
	Escribir "4) Divisi�n"
	Escribir ""
	
	Leer opciones
	
	Escribir "Introduzca el primer n�mero"
	Leer numero1
	
	Escribir "Introduzca el segundo n�mero"
	Leer numero2
	
	Segun opciones Hacer
		1:
			resultado <- numero1 + numero2
			Escribir "El resultado es " resultado;
		2:
			resultado <- numero1 - numero2
			Escribir "El resultado es " resultado;
		3:
			resultado <- numero1 * numero2
			Escribir "El resultado es " resultado;
		4:
			resultado <- numero1 / numero2
			Escribir "El resultado es " resultado;
			
		De Otro Modo:
			Escribir "Reejecute el c�digo e introduzca par�metros correctos"
	Fin Segun
FinAlgoritmo
