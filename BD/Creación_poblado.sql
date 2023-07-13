--1.Poblacion tabla tipo usuario--

INSERT INTO "Tipo_usuario" (id_tipo_usuario, registrado, tipo_rol) VALUES
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
('01', 'Ubicación 001'),
('02', 'Ubicación 002'),
('03', 'Ubicación 003'),
('04', 'Ubicación 004'),
('05', 'Ubicación 005'),
('06', 'Ubicación 006'),
('07', 'Ubicación 007'),
('08', 'Ubicación 008'),
('09', 'Ubicación 009'),
('010', 'Ubicación 0010');