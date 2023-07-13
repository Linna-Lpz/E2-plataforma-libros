CREATE TABLE public."Libro_Carrito"
(
    id_libro_carrito serial NOT NULL,
    libro_carrito_libro_fk integer,
    libro_carrito_carrito_fk integer,
    PRIMARY KEY (id_libro_carrito),
    CONSTRAINT libro_carrito_libro_fk FOREIGN KEY (id_libro)
        REFERENCES public."Libro" ("Id_libro") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT libro_carrito_carrito_fk FOREIGN KEY (id_carrito)
        REFERENCES public."Carrito" (id_carrito) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);

ALTER TABLE IF EXISTS public."Libro_Carrito"
    OWNER to postgres;