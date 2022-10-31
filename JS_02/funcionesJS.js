let miNombr = "Luis";
let valor2 = 3;
let variableGlobal = 5;
console.log(miNombr);
miNombre();
funcion1();
funcion2();
funcion3();

function miNombre() {
  let nombre = "Luis";
  console.log(nombre);
}

//declaracion global
function funcion1() {
  let valor = 2;
  valor = valor + 3;
  console.log(valor);
}
function funcion2() {
  valor2 = valor2 + 3;
  console.log("El resultado de la variable 2 es: " + valor2);
}

function funcion3() {
  let variableLocal = "El valor es. ";
  console.log(variableLocal + variableGlobal);
}

function funcion4(valor) {
  let numero = 6;
  numero = numero * valor;
  return numero;
}
let salida = funcion4(2);
console.log("El producto es: " + salida);

//funciones anonimas
let miFuncion0 = function (parametro) {
  parametro = parametro * 2;
  return parametro;
};

console.log("Llamando a la funcion anónima " + miFuncion0(4));

let funcion01 = (function (caracteres) {
  return "Hola " + caracteres;
})("Lunes");
console.log("El resultado es " + funcion01);

let suma = (x, y) => {
  return x + y;
};
let resultado = suma(5, 3);
console.log("La suma es: " + resultado);

//Funcion normal
/* function calcularPrecioTotal(precio) {
  let impuestos = 1.16;
  let gastosEnvio = 10;
  return precio * impuestos + gastosEnvio;
}
 */
//Funcion anonima
/* const calcularPrecioTotal=function(precio){
    let impuestos =1.16;
    let gastosEnvio=10;
    return precio*impuestos + gastosEnvio;
} */
//Funcion flecha
/* const calcularPrecioTotal = (precio) => {
  let impuestos = 1.16;
  let gastosEnvio = 10;
  return precio * impuestos + gastosEnvio;
}; */
const calcularPrecioTotal = (precio, porcentajeImpuestos) => {
  let precioConImpuestos = (1 + porcentajeImpuestos / 100) * precio;
  let gastosEnvio = 10;
  return precioConImpuestos + gastosEnvio;
};
console.log("El precio total es: " + calcularPrecioTotal(23.34, 16));

let miObjeto={
    nombre:"Juan",
    edad: 20
};

let mensaje= "Tu nombre es "+ miObjeto.nombre;
mensaje+=" tienes"+miObjeto["edad"]+" años";
console.log(mensaje);