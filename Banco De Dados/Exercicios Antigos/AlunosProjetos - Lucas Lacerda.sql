/* CRIAR UM BANCO DE DADOS AlunoProjeto NO MYSQL */

drop database Bandtec;
use Bandtec;

-- Criar as tabelas equivalentes á modelagem.
create table Projetos (
idProjeto int primary key auto_increment,
projeto varchar(45),
grupo int,
descricao varchar(30)
);

create table Alunos (
raAluno int primary key auto_increment,
aluno varchar(45),
telefone varchar(12),
fkProjeto int,
	foreign key (fkProjeto)
		references Projetos (idProjeto)
) auto_increment = 101;

create table Professores (
idProfessor int primary key auto_increment,
professor varchar(45),
disciplina varchar(30),
fkProjeto int,
	foreign key (fkProjeto)
		references Projetos (idProjeto)
) auto_increment = 1001;

-- Inserir dados nas tabelas.
insert into  Projetos (projeto, grupo, descricao)
values
("Facebook", 01, "Rede social"),
("Leroy Merlin", 02, "Construcao"),
("Renner", 03, "Roupas"),
("Hersheys", 04, "Chocolate"),
("Jeep", 05, "Carros");

insert into Alunos (aluno, telefone, fkProjeto)
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

insert into Professores (professor, disciplica, fkProjeto)
values 
("Alex", "Banco de Dados", 101),
("Frizza", "Algoritmos", 103),
("Braian", "Arquitetura Computacional", 105);

-- Exibir todos os dados de cada tabela criada, separadamente.
select * from Alunos;
select * from Projetos;
select * from Acompanhantes;
select * from Representantes;


-- Exibir os dados dos alunos e dos projetos correspondentes.
select * from Alunos
			join Projetos
				on Alunos.fkProjeto = Projetos.idProjeto;


-- Exibir os dados dos alunos e dos seus acompanhantes.
select * from Alunos
			join Acompanhantes
				on Acompanhantes.fkAluno = Alunos.raAluno;


-- Exibir os dados dos alunos e dos seus representantes.
select * from Alunos
			join Representantes
				on Representantes.fkAluno = Alunos.raAluno;


-- Exibir os dados dos alunos e dos projetos correspondentes, mas somente um determinado projeto (indicar o nome do projeto na consulta).
select * from Alunos
			join Projetos
				on Alunos.fkProjeto = Projetos.idProjeto
					where projeto = "Facebook";


-- Exibir os dados dos alunos e dos projetos correspondentes e dos seus acompanhantes.
select * from Alunos
			join Projetos on Alunos.fkProjeto = Projetos.idProjeto
            join Acompanhantes on Acompanhantes.fkAluno = Alunos.raAluno;