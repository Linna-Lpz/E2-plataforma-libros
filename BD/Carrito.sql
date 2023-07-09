create table public if not exists carrito
(	"Id_libro" integer NOT NULL
 	"Usuario_Id" int NOT NULL
 	"Precio" int ()
 	"cantidad" int(10) NOT NULL
 	foreign key(Id_libro) references Libro(Id_libro)
 	foreign key(Precio) references Libro(Id_libro)
 	foreign key(Usuario_Id) references Usuarios(Usuario_Id)
);