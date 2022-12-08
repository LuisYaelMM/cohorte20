/* joins */
select * from productos;
select * from productos, categoria
where idCategoria=id;

select p.nombre, p.precio, p.existencia,c.nombre from productos as p inner join categoria as c
on p.idCategoria=c.id;