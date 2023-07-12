-- Table: public.Tipo_usuario

-- DROP TABLE IF EXISTS public."Tipo_usuario";

CREATE TABLE IF NOT EXISTS public."Tipo_usuario"
(
    id_tipo_usuario integer NOT NULL,
    es_registrado boolean,
    tipo_rol varchar,
    CONSTRAINT "TIPO_USUARIO_pkey" PRIMARY KEY (id_tipo_usuario)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Tipo_usuario"
    OWNER to postgres;