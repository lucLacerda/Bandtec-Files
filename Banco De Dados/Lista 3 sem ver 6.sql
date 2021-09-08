create database SuperFacul;
use SuperFacul;

create table Empresa (
id decimal primary key,
nome varchar(50),
responsavel varchar(40)
);

alter table Empresa modify column responsavel varchar(50);

insert into Empresa
values
( 1, "Fleury", "Maria"),
( 2, "C6", "Pedro"),
( 3, "TIVIT", "Camila"),
( 4, "Safra", "Natalia");

select * from Empresa;

select nome, responsavel from Empresa;

select * from Empresa order by nome asc;

select * from Empresa order by responsavel desc;

select * from Empresa where nome like "%r%";

select * from Empresa where nome like "c%";

select * from Empresa where nome like "%r_";

update Empresa
set responsavel = "Paulo"
where id = 2;

delete from Empresa where id = 3;

select * from Empresa;

drop database SuperFacul;