public class operadores {
    public static void main(String[] args) {

        int suma = 3+4;
        int resta = 3-4;
        int multiplicacion = 3*4;
        int division = 3/4;
        int modulo = 3%4;
        suma++; //Incrementa en 1 el valor de la variable suma.
        ++suma; //Incrementa en 1 y después asigna el valor.

        //Asignacion

        String texto = "valor";
        int cont = 0;
        int incremento = 4;
        cont = cont + incremento;
        cont += incremento; //Es lo mismo que la linea anterior. Al valor de la izda le suma el de la dcha.
        cont -= incremento; //Al valor de la izda le resta el de la dcha.
        cont *= incremento; //Al valor de la izda le multiplica el de la dcha.
        cont /= incremento; //Al valor de la izda le divide el de la dcha.

        //Relacionales

        boolean igual = (5 == 4); 
        boolean distinto = (5 != 4); 
        boolean mayor = (5 > 4);
        boolean menor = (5 < 4);
        boolean mayorigual = (5 >= 4);
        boolean menorigual = (5 <= 4);

        //Logicos

        boolean and = 4 == 4 && 5 == 5; //Devuelve true si las dos condiciones son verdaderas.
        boolean or = 4 == 4 || 5 == 5; //Devuelve true si una de las condiciones o ambas son verdaderas.
        boolean negacion = !true; //Devuelve el valor contrario al que tiene.

        //Especiales

        // ? : -- Operador ternario.
        // new -- Operador de creacion de objetos.
        // [] -- Arrays
        // () -- Definen bloques y permiten establaecer una prioridad.

    }   
}
