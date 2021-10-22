 create database jogos;
 use jogos;

create table Times (
idTime int primary key auto_increment,
nomeTime varchar (40),
inaugurou date,
serie char (1),
check (serie = 'A' or serie = 'B' or serie = 'C'),
patrimonio decimal (10,2)
);

insert into Times (nomeTime, inaugurou, serie, patrimonio)
values 
('Sao Paulo', '1930-05-22', 'A', '90000000.00'),
('Corinthians', '1800-04-19', 'C', '60000.00'),
('Palmeiras', '1925-12-02', 'B', '1000000.00'),
('Santos', '1928-07-11', 'A', '300000.00');

select * from Times;


create table Jogadores (
idJogador int primary key auto_increment,
nomeJogador varchar (40),
nascimentoJogador date,
perna char(1),
check (perna = 'E' or perna = 'D'),
salario decimal(9,2),
fkTime int,
foreign key (fkTime)
references Times (idTime)
) auto_increment = 101;

insert into Jogadores (nomeJogador, nascimentoJogador, perna, salario, fkTime)
values 
('Lucas', '2001-05-22', 'D', '90000.00', 1),
('Pedrinho', '1995-06-19', 'E', '400000.00', 2),
('Cristiano', '1997-04-17', 'D', '9000000.00', 3),
('Ceni', '1996-11-27', 'D', '60000.00', 4),
('Calleri', '1991-12-08', 'E', '10000.00', 1);

select * from Jogadores;


create table Seguidores (
idSeguidor int primary key auto_increment,
nomeSeguidor varchar (40),
nascimentoSeguidor date,
genero char(1),
check (genero = 'M' or genero = 'F'),
socioTorcedor decimal (6,2),
fkJogador int,
foreign key (fkJogador)
references Jogadores (idJogador)
) auto_increment = 1001;

insert into Seguidores (nomeSeguidor, nascimentoSeguidor, genero, socioTorcedor, fkJogador)
values 
('Antonio', '2001-07-22', 'M', '100.00', 101),
('Marcos', '1999-11-20', 'M', '110.00', 103),
('Rodinei', '1995-05-27', 'M', '150.00', 105),
('Julia', '1982-01-06', 'F', '100.00', 101),
('Alessandra', '2002-05-15', 'F', '130.00', 102);

select * from Seguidores;



update Times 
set nomeTime = 'Portuguesa' 
where idTime = 2;

select * from Times;

update Jogadores 
set nomeJogador = 'Neymar' 
where idJogador = 2;

select * from Jogadores;

select sum(socioTorcedor) from Seguidores;

select round(avg(salario),2) from Jogadores;

select round(avg(patrimonio),2) from Times;

select sum(patrimonio) from Times;

select sum(salario) from Jogadores;

select round(avg(socioTorcedor),2) from Seguidores;

select * from Jogadores
			join Seguidores
				on Seguidores.fkJogador = Jogador.idJogador;