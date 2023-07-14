-- Table: public.Usuario

-- DROP TABLE IF EXISTS public."Usuario";

CREATE TABLE IF NOT EXISTS public."Usuario"
(
    correo varchar NOT NULL,
    fecha_nacimiento date,
    contraseña varchar,
    nombre_usuario varchar,
    fk_tipo_usuario int,
    fk_ubicacion int,
    CONSTRAINT "Usuario_pkey" PRIMARY KEY (correo),
    CONSTRAINT fk_tipo_usuario FOREIGN KEY (fk_tipo_usuario) REFERENCES public."Tipo_usuario"(id_tipo_usuario) MATCH SIMPLE,
    CONSTRAINT fk_ubicacion FOREIGN KEY (fk_ubicacion) REFERENCES public."Ubicacion"(id_ubicacion) MATCH SIMPLE
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Usuario"
    OWNER to postgres;
