DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

create table peliculas(
	id int PRIMARY KEY,
	nombre varchar(100)
	);
create table salas (
	id int PRIMARY KEY,
	nombre varchar(100),
	pelicula_id int,
	CONSTRAINT pelicula_fk FOREIGN KEY(pelicula_id) REFERENCES peliculas(id) ON DELETE CASCADE ON UPDATE CASCADE);

insert into peliculas (id, nombre) values (1, 'Baterman');
insert into peliculas (id, nombre) values (2, 'El transpasable');
insert into peliculas (id, nombre) values (3, 'Sopaman');

insert into salas (id, nombre, pelicula_id) values (1, 'A1', 3);
insert into salas (id, nombre, pelicula_id) values (2, 'A2', 1);
insert into salas (id, nombre, pelicula_id) values (3, 'A3', 2);
