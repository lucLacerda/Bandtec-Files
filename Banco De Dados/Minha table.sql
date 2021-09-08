-- Criamos um DataBase--
create database Escola;
-- Selecionamos o Database --
use Escola;
-- Criamos uma tabela --
create table SuperAlunos(superalunos
RA int primary key,
nome varchar(50),
bairro varchar (70)
);
-- renomear tabelas --
alter table Alunos rename to SuperAlunos;
-- Selecionar a tabela --
select*from SuperAlunos;
-- Inserir os dados--
insert into SuperAlunos(RA, nome, bairro)
value ();

select RA from SuperAlunos;
select nome from SuperAlunos;

-- Excluir tabela --
drop table SuperProfessores;
-- criar tabela professor, excluir tabela e criar outra tabela SuperProfessor--
create table SuperProfessores (
ID int primary key,
Nome char (50),
Disciplina char (30)
);
select * from SuperProfessores;

insert into SuperProfessores (ID, Nome, Disciplina)
value (00, 'Brandão', 'Pesquisa e Inovação');

update SuperProfessores
set Moradia = 'Casa'
where ID = 5;

delete from SuperProfessores where ID in (5, 4);

select* from SuperProfessores where Nome like '_a%';

alter table SuperProfessores add column Moradia varchar(20);

update SuperProfessores 
set Moradia = 'Casa'
where ID = 1;


-- desc "NomeDaTabela" descreve e verifica alteração --
desc SuperProfessores
