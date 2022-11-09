/* const foo=()=>console.log("First");
const bar=()=>setTimeout(()=>console.log("Second"), 3000)
const baz=()=>console.log("Third");
bar();
foo();
baz();
 */

const nombre = () => {
  const nombres = ["Pepe", "Pancho", "Maria"];
  setTimeout(() => {
    return nombres;
  }, 0);
  return new Promise((resolve, reject) => {
    //resolve -- proceso existoso
    setTimeout(() => {
      //reject -- proceso no exitoso
      if (true) {
        resolve(nombres);
      } else {
        reject("No hay nombres");
      }
    }, 3000);
  });
};
//servidor

/* 
nuestra pc
 */

//console.log(nombre()[0]);

//nombre().then((nombres) => console.log(nombres)).catch(error=>console.error(error));
/* console.log(nombre());
 */
/* console.log(nombre()); */

/* const url = "https://pokeapi.co/api/v2/pokemon/25";

const pokedex = () => {
  fetch(url)
    .then(datos => datos.json())
    .then(pokemon => console.log(pokemon))
    .catch(error=>console.log(error));
};
pokedex(); */

/* 
async function
*/
const obtenerNombre = async () => {
  try {
    let nombres = await nombre();
    console.log(nombres);
  } catch (error) {
    //console.log(error);
    alert(error);
  }
};

//obtenerNombre();
const cartaPokemon = document.getElementById("pokemon");
const nombrePokemon = document.getElementById("nombre");
const imagen=document.getElementById("img");
const form=document.getElementById("form");
const pokedex = async (numero) => {
  try {
    const url = `https://pokeapi.co/api/v2/pokemon/${numero}`;
    const respuesta = await fetch(url);
    const pokemon = await respuesta.json();
    console.log(pokemon.name);
    const datos={
        nombre:pokemon.name,
        imagen:pokemon.sprites.other['official-artwork'].front_default
    }
    nombrePokemon.textContent=datos.nombre;
    imagen.innerHTML=`
    <img src="${datos.imagen}" alt="Imagen de ${datos.nombre}" width="250"/>`


  } catch (error) {}
};

form.addEventListener("submit",(evento)=>{
    //codigo
    evento.preventDefault();
    const valor=document.getElementById("idP").value;
    pokedex(valor);
    form.reset();
});
