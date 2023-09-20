-- 1. Nombre de los ciclistas que no pertenezcan al equipo Kelme

SELECT NOMBRE FROM CICLISTA WHERE NOMEQ != 'KELME';

-- 2. Edad media de los ciclistas del equipo TVM

SELECT AVG(EDAD) FROM CICLISTA WHERE NOMEQ = 'TVM';

-- 3. Nombre de los ciclistas que pertenezcan al mismo equipo que Miguel Indurain

SELECT NOMBRE FROM CICLISTA WHERE NOMEQ = (SELECT NOMEQ FROM CICLISTA WHERE NOMBRE = 'MIGUEL INDURAIN');

-- 4. Obtener el nombre y el director de los equipos a los que pertenezca algún ciclista mayor de 33 años.

SELECT DISTINCT EQUIPO.NOMEQ, EQUIPO.DIRECTOR 
FROM EQUIPO INNER JOIN CICLISTA
ON EQUIPO.NOMEQ = CICLISTA.NOMEQ
WHERE CICLISTA.EDAD > 33;

-- 5. Obtener los ciclistas que no ham ganado ningun puerto.

SELECT CICLISTA.NOMBRE FROM CICLISTA
WHERE CICLISTA.DORSAL NOT IN (
    SELECT PUERTO.DORSAL FROM PUERTO
);

-- 6. Nombre del equipo y edad media de los ciclistas de cada equipo

SELECT NOMEQ, AVG(EDAD) FROM CICLISTA
GROUP BY NOMEQ;

-- 7. Nombre del equipo con edad media menor a 30 años.

SELECT NOMEQ, AVG(EDAD) AS EDAD_MEDIA FROM CICLISTA
GROUP BY NOMEQ
HAVING EDAD_MEDIA < 30;

-- 8. Obtener el ciclista mas joven

SELECT NOMBRE, EDAD FROM CICLISTA
ORDER BY EDAD LIMIT 1;