DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

create table peliculas(
	codigo int PRIMARY KEY,
	nombre varchar(100)
	);
create table salas (
	codigo int PRIMARY KEY,
	nombre varchar(100),
	pelicula_codigo int,
	CONSTRAINT pelicula_fk FOREIGN KEY(pelicula_codigo) REFERENCES peliculas(codigo));

insert into peliculas (codigo, nombre) values (1, 'Baterman');
insert into peliculas (codigo, nombre) values (2, 'El transparente');
insert into peliculas (codigo, nombre) values (3, 'Sopa Agridulce');

insert into salas (codigo, nombre, pelicula_codigo) values (1, 'A1', 3);
insert into salas (codigo, nombre, pelicula_codigo) values (2, 'A2', 1);
insert into salas (codigo, nombre, pelicula_codigo) values (3, 'A3', 2);
