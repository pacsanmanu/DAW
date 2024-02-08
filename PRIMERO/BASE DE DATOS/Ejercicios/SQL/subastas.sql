CREATE DATABASE IF NOT EXISTS subastas;

USE SUBASTAS;

DROP TABLE IF EXISTS LOTE;

CREATE TABLE LOTE (
    Catnum char(6) PRIMARY KEY,
    Salida datetime NOT NULL,
    Pujamax decimal(10,2) NOT NULL,
    Tiempo time DEFAULT CURRENT_TIMESTAMP
    );

DROP TABLE IF EXISTS CLIENTE;

CREATE TABLE CLIENTE (
    Usuario varchar(25) PRIMARY KEY,
    Email varchar(30) NOT NULL,
    Nombre varchar(25) NOT NULL,
    Clave varchar(30) NOT NULL
    );

DROP TABLE IF EXISTS PRODUCTO;

CREATE TABLE PRODUCTO(
    Codigo char(6) PRIMARY KEY,
    Nombre varchar(20) NOT NULL,
    Descripcion text DEFAULT NULL,
    Foto varchar(15) NOT NULL,
    Catnum char(6) NOT NULL,
	CONSTRAINT FK_1 FOREIGN KEY (Catnum) REFERENCES LOTE (Catnum)
    );

DROP TABLE IF EXISTS PUJA;

CREATE TABLE PUJA(
    Catnum char(6) NOT NULL,
    Usuario varchar(25) NOT NULL,
    Dia date NOT NULL,
    Hora time NOT NULL,
    Cantidad integer(15) NOT NULL,
	CONSTRAINT PK_1 PRIMARY KEY (Catnum, Usuario)
    );