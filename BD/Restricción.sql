-- Table: public.Restriccion

-- DROP TABLE IF EXISTS public."Restriccion";

CREATE TABLE IF NOT EXISTS public."Restriccion"
(
    id_restriccion integer NOT NULL,
    edad_minima integer,
    CONSTRAINT "Restriccion_pkey" PRIMARY KEY (id_restriccion)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Restriccion"
    OWNER to postgres;