-- criando database
create database vitiWine;


-- usar database
use vitiWine;


-- criando tabela base Cadastro
create table Cadastro
(idCadastro int primary key auto_increment,
nome varchar(20),
sobrenome varchar(45),
cnpj varchar(14),  
email varchar(60),
telefone varchar(15)
)auto_increment = 1;

-- inserindo dados na tabela Cadastro
insert into Cadastro (nome, sobrenome, cnpj, email, telefone) values
("Renan", "Cardoso", 37087469887, "renan.cardoso@gamil.com", 978758585);

-- selecionando tabela 
select * from Cadastro;

create table Usuarios 
(idUsusario int primary key auto_increment, -- chave primaria
nome varchar(45),
cpf varchar(12),
email varchar(60),
senha varchar(30),
telefone varchar(15),
fkCadastros int,
foreign key (fkCadastro) references Cadastro (idCadastro)
)auto_increment = 1001;

-- inserindo dados na tabela usuarios
Insert into Usuarios(nome, cpf, email, senha, telefone,fkCadastro)  values
('Paulo Silva', '15689478542', 'paulo.silva@gmail.com', '#Psil2226', '915987541', 1);



-- selecionando tabela 
select * from Usuarios;

-- criando a tabela estufas
create table Estufas
(idEstufa int primary key auto_increment,
hectares int,
qtdPes int,
coordenadas varchar(20),
fkCadastro  int,
foreign key (fkCadastro) references Cadastro (idCadastro)) -- chave estrangeira 
auto_increment = 2001;

-- inserindo dados na tabela estufas
insert into  Estufas (hectares, qtdPes, coordenadas, fkClientes) values
(3, 5000, '07450678', 10);


-- criando a tabela sensores
create table Sensores
(idSensores int primary key auto_increment,
modelo varchar(30),
coordenadas varchar(20),
dtInstalacao date,
fkEstufa int,
foreign key (fkEstufa) references Estufa (idEstufa)) -- chave estrangeira 
auto_increment = 3001;

-- inserindo dados na tabela sensores 
insert into tb_Sensores (modelo, coordenadas, dtInstalacao, fkEstufa) values
('lm35', '23.56 46.64', '2021-02-20', 2001);




-- criando a tabela registros
create table Registros
(idRegistros int primary key auto_increment,
temperatura float,
dtMedicao datetime,
fkSensoress int,
foreign key (fkSensoress) references Sensoress (idSensores))
auto_increment = 4001;

-- inserindo dados na table registros
insert into Registros (temperatura, dtMedicao, fkSensores) values 
(18.01, '2021-02-11 12:00:00', 3001), 
(22.21, '2021-03-08 12:00:00', 3002),
(14.32, '2021-04-03 12:00:00', 3003);
