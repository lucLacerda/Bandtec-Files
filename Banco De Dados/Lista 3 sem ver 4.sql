create database SuperFacul;
use SuperFacul;

-- 1 --
create table Empresa (
id int primary key,
nome varchar(50),
responsavel varchar(40)
);

-- 2 --
alter table Empresa modify column responsavel varchar(50);

-- 3 --
insert into Empresa 
values 
( 1, "Fleury", "Maria"),
( 2, "C6", "Pedro"),
( 3, "TIVIT", "Camila"),
( 4, "Safra", "Natalia");

-- 4 --
select * from Empresa;

-- 5 --
select nome, responsavel from Empresa;

-- 6 --
select * from Empresa order by nome;

-- 7 --
select * from Empresa order by nome desc;

-- 8 --
select * from Empresa where nome like "%r%";

-- 9 --
select * from Empresa where nome like "s%";

-- 10 --
select * from Empresa where nome like "%r_";

-- 11 --
update Empresa
set responsavel = "Paulo"
where id = 2;

-- 12 --
delete from Empresa
where id = 3;


