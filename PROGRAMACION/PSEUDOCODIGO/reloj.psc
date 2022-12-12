Algoritmo reloj
	
	Definir s Como Entero
	Definir m Como Entero
	Definir h Como Entero
	Definir contador Como Entero
	
	
	Mientras Verdadero Hacer
		
		Si h < 10 Entonces
			Escribir "0" Sin saltar
		FinSi
		
		Escribir h, ":" Sin Saltar
		
		Si m < 10 Entonces
			Escribir "0" Sin saltar
		FinSi
		
		Escribir m, ":" Sin Saltar
		
		Si s < 10 Entonces
			Escribir "0" Sin saltar
		FinSi
		
		Escribir s
		
		
		s <- s + 1
		
		Si s = 60
			
			m <- m + 1
			s = 0
			
			Si m = 60
				
				h <- h + 1
				m = 0
				
				Si h = 24 Entonces
					
					h <- 0
					
				FinSi
				
			FinSi
			
		FinSi
		
		Esperar 1 Segundos
		Limpiar Pantalla
		
		
	FinMientras
	
FinAlgoritmo
