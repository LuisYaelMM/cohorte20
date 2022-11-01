const numeros = [2, 4, 6, 57, 200];
let suma = 0;

//forEach
//recorre todo el arreglo y ejecuta el codigo que le indiquemos
//sobre los valores guardados

/* numeros.forEach(function sumar(elemento) {
  suma += elemento;
  console.log(suma);
}); */

numeros.forEach((el, indice, arreglo) => {
  console.log(el, indice, arreglo);
});

let nuevoArr = numeros.map((el, idx, arr) => {
  return el * el;
});

console.log(nuevoArr);

//filter
//crea una copia del arreglo original y nos permite filtrar

const frutas = ["papaya", "manzana", "manzana", "uva"];

let frutaFiltrada = frutas.filter((fruta) => fruta.length >= 3);

console.log(frutaFiltrada);
