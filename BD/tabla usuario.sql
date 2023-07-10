-- Table: public.Usuario

-- DROP TABLE IF EXISTS public."Usuario";

CREATE TABLE IF NOT EXISTS public."Usuario"
(
    correo character(1) COLLATE pg_catalog."default" NOT NULL,
    fecha_nacimiento date,
    "contraseña" "char",
    nombre_usuario character(1) COLLATE pg_catalog."default",
    fk_tipo_usuario integer,
    fk_ubicacion integer,
    CONSTRAINT "Usuario_pkey" PRIMARY KEY (correo),
    CONSTRAINT fk_tipo_usuario FOREIGN KEY (fk_tipo_usuario)
        REFERENCES public."Tipo_usuario" (id_tipo_usuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Usuario"
    OWNER to postgres;