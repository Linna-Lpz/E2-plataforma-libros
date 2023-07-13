--1.Tabla tipo usuario--

CREATE TABLE IF NOT EXISTS public."Tipo_usuario"
(
    id_tipo_usuario integer NOT NULL,
    es_registrado boolean,
    tipo_rol varchar,
    CONSTRAINT "TIPO_USUARIO_pkey" PRIMARY KEY (id_tipo_usuario)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Tipo_usuario"
    OWNER to postgres;

--2.Tabla ubicacion--

CREATE TABLE public."Ubicacion"
(
    id_ubicacion serial NOT NULL,
    nombre_ubicacion character varying(50),
    PRIMARY KEY (id_ubicacion)
);

ALTER TABLE IF EXISTS public."Ubicacion"
    OWNER to postgres;

--3.Tabla Restriccion--

CREATE TABLE IF NOT EXISTS public."Restriccion"
(
    id_restriccion integer NOT NULL,
    edad_minima integer,
    CONSTRAINT "Restriccion_pkey" PRIMARY KEY (id_restriccion)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Restriccion"
    OWNER to postgres;

--4.Tabla usuario--

CREATE TABLE IF NOT EXISTS public."Usuario"
(
    correo varchar NOT NULL,
    fecha_nacimiento date,
    contraseña varchar,
    nombre_usuario varchar,
    fk_tipo_usuario int,
    fk_ubicacion int,
    CONSTRAINT "Usuario_pkey" PRIMARY KEY (correo),
    CONSTRAINT fk_tipo_usuario FOREIGN KEY (fk_tipo_usuario) REFERENCES public."Tipo_usuario"(id_tipo_usuario) MATCH SIMPLE,
    CONSTRAINT fk_ubicacion FOREIGN KEY (fk_ubicacion) REFERENCES public."Ubicacion"(id_ubicacion) MATCH SIMPLE
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Usuario"
    OWNER to postgres;

--5.Tabla Libro --

CREATE TABLE public."Libro"
(
    "Año" integer,
    "Descripcion" varchar COLLATE pg_catalog."default" NOT NULL,
    "Editorial" varchar COLLATE pg_catalog."default",
    "Genero_libro" varchar COLLATE pg_catalog."default",
    "Id_libro" integer NOT NULL,
    "Link" varchar COLLATE pg_catalog."default" NOT NULL,
    "Nombre_libro" varchar COLLATE pg_catalog."default" NOT NULL,
    "Precio" integer NOT NULL,
    "Stock" integer NOT NULL,
    "Tipo_libro" varchar COLLATE pg_catalog."default" NOT NULL,
    "Numero_favoritos" integer NOT NULL,
    fk_id_restriccion integer,
    fk_id_ubicacion integer,
    Nombre_autor varchar COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "Libro_pkey" PRIMARY KEY ("Id_libro")
    CONSTRAINT fk_id_restriccion FOREIGN KEY (fk_id_restriccion) REFERENCES public."Restriccion"(id_restriccion) MATCH SIMPLE
    CONSTRAINT fk_id_ubicacion FOREIGN KEY (fk_id_ubicacion) REFERENCES public."Ubicacion"(id_ubicacion) MATCH SIMPLE
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Libro"
    OWNER to postgres;

--6.Tabla  Usuario Libro--

CREATE TABLE IF NOT EXISTS public."usuario_libro"
(
    id_usuario_libro integer NOT NULL,
    favoritos char,
    fk_usuario varchar,
	fk_libro integer,
    CONSTRAINT "usuario_libro_pkey" PRIMARY KEY (id_usuario_libro),
    CONSTRAINT fk_usuario FOREIGN KEY (fk_usuario) REFERENCES public."Usuario"(correo) MATCH SIMPLE,
    CONSTRAINT fk_libro FOREIGN KEY (fk_libro) REFERENCES public."Libro"("Id_libro") MATCH SIMPLE
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."usuario_libro"
    OWNER to postgres;

--7.Tabla Carrito--

create table if not exists carrito
(	id_carrito int primary key,
 	N_productos int NOT NULL,
 	ubicacion char NOT NULL,
 	saldo_total int NOT NULL
	fk_correo_carrito int,
	CONSTRAINT fk_correo_carrito FOREIGN KEY (fk_correo_carrito) REFERENCES public."Usuario"(correo) MATCH SIMPLE
);

--8.Tabla Libro Carrito--

CREATE TABLE public."Libro_Carrito"
(
    id_libro_carrito serial NOT NULL,
    libro_carrito_libro_fk integer,
    libro_carrito_carrito_fk integer,
    PRIMARY KEY (id_libro_carrito),
    CONSTRAINT libro_carrito_libro_fk FOREIGN KEY (id_libro)
        REFERENCES public."Libro" ("Id_libro") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT libro_carrito_carrito_fk FOREIGN KEY (id_carrito)
        REFERENCES public."Carrito" (id_carrito) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);

ALTER TABLE IF EXISTS public."Libro_Carrito"
    OWNER to postgres;

--9.Tabla Factura--

create table if not exists Factura
(	id_factura int primary key,
 	Metodo_pago char NOT NULL,
 	correo char NOT NULL,
 	id_carrito int NOT NULL,
 	foreign key("Correo") references "Usuario" (correo),
 	foreign key(id_carrito) references carrito (id_carrito)
);


--10.Tabla Valoracion--

CREATE TABLE public."Valoracion"
(
    id_valoracion integer NOT NULL,
    comentario varchar COLLATE pg_catalog."default",
    puntuacion integer NOT NULL,
    fk_id_libro integer,
    CONSTRAINT "Valoracion_pkey" PRIMARY KEY (id_valoracion),
    CONSTRAINT fk_id_libro FOREIGN KEY (fk_id_libro) REFERENCES public."LIBRO"("Id_libro") MATCH SIMPLE

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Valoracion"
    OWNER to postgres;

--11.Tabla Ranking--

CREATE TABLE public."Ranking"
(
    id_ranking integer NOT NULL,
    fk_Id_libro integer,
    CONSTRAINT "Ranking_pkey" PRIMARY KEY (id_ranking),
    CONSTRAINT fk_Id_libro FOREIGN KEY (fk_Id_libro) REFERENCES public."Libro"("Id_libro") MATCH SIMPLE

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Ranking"
    OWNER to postgres;


