/* Ejercicio 1: Procedimiento que muestre enfermos que nacieron entre 2 fechas pasándoselas por parámetros*/
DROP PROCEDURE IF EXISTS ejemplo1;
DELIMITER $$
CREATE PROCEDURE ejemplo1(IN fecha1 date, IN fecha2 date)
BEGIN
    SELECT ENFERMO.* FROM ENFERMO WHERE FECHA_NAC>=fecha1 AND FECHA_NAC<=fecha2;
END $$
DELIMITER ;

/* Para llamar al procedimiento */
call ejemplo1("1940-01-01", "1960-01-01");

/* Ejercicio 2: Crea un procedimiento que muestre el nombre de un enfermo dado su codigo (pasado por parámetro). */
DROP PROCEDURE IF EXISTS ejemplo2;
DELIMITER $$
CREATE PROCEDURE ejemplo2(IN codigo INTEGER(5))
BEGIN
    SELECT ENFERMO.NOMBRE FROM ENFERMO WHERE ENFERMO.INSCRIPCION=codigo;
END $$
DELIMITER ;

/* Para llamar al procedimiento */
call ejemplo2(10995);

/* Crea una FUNCION que devuelva la letra del dni. Como parámetro de entrada le pasaremos a la Función el número del DNI */
DROP FUNCTION IF EXISTS letraDNI;
DELIMITER $$
CREATE FUNCTION letraDNI(dni INT)
RETURNS CHAR(1)
BEGIN
    DECLARE resto INT;
    DECLARE abc CHAR(23);
    DECLARE letra CHAR(1);
    SET abc = 'TRWAGMYFPDXBNJZSQVHLCKE';

    SET resto = dni%23;
    SET letra = SUBSTR(abc, resto+1, 1);

    RETURN letra;
END $$
DELIMITER ;

SELECT letraDNI(31021037);

/* Crea una FUNCION que muestre el nombre de un enfermo dado su codigo de inscripción o INSCRIPCION (pasado por parámetro). */
DROP FUNCTION IF EXISTS nombreEnfermo;
DELIMITER $$
CREATE FUNCTION nombreEnfermo(inscripcion INT)
RETURNS CHAR(20)
BEGIN
    DECLARE nombre CHAR(20);
    SET nombre = (SELECT ENFERMO.NOMBRE FROM ENFERMO WHERE ENFERMO.INSCRIPCION = inscripcion);
    RETURN nombre;
END $$
DELIMITER ;

SELECT nombreEnfermo(10995);

/* Escribe una función que devuelva el valor de la hipotenusa de un triángulo a partir de los valores de sus lados. */
DROP FUNCTION IF EXISTS hipotenusa;
DELIMITER $$
CREATE FUNCTION hipotenusa(lado1 INT, lado2 INT)
RETURNS REAL
BEGIN
    DECLARE hipotenusa REAL;
    SET hipotenusa = SQRT(POWER(lado1, 2)+POWER(lado2, 2));
    RETURN hipotenusa;
END $$
DELIMITER ;

SELECT hipotenusa(5, 4);

/* Que coincida la letra del NIF que pasamos con la generada */
DROP FUNCTION IF EXISTS comprobarDNI;
DELIMITER $$
CREATE FUNCTION comprobarDNI(dni INT, letra CHAR(1))
RETURNS BOOLEAN
BEGIN
    DECLARE resto INT;
    DECLARE abc CHAR(23);
    DECLARE letraGenerada CHAR(1);
    SET abc = 'TRWAGMYFPDXBNJZSQVHLCKE';

    SET resto = dni%23;
    SET letraGenerada = SUBSTR(abc, resto+1, 1);

    IF letraGenerada = letra THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
END $$
DELIMITER ;

SELECT comprobarDNI(31021037, 'V');

/* "Crea una FUNCION que devuelva la letra del NIE. Como parámetro de entrada le pasaremos a la Función la letra inicial del NIE  (X, Y ó Z) y los siguientes 7 siete dígitos." */

DROP FUNCTION IF EXISTS comprobarNIE;
DELIMITER $$
CREATE FUNCTION comprobarNIE(nie INT, letra CHAR(1))
RETURNS CHAR(1)
BEGIN
    DECLARE nie_con_letra VARCHAR(9);
    DECLARE resto INT;
    DECLARE abc CHAR(23);
    DECLARE letraGenerada CHAR(1);

    CASE letra
        WHEN 'X' THEN SET nie_con_letra = CONCAT('0', nie);
        WHEN 'Y' THEN SET nie_con_letra = CONCAT('1', nie);
        WHEN 'Z' THEN SET nie_con_letra = CONCAT('2', nie);
    END CASE;

    SET abc = 'TRWAGMYFPDXBNJZSQVHLCKE';
    SET resto = CAST(nie_con_letra AS UNSIGNED) % 23;
    SET letraGenerada = SUBSTR(abc, resto + 1, 1);

    RETURN letraGenerada;
