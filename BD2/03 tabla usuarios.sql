-- Table: public.usuarios

-- DROP TABLE IF EXISTS public.usuarios;

CREATE TABLE IF NOT EXISTS public.usuarios
(
    usuario_id smallint NOT NULL DEFAULT nextval('"Usuarios_usuario_id_seq"'::regclass),
    rol_id smallint,
    username character varying(20) COLLATE pg_catalog."default",
    password character varying(20) COLLATE pg_catalog."default",
    nombre character varying(50) COLLATE pg_catalog."default",
    email character varying(50) COLLATE pg_catalog."default",
    fecha_nacimiento date,
    fecha_creacion date,
    fecha_modificacion date,
    CONSTRAINT "Usuarios_pkey" PRIMARY KEY (usuario_id),
    CONSTRAINT usuarios_rol_fk FOREIGN KEY (rol_id)
        REFERENCES public.roles (rol_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.usuarios
    OWNER to postgres;