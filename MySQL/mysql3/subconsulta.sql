/* subconsultas */
select * from productos
where idCategoria=2 and precio >10 and existencia between 5 and 20 and fecha_alta is not null;

select * from productos where idCategoria in (select id from categoria where id>2);