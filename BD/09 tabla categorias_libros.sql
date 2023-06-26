-- Table: public.categorias_libros

-- DROP TABLE IF EXISTS public.categorias_libros;

CREATE TABLE IF NOT EXISTS public.categorias_libros
(
    libro_id smallint NOT NULL,
    categoria_id smallint NOT NULL,
    CONSTRAINT categoriaslibros_categorias_fk FOREIGN KEY (categoria_id)
        REFERENCES public.categorias (categoria_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT categoriaslibros_libros_fk FOREIGN KEY (libro_id)
        REFERENCES public.libros (libro_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.categorias_libros
    OWNER to postgres;