-- Table: public.LIBRO

-- DROP TABLE public."LIBRO";

CREATE TABLE public."LIBRO"
(
    "Año" date,
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
    fk_id_restriccion integer,
    fk_id_ubicacion integer,
    CONSTRAINT "Libro_pkey" PRIMARY KEY ("Id_libro")
    CONSTRAINT fk_id_ubicacion FOREIGN KEY (fk_id_ubicacion) REFERENCES public."Ubicacion"(id_ubicacion) MATCH SIMPLE
    CONSTRAINT fk_id_restriccion FOREIGN KEY (fk_id_restriccion) REFERENCES public."Restriccion"(id_restriccion) MATCH SIMPLE

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."LIBRO"
    OWNER to postgres;