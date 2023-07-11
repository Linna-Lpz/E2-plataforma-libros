-- Table: public.VALORACION

-- DROP TABLE public."VALORACION";

CREATE TABLE public."VALORACION"
(
    id_valoracion integer NOT NULL,
    comentario text COLLATE pg_catalog."default",
    puntuacion integer NOT NULL,
    fk_id_libro integer,
    CONSTRAINT "Valoracion_pkey" PRIMARY KEY (id_valoracion)
    CONSTRAINT fk_id_libro FOREIGN KEY (fk_id_libro) REFERENCES public."LIBRO"(Id_libro) MATCH SIMPLE

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."VALORACION"
    OWNER to postgres;