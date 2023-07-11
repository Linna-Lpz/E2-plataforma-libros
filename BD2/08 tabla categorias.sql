-- Table: public.categorias

-- DROP TABLE IF EXISTS public.categorias;

CREATE TABLE IF NOT EXISTS public.categorias
(
    categoria_id smallint NOT NULL DEFAULT nextval('categorias_categoria_id_seq'::regclass),
    categoria_nombre character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT categorias_pkey PRIMARY KEY (categoria_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.categorias
    OWNER to postgres;