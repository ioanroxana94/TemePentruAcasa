drop database if exists cinema;

create database cinema;

use cinema;

create table actors(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
name VARCHAR(15) NOT NULL,
first_name VARCHAR(15) NOT NULL,
gender VARCHAR(10) NOT NULL
);

create table directors(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
name VARCHAR (15) NOT NULL,
first_name VARCHAR (15) NOT NULL
);

create table movies(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
title VARCHAR(20) NOT NULL,
year_of_launch INT NOT NULL,
duration INT NOT NULL,
language VARCHAR (15) NOT NULL,
country VARCHAR (20) NOT NULL,
movie_type VARCHAR(20) NOT NULL,
directors_id INT NOT NULL,
CONSTRAINT fk_movies_directors
FOREIGN KEY (directors_id)
REFERENCES directors(id)
);

create table genres(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
movies_id INT NOT NULL,
CONSTRAINT fk_view_genres_movies
FOREIGN KEY(movies_id)
REFERENCES movies(id),
view_type VARCHAR(15) NOT NULL 
);


create table reviewers(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
name VARCHAR (15) NOT NULL,
first_name VARCHAR (15) NOT NULL,
age INT NOT NULL
);

create table ratings(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
reviewer_id INT NOT NULL,
movies_id INT NOT NULL,
number_of_stars INT NOT NULL,
CONSTRAINT fk_rating_reviewers
FOREIGN KEY (reviewer_id)
REFERENCES reviewers(id),
CONSTRAINT fk_ratings_movies
FOREIGN KEY (movies_id)
REFERENCES movies(id)
);

create table movies_cast(
id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
movies_id INT NOT NULL,
actors_id INT NOT NULL,
rol_type VARCHAR(15) NOT NULL,
CONSTRAINT fk_casts_movies
FOREIGN KEY (movies_id)
REFERENCES movies(id),
CONSTRAINT fk_casts_actors
FOREIGN KEY (actors_id)
REFERENCES actors(id)
);

insert into actors
(name, first_name, gender)
values
('Reeves', 'Keanu', 'Male');

insert into actors
(name,first_name, gender)
values
('Hemsworth', 'Chris', 'Male');

insert into actors
(name,first_name, gender)
values
('Downey', 'Robert', 'Male');

insert into actors
(name,first_name, gender)
values
('Neeson', 'Liam', 'Male');

insert into actors
(name, first_name, gender)
values
('Cooper', 'Bradley', 'Male');

insert into actors
(name, first_name, gender)
values
('Clarke', 'Emilia', 'Female');

insert into actors
(name, first_name, gender)
values
('Winnick', 'Katheryn', 'Female');

insert into actors
(name, first_name, gender)
values
('Saldana', 'Zoe', 'Female');

insert into actors
(name, first_name, gender)
values
('Braschu', 'Nicoletta', 'Female');

insert into actors
(name, first_name, gender)
values
('Weaver', 'Sigourney', 'Female');

insert into directors
(name, first_name)
values
('Branagh', 'Kenneth');

insert into directors
(name, first_name)
values
('Waititi', 'Taika');

insert into directors
(name, first_name)
values
('Benioff', 'David');

insert into directors
(name, first_name)
values
('Whedon', 'Joss');

insert into directors
(name, first_name)
values
('Spielberg', 'Steven');

insert into directors
(name, first_name)
values
('Cameron', 'James');

insert into directors
(name, first_name)
values
('Benigni', 'Roberto');

insert into directors
(name, first_name)
values
('Phillips', 'Todd');

insert into directors
(name, first_name)
values
('Ridley', 'Scott');

insert into directors
(name, first_name)
values
('Wachowski', 'Lana');

insert into movies
(title, year_of_launch, duration, language, country, movie_type, directors_id)
values
('Thor', 2011, 155, 'English', 'USA', 'Action', 1);

