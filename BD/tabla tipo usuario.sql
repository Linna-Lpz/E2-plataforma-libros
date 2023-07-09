-- Table: public.TIPO_USUARIO

-- DROP TABLE IF EXISTS public."TIPO_USUARIO";

CREATE TABLE TIPO_USUARIO
(
    id_tipo_usuario integer NOT NULL,
    autor boolean,
    lector boolean,
    registrado boolean,
    administrador boolean,
    permiso "char",
    PRIMARY KEY (id_tipo_usuario)
);
