const titulo = document.getElementById("titulo");
const parrafos = document.getElementsByClassName("parrafo");

titulo.textContent = "Hola";
console.log(titulo);
console.log(parrafos[1].textContent);

/* parrafos[1].style.color="red";
parrafos[1].style.backgroundColor="yellow"; */

parrafos[1].classList.add("coloresFeos");

const padre = document.getElementById("padre");

const enlace = document.createElement("a");
enlace.href = "http://google.com";
enlace.textContent = "Ir a google";

/* document.body.insertAdjacentElement("afterbegin",enlace) */

padre.appendChild(enlace);

console.log(document.body);
