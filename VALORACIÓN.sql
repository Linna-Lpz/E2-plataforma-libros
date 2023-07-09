-- Table: public.VALORACION

-- DROP TABLE public."VALORACION";

CREATE TABLE public."VALORACION"
(
    id_valoracion integer NOT NULL,
    comentario "char",
    puntuacion integer NOT NULL,
    CONSTRAINT "Valoracion_pkey" PRIMARY KEY (id_valoracion)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."VALORACION"
    OWNER to postgres;
