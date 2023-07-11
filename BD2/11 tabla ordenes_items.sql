-- Table: public.ordenes_items

-- DROP TABLE IF EXISTS public.ordenes_items;

CREATE TABLE IF NOT EXISTS public.ordenes_items
(
    orden_item_id smallint NOT NULL DEFAULT nextval('ordenes_items_orden_item_id_seq'::regclass),
    orden_id smallint NOT NULL,
    libro_id smallint NOT NULL,
    cantidad smallint,
    precio double precision,
    CONSTRAINT ordenes_items_pkey PRIMARY KEY (orden_item_id),
    CONSTRAINT ordenes_items_libros_fk FOREIGN KEY (libro_id)
        REFERENCES public.libros (libro_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT ordenes_items_ordenes_fk FOREIGN KEY (orden_id)
        REFERENCES public.ordenes (orden_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.ordenes_items
    OWNER to postgres;