-- Table: public.Usuario_valoracion

-- DROP TABLE IF EXISTS public."Usuario_valoracion";

CREATE TABLE IF NOT EXISTS public."Usuario_valoracion"
(
    id_usuario_valoracion integer NOT NULL,
    CONSTRAINT "usuario_valoracion_pkey" PRIMARY KEY (id_usuario_valoracion),
    CONSTRAINT fk_usuario FOREIGN KEY (fk_usuario) REFERENCES public."Usuario"(correo) MATCH SIMPLE
    CONSTRAINT fk_valoracion FOREIGN KEY (fk_valoracion) REFERENCES public."VALORACIÓN"(id_valoracion) MATCH SIMPLE
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Usuario_valoracion"
    OWNER to postgres;
