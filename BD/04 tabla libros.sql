-- Table: public.libros

-- DROP TABLE IF EXISTS public.libros;

CREATE TABLE IF NOT EXISTS public.libros
(
    libro_id smallint NOT NULL DEFAULT nextval('libros_libro_id_seq'::regclass),
    usuario_id smallint,
    libro_titulo character varying(200) COLLATE pg_catalog."default",
    libro_referencia character varying(500) COLLATE pg_catalog."default",
    libro_ubicacion character varying(200) COLLATE pg_catalog."default",
    stock smallint,
    precio double precision,
    fecha_creacion date,
    fecha_modificacion date,
    CONSTRAINT libros_pkey PRIMARY KEY (libro_id),
    CONSTRAINT libros_usuarios_fk FOREIGN KEY (usuario_id)
        REFERENCES public.usuarios (usuario_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.libros
    OWNER to postgres;