create table departamentos(
codigo int not null primary key ,
nombre varchar(100),
presupuesto int
);

create table empleados(
dni varchar(8) not null primary key,
nombre varchar(100),
apellidos varchar(255),
departamento int,
foreign key (departamento) references departamentos (codigo)
);

insert into departamentos(codigo,nombre,presupuesto) values(1,'Contabilidad',10000);
insert into departamentos(codigo,nombre,presupuesto) values(2,'Desarrollo',40000);
insert into departamentos(codigo,nombre,presupuesto) values(3,'Ventas',15000);

insert into empleados(dni,nombre,apellidos,departamento) values('43597789','Alvaro','Bernabey',2);
insert into empleados(dni,nombre,apellidos,departamento) values('43597788','Juan','Bosque',1);
insert into empleados(dni,nombre,apellidos,departamento) values('43597787','Martina','Herrera',3);