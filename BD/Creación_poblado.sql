--1.Poblacion tabla tipo usuario--

INSERT INTO "Tipo_usuario" ("id_tipo_usuario", "registrado", "tipo_rol") VALUES
(1, true, 'lector'),
(2, true, 'lector'),
(3, true, 'administador'),
(4, false, 'autor'),
(5, true, 'autor'),
(6, false, 'lector'),
(7, true, 'autor'),
(8, true, 'autor'),
(9, true, 'administrador'),
(10, false, 'lector');

--2.Poblacion tabla ubicacion--

INSERT INTO "Ubicacion" ("id_ubicacion", "nombre_ubicacion") VALUES
(1, 'Biblioteca Central')
(2, 'Librería Aventura')
(3, 'Cafetería Literaria')
(4, 'Universidad Nacional')
(5, 'Parque de Lectura')
(6, 'Librería Fantasía')
(7, 'Casa del Autor')
(8, 'Biblioteca Municipal')
(9, 'Librería Clásica')
(10, 'Café Literario')

--3.Poblacion tabla restriccion --

INSERT INTO "Restriccion" ("id_restriccion", "edad_minima") VALUES
(1, 18)
(2, 21)
(3, 16)
(4, 12)
(5, 18)
(6, 16)
(7, 21)
(8, 12)
(9, 18)
(10, 16)

--4.Poblacion tabla Usuario --

INSERT INTO "Usuario" ("correo", "fecha_nacimiento", "contraseña", "nombre_usuario", "fk_tipo_usuario", "fk_ubicacion") VALUES
('usuario1@example.com', '1990-01-01', 'password123', 'John Doe', 1, 1)
('usuario2@example.com', '1985-05-15', 'securepass', 'Jane Smith', 2, 2)
('usuario3@example.com', '2000-12-30', 'abc123', 'Alice Johnson', 1, 3)
('usuario4@example.com', '1998-09-20', 'qwerty', 'Bob Anderson', 4, 1)
('usuario5@example.com', '1995-03-10', 'pass1234', 'Emily Davis', 5, 4)
('usuario6@example.com', '1987-07-22', 'letmein', 'David Wilson', 2, 5)
('usuario7@example.com', '2002-11-05', 'password', 'Sarah Lee', 1, 2)
('usuario8@example.com', '1993-08-12', 'test123', 'Michael Brown', 4, 3)
('usuario9@example.com', '1999-04-18', 'hello123', 'Jessica Taylor', 3, 1)
('usuario10@example.com', '1997-02-28', 'welcome', 'Daniel Clark', 2, 4)

--5.Poblacion tabla Libro --

INSERT INTO "Libro" ("Año", "Descripcion", "Editorial", "Genero_libro", "Id_libro", "Link", "Nombre_libro", "Precio", "Stock", "Tipo_libro", "Numero_favoritos", "fk_id_restriccion", "fk_id_ubicacion") VALUES
(2005, 'Una emocionante aventura llena de misterio', 'Editorial XYZ', 'Aventura', 1, 'https://libro1.com', 'El Tesoro Perdido', 20, 50, 'Físico', 100, 1, 1, 'Autor1')
(2010, 'Una historia de amor y superación', 'Editorial ABC', 'Romance', 2, 'https://libro2.com', 'El Destino en Tus Manos', 15, 30, 'Digital', 50, 2, 2, 'Autor2')
(1998, 'Un clásico de la literatura universal', 'Editorial DEF', 'Clásico', 3, 'https://libro3.com', 'Orgullo y Prejuicio', 25, 20, 'Físico', 80, 3, 1, 'Autor3')
(2015, 'Una historia de fantasía épica', 'Editorial GHI', 'Fantasía', 4, 'https://libro4.com', 'El Reino de las Sombras', 30, 10, 'Físico', 200, 4, 2, 'Autor4')
(2020, 'Una guía práctica para aprender programación', 'Editorial JKL', 'Educación', 5, 'https://libro5.com', 'Programación 101', 40, 100, 'Digital', 300, 5, 3, 'Autor5')
(2012, 'Una historia de suspense y intriga', 'Editorial MNO', 'Suspenso', 6, 'https://libro6.com', 'El Secreto del Pasado', 18, 40, 'Físico', 150, 6, 4, 'Autor6')
(2007, 'Una novela histórica basada en hechos reales', 'Editorial PQR', 'Histórico', 7, 'https://libro7.com', 'Los Pilares de la Tierra', 22, 15, 'Digital', 120, 7, 1, 'Autor7')
(2019, 'Un libro de ciencia ficción futurista', 'Editorial STU', 'Ciencia ficción', 8, 'https://libro8.com', 'El Amanecer del Cosmos', 35, 25, 'Físico', 90, 8, 2, 'Autor8')
(2003, 'Una novela de terror escalofriante', 'Editorial VWX', 'Terror', 9, 'https://libro9.com', 'La Casa de los Horrores', 28, 35, 'Físico', 70, 9, 3, 'Autor9')
(2018, 'Una obra filosófica que invita a la reflexión', 'Editorial YZA', 'Filosofía', 10, 'https://libro10.com', 'El Camino hacia la Sabiduría', 20, 50, 'Digital', 200, 10, 4, 'Autor10')

