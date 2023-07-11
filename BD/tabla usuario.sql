-- Table: public.Valoracion

-- DROP TABLE IF EXISTS public."Valoracion";

CREATE TABLE IF NOT EXISTS public."Usuario"
(
    correo char NOT NULL,
    fecha_nacimiento date,
    contraseña "char",
    nombre_usuario char,
    fk_tipo_usuario int,
    fk_ubicacion int,
    CONSTRAINT "Usuario_pkey" PRIMARY KEY (correo),
    CONSTRAINT fk_tipo_usuario FOREIGN KEY (fk_tipo_usuario) REFERENCES public."Tipo_usuario"(id_tipo_usuario) MATCH SIMPLE
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Usuario"
    OWNER to postgres;
