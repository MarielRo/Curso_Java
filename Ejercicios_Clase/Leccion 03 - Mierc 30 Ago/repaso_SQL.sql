CREATE DATABASE repaso_SQL;
GO

USE repaso_SQL;
GO

--DROP DATABASE repaso_SQL

----------------------------------------------------------------------------------------
--PROFESORES
CREATE TABLE PROFESORES(
ID_PROFESOR INT IDENTITY CONSTRAINT PK_PROFESOR PRIMARY KEY,
NOMBRE VARCHAR(50) NOT NULL,
APELLIDO  VARCHAR(50) NOT NULL,
DIRECCION VARCHAR(150) NOT NULL,
PROVINCIA  VARCHAR(20) NOT NULL DEFAULT ('ALAJUELA'),
FECHA DATETIME DEFAULT GETDATE()
);

ALTER TABLE PROFESORES 
ADD CONSTRAINT CK_PROVINCIAS CHECK(PROVINCIA IN ('ALAJUELA','SAN JOSE','PUNTARENAS',
												'LIMÓN', 'GUANACASTE', 'CARTAGO', 'HEREDIA'))
----------------------------------------------------------------------------------------------

--ESTUDIANTES

CREATE TABLE ESTUDIANTES(
ID_ESTUDIANTE INT IDENTITY(100,1) CONSTRAINT PK_ESTUDIANTE PRIMARY KEY,
NOMBRE VARCHAR(50) NOT NULL,
APELLIDO VARCHAR(50) NOT NULL,
DIRECCION VARCHAR(150) NOT NULL,
EDAD INT NOT NULL DEFAULT 10
);

ALTER TABLE ESTUDIANTES
ADD CONSTRAINT CK_EDAD CHECK(EDAD >= 10 AND EDAD <=50) --(Edad BETWEEN 10 AND 50)

-----------------------------------------------------------------------------------------------------

--MATERIAS
CREATE TABLE MATERIAS(
ID_ESTUDIANTE INT NOT NULL, -- FK
ID_PROFESOR INT NOT NULL, --FK
NOMBRE_MATERIA VARCHAR(50) NOT NULL,
DIAS_LECTIVOS CHAR NOT NULL,
PRIMARY KEY(ID_ESTUDIANTE,ID_PROFESOR),
CONSTRAINT FK_ID_PROFESOR  FOREIGN KEY (ID_PROFESOR) REFERENCES PROFESORES(ID_PROFESOR) -- una forma sin el alter table/relación entre profesores y materias.
);

-----------------------------------------------------------------------------------------------------------------------------
-- CONSULTAS
-- Agregue una relación entre estudiantes y materias.
-- forma con el alter
ALTER TABLE MATERIAS 
ADD CONSTRAINT FK_ID_ESTUDIANTE FOREIGN KEY (ID_ESTUDIANTE)
REFERENCES ESTUDIANTES(ID_ESTUDIANTE);

ALTER TABLE MATERIAS
ADD CONSTRAINT CK_DIAS_LECTIVOS CHECK (DIAS_LECTIVOS IN('L','K','M','J','V' ));

--Agregue el campo teléfono a la tabla estudiantes este debe tener 50 caracteres.

ALTER TABLE ESTUDIANTES 
ADD TELEFONO VARCHAR(50) NOT NULL;

--Modifique el campo teléfono agregado anteriormente para que permita 90 caracteres. 
ALTER TABLE ESTUDIANTES 
ALTER COLUMN TELEFONO VARCHAR(90);


--Escriba la instrucción para eliminar todos los registros de la tabla estudiantes. 
DELETE FROM  ESTUDIANTES;

--Agregue 4 registros a la tabla ESTUDIANTES

INSERT INTO ESTUDIANTES(NOMBRE, APELLIDO, DIRECCION, EDAD, TELEFONO)
VALUES
    ('Ana', 'García', 'Calle 123, San José', 20,'12345678'),
    ('Juan', 'Pérez', 'Avenida 456, Alajuela', 22,'78945612'),
    ('María', 'López', 'Calle 789, Heredia', 19,'45612378'),
    ('Carlos', 'Martínez', 'Avenida 234, Cartago', 11,'98745632');

SELECT * FROM ESTUDIANTES

--Cree un cursor que cargue los datos del primer estudiante,  puede mostrarlo con FETCH NEXT FROM nombre del cursor.

--1 SE DECLARA
DECLARE PrimerEstudiante CURSOR
FOR SELECT * FROM ESTUDIANTES;

-- 2 APERTURA DEL CURSOR
OPEN  PrimerEstudiante;

--3 NAVEGA POR EL CURSOR
FETCH NEXT FROM  PrimerEstudiante;

-- 4 CERRAR
CLOSE  PrimerEstudiante;
--5 LIBERAR
DEALLOCATE  PrimerEstudiante;


-----------------------------------------------------------------------
--Cree un cursor que cargue los datos de los estudiantes y muestre mediante un ciclo sólo el nombre. 
-- SOLO NOMBRES
-- DECLARACION DE VARIABLES
DECLARE @nombre varchar(50);

--1 SE DECLARA CURSOR
DECLARE DatosEstudiantes CURSOR
FOR SELECT NOMBRE FROM ESTUDIANTES;

-- 2 APERTURA DEL CURSOR
OPEN  DatosEstudiantes;

--3 NAVEGA POR EL CURSOR
FETCH NEXT FROM  DatosEstudiantes into @nombre;

WHILE @@FETCH_STATUS = 0
BEGIN
	PRINT '---------------------'
    PRINT 'NOMBRE:  ' + @nombre;
    FETCH NEXT FROM DatosEstudiantes INTO @Nombre;
END;

-- 4 CERRAR
CLOSE  DatosEstudiantes;
--5 LIBERAR
DEALLOCATE  DatosEstudiantes;


------------------------------------------------------------------------------------------------------------------------------
--Crear un procedimiento almacenado que cuente la cantidad de estudiantes mayores de edad.
GO;

CREATE PROCEDURE CONTAR_EDAD
AS
  BEGIN
	DECLARE @cantidad_estu INT;

	SELECT @cantidad_estu = COUNT(EDAD) FROM ESTUDIANTES WHERE EDAD >= 18;
	PRINT 'Hay ' +  CAST(@cantidad_estu AS VARCHAR(10))  + '  Estudiantes mayores de Edad';
  END;


  -- SE EJECUTA EL PROCEDIMIENTO

  EXEC CONTAR_EDAD