--6.Poblacion tabla usuario libro --

INSERT INTO "Usuario_libro" ("id_usuario_libro", "favoritos", "fk_usuario", "fk_libro") VALUES
(1, 'S', 'usuario1@example.com', 1)
(2, 'N', 'usuario2@example.com', 2)
(3, 'S', 'usuario3@example.com', 3)
(4, 'N', 'usuario4@example.com', 4)
(5, 'S', 'usuario5@example.com', 5)
(6, 'N', 'usuario6@example.com', 6)
(7, 'S', 'usuario7@example.com', 7)
(8, 'N', 'usuario8@example.com', 8)
(9, 'S', 'usuario9@example.com', 9)
(10, 'N', 'usuario10@example.com', 10)

--7.Poblacion tabla carrito --

INSERT INTO "Carrito" ("id_carrito", "n_productos", "ubicacion", "saldo_total", "fk_correo_carrito") VALUES

(1, 3, 'A', 120, 'usuario1@example.com')
(2, 2, 'B', 75, 'usuario2@example.com')
(3, 1, 'C', 30, 'usuario3@example.com')
(4, 4, 'A', 160, 'usuario4@example.com')
(5, 2, 'B', 70, 'usuario5@example.com')
(6, 3, 'C', 105, 'usuario6@example.com')
(7, 2, 'A', 90, 'usuario7@example.com')
(8, 1, 'B', 40, 'usuario8@example.com')
(9, 4, 'C', 180, 'usuario9@example.com')
(10, 3, 'A', 110, 'usuario10@example.com')

--8.Poblacion tabla libro carrito --

INSERT INTO public."Libro_Carrito" ("id_libro_carrito","libro_carrito_libro_fk", "libro_carrito_carrito_fk", ) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 1),
(4, 4, 3),
(5, 5, 2),
(6, 6, 4),
(7, 7, 1),
(8, 8, 3),
(9, 9, 2),
(10, 10, 4);

--9.Poblacion tabla factura --

INSERT INTO "Factura" ("id_factura", "metodo_pago", "correo", "id_carrito") VALUES
(1, 'T', 'usuario1@example.com', 1)
(2, 'T', 'usuario2@example.com', 2)
(3, 'T', 'usuario3@example.com', 3)
(4, 'T', 'usuario4@example.com', 4)
(5, 'T', 'usuario5@example.com', 5)
(6, 'T', 'usuario6@example.com', 6)
(7, 'T', 'usuario7@example.com', 7)
(8, 'T', 'usuario8@example.com', 8)
(9, 'T', 'usuario9@example.com', 9)
(10, 'T', 'usuario10@example.com', 10)

--10.Poblacion tabla valoracion --

INSERT INTO "Valoracion" ("id_valoracion", "comentario", "puntuacion", "fk_id_libro") VALUES
(1, '¡Me encantó este libro!', 5, 1)
(2, 'Recomiendo este libro a todos los amantes del romance', 4, 2)
(3, 'Un clásico que todos deberían leer', 4, 3)
(4, 'Me transportó a un mundo lleno de fantasía', 5, 4)
(5, 'Muy útil para aprender programación desde cero', 4, 5)
(6, 'Un thriller que te mantendrá en vilo hasta el final', 5, 6)
(7, 'Una novela histórica apasionante', 4, 7)
(8, 'Me encantó la ambientación futurista', 5, 8)
(9, '¡Me dio pesadillas! Muy recomendado para los amantes del terror', 4, 9)
(10, 'Una lectura profunda y reflexiva', 4, 10)

--11.Poblacion tabla valoracion --

INSERT INTO "Ranking" ("id_ranking", "fk_id_libro") VALUES
(1, 1)
(2, 2)
(3, 3)
(4, 4)
(5, 5)
(6, 6)
(7, 7)
(8, 8)
(9, 9)
(10, 10)




