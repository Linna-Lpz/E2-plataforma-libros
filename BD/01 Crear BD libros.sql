-- Database: libros

-- DROP DATABASE IF EXISTS libros;

CREATE DATABASE Plataforma_libros
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Chile.1252'
    LC_CTYPE = 'Spanish_Chile.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

COMMENT ON DATABASE Plataforma_libros
    IS 'BD de Libros para DBD';


-- Hola Hola Hola --
-- Hola Hola Hola2 --