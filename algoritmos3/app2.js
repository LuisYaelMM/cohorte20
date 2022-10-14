// propiedades de arreglo
//lenght

const frutas = ["🍎", "Sandia", "Melon"];
console.log(frutas);

console.log(frutas.length);

//push() agrega al final
frutas.push("Kiwi");
console.log(frutas);

//unshift() agrega al inicio
frutas.unshift("🍓");
console.log(frutas);

//Metodos para quitar
//pop()

frutas.pop();
console.log(frutas);

//shift()

frutas.shift();

//indexOf()
console.log(frutas);
console.log(frutas.indexOf("Sandia"));

//reverse()
frutas.reverse();
console.log(frutas);
frutas.reverse();
console.log(frutas);

//sort()
frutas.sort();

const numeros = [6, 26, 122, 1, 4, 67, 25];

//numeros.sort((a, b) => a - b);

numeros.sort(function order(a, b) {
  return a - b;
});
console.log(numeros);