insert into movies
(title, year_of_launch, duration, language, country, movie_type, directors_id)
values
('Vikings', 2013, 45, 'English', 'USA', 'Action', 2);

insert into movies
(title, year_of_launch, duration, language, country, movie_type, directors_id)
values
('Game of thrones', 2011, 55, 'English', 'USA', 'Adventure, Drama', 3);

insert into movies
(title, year_of_launch, duration, language, country, movie_type, directors_id)
values
('The Avengers', 2012, 143, 'English', 'USA', 'Action', 4);

insert into movies
(title, year_of_launch, duration, language, country, movie_type, directors_id)
values
('Schindlers List', 1993, 195, 'English', 'USA', 'Biography', 5);

insert into movies
(title, year_of_launch, duration, language, country, movie_type, directors_id)
values
('Avatar', 2009, 171, 'English', 'USA', 'Adventure', 6);

insert into movies
(title, year_of_launch, duration, language, country, movie_type, directors_id)
values
('La vita e bella', 1997, 156, 'Italian', 'Italy', 'Comedy', 7);

insert into movies
(title, year_of_launch, duration, language, country, movie_type, directors_id)
values
('The hangover', 2009, 140, 'English', 'USA', 'Comedy',8);

insert into movies
(title, year_of_launch, duration, language, country, movie_type, directors_id)
values
('Alien', 1979, 157, 'English', 'USA', 'Horror', 9);

insert into movies
(title, year_of_launch, duration, language, country, movie_type, directors_id)
values
('Matrix', 1999, 216, 'English', 'USA', 'Action', 10);

insert into genres
(movies_id, view_type)
values
(10, '2D');

insert into genres
(movies_id, view_type)
values
(6, '3D');

insert into genres
(movies_id, view_type)
values
(4, '3D');

insert into genres
(movies_id, view_type)
values
(4, '2D');

insert into genres
(movies_id, view_type)
values
(8, '2D');

insert into genres
(movies_id, view_type)
values
(1, '3D');

insert into genres
(movies_id, view_type)
values
(1, '2D');

insert into genres
(movies_id, view_type)
values
(9, '2D');

insert into genres
(movies_id, view_type)
values
(7, '2D');

insert into genres
(movies_id, view_type)
values
(8, '3D');

insert into reviewers 
(name, first_name, age)
values
('Ioan' , 'Roxana', 25);

insert into reviewers 
(name, first_name, age)
values
('Nastase', 'Eduard', 24);

insert into reviewers 
(name, first_name, age)
values
('Marin', 'Alexandru', 20);

insert into reviewers
(name, first_name, age)
values
('Canevici', 'Marius', 16);

insert into reviewers
(name, first_name, age)
values
('Mihalache', 'Mircea', 47);

insert into reviewers
(name, first_name, age)
values
('Manoliu', 'Roxana', 24);

insert into reviewers
(name, first_name, age)
values
('Ionescu', 'Iulia', 27);

insert into reviewers
(name, first_name, age)
values
('Stefanescu', 'Marius', 35);

insert into reviewers
(name, first_name, age)
values
('Jelescu', 'Carmen', 19);

insert into reviewers
(name, first_name, age)
values
('Buzoianu', 'Vlad', 17);

insert into ratings
(reviewer_id, movies_id, number_of_stars)
values
(1 ,4 , 3);

insert into ratings
(reviewer_id, movies_id, number_of_stars)
values
(3 ,5, 2);

insert into ratings
(reviewer_id, movies_id, number_of_stars)
values
(4 , 9 , 5);

insert into ratings
(reviewer_id, movies_id, number_of_stars)
values
(7, 3, 2);

insert into ratings
(reviewer_id, movies_id, number_of_stars)
values
(2, 2, 1);

insert into ratings
(reviewer_id, movies_id, number_of_stars)
values
(7, 10, 5);

insert into ratings
(reviewer_id, movies_id, number_of_stars)
values
(3, 3, 4);

insert into ratings
(reviewer_id, movies_id, number_of_stars)
values
(6, 6, 4);

insert into ratings
(reviewer_id, movies_id, number_of_stars)
values
(1, 4, 5);

insert into ratings
(reviewer_id, movies_id, number_of_stars)
values
(2, 1, 3);

insert into ratings
(reviewer_id, movies_id, number_of_stars)
values
(10, 10, 4);

insert into movies_cast
(movies_id, actors_id, rol_type)
values
(10, 1, 'main');

insert into movies_cast
(movies_id, actors_id, rol_type)
values
(1, 2, 'main');

insert into movies_cast
(movies_id, actors_id, rol_type)
values
(2, 3, 'main');

insert into movies_cast
(movies_id, actors_id, rol_type)
values
(3, 4, 'main');

insert into movies_cast
(movies_id, actors_id, rol_type)
values 
(4, 5, 'main');

insert into movies_cast
(movies_id, actors_id, rol_type)
values
(5, 6, 'main');

insert into movies_cast
(movies_id, actors_id, rol_type)
values
(6, 7, 'secondary');

insert into movies_cast
(movies_id, actors_id, rol_type)
values
(7, 8, 'secondary');

insert into movies_cast
(movies_id, actors_id, rol_type)
values
(8, 9, 'secondary');

insert into movies_cast
(movies_id, actors_id, rol_type)
values
(9, 10, 'main');

-- sa se afiseze actorii de gen masculin

select first_name, name from actors where gender= 'Male';

-- sa se afiseze actorii de gen feminin

select first_name, name from actors where gender= 'Female';

-- sa se afiseze filmele lansate inainte de 1990

select title, year_of_launch from movies 
where year_of_launch < 1990;

-- sa se afiseze filmele drama si comedie

select title from movies
where movie_type= 'Drama' or movie_type= 'Comedy';

-- sa se afiseze filmele care nu au fost lansate in Romania

select title from movies
where country <> 'Romania';

-- sa se afiseze filmele care au fost regizate de un anumit regizor (Steven Spielberg)

select title, name from movies inner join directors on movies.directors_id = directors.id
where name= 'Spielberg';

-- sa se afiseze filmele care dureaza mai mult de 2 ore

select title from movies
where duration > 120;

-- sa se afiseze cate filme dureaza intre o ora si 2 ore

select title from movies
where duration > 60 and duration < 120;

-- sa se afiseze toti reviewerii mai mari de 18 ani

select first_name, name from reviewers
where age > 18;

-- sa se afiseze cati reviereri mai mici de 18 ani

select count(*) from reviewers
where age < 18;

-- sa se afiseze filmele care au mai mult de 3 stele la rating

select title, number_of_stars from ratings inner join movies on ratings.movies_id= movies.id
where number_of_stars > 3;

-- sa se afiseze cate filme au mai putin de 3 stele

select count(*) from ratings
where number_of_stars < 3;

-- sa se afiseze media de varsta a tuturor reviewerilor

select avg(age) from reviewers;

-- sa se afiseze actorii dintr-un film

select actors_id, title from movies_cast inner join movies on movies_cast.movies_id= movies.id
where title= 'Alien' ;

-- sa se afiseze filmele in care un anumit actor a avut rolul principal

select actors_id, rol_type from movies_cast inner join movies on movies_cast.movies_id= movies.id
where actors_id= 'Clarke' and rol_type= 'main';

-- sa se afiseze filmele de un anumit tip (ex actiune)

select title, movie_type from movies
where movie_type= 'Action';

-- sa se afiseze filmele care nu sunt 3D

select title, view_type from genres inner join movies on genres.movies_id= movies.id
where view_type <> '3D';

-- sa se afiseze filmele drama 2D

select title, movie_type, view_type from genres inner join movies on genres.movies_id= movies.id
where movie_type= 'Drama' and view_type= '2D';

































