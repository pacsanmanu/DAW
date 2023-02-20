SELECT EMPLEADO.EMP_NO, EMPLEADO.NOMBRE, DEPARTAMENTO.DNOM
FROM EMPLEADO INNER JOIN DEPARTAMENTO
ON EMPLEADO.DEPT_NO = DEPARTAMENTO.DEPT_NO
WHERE EMPLEADO.CARGO = "DIRECTOR"
ORDER BY EMPLEADO.NOMBRE;

SELECT DEPARTAMENTO.DEPT_NO AS DEPT, DEPARTAMENTO.DNOM AS NOMBRE, SUM(EMPLEADO.SALARIO) AS NOMINATOTAL
FROM DEPARTAMENTO LEFT JOIN EMPLEADO
ON EMPLEADO.DEPT_NO = DEPARTAMENTO.DEPT_NO
GROUP BY DEPARTAMENTO.DEPT_NO
ORDER BY NOMINATOTAL DESC;

SELECT CLIENTE.CLIENTE_CODIGO AS CLIENTE, CLIENTE.NOMBRE AS NOMBRE, PEDIDO.PEDIDO_FECHA AS F_PEDIDO, PEDIDO.TOTAL AS IMPORTE
FROM CLIENTE RIGHT JOIN PEDIDO
ON CLIENTE.CLIENTE_CODIGO = PEDIDO.CLIENTE_CODIGO
ORDER BY PEDIDO.CLIENTE_CODIGO, PEDIDO.PEDIDO_FECHA;

SELECT DETALLE.PEDIDO_NUMERO AS PEDIDO, DETALLE.DETALLE_NUMERO AS LINEA, PRODUCTO.DESCRIPCION AS PRODUCTO, DETALLE.PRECIO_VENTA AS PRECIO, DETALLE.CANTIDAD AS CANTIDAD, DETALLE.IMPORTE AS IMPORTE
FROM DETALLE RIGHT JOIN PRODUCTO
ON DETALLE.PRODUCTO_NUMERO = PRODUCTO.PRODUCTO_NUMERO
WHERE DETALLE.PEDIDO_NUMERO = 617;

SELECT NOMBRE, CARGO, SALARIO FROM EMPLEADO
WHERE SALARIO > (SELECT AVG(SALARIO) FROM EMPLEADO);



SELECT CLIENTES.NOMBRE AS NOMBRE, CLIENTES.APELLIDO AS APELLIDO_1, CLIENTES.APELLIDO2 AS APELLIDO_2, POBLACIONES.POBLACION AS NOMBRE, CALLESPOBLACIONES.CODPOSTAL AS CP, PROVINCIAS.PROVINCIA AS PROVINCIA
FROM CLIENTES INNER JOIN CALLESPOBLACIONES ON CLIENTES.CALLE = CALLESPOBLACIONES.IDCALLE
INNER JOIN POBLACIONES ON CALLESPOBLACIONES.CODPOBLACION = POBLACIONES.CODIGOPOBLACION
INNER JOIN PROVINCIAS ON POBLACIONES.CODIGOPROVINCIA = PROVINCIAS.CODIGOPROVINCIA
WHERE POBLACIONES.POBLACION = "VIVEIRO"
ORDER BY CLIENTES.NOMBRE;

SELECT POBLACIONES.POBLACION, PROVINCIAS.PROVINCIA, MAX(CLIENTES.METROS) AS METROS
FROM CLIENTES INNER JOIN CALLESPOBLACIONES ON CLIENTES.CALLE = CALLESPOBLACIONES.IDCALLE
INNER JOIN POBLACIONES ON CALLESPOBLACIONES.CODPOBLACION = POBLACIONES.CODIGOPOBLACION
INNER JOIN PROVINCIAS ON POBLACIONES.CODIGOPROVINCIA = PROVINCIAS.CODIGOPROVINCIA;

SELECT AVG(CLIENTES.METROS) AS MEDIAM2, COUNT(CLIENTES.PISO) AS NPISOS FROM CLIENTES
WHERE CLIENTES.METROS > (SELECT AVG(CLIENTES.METROS) FROM CLIENTES);

SELECT PROVINCIAS.PROVINCIA, SUM(POBLACIONES.HABITANTES) AS HABITANTES
FROM PROVINCIAS INNER JOIN POBLACIONES
ON POBLACIONES.CODIGOPROVINCIA = PROVINCIAS.CODIGOPROVINCIA
GROUP BY PROVINCIAS.PROVINCIA;

SELECT CLIENTES.APELLIDO, COUNT(CLIENTES.APELLIDO) AS NUMERO FROM CLIENTES
GROUP BY CLIENTES.APELLIDO ORDER BY NUMERO DESC LIMIT 3;