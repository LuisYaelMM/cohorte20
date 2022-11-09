//forma 1

//1 llamar al contenedor

const imagen = document.getElementsByClassName("contenedor")[0];

//2 crear el elemento

const nuevaImg = document.createElement("img");

//3- modificar atributos

nuevaImg.src = "https://placeimg.com/640/480/nature";

nuevaImg.alt = "Imagen de naturaleza";

//4- insertar el elemento
imagen.appendChild(nuevaImg);

/* Otra forma de crear elementos */

//1 llamar al elemento padre

const imagen2 = document.getElementById("img");

//2
imagen2.innerHTML = `
<img/ src="https://placeimg.com/640/480/animals" alt="Imagen de animales">`;

//Crear una lista a partir de los elementos guardados en un arreglo

//insertarla en el documento para que se pueda mostrar

const nombres = ["Pedro", "Juan", "Sonia", "Miguel"];

//forma 1
lista = document.createElement("ul");
nombres.forEach((elemento) => {
  let li = document.createElement("li");
  lista.appendChild(li);
  li.innerHTML += elemento;
});
document.getElementById("lista").appendChild(lista);

//forma 2
const frutas = ["Manzana", "Limon", "Pera", "Uva"];

const lista2 = document.getElementById("lista2");
frutas.forEach((el) => {
  lista2.innerHTML += `
    <li>${el}</li>`;
});
