let x = 10;
console.log(x);

let persona = {
  nombre: "Juan",
  apellido: "Perez",
  nombreCompleto: function () {
    return "El nombre es " + this.nombre + " " + this.apellido;
  },
};

for (nombrepropiedad in persona) {
  console.log(nombrepropiedad);
  console.log("Valor: " + persona[nombrepropiedad]);
}

console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());
console.log(persona["apellido"]);
persona.tel = "555443322";
console.log(persona);
console.log(persona.tel);
delete persona.tel;
console.log(persona);
let personaArreglo = Object.values(persona);
console.log(personaArreglo);
let personaString = JSON.stringify(persona);
console.log(personaString);
