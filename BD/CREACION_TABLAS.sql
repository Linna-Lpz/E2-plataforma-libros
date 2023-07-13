--1.Tabla tipo usuario--

CREATE TABLE public."Tipo_usuario"
(
    id_tipo_usuario integer NOT NULL,
    es_registrado boolean,
    tipo_rol character varying COLLATE pg_catalog."default",
    CONSTRAINT "TIPO_USUARIO_pkey" PRIMARY KEY (id_tipo_usuario)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Tipo_usuario"
    OWNER to postgres;
ALTER TABLE IF EXISTS public."Tipo_usuario"
    OWNER to postgres;

--2.Tabla ubicacion--


CREATE TABLE public."Ubicacion"
(
    id_ubicacion integer NOT NULL,
    nombre_ubicacion character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT "Ubicacion_pkey" PRIMARY KEY (id_ubicacion)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Ubicacion"
    OWNER to postgres;
ALTER TABLE IF EXISTS public."Ubicacion"
    OWNER to postgres;

--3.Tabla Restriccion--

CREATE TABLE public."Restriccion"
(
    id_restriccion integer NOT NULL,
    edad_minima integer,
    CONSTRAINT "Restriccion_pkey" PRIMARY KEY (id_restriccion)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Restriccion"
    OWNER to postgres;

--4.Tabla usuario--

CREATE TABLE public."Usuario"
(
    correo character varying COLLATE pg_catalog."default" NOT NULL,
    fecha_nacimiento date,
    "contraseña" character varying COLLATE pg_catalog."default",
    nombre_usuario character varying COLLATE pg_catalog."default",
    fk_tipo_usuario integer,
    fk_ubicacion integer,
    CONSTRAINT "Usuario_pkey" PRIMARY KEY (correo),
    CONSTRAINT fk_tipo_usuario FOREIGN KEY (fk_tipo_usuario)
        REFERENCES public."Tipo_usuario" (id_tipo_usuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_ubicacion FOREIGN KEY (fk_ubicacion)
        REFERENCES public."Ubicacion" (id_ubicacion) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Usuario"
    OWNER to postgres;

--5.Tabla Libro --

CREATE TABLE public."Libro"
(
    "Año" integer,
    "Descripcion" character varying COLLATE pg_catalog."default" NOT NULL,
    "Editorial" character varying COLLATE pg_catalog."default",
    "Genero_libro" character varying COLLATE pg_catalog."default",
    "Id_libro" integer NOT NULL,
    "Link" character varying COLLATE pg_catalog."default" NOT NULL,
    "Nombre_libro" character varying COLLATE pg_catalog."default" NOT NULL,
    "Precio" integer NOT NULL,
    "Stock" integer NOT NULL,
    "Tipo_libro" character varying COLLATE pg_catalog."default" NOT NULL,
    "Numero_favoritos" integer NOT NULL,
    fk_id_restriccion integer,
    fk_id_ubicacion integer,
    nombre_autor character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "Libro_pkey" PRIMARY KEY ("Id_libro"),
    CONSTRAINT fk_id_restriccion FOREIGN KEY (fk_id_restriccion)
        REFERENCES public."Restriccion" (id_restriccion) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_id_ubicacion FOREIGN KEY (fk_id_ubicacion)
        REFERENCES public."Ubicacion" (id_ubicacion) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Libro"
    OWNER to postgres;

--6.Tabla  Usuario Libro--

CREATE TABLE public.usuario_libro
(
    id_usuario_libro integer NOT NULL,
    favoritos character(1) COLLATE pg_catalog."default",
    fk_usuario character varying COLLATE pg_catalog."default",
    fk_libro integer,
    CONSTRAINT usuario_libro_pkey PRIMARY KEY (id_usuario_libro),
    CONSTRAINT fk_libro FOREIGN KEY (fk_libro)
        REFERENCES public."Libro" ("Id_libro") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_usuario FOREIGN KEY (fk_usuario)
        REFERENCES public."Usuario" (correo) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.usuario_libro
    OWNER to postgres;

--8.Tabla Libro Carrito--

CREATE TABLE public."Carrito"
(
    id_carrito integer NOT NULL,
    n_productos integer NOT NULL,
    ubicacion character(1) COLLATE pg_catalog."default" NOT NULL,
    saldo_total integer NOT NULL,
    fk_correo_carrito character varying COLLATE pg_catalog."default",
    CONSTRAINT "Carrito_pkey" PRIMARY KEY (id_carrito),
    CONSTRAINT fk_correo_carrito FOREIGN KEY (fk_correo_carrito)
        REFERENCES public."Usuario" (correo) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Carrito"
    OWNER to postgres;

--9.Tabla Factura--

CREATE TABLE public.factura
(
    id_factura integer NOT NULL,
    metodo_pago character(1) COLLATE pg_catalog."default" NOT NULL,
    correo character(1) COLLATE pg_catalog."default" NOT NULL,
    id_carrito integer NOT NULL,
    CONSTRAINT factura_pkey PRIMARY KEY (id_factura),
    CONSTRAINT factura_correo_fkey FOREIGN KEY (correo)
        REFERENCES public."Usuario" (correo) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT factura_id_carrito_fkey FOREIGN KEY (id_carrito)
        REFERENCES public."Carrito" (id_carrito) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.factura
    OWNER to postgres;

--10.Tabla Valoracion--

CREATE TABLE public."Valoracion"
(
    id_valoracion integer NOT NULL,
    comentario character varying COLLATE pg_catalog."default",
    puntuacion integer NOT NULL,
    fk_id_libro integer,
    CONSTRAINT "Valoracion_pkey" PRIMARY KEY (id_valoracion),
    CONSTRAINT fk_id_libro FOREIGN KEY (fk_id_libro)
        REFERENCES public."Libro" ("Id_libro") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Valoracion"
    OWNER to postgres;

ALTER TABLE public."Valoracion"
    OWNER to postgres;

--11.Tabla Ranking--

CREATE TABLE public."Ranking"
(
    id_ranking integer NOT NULL,
    fk_id_libro integer,
    CONSTRAINT "Ranking_pkey" PRIMARY KEY (id_ranking),
    CONSTRAINT fk_id_libro FOREIGN KEY (fk_id_libro)
        REFERENCES public."Libro" ("Id_libro") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Ranking"
    OWNER to postgres;
