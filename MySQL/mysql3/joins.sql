/* joins */
select * from productos;
select * from productos, categoria
where idCategoria=id;

select p.nombre, p.precio, p.existencia,c.nombre from productos as p inner join categoria as c
on p.idCategoria=c.id;

select p.nombre, p.precio, p.existencia,t.nombre from productos as p left join temporal as t
on p.idCategoria=t.id;

select * from proveedores;
select * from categoria union
select nombre,precio from productos;

/* multiconsulta*/
select p.nombre, p.precio, p.existencia from productos as p;

select idCategoria from productos;

select p.nombre as nom_producto, c.nombre as nom_categoria,pv.nombre as nom_proveedor
from productos as p
left join categoria as c
on p.idCategoria = c.id
left join detalle_productoorden_proveedor as det
on p.idProducto=det.idProducto
left join proveedores as pv
on det.id=pv.id;