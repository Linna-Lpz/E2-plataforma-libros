-- Table: public.ordenes

-- DROP TABLE IF EXISTS public.ordenes;

CREATE TABLE IF NOT EXISTS public.ordenes
(
    orden_id smallint NOT NULL DEFAULT nextval('ordenes_orden_id_seq'::regclass),
    usuario_id smallint NOT NULL,
    orden_fecha date,
    medio_pago character varying(20) COLLATE pg_catalog."default",
    CONSTRAINT ordenes_pkey PRIMARY KEY (orden_id),
    CONSTRAINT ordenes_usuarios_fk FOREIGN KEY (usuario_id)
        REFERENCES public.usuarios (usuario_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.ordenes
    OWNER to postgres;