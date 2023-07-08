-- Table: public.LIBRO

-- DROP TABLE public."LIBRO";

CREATE TABLE public."LIBRO"
(
    "Año" date,
    "Descripcion" "char" NOT NULL,
    "Editorial" "char",
    "Genero_libro" "char",
    "Id_libro" integer NOT NULL,
    "Link" "char" NOT NULL,
    "Nombre_libro" "char" NOT NULL,
    "Precio" integer NOT NULL,
    "Stock" integer NOT NULL,
    "Tipo_libro" "char" NOT NULL,
    "Numero_favoritos" integer NOT NULL,
    CONSTRAINT "Libro_pkey" PRIMARY KEY ("Id_libro")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."LIBRO"
    OWNER to postgres;