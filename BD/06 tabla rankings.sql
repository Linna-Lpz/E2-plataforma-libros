-- Table: public.rankings

-- DROP TABLE IF EXISTS public.rankings;

CREATE TABLE IF NOT EXISTS public.rankings
(
    ranking_id smallint NOT NULL DEFAULT nextval('rankings_ranking_id_seq'::regclass),
    libro_id smallint NOT NULL,
    usuario_id smallint NOT NULL,
    ranking_valor smallint,
    CONSTRAINT rankings_pkey PRIMARY KEY (ranking_id),
    CONSTRAINT ranking_libro_fk FOREIGN KEY (libro_id)
        REFERENCES public.libros (libro_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT ranking_usuario_fk FOREIGN KEY (usuario_id)
        REFERENCES public.usuarios (usuario_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.rankings
    OWNER to postgres;