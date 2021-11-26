create database if not exists Bandtec;
use Bandtec;

create table if not exists Curso (
idCurso int primary key auto_increment,
nomeCurso varchar(45)
);

create table if not exists RespFinanceiro (
idRespFinanceiro int primary key auto_increment,
nomeResp varchar(45),
relacaoResp varchar(45)
) auto_increment = 10001;

create table if not exists Aluno (
idAluno int primary key auto_increment,
nomeAluno varchar(45),
fkIndicacao int,
fkRespFinanceiro int not null,
	foreign key (fkRespFinanceiro)
		references RespFinanceiro (idRespFinanceiro)
)auto_increment = 101;

create table if not exists Matricula (
idMatricula int unique,
fkAluno int not null,
	foreign key (fkAluno)
		references Aluno (idAluno),
fkCurso int not null,
	foreign key (fkCurso)
		references Curso (idCurso),
primary key (fkAluno, fkCurso),
dataMatricula date
);

insert into Curso (nomeCurso)
values
("Algoritmos"),
("Banco de Dados"),
("Arquitetura Computacional"),
("Tecnologia da Informação"),
("Pesquisa e Inovação");

insert into RespFinanceiro (nomeResp, relacaoResp)
values
("Roberto", "Avô"),
("Pedro", "Pai"),
("Agna", "Mãe"),
("Claudio", "Avô"),
("Patricia", "Avó");

insert into Aluno (nomeAluno, fkIndicacao, fkRespFinanceiro)
values
("Rodrigo", null, 10001),
("Victor", 101, 10001),
("Lucas", null, 10002),
("Antonio", 102, 10003),
("Karina", null, 10001),
("Gabriela", 104, 10002),
("Hanna", 105, 10003);

alter table Aluno add foreign key (fkIndicacao) references Aluno (idAluno);

insert into Matricula (idMatricula, fkAluno, fkCurso, dataMatricula)
values
(30146, 101, 01, '2021-01-29'),
(30154, 102, 02, '2021-02-10'),
(30125, 103, 03, '2021-02-15'),
(30191, 104, 04, '2021-02-11'),
(30105, 105, 05, '2021-02-08');

alter table Matricula add column precoMatricula decimal(10,2);

update Matricula 
set precoMatricula = 2244.08
where idMatricula = 30146;

update Matricula 
set precoMatricula = 4324.99
where idMatricula = 30154;

update Matricula 
set precoMatricula = 933.10
where idMatricula = 30125;

update Matricula 
set precoMatricula = 4529.13
where idMatricula = 30191;

update Matricula 
set precoMatricula = 841.78
where idMatricula = 30105;

select * from Matricula;

select sum(precoMatricula) as Mensalidade2021 from Matricula where year(dataMatricula) = '2021%';

select round(avg(precoMatricula),2) as Mensalidade2021, nomeCurso from Matricula
																		join Curso
																			on Matricula.fkCurso = Curso.idCurso
																				group by fkCurso;



