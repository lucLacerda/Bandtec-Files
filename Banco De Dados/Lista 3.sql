-- Exercicios -- 
create database SuperFacul;
use SuperFacul;

-- 1 --
create table Empresa (
ID int primary key,
Nome varchar(50),
Responsavel varchar(40)
);

-- 2 --
alter table Empresa modify column 
Responsavel varchar (50);

-- 3 --
insert into Empresa
value 
(1, 'Fleury', 'Maria'),
(2, 'C6', 'Pedro'),
(3, 'TIVIT', 'Camila'),
(4, 'Safra', 'Natalia');

-- 4 --
select*from Empresa;

-- 5 --
select Nome, Responsavel from Empresa;

-- 6 --
select * from Empresa
order by Nome;

-- 7 --
select * from Empresa
order by Responsavel desc;

-- 8 --
select *from Empresa where Nome like  "%r%";

-- 9 --
select *from Empresa where Nome like  "c%";

-- 10 --
select *from Empresa where Nome like  "%r_";

-- 11 --
update Empresa 
set responsavel = "Paulo"
where ID = 2;
select*from Empresa;

-- 12 --
delete from Empresa
where ID = 3;
select * from Empresa;

-- 13 --
-- drop table Empresa; --