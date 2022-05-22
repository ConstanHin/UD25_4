DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

create table peliculas(
	codigo int PRIMARY KEY,
	nombre varchar(100),
	calificacion_edad int
	);
create table salas (
	codigo int PRIMARY KEY,
	nombre varchar(100),
	pelicula_id int,
	CONSTRAINT pelicula_fk FOREIGN KEY(pelicula_id) REFERENCES peliculas(codigo) ON DELETE CASCADE ON UPDATE CASCADE);

insert into peliculas (codigo, nombre, calificacion_edad) values (1, 'Baterman', 18);
insert into peliculas (codigo, nombre, calificacion_edad) values (2, 'El transpasable', 18);
insert into peliculas (codigo, nombre, calificacion_edad) values (3, 'Sopaman', 16);

insert into salas (codigo, nombre, pelicula_id) values (1, 'A1', 3);
insert into salas (codigo, nombre, pelicula_id) values (2, 'A2', 1);
insert into salas (codigo, nombre, pelicula_id) values (3, 'A3', 2);