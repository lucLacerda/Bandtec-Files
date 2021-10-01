create database PetShop;
use PetShop;

CREATE TABLE Cliente (
    idCliente INT PRIMARY KEY AUTO_INCREMENT,
    nomeCliente VARCHAR(45),
    sobrenome VARCHAR(45),
    tel_fixo VARCHAR(45),
    celular VARCHAR(45),
    bairro VARCHAR(45),
    endereço VARCHAR(45)
);

insert into Cliente (nomeCliente, sobrenome, tel_fixo, celular, endereço, bairro)
values
('Lucas', 'Lacerda', '3002-3922', '98865-4654', 'R. Lopes Chaves', 'Barra Funda'),
('Pedro', 'Henrique', '3002-3924', '98865-4651', 'R. Itararé', 'Itanhaem'),
('João', 'Pedro', '3002-3928', '98865-4656', 'R. Rocha Silva', 'Mato Grosso'),
('Danilo', 'Gonçalves', '3002-3927', '98865-4655', 'R. Oswaldo Gomes', 'American'),
('Ana', 'Lacerda', '3002-3922', '98865-4659', 'R. Brigadeiro Galvão', 'Boturussu'),
('Julia', 'Barbosa', '3002-3929', '98865-4652', 'R. Washington', 'Itapevi');

CREATE TABLE Pet (
    idPet INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(45),
    nomePet VARCHAR(45),
    raça VARCHAR(45),
    data_de_nascimento DATE,
    preco_pet DECIMAL(10 , 2 ),
    fkCliente INT,
    FOREIGN KEY (fkCliente)
        REFERENCES cliente (idCliente)
)  AUTO_INCREMENT=101 ;

insert into Pet (tipo, nomePet, raça, data_de_nascimento, preco_pet, fkCliente)
values
('Cachorro', 'Bob', 'Pintcher', '2020-04-05', 988.32, 1),
('Gato', 'Nick', 'Persa', '2019-07-30', 3447.65, 2),
('Papagaio', 'Pingo', 'Algum', '2015-04-17', 3110.98, 3),
('Cachorro', 'Sandy', 'Coral', '2014-05-11', 4762.76, 1),
('Coelho', 'Claudin', 'Cueio', '2021-07-09', 5624.99, 4),
('Peixe', 'Lion', 'Beleza', '2022-09-04', 6886.99, 5);

select * from Cliente;
select * from Pet;

alter table Cliente modify nomeCliente varchar (50);

select * from Pet 
where tipo = 'Gato';

select nomePet, data_de_nascimento from Pet;

select * from Pet order by nomePet;

select * from Cliente order by bairro desc;

select * from Pet where nomePet like 'A%';

select * from Cliente where sobrenome = 'Lacerda';

update Cliente 
set tel_fixo = '3402-3922'
where idCliente = 1;

select * from Cliente;

select * from Cliente c
	join Pet p
		on p.fkCliente = c.idCliente;

select c.nomeCliente, p.preco_pet from Cliente c 
	join Pet p
		on p.fkCliente = c.idCliente
	where c.nomeCliente like 'Lucas%';

delete from Pet where idPet = 102;

select * from Pet;

-- sum(nomeColuna) soma os valores, com where especifica mais ainda a soma
select sum(preco_pet) from pet where tipo = "Cachorro";

-- avg(nomeColuna) faz a media dos valores
select avg(preco_pet) from pet;

-- round(nomeColuna) faz o arrendondamento dos valores
select round(preco_pet) from p et;

-- min(nomeColuna) traz o valor minimo
select min(preco_pet) from pet;

-- max(nomeColuna) traz o valor maximo
select max(preco_pet), tipo from pet;



-- drop table Pet;
-- drop table Cliente;
