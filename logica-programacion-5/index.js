let numeroAleatorio = Math.floor(
  Math.random() * (Math.floor(100) - Math.ceil(0) + 1) + Math.ceil(0)
);

let intentos = [];
let numero = 0;

adivinarNumero(numeroAleatorio);


function adivinarNumero(aleatorio) {
  do {
    numero = Number(prompt("Intenta adivinar el número:"));
    if (isNaN(numero)) {
      alert("Por favor introduzca un número.");
    } else {
      console.log("hola");
      if (numero == aleatorio) {
        console.log("Felicidades, adivinaste el número secreto.");
        console.log(intentos);
      } else {
        alert("Ups, el número secreto es incorrecto, vuelve a intentarlo")
        intentos.push(numero);
      }
    }
  } while (isNaN(numero) || numero !== aleatorio);
}
