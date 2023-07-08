-- Table: public.Valoracion

-- DROP TABLE public."Valoracion";

CREATE TABLE public."Valoracion"
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

ALTER TABLE public."Valoracion"
    OWNER to postgres;