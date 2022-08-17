create table detalle_cliente_pizza(
    id_cliente int NOT NULL,
    id_pizza int NOT NULL,
     FOREIGN KEY(id_cliente ) REFERENCES Cliente (id_cliente )  on delete cascade on update cascade,
    FOREIGN KEY(id_pizza ) REFERENCES Pizza( id_pizza )  on delete cascade on update cascade
)
create table detalle_pizzeria_pizza(
    id_pizzeria int NOT NULL,
    id_pizza int NOT NULL,
     FOREIGN KEY(id_pizzeria ) REFERENCES Pizzeria (id_pizzeria )  on delete cascade on update cascade,
    FOREIGN KEY(id_pizza ) REFERENCES Pizza( id_pizza )  on delete cascade on update cascade
)