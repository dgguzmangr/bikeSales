
create table Tipo_de_Vehiculo(
	Idtipodeveh integer not null primary key,
    Nombre_del_fabricante varchar(50)     
);

insert into Tipo_de_Vehiculo(Idtipodeveh, Nombre_del_fabricante) values (1,"Cannondale");
insert into Tipo_de_Vehiculo(Idtipodeveh, Nombre_del_fabricante) values (2,"Trek");
insert into Tipo_de_Vehiculo(Idtipodeveh, Nombre_del_fabricante) values (3,"Yeti");
insert into Tipo_de_Vehiculo(Idtipodeveh, Nombre_del_fabricante) values (4,"Fuji");
insert into Tipo_de_Vehiculo(Idtipodeveh, Nombre_del_fabricante) values (5,"Bmc");
insert into Tipo_de_Vehiculo(Idtipodeveh, Nombre_del_fabricante) values (6,"Starker");
insert into Tipo_de_Vehiculo(Idtipodeveh, Nombre_del_fabricante) values (7,"Lucky Lion");
insert into Tipo_de_Vehiculo(Idtipodeveh, Nombre_del_fabricante) values (8,"Be Electric");
insert into Tipo_de_Vehiculo(Idtipodeveh, Nombre_del_fabricante) values (9,"Aima");
insert into Tipo_de_Vehiculo(Idtipodeveh, Nombre_del_fabricante) values (10,"Mec de Colombia");
insert into Tipo_de_Vehiculo(Idtipodeveh, Nombre_del_fabricante) values (11,"Atom Electric");


create table Bicicleta(
IdBicicleta integer not null primary key,
Precio_unitario_bicicleta varchar (60),
Año_de_construccion integer,
foreign key (IdBicicleta) references Tipo_de_Vehiculo (Idtipodeveh)
);

insert into Bicicleta (IdBicicleta,Precio_unitario_bicicleta,Año_de_construccion) values (1,"1200000",2020);
insert into Bicicleta (IdBicicleta,Precio_unitario_bicicleta,Año_de_construccion) values (2,"1450000",2019);
insert into Bicicleta (IdBicicleta,Precio_unitario_bicicleta,Año_de_construccion) values (3,"2000000",2020);
insert into Bicicleta (IdBicicleta,Precio_unitario_bicicleta,Año_de_construccion) values (4,"950000",2021);
insert into Bicicleta (IdBicicleta,Precio_unitario_bicicleta,Año_de_construccion) values (5,"1950000",1018);

create table Proveedor_motor(
Idproveedormotor integer not null primary key,
Proveedor_Nombre varchar(35),
Direccion_proveedor varchar(70),
Telefono_proveedor varchar(11)
);

insert into Proveedor_motor (Idproveedormotor,Proveedor_Nombre,Direccion_proveedor,Telefono_proveedor) values (20,"Auteco","calle 7 No. 45-17",05713224459);
insert into Proveedor_motor (Idproveedormotor,Proveedor_Nombre,Direccion_proveedor,Telefono_proveedor) values (21,"Hitachi","calle 19 No. 108-26",05714223344);
insert into Proveedor_motor (Idproveedormotor,Proveedor_Nombre,Direccion_proveedor,Telefono_proveedor) values (22,"Bosch","carrera 68 No. 26-45",05715678798);
insert into Proveedor_motor (Idproveedormotor,Proveedor_Nombre,Direccion_proveedor,Telefono_proveedor) values (23,"Teco","calle 77 No. 68-33",05712213243);
insert into Proveedor_motor (Idproveedormotor,Proveedor_Nombre,Direccion_proveedor,Telefono_proveedor) values (24,"General Electric","calle 29 No. 26-12",05717239919);


create table Motocicleta_Electrica(
IdMoto integer not null primary key,
Precio_unitario_moto varchar(35),
Autonomia_de_la_Bateria varchar(35),
Doc_proveedormotor int,
foreign key (IdMoto) references Tipo_de_Vehiculo (Idtipodeveh),
foreign key (Doc_proveedormotor) references Proveedor_motor (Idproveedormotor)
);

insert into Motocicleta_Electrica (IdMoto, Precio_unitario_moto, Autonomia_de_la_Bateria, Doc_proveedormotor) values (6,"4200000","18 horas", 20 );
insert into Motocicleta_Electrica (IdMoto, Precio_unitario_moto, Autonomia_de_la_Bateria, Doc_proveedormotor) values (7,"4200000","14 horas", 21 );
insert into Motocicleta_Electrica (IdMoto, Precio_unitario_moto, Autonomia_de_la_Bateria, Doc_proveedormotor) values (8,"4600000","26 horas", 20);
insert into Motocicleta_Electrica (IdMoto, Precio_unitario_moto, Autonomia_de_la_Bateria, Doc_proveedormotor) values (9,"8000000","36 horas", 22 );
insert into Motocicleta_Electrica (IdMoto, Precio_unitario_moto, Autonomia_de_la_Bateria, Doc_proveedormotor) values (10,"5900000","20 horas", 23 );
insert into Motocicleta_Electrica (IdMoto, Precio_unitario_moto, Autonomia_de_la_Bateria, Doc_proveedormotor) values (11,"4500000","12 horas", 24 );


