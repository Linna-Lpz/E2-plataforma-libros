-- Table: public.usuario_libro

-- DROP TABLE IF EXISTS public."usuario_libro";

CREATE TABLE IF NOT EXISTS public."usuario_libro"
(
    id_usuario_libro integer NOT NULL,
    favoritos char,
    fk_usuario varchar,
	fk_libro integer,
    CONSTRAINT "usuario_libro_pkey" PRIMARY KEY (id_usuario_libro),
    CONSTRAINT fk_usuario FOREIGN KEY (fk_usuario) REFERENCES public."Usuario"(correo) MATCH SIMPLE,
    CONSTRAINT fk_libro FOREIGN KEY (fk_libro) REFERENCES public."Libro"("Id_libro") MATCH SIMPLE
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."usuario_libro"
    OWNER to postgres;