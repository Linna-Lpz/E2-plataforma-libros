-- Table: public.libros_vistas

-- DROP TABLE IF EXISTS public.libros_vistas;

CREATE TABLE IF NOT EXISTS public.libros_vistas
(
    vista_id smallint NOT NULL DEFAULT nextval('libros_vistas_vista_id_seq'::regclass),
    libro_id smallint NOT NULL,
    usuario_id smallint NOT NULL,
    vista_fecha date,
    CONSTRAINT libros_vistas_pkey PRIMARY KEY (vista_id),
    CONSTRAINT libros_vistas_libro_fk FOREIGN KEY (libro_id)
        REFERENCES public.libros (libro_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT libros_vistas_usuario_fk FOREIGN KEY (usuario_id)
        REFERENCES public.usuarios (usuario_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.libros_vistas
    OWNER to postgres;