create database Faculdade;
use Faculdade;

create table Cursos (
idCurso int primary key auto_increment,
Curso varchar(45),
Coordenador varchar(30),
MediaGlobal int,
	check (MediaGlobal = '5' or MediaGlobal = '6' or MediaGlobal = '7')
)auto_increment = 01;

create table Alunos (
raAluno int primary key auto_increment,
Aluno varchar(45),
Bairro varchar(45)
) auto_increment = 101;

insert into Cursos (Curso, Coordenador)
values
("Algoritmos", "Claudio"),
("Arquitetura Computacional", "Eduardo"),
("Banco de Dados", "Alexander"),
("Tecnologia da Informação", "Thiago"),
("Pesquisa e Inovação", "Fernando"),
("Socieomocional", "Kaline");

insert into Alunos (Aluno, Bairro)
values
("Lucas Lacerda", "Ponte Rasa"),
("Matheus Cantero", "Penha"),
("Diego Leopoldino", "Zona Norte");

create table Bandtec (
fkCurso int,
 foreign key (fkCurso)
	references Cursos (idCurso),
fkAluno int,
	foreign key (fkAluno)
		references Alunos (raAluno),
MediaAluno decimal (3,1),
Inicio date,
Nivel CHAR(1), 
	check (Nivel = 'A' or Nivel = 'B' or Nivel = 'C' or Nivel = 'S'),
primary key (fkAluno, fkCurso)
);

drop table Bandtec;

insert into Bandtec (fkCurso, fkAluno, MediaAluno, Inicio, Nivel)
values
(01, 101, '8.5', '2021-07-15', "A"),
(02, 101, '7.3', '2021-07-15', "A"),
(03, 101, '9.2', '2021-07-15', "S"),
(04, 101, '6.8', '2021-07-15', "A"),
(05, 101, '10.0', '2021-07-15', "S"),
(06, 101, '7.5', '2021-07-15', "A"),

(01, 102, '8.5', '2021-07-15', "A"),
(02, 102, '8.9', '2021-07-15', "C"),
(03, 102, '7.1', '2021-07-15', "B"),
(04, 102, '5.9', '2021-07-15', "C"),
(05, 102, '6.0', '2021-07-15', "S"),
(06, 102, '7.5', '2021-07-15', "A"),

(01, 103, '9.4', '2021-07-15', "B"),
(02, 103, '7.1', '2021-07-15', "C"),
(03, 103, '8.2', '2021-07-15', "A"),
(04, 103, '5.9', '2021-07-15', "B"),
(05, 103, '8.0', '2021-07-15', "C"),
(06, 103, '8.6', '2021-07-15', "S")
;

-- Exibir os dados de cada tabela separadamente.
select * from Alunos;
select * from Cursos;
select * from Bandtec;

-- Exibir os dados dos alunos e dos cursos correspondentes.
select * 
	from Bandtec 
		join Alunos on Alunos.raAluno = Bandtec.fkAluno
        join Cursos on Cursos.idCurso = Bandtec.fkCurso;


-- Exibir os dados dos alunos, mas somente de um curso.
select * 
	from Bandtec 
		join Alunos on Alunos.raAluno = Bandtec.fkAluno
        join Cursos on Cursos.idCurso = Bandtec.fkCurso
			where fkCurso = 2;

-- Exibir os dados de um aluno e os dados dos cursos desse aluno.
select * 
	from Bandtec 
		join Alunos on Alunos.raAluno = Bandtec.fkAluno
        join Cursos on Cursos.idCurso = Bandtec.fkCurso
			where fkAluno = 101;
            
-- Exibir a média das médias.
select avg(MediaAluno) as Media from Bandtec;

-- Exibir a maior e a menor média.
select max(MediaAluno) as Media_maxima, min(MediaAluno) as Media_minima from Bandtec;

-- Exibir a maior e a menor média agrupado por curso.
select max(MediaAluno) as Media_maxima, min(MediaAluno) as Media_minima from Bandtec group by fkCurso;

-- Exibir a maior e a menor média agrupado por aluno.
select max(MediaAluno) as Media_maxima, min(MediaAluno) as Media_minima from Bandtec group by fkAluno;

-- Exibir apenas as médias da tabela AlunoCurso.
select MediaAluno from Bandtec;

-- Exibir as médias distintas da tabela AlunoCurso.
select distinct(MediaAluno) from Bandtec;

-- Exibir a quantidade de médias da tabela AlunoCurso.
select count(MediaAluno) from Bandtec;

-- Exibir a quantidade de médias distintas da tabela AlunoCurso.
select count(distinct(MediaAluno)) from Bandtec;

-- https://moodle.digitalschool.com.br/mod/assign/view.php?id=1867&action=view