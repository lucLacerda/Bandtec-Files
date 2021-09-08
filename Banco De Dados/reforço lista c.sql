	create database SuperFacul;

	use SuperFacul;
	create table Empresa (
	idEmpresa int primary key,
	nomeEmpresa varchar (50),
	responsavel varchar (40)
	);

	alter table Empresa modify responsavel varchar (50); 

	insert into Empresa 
	value 
	(1,'Fleury', 'Maria'),
	(2,"C6","Pedro"),
	(3,"TIVIT","Camila"),
	(4,"Safra","Natalia");

	select nomeEmpresa, responsavel from Empresa;

	select * from Empresa
	order by nomeEmpresa;

	select *from Empresa 
	order by responsavel desc;

	select *from Empresa where nomeEmpresa
	like  "%r%";

	select *from Empresa where nomeEmpresa
	like  "s%";
    
    	select *from Empresa where nomeEmpresa
	like  "%r_";
    
    update Empresa 
    set responsavel = "Paulo"
    where idEmpresa = 2; 
    
    delete from Empresa 
    where idEmpresa = 3;
    
    select * from Empresa;
    
    drop table Empresa;
    
    
    



