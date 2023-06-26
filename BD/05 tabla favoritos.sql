-- Table: public.favoritos

-- DROP TABLE IF EXISTS public.favoritos;

CREATE TABLE IF NOT EXISTS public.favoritos
(
    libro_id smallint NOT NULL,
    usuario_id smallint NOT NULL,
    CONSTRAINT libro_favoritos_fk FOREIGN KEY (libro_id)
        REFERENCES public.libros (libro_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT usuario_favoritos_fk FOREIGN KEY (usuario_id)
        REFERENCES public.usuarios (usuario_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.favoritos
    OWNER to postgres;