DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

create table peliculas(
	id int PRIMARY KEY,
	nombre varchar(100),
	calificacion_edad int,
	codigo int
	);
create table salas (
	id int PRIMARY KEY,
	nombre varchar(100),
	pelicula_id int,
	CONSTRAINT pelicula_fk FOREIGN KEY(pelicula_id) REFERENCES peliculas(id) ON DELETE CASCADE ON UPDATE CASCADE);

insert into peliculas (id, nombre, calificacion_edad, codigo) values (1, 'Baterman', 18, 564);
insert into peliculas (id, nombre, calificacion_edad, codigo) values (2, 'El transpasable', 18, 54);
insert into peliculas (id, nombre, calificacion_edad, codigo) values (3, 'Sopaman', 18, 2312);

insert into salas (id, nombre, pelicula_id) values (1, 'A1', 3);
insert into salas (id, nombre, pelicula_id) values (2, 'A2', 1);
insert into salas (id, nombre, pelicula_id) values (3, 'A3', 2);
