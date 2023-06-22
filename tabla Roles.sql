CREATE TABLE public.roles
(
    rol_id smallserial NOT NULL,
    rol_nombre character varying(20),
    PRIMARY KEY (rol_id)
);

ALTER TABLE IF EXISTS public.roles
    OWNER to postgres;