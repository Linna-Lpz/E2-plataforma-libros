create table if not exists carrito
(	id_carrito int primary key,
 	N_productos int NOT NULL,
 	ubicacion char NOT NULL,
 	saldo_total int NOT NULL,
);
