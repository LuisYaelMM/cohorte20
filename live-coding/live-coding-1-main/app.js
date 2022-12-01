// Escribe tu código aquí.

let arregloPrueba = ["Manzana", "Carro", "Pera", "Television"];
let palabraPrueba = "Maiz";

function palabrasGrandes(palabra, arregloPalabras) {
  let arreglo = [];
  arregloPalabras.forEach((element) => {
    if (element.length > palabra.length) {
      arreglo.push(element);
    }
  });
  return arreglo;
}

function escribirEnDom(arreglo) {
  let lista = "";
  arreglo.forEach((element) => {
    lista += `<li>` + element + `</li>`;
  });
  document.getElementById("lista").innerHTML = lista;
}
