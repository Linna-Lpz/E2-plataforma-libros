create table if not exists carrito
(	id_carrito int primary key,
 	N_productos int NOT NULL,
 	ubicacion char NOT NULL,
 	saldo_total int NOT NULL
	fk_correo_carrito int,
	CONSTRAINT fk_correo_carrito FOREIGN KEY (fk_correo_carrito) REFERENCES public."Usuario"(correo) MATCH SIMPLE
);
