create table if not exists Factura
(	id_factura int primary key,
 	Metodo_pago char NOT NULL,
 	correo char NOT NULL,
 	id_carrito int NOT NULL,
 	foreign key("Correo") references "Usuario" (correo),
 	foreign key(id_carrito) references carrito (id_carrito)
);
