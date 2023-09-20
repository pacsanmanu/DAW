create DATABASE if not EXISTS CINE;

USE CINE;

DROP TABLE IF EXISTS IDIOMA;

CREATE TABLE IDIOMA (
    lenguaje_id tinyint(3) PRIMARY KEY,
    nombre char(20) NOT NULL,
    ultima_modificacion timestamp DEFAULT CURRENT_TIMESTAMP);
	
USE CINE;
	
DROP TABLE IF EXISTS PELICULA;

CREATE TABLE PELICULA (
	pelicula_id SMALLINT(5) PRIMARY KEY,
    titulo varchar(128) NOT NULL,
    descripcion text DEFAULT NULL,
    anno_estreno year(4) DEFAULT NULL,
    original_lenguaje_id tinyint(3) NOT NULL ,
    precio_alquiler decimal(4,2) NOT NULL DEFAULT 4.99,
	CONSTRAINT FK_1 FOREIGN KEY (original_lenguaje_id) REFERENCES idioma (lenguaje_id));
   
  
