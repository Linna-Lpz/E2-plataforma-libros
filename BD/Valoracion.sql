-- Table: public.Valoracion

-- DROP TABLE public."Valoracion";

CREATE TABLE public."Valoracion"
(
    id_valoracion integer NOT NULL,
    comentario text COLLATE pg_catalog."default",
    puntuacion integer NOT NULL,
    fk_id_libro integer,
    CONSTRAINT "Valoracion_pkey" PRIMARY KEY (id_valoracion),
    CONSTRAINT fk_id_libro FOREIGN KEY (fk_id_libro) REFERENCES public."LIBRO"("Id_libro") MATCH SIMPLE

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Valoracion"
    OWNER to postgres;