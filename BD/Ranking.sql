-- Table: public.Ranking

-- DROP TABLE public."Ranking";

CREATE TABLE public."Ranking"
(
    id_ranking integer NOT NULL,
    fk_Id_libro integer,
    CONSTRAINT "Ranking_pkey" PRIMARY KEY (id_ranking)
    CONSTRAINT fk_Id_libro FOREIGN KEY (fk_Id_libro) REFERENCES public."Libro"(Id_libro) MATCH SIMPLE

)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Ranking"
    OWNER to postgres;