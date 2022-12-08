/*Like*/
select * from productos
where nombre like "limonada";

select * from productos
where nombre like "Limo%";

select * from productos
where nombre like "%limon";

select * from productos
where nombre not like "%limon%";