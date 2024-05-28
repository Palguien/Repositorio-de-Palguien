CREATE USER c##alumnos IDENTIFIED BY alumnos;
GRANT ALL PRIVILEGES TO c##alumnos;

CONNECT c##alumnos/alumnos;

CREATE TABLE Alumnos (
num NUMBER PRIMARY KEY,
nombre VARCHAR2(30),
fnac DATE,
media NUMBER(4,2),
curso VARCHAR2(2));


alter session set nls_date_format='yyyy-mm-dd';

INSERT INTO Alumnos VALUES 
(1, 'Antonio Arroz', '2010-01-01', 5.1, '1A');
INSERT INTO Alumnos VALUES
(2, 'Bea Boniato', '2009-02-02', 6.75, '1B');
INSERT INTO Alumnos VALUES
(3, 'Cristina Cristal', '2009-03-03', 7.23, '1B');
INSERT INTO Alumnos VALUES
(4, 'David Dado', '2009-04-04', 8.5, '1B');
INSERT INTO Alumnos VALUES
(5, 'Ernesto Escarola', '2008-05-05', 9.0, '2A');
INSERT INTO Alumnos VALUES
(6, 'Francisco Frio', '2008-06-06', 9.5, '2A');
INSERT INTO Alumnos VALUES
(7, 'Gema Gato', '2008-07-07', 9.99, '2A');
INSERT INTO Alumnos VALUES
(8, 'Helena Huerto', '2007-08-08', 10, '2A');
INSERT INTO Alumnos VALUES
(9, 'Irene Idea', '2007-09-09', 5.45, '2B');
INSERT INTO Alumnos VALUES
(10, 'Julia Jarra', '2007-10-10', 6.66, '2B');
INSERT INTO Alumnos VALUES
(11, 'Kika Kenya', '2006-11-11', 7.77, '2B');
INSERT INTO Alumnos VALUES
(12, 'Luna Lima', '2006-12-12', 8.88, '2B');

