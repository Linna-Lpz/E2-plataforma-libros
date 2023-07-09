CREATE FUNCTION public."Mostrar_Productos_Carrito"(IN id_carrito integer)
    RETURNS pg_tables
    LANGUAGE 'sql'
    
AS $BODY$
SELECT l.Nombre_Libro, l.Descripcion, l.Editorial, l.Precio
FROM Libro_Carrito as lc
INNER JOIN Libro as l
ON l.id_libro = lc.id_libro
$BODY$;

ALTER FUNCTION public."Mostrar_Productos_Carrito"(integer)
    OWNER TO postgres;