-- Table: public.Tipo_usuario

-- DROP TABLE IF EXISTS public."Tipo_usuario";

CREATE TABLE IF NOT EXISTS public."Tipo_usuario"
(
    id_tipo_usuario integer NOT NULL,
    autor boolean,
    lector boolean,
    registrado boolean,
    administrador boolean,
    permiso character varying COLLATE pg_catalog."default",
    CONSTRAINT "TIPO_USUARIO_pkey" PRIMARY KEY (id_tipo_usuario)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Tipo_usuario"
    OWNER to postgres;