create table Clientes(
	Alias varchar(35) not null primary key,
    Nombres_cliente varchar(35),
    Apellidos_cliente varchar(35),
    Email varchar(40),
    Celular_cliente varchar(10),
    Fecha_de_nacimiento_cliente date,
    contraseña_cliente varchar(8)
);

insert into Clientes (Alias,Nombres_cliente,Apellidos_cliente,Email,Celular_cliente,Fecha_de_nacimiento_cliente,contraseña_cliente) values ("lucky", "Pedro", "Perez","Pedro.Perez@ruta4.com",3001234567,"1991-02-12",34567895);
insert into Clientes (Alias,Nombres_cliente,Apellidos_cliente,Email,Celular_cliente,Fecha_de_nacimiento_cliente,contraseña_cliente) values ("malopez","Maria", "Lopez", "Maria.Lopez@ruta4.com",3001234568,"1992-03-15",34567896);
insert into Clientes (Alias,Nombres_cliente,Apellidos_cliente,Email,Celular_cliente,Fecha_de_nacimiento_cliente,contraseña_cliente) values ("diva"," Ana","Diaz","Ana.Diaz@ruta4.com",3001234569,"2000-05-16",34567897);
insert into Clientes (Alias,Nombres_cliente,Apellidos_cliente,Email,Celular_cliente,Fecha_de_nacimiento_cliente,contraseña_cliente) values ("dreamer","Luis","Rojas","Luis.Rojas@ruta4.com",3001234570,"2001-06-17",34567898);
insert into Clientes (Alias,Nombres_cliente,Apellidos_cliente,Email,Celular_cliente,Fecha_de_nacimiento_cliente,contraseña_cliente) values ("ninja","Andres","Cruz","Andres.Cruz@ruta4.com",3001234571,"1999-09-09",34567899);
insert into Clientes (Alias,Nombres_cliente,Apellidos_cliente,Email,Celular_cliente,Fecha_de_nacimiento_cliente,contraseña_cliente) values ("neon","Nelson","Ruiz","Nelson.Ruiz@ruta4.com",3001234572,"1997-10-10",34567900);
insert into Clientes (Alias,Nombres_cliente,Apellidos_cliente,Email,Celular_cliente,Fecha_de_nacimiento_cliente,contraseña_cliente) values ("rose","Claudia","Mendez","Claudia.Mendez@ruta4.com",3001234573,"1995-08-07",34567901);
insert into Clientes (Alias,Nombres_cliente,Apellidos_cliente,Email,Celular_cliente,Fecha_de_nacimiento_cliente,contraseña_cliente) values ("green","Jorge","Rodriguez","Jorge.Rodriguez@ruta4.com",3001234574,"1997-09-16",34567902);

create table Registro_intdecompra(
	Reg_Idtipodeveh integer not null,
    Reg_Alias varchar(35) not null,
    fecha_de_registro datetime,
    primary key(Reg_Idtipodeveh, Reg_Alias),
    foreign key (Reg_Idtipodeveh) references Tipo_de_Vehiculo (Idtipodeveh),
    foreign key (Reg_Alias) references Clientes (Alias)
);

insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(1,"lucky", '2017-10-25 20:00:00');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(2,"lucky", '2019-03-15 18:30:00');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(6,"lucky", '2019-05-20 20:30:00');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(1,"malopez", '2018-05-20 20:30:00');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(6,"malopez", '2020-01-20 20:30:00');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(3,"diva", '2019-05-20 20:30:00');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(4,"diva", '2018-06-22 21:30:00');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(7,"diva", '2020-03-17 15:30:20');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(7,"dreamer", '2020-03-17 15:30:20');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(8,"dreamer", '2020-04-10 18:30:20');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(9,"ninja", '2020-02-17 20:30:20');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(6,"ninja", '2020-02-20 16:30:20');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(10,"ninja", '2020-03-27 18:30:20');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(11,"rose", '2020-03-20 21:30:20');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(3,"green", '2020-01-10 17:30:20');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(2,"green", '2020-02-15 20:30:20');
insert into Registro_intdecompra(Reg_Idtipodeveh,Reg_Alias,fecha_de_registro) values(5,"green", '2020-03-17 18:30:20');





