CREATE VIEW LISTADO_PAGOS_CLIENTES AS
SELECT CONCAT(CLIENTE.NOMBRE_CONTACTO, " ", CLIENTE.APELLIDO_CONTACTO) AS NOMBRE_CLIENTE, CLIENTE.TELEFONO, CLIENTE.CIUDAD, CLIENTE.PAIS, PAGO.FECHA_PAGO, PAGO.TOTAL, PAGO.ID_TRANSACCION
FROM CLIENTE INNER JOIN PAGO
ON CLIENTE.CODIGO_CLIENTE = PAGO.CODIGO_CLIENTE;

CREATE VIEW LISTADO_PEDIDOS_CLIENTES AS
SELECT CONCAT(CLIENTE.NOMBRE_CONTACTO, " ", CLIENTE.APELLIDO_CONTACTO) AS NOMBRE_CLIENTE, CLIENTE.TELEFONO, CLIENTE.CIUDAD, CLIENTE.PAIS, PEDIDO.CODIGO_PEDIDO, PEDIDO.FECHA_PEDIDO, PEDIDO.FECHA_ESPERADA, PEDIDO.FECHA_ENTREGA, SUM(DETALLE_PEDIDO.CANTIDAD * DETALLE_PEDIDO.PRECIO_UNIDAD) AS CANTIDAD_TOTAL
FROM CLIENTE INNER JOIN PEDIDO
ON CLIENTE.CODIGO_CLIENTE = PEDIDO.CODIGO_CLIENTE INNER JOIN DETALLE_PEDIDO
ON PEDIDO.CODIGO_PEDIDO = DETALLE_PEDIDO.CODIGO_PEDIDO
GROUP BY PEDIDO.CODIGO_PEDIDO;

SELECT * FROM LISTADO_PAGOS_CLIENTES WHERE CIUDAD = "MADRID" && TOTAL != 0;

SELECT * FROM LISTADO_PEDIDOS_CLIENTES WHERE FECHA_ENTREGA IS NULL;
SELECT NOMBRE_CLIENTE, COUNT(CODIGO_PEDIDO) AS NUMERO_PEDIDOS FROM LISTADO_PEDIDOS_CLIENTES GROUP BY NOMBRE_CLIENTE;

SELECT NOMBRE_CLIENTE, MIN(CANTIDAD_TOTAL) AS PEDIDO_MINIMO, MAX(CANTIDAD_TOTAL) AS PEDIDO_MAXIMO FROM LISTADO_PEDIDOS_CLIENTES
GROUP BY NOMBRE_CLIENTE;

RENAME TABLE LISTADO_PAGOS_CLIENTES TO LISTADO_DE_PAGOS;