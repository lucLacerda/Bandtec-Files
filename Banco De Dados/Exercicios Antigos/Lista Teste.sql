-- drop database bandtec --

create database Bandtec;
use Bandtec;

create table Faculdade (
id int primary key auto_increment,
nome varchar(20),
idade decimal not null,
time varchar(40)
);

alter table Faculdade auto_increment = 1;

select * from Faculdade;

insert into Faculdade (nome, idade, time)
values 
("Rafael", 18, "Palmeiras"), ("Lucas", 20, "São Paulo"), ("Júlia", 20, "São Paulo"), ("Pedro", 43, "São Paulo"),
("Victor", 46, "Corinthians"), ("Gabriela", 12, "Palmeiras"), ("Beatriz", 34, "Corinthians"), ("Wilson", 19, "Flamengo"),
("Jorge", 26, "Fortaleza"), ("Kaique", 64, "Santos"), ("Afonso", 54, "Santos"), ("Matheus", 23, "Gremio");

select * from Faculdade;

update Faculdade 
set idade = 20
where id = 4;

select * from Faculdade order by nome;

insert into Faculdade (nome, idade, time)
values
("Felipe", 28, "São Paulo"),
("Rogerio", 23, "Fluminense"),
("Karina", 15, "Atletico Goianiense"),
("Wesley", 25, "Botafogo"),
("Hanna", 21, "Internacional"),
("Vinicius", 23, "Cruzeiro");

select * from Faculdade order by nome asc;

update Faculdade
set id = 90
where id = 12;