/* 
Feito por:
Nome: Lucas Ribeiro de Lacerda
RA: 01212151
*/

/* CRIAR UM BANCO DE DADOS AlunoProjeto NO MYSQL */

create database Bandtec;
use Bandtec;

-- Criar as tabelas equivalentes á modelagem.
create table Professores (
idProfessor int primary key auto_increment,
professor varchar(45),
disciplina varchar(30)
) auto_increment = 10001;

create table Grupos (
idGrupo int primary key auto_increment,
projeto varchar(45),
descricao varchar(30)
);

create table Alunos (
raAluno int primary key auto_increment,
aluno varchar(45),
telefone varchar(12),
fkGrupo int,
	foreign key (fkGrupo)
		references Grupos (idGrupo)
) auto_increment = 1000;

create table Apresentacao (
fkGrupo int,
	foreign key (fkGrupo)
		references Grupos (idGrupo),
fkProfessor int,
	foreign key (fkProfessor)
		references Professores (idProfessor),
primary key (fkGrupo, fkProfessor),
dataHora datetime,
nota decimal(4,2)
);

-- Inserir dados nas tabelas.
insert into Professores (professor, disciplina)
values 
("Alex", "Banco de Dados"),
("Frizza", "Algoritmos"),
("Braian", "Arquitetura Computacional");

insert into  Grupos (projeto, descricao)
values
("Facebook", "Rede social"),
("Leroy Merlin", "Construcao"),
("Renner", "Roupas"),
("Hersheys", "Chocolate"),
("Jeep", "Carros");

insert into Alunos (aluno, telefone, fkGrupo)
values 
("Mark", "1196943561", 1),
("Zuckerberg", "1196943545", 1),

("Leroy", "1196943527", 2),
("Merlin ", "11969435654", 2),

("Antonio", "1196943565", 3),
("Jacob", "1196943513", 3),

("Milton", "1196943578", 4),
("Hershey", "1196943504", 4),

("Sergio", "1196943518", 5),
("Michael", "1196943592", 5);

insert into  Apresentacao (fkGrupo, fkProfessor, dataHora, nota)
values
(01, 10001, '2021-04-05', 8.5),
(02, 10002, '2021-04-06', 9.5),
(03, 10002, '2021-04-07', 7.0),
(04, 10003, '2021-04-08', 6.0),
(05, 10003, '2021-04-09', 10.0);

-- Exibir todos os dados de cada tabela criada, separadamente.
select * from Alunos;
select * from Grupos;
select * from Professores;
select * from Apresentacao;

-- 5 Exibir os dados dos grupos e dos alunos correspondentes.
select * from Alunos
			join Grupos
				on Alunos.fkGrupo = Grupos.idGrupo;


-- 6 Exibir os dados de um determinado grupo e os dados de seus respectivos alunos.
select * from Alunos
			join Grupos
				on Alunos.fkGrupo = Grupos.idGrupo
					where idGrupo = 02;


-- 7 Exibir a média das notas atribuídas aos grupos, no geral
select avg(nota) as MediaGeral from Apresentacao;


-- 8 Exibir a nota minima e a nota maxima que foi atribuida aos grupos, no geral
select min(nota) as MinimoNotas from Apresentacao;

select max(nota) as MaxmoNotas from Apresentacao;

-- 9 Exibir a soma das notas dadas aos grupos, no geral.
select sum(nota) as SomaNotas from Apresentacao;

-- 10 Exibir os dados dos professores que avaliaram cada grupo, os dados do grupo, a data e o horario da avaliacao.
select * from Apresentacao
				join Professores 
					on Apresentacao.fkProfessor = Professores.idProfessor;
					
-- 11 Exibir os dados dos professores que avaliaram um determinado grupo, os dados do grupo, a data e o horario da avaliacao.
select * from Apresentacao
				join Professores 
					on Apresentacao.fkProfessor = Professores.idProfessor
						where fkGrupo = 02;
                        
                        
-- 12 Exibir nomes dos grupos que foram avaliados por um determinado professor
select * from Apresentacao
				join Professores 
					on Apresentacao.fkProfessor = Professores.idProfessor
						where fkProfessor = 10002;