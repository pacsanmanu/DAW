-- 1 Obten  el nombre de aquellos ciclistas que tengan una edad entre 25 y 30 años y que no pertenezcan a los equipos Kelme y Banesto.

SELECT NOMBRE FROM CICLISTA
WHERE (EDAD BETWEEN 25 AND 30) AND NOMEQ NOT IN ("KELME", "BANESTO");

-- 2 Obtener el nombre del equipo y número de ciclistas tiene cada uno de ellos

SELECT COUNT(*) AS NUMERO_CICLISTAS, NOMEQ AS NOMBRE_EQUIPO FROM CICLISTA
GROUP BY NOMEQ;

-- 3 Obtener los nombres de los ciclistas que pertenezcan al mismo equipo que Miguel Indurain

SELECT NOMBRE FROM CICLISTA 
WHERE NOMEQ = (SELECT NOMEQ FROM CICLISTA WHERE NOMBRE = 'MIGUEL INDURAIN');

-- 4 Obtener las poblaciones de salida, la de llegada y la altura del puerto/s de las etapas donde se encuentran puertos con altura superior a 1300 metros

SELECT ETAPA.SALIDA, ETAPA.LLEGADA, PUERTO.ALTURA FROM ETAPA
INNER JOIN PUERTO ON ETAPA.NETAPA = PUERTO.NETAPA
WHERE PUERTO.ALTURA > 1300;

-- 5 ¿Quien ganó la etapa más larga? Obten el nombre del ciclista y el lugar de salida y llegada de la etapa.

SELECT CICLISTA.NOMBRE, ETAPA.SALIDA, ETAPA.LLEGADA FROM CICLISTA
INNER JOIN ETAPA ON CICLISTA.DORSAL = ETAPA.DORSAL
WHERE ETAPA.KM = (SELECT MAX(ETAPA.KM) FROM ETAPA);

-- 6 Obtener el nombre de los ciclistas  que no hayan ganado ninguna etapa

SELECT CICLISTA.NOMBRE FROM CICLISTA
WHERE CICLISTA.DORSAL NOT IN (
    SELECT ETAPA.DORSAL FROM ETAPA
);

-- 7 Obten  el nombre de los Ciclistas y en nº de la Etapas que han ganado.

-- 8 Selecciona el nombre de los puertos con una altura superior a la altura media de todos los puertos.

SELECT NOMPUERTO AS NOMBRE_PUERTO FROM PUERTO
WHERE ALTURA > (SELECT AVG(ALTURA) FROM PUERTO);

-- 9 Obtener el nombre del puerto con una mayor altura. No puedes usar la clausula LIMIT.

SELECT NOMPUERTO, ALTURA FROM PUERTO
WHERE ALTURA = (SELECT MAX(ALTURA) FROM PUERTO);

-- 10 Obten las etapas (netapa, km, salida y llegada) de aquellas que tienen más de 200 km de recorrido

SELECT NETAPA, KM, SALIDA, LLEGADA FROM ETAPA
WHERE KM > 200;