END $$
DELIMITER ;

SELECT comprobarNIE(4527393, 'Y');

/* Generar 2 valores aleatorios entre 0 y 10 y que sean diferentes entre si */

DELIMITER $$
CREATE PROCEDURE numerosAleatorios()
BEGIN
    DECLARE numero1 INT;
    DECLARE numero2 INT;

    SET numero1 = FLOOR(11 * RAND());
    REPEAT
        SET numero2 = FLOOR(11 * RAND());
    UNTIL numero2 != numero1 END REPEAT;

    SELECT numero1, numero2;
END $$
DELIMITER ;

/* Funcion que devuelva el factorial de un numero */

DROP FUNCTION IF EXISTS factorial;
DELIMITER $$
CREATE FUNCTION factorial(numero INT)
RETURNS INT
BEGIN
    DECLARE aux INT;
    SET aux = numero;
    
    WHILE numero > 1 DO
        SET aux = aux * (numero - 1);
        SET numero = numero - 1;
    END WHILE;

    RETURN aux;
END $$
DELIMITER ;

/* Funciones de la base de datos tienda */

/* 1. Escribe una FUNCIÓN para la base de datos tienda que devuelva el número total de productos que hay en la tabla productos. */

DROP FUNCTION IF EXISTS numeroTotalProductos;
DELIMITER $$
CREATE FUNCTION numeroTotalProductos()
RETURNS INT
BEGIN
    DECLARE total INT;
    SET total = (SELECT COUNT(*) FROM PRODUCTO);
    RETURN total;
END $$
DELIMITER ;

/* 2. Escribe una FUNCIÓN para la base de datos tienda que devuelva el valor medio del precio de los productos de un determinado fabricante que se recibirá como parámetro de entrada. El parámetro de entrada será el nombre del fabricante. */

DROP FUNCTION IF EXISTS precioMedioProductos;
DELIMITER $$
CREATE FUNCTION precioMedioProductos(nombreFabricante VARCHAR(25))
RETURNS DOUBLE
BEGIN
    DECLARE precioMedio DOUBLE;
    SET precioMedio = (SELECT AVG(PRODUCTO.PRECIO) FROM PRODUCTO INNER JOIN FABRICANTE ON PRODUCTO.ID_FABRICANTE = FABRICANTE.ID WHERE FABRICANTE.NOMBRE = nombreFabricante);
    RETURN precioMedio;
END $$
DELIMITER ;

/* 3. Escribe una FUNCIÓN para la base de datos tienda que devuelva el valor máximo del precio de los productos de un determinado fabricante que se recibirá como parámetro de entrada. El parámetro de entrada será el nombre del fabricante. */

DROP FUNCTION IF EXISTS precioMaximo;
DELIMITER $$
CREATE FUNCTION precioMaximo(nombreFabricante VARCHAR(25))
RETURNS DOUBLE
BEGIN
    DECLARE precioMaximo DOUBLE;
    SET precioMaximo = (SELECT MAX(PRODUCTO.PRECIO) FROM PRODUCTO INNER JOIN FABRICANTE ON PRODUCTO.ID_FABRICANTE = FABRICANTE.ID WHERE FABRICANTE.NOMBRE = nombreFabricante);
    RETURN precioMaximo;
END $$
DELIMITER ;

/* 4. Escribe una FUNCIÓN para la base de datos tienda que devuelva el valor mínimo del precio de los productos de un determinado fabricante que se recibirá como parámetro de entrada. El parámetro de entrada será el nombre del fabricante. */

DROP FUNCTION IF EXISTS precioMinimo;
DELIMITER $$
CREATE FUNCTION precioMinimo(nombreFabricante VARCHAR(25))
RETURNS DOUBLE
BEGIN
    DECLARE precioMinimo DOUBLE;
    SET precioMinimo = (SELECT MIN(PRODUCTO.PRECIO) FROM PRODUCTO INNER JOIN FABRICANTE ON PRODUCTO.ID_FABRICANTE = FABRICANTE.ID WHERE FABRICANTE.NOMBRE = nombreFabricante);
    RETURN precioMinimo;
END $$
DELIMITER ;