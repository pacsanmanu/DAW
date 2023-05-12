ALTER TABLE Futbolista
ADD FilialFCB CHAR(1) NOT NULL CHECK (FilialFCB IN ('S', 'N'));

ALTER TABLE Futbolista
ADD Email VARCHAR(50) UNIQUE,
ADD CONSTRAINT ComprobarEmail CHECK (Email LIKE '%@%');

ALTER TABLE Futbolista
DROP COLUMN Nacionalidad;

ALTER TABLE Club
ADD CapacidadEspectadores INT NOT NULL CHECK (CapacidadEspectadores > 0 AND CapacidadEspectadores < 99999);

CREATE INDEX IndiceNombreApellido ON Futbolista (Nombre, Apellido);

CREATE INDEX IndiceAnyoCreacion ON Club (AnyoCreacion);

ALTER TABLE Futbolista
RENAME TO Jugadora;

DROP TABLE Jugadora;