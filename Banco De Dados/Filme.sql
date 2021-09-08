create database Filme;
use Filme;

create table Filme(
iDFilme int primary key,
Titulo varchar(50),
Genero varchar (70),
Diretor varchar(50)
);

select * from Filme;

insert into Filme (iDFilme, Titulo, Genero, Diretor)
value(01, 'Titanic', 'Drama', 'James Cameron'),
(02, 'Vingadores', 'Ação', 'Anthony Russo');

insert into Filme (iDFilme, Titulo)
value (03, 'Vingadores 2');

insert into Filme (iDFilme, Titulo)
value (04, 'Velozes e Furiosos'),
(05, 'Avatar'), 
(07, 'Homem de Ferro 2'),
(06, 'O Exterminador do Futuro');

select*from Filme;

update Filme
set Diretor = 'James Cameron'
where iDFilme = (5, 6);

select*from Filme;

update Filme
set Genero = 'Ação'
where iDFilme= (2,6);

update Filme
set Diretor = 'Josue Palmeira'
where iDFilme = (2);

update Filme
set Genero = 'Ação'
where iDFilme = (3);

update Filme 
set Diretor = 'Pedro Costa da Silva Bandeira' , Genero = 'Terror'
where iDFilme = (3);

update Filme 
set Diretor = 'Augusto Ribeiro Gomes' , Genero = 'Aventura'
where iDFilme = (7);

update Filme 
set Diretor = 'Samuel Antonio' , Genero = 'Romance'
where iDFilme = (8);

update Filme 
set Genero = 'Comedia'
where iDFilme = (10);

select*from Filme;

delete from Filme where ID in (5, 6, 11);

alter table Filme add column Ano varchar(5);

select*from Filme;

alter table Filme modify column Titulo varchar(50);

desc Filme;

alter table Filme drop column Ano;



