-- Table: public.LIBRO

-- DROP TABLE public."LIBRO";

CREATE TABLE public."LIBRO"
(
    "Año" integer,
    "Descripcion" text COLLATE pg_catalog."default" NOT NULL,
    "Editorial" text COLLATE pg_catalog."default",
    "Genero_libro" text COLLATE pg_catalog."default",
    "Id_libro" integer NOT NULL,
    "Link" text COLLATE pg_catalog."default" NOT NULL,
    "Nombre_libro" text COLLATE pg_catalog."default" NOT NULL,
    "Precio" integer NOT NULL,
    "Stock" integer NOT NULL,
    "Tipo_libro" text COLLATE pg_catalog."default" NOT NULL,
    "Numero_favoritos" integer NOT NULL,
    id_restriccion integer,
    id_ubicacion integer,
    CONSTRAINT "Libro_pkey" PRIMARY KEY ("Id_libro")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."LIBRO"
    OWNER to postgres;