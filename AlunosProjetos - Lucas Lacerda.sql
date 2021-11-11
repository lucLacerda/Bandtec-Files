/* CRIAR UM BANCO DE DADOS AlunoProjeto NO MYSQL */
create database AlunoProjeto;
use AlunoProjeto;

-- Criar as tabelas equivalentes á modelagem.
create table Projetos (
idProjeto int primary key auto_increment,
projeto varchar(45),
descricao varchar(30)
);

create table Alunos (
raAluno int auto_increment,
aluno varchar(45),
telefone varchar(12),
fkProjeto int,
	foreign key (fkProjeto)
		references Projetos (idProjeto),
fkRepresentante int,
	foreign key (fkRepresentante)
		references Alunos (raAluno)
) auto_increment = 101;

create table Acompanhantes (
idAcompanhante int primary key auto_increment,
acompanhante varchar(45),
relacao varchar(30),
fkAluno int,
	foreign key (fkAluno)
		references Alunos (raAluno)
) auto_increment = 1001;

-- Inserir dados nas tabelas.
insert into  Projetos (projeto, descricao)
values
("Facebook", "Rede social"),
("Leroy Merlin", "Construcao"),
("Renner", "Roupas"),
("Hersheys", "Chocolate"),
("Jeep", "Carros");

insert into Alunos (aluno, telefone, fkProjeto, fkRepresentante)
values 
("Mark", "1196943561", 1, 101),
("Zuckerberg", "1196943545", 1, 102),

("Leroy", "1196943527", 2, 102),
("Merlin ", "11969435654", 2, 102),

("Antonio", "1196943565", 3, 101),
("Jacob", "1196943513", 3, 101),

("Milton", "1196943578", 4, 102),
("Hershey", "1196943504", 4, 102),

("Sergio", "1196943518", 5, 101),
("Michael", "1196943592", 5, 102);

insert into Acompanhantes (acompanhante, relacao, fkAluno)
values 
("Joao", "Pai", 101),
("Pedro", "Irmão", 103),
("Maria", "Mãe", 105);

-- Exibir todos os dados de cada tabela criada, separadamente.
select * from Alunos;
select * from Projetos;
select * from Acompanhantes;

-- Exibir os dados dos alunos e dos projetos correspondentes.
select * from Alunos
			join Projetos
				on Alunos.fkProjeto = Projetos.idProjeto;


-- Exibir os dados dos alunos e dos seus acompanhantes.
select * from Alunos
			join Acompanhantes
				on Acompanhantes.fkAluno = Alunos.raAluno;


-- Exibir os dados dos alunos e dos seus representantes.
select Representante.aluno, Alunos.aluno from Alunos as Representante
			join Alunos
				on Alunos.raAluno = Representante.fkRepresentante;


-- Exibir os dados dos alunos e dos projetos correspondentes, mas somente um determinado projeto (indicar o nome do projeto na consulta).
select * from Alunos
			join Projetos
				on Alunos.fkProjeto = Projetos.idProjeto
					where projeto = "Facebook";


-- Exibir os dados dos alunos e dos projetos correspondentes e dos seus acompanhantes.
select * from Alunos
			join Projetos on Alunos.fkProjeto = Projetos.idProjeto
            join Acompanhantes on Acompanhantes.fkAluno = Alunos.raAluno;