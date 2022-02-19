-- Exercicios Reforço -- 
create database SuperFacul;
use SuperFacul;

-- 1 --
create table Empresa ( 
idEmpresa int primary key,
nomeEmpresa varchar(50),
responsavel varchar(40)
);

-- 2 --
alter table Empresa modify column responsavel varchar(40);

-- 3 --
insert into Empresa
value 
(1, "Fleury", "Maria"),
(2, "C6", "Pedro"),
(3, "TIVIT", "Camila"),
(4, "Safra", "Natalia");

-- 4 --
select*from Empresa;

-- 5 --
select nomeEmpresa, Responsavel from Empresa;

-- 6 --
select*from Empresa order by nomeEmpresa;

-- 7 --
select*from Empresa order by Responsavel desc;

-- 8 --
select*from Empresa where nomeEmpresa like "%r%"

-- 9 --
select*from Empresa where nomeEmpresa like "p%"

-- 10 --
select*from Empresa where nomeEmpresa like "%r_"

-- 11 --
update Empresa set 