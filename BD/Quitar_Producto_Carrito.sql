CREATE FUNCTION public."Quitar_Producto_Carrito"(IN id_carrito_libro integer)
    RETURNS void
    LANGUAGE 'sql'
    
AS $BODY$
DELETE FROM Libro_Carrito WHERE id_libro_carrito = id_libro_carrito
$BODY$;

ALTER FUNCTION public."Quitar_Producto_Carrito"(integer)
    OWNER TO postgres;