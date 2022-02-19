create DATABASE PraticaJogador;
use PraticaJogador;

create table timeF (
id int primary key auto_increment,
nome varchar(45),
tecnico varchar(45),
dataFormacao date
);

create table jogador (
id int primary key auto_increment,
nome varchar(45),
posicao varchar(45),
salario decimal(6,2),
fk_time int,
foreign key (fk_time)
    references timeF (id),
conselheiro int,
foreign key (conselheiro)
    references jogador (id)
);

create table seguidor (
id int auto_increment,
fk_jogador int,
foreign key (fk_jogador)
references jogador (id),
primary key (id, fk_jogador),
nome varchar(45),
genero char(1),
check (genero = 'm' or genero = 'f' or genero = 'n')
);

insert into timeF (nome, tecnico, dataFormacao)
values ("Corinthians", "Tite", "2020-08-15"),
("Sao Paulo", "Rogerio Ceni", "2020-08-29"),
("Santos", "Pedro", "2020-08-01"),
("Palmeiras", "Jorge", "2020-08-23");

insert into jogador (nome, posicao, salario, fk_time, conselheiro)
values
('Cassio', 'goleiro', 2434.00, 1, null),
('Jo', 'atacante', 8392.00, 1, 1),
('lucas', 'armador', 5432.00, 2, null),
('neymar', 'atacante', 8323.00, 3, 3),
('valdivia', 'atacante', 4738.00, 4, 4);

insert into seguidor (fk_jogador, nome, genero)
values (1, 'Douglas', 'm'),
(2, 'Cleide', 'f'),
(2, 'Jorge', 'f'),
(3, 'Alex', 'm'),
(4, 'Malu', 'f'),
(5, 'Cleber', 'm');

select * from timeF;
select * from jogador;
select * from seguidor;

select nome, tecnico from timeF where nome like 'S%';

select * from jogador order by posicao desc;

select * from jogador where posicao = 'atacante';

select * from timeF where tecnico like '%t_';

select * from timeF order by tecnico;

select * from timeF order by dataFormacao desc;

update jogador set posicao = 'armador' where id=5;

select * from timeF ti
join jogador jo 
on jo.fk_time = ti.id;

select ti.nome as 'nome do time', jo.nome as 'nome do jogador', jo.posicao from timeF ti
join jogador jo
on jo.fk_time = ti.id;

select * from jogador jo
	join jogador co on jo.conselheiro = co.id;

select ti.nome, jo.nome, co.nome from timeF ti
		right join jogador jo on jo.fk_time = ti.id
			join jogador co on jo.conselheiro = co.id;

select * from timeF ti
	join jogador jo on jo.fk_time = ti.id
		join jogador co on jo.conselheiro = co.id
where jo.nome = 'neymar';

select * from jogador jo
join seguidor se
on se.fk_jogador = jo.id;

select * from jogador jo
join seguidor se
on se.fk_jogador = jo.id
where jo.nome = 'jo';



/*
delete from seguidor where id = 6;
delete from jogador where id = 5;

drop table seguidor;
drop table jogador;
drop table timeF;
*/