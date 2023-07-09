CREATE TABLE public."Ubicacion"
(
    id_ubicacion serial NOT NULL,
    nombre_ubicacion character varying(50),
    PRIMARY KEY (id_ubicacion)
);

ALTER TABLE IF EXISTS public."Ubicacion"
    OWNER to postgres;