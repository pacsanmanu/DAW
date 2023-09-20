CREATE TABLE Futbolista (
    NIF VARCHAR(9) PRIMARY KEY,
    Nombre VARCHAR(25),
    Apellido VARCHAR(20),
    AñoNacimiento YEAR NOT NULL,
    Nacionalidad VARCHAR(20) NOT NULL
);

CREATE TABLE Club (
    IdClub INT PRIMARY KEY,
    Nombre VARCHAR(30) NOT NULL,
    AnyoCreacion YEAR NOT NULL,
    NombreEstadio VARCHAR(30) NOT NULL
);

CREATE TABLE juega (
    NIF_futbolista VARCHAR(9),
    IdClub INT,
    Temporada VARCHAR(9),
    PRIMARY KEY (NIF_futbolista, IdClub),
    FOREIGN KEY (NIF_futbolista) REFERENCES Futbolista(NIF),
    FOREIGN KEY (IdClub) REFERENCES Club(IdClub